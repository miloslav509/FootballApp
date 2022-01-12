package com.ftninformatika.rent.support;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninformatika.rent.model.Takmicenje;
import com.ftninformatika.rent.model.Utakmica;
import com.ftninformatika.rent.service.KlubService;
import com.ftninformatika.rent.service.StadionService;
import com.ftninformatika.rent.service.SudijaService;
import com.ftninformatika.rent.service.TakmicenjeService;
import com.ftninformatika.rent.service.UtakmicaService;
import com.ftninformatika.rent.web.dto.UtakmicaDTO;

@Component
public class UtakmicaDtoToUtakmica implements Converter<UtakmicaDTO, Utakmica> {

	@Autowired
	private UtakmicaService utakmicaService;
	
	@Autowired
	private KlubService klubService;
	
	@Autowired
	private TakmicenjeService takmicenjeService;
	
	@Autowired
	private SudijaService sudijaService;
	
	@Autowired
	private StadionService stadionService;
	
	@Override
	public Utakmica convert(UtakmicaDTO dto) {
		Utakmica utakmica;
		if (dto.getId() != null) {
			utakmica = utakmicaService.findOne(dto.getId());
		} else {
			utakmica = new Utakmica();
		}
		
		if (utakmica != null) {
			utakmica.setKlubDomacin(klubService.findOne(dto.getDomacinId()));
			utakmica.setKlubGost(klubService.findOne(dto.getGostId()));
			utakmica.setDatumIVreme(getLocalDateTime(dto.getDatumVreme()));
			utakmica.setKolo(dto.getKolo());
			utakmica.setTakmicenje(takmicenjeService.findOne(dto.getTakmicenjeId()));
			utakmica.setSudija(sudijaService.findOne(dto.getSudijaId()));
			utakmica.setStadion(stadionService.findOne(dto.getStadionId()));
			utakmica.setOdigrana(dto.isOdigrana());
			utakmica.setVideo(dto.getVideo());
			utakmica.setGoloviDomacin(dto.getGoloviDomacin());
			utakmica.setGoloviGost(dto.getGoloviGost());
			utakmica.setSuteviDomacin(dto.getSuteviDomacin());
			utakmica.setSuteviGost(dto.getSuteviGost());
			utakmica.setSuteviUGolDomacin(dto.getSuteviUGolDomacin());
			utakmica.setSuteviUGolGost(dto.getSuteviUGolGost());
			utakmica.setPosedDomacin(dto.getPosedDomacin());
			utakmica.setPosedGost(dto.getPosedGost());
			
			
		}
		
		
		return utakmica;
	}
	
	private LocalDateTime getLocalDateTime(String datumIVreme) throws DateTimeParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate datum = LocalDate.parse(datumIVreme.substring(0, 10), formatter);
        LocalTime vreme = LocalTime.parse(datumIVreme.substring(11), DateTimeFormatter.ofPattern("HH:mm"));
        return LocalDateTime.of(datum, vreme);
    }
}
