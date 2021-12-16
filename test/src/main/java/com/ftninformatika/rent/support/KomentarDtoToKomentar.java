package com.ftninformatika.rent.support;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.ftninformatika.rent.model.Komentar;
import com.ftninformatika.rent.service.KomentarService;
import com.ftninformatika.rent.service.KorisnikService;
import com.ftninformatika.rent.service.UtakmicaService;
import com.ftninformatika.rent.web.dto.KomentarDTO;

@Component
public class KomentarDtoToKomentar implements Converter<KomentarDTO, Komentar> {

	@Autowired
	private KomentarService komentarService;
	
	@Autowired
	private KorisnikService korisnikService;
	
	@Autowired
	private UtakmicaService utakmicaService;
	
	@Override
	public Komentar convert(KomentarDTO dto) {
		Komentar komentar;
		if (dto.getId() != null) {
			komentar = komentarService.findOne(dto.getId());
		} else {
			komentar = new Komentar();
		}
		
		if (komentar != null) {
			komentar.setDatumIVreme(getLocalDateTime(dto.getDatumVreme()));
			komentar.setKorisnik(korisnikService.findOneByUsername(dto.getKorisnikKorisnickoIme()));
			komentar.setSadrzaj(dto.getSadrzaj());
			komentar.setUtakmica(utakmicaService.findOne(dto.getUtakmicaId()));
		}
		
		return komentar;
	}
	
	private LocalDateTime getLocalDateTime(String datumIVreme) throws DateTimeParseException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate datum = LocalDate.parse(datumIVreme.substring(0, 10), formatter);
        LocalTime vreme = LocalTime.parse(datumIVreme.substring(11), DateTimeFormatter.ofPattern("HH:mm"));
        return LocalDateTime.of(datum, vreme);
    }
}
