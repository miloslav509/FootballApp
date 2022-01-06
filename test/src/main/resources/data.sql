
INSERT INTO korisnik (id, e_mail, korisnicko_ime, lozinka, ime, prezime, uloga)
              VALUES (1,'miroslav@maildrop.cc','miroslav','$2y$12$NH2KM2BJaBl.ik90Z1YqAOjoPgSd0ns/bF.7WedMxZ54OhWQNNnh6','Miroslav','Simic','ADMIN');
INSERT INTO korisnik (id, e_mail, korisnicko_ime, lozinka, ime, prezime, uloga)
              VALUES (2,'tamara@maildrop.cc','tamara','$2y$12$DRhCpltZygkA7EZ2WeWIbewWBjLE0KYiUO.tHDUaJNMpsHxXEw9Ky','Tamara','Milosavljevic','KORISNIK');
INSERT INTO korisnik (id, e_mail, korisnicko_ime, lozinka, ime, prezime, uloga)
              VALUES (3,'petar@maildrop.cc','petar','$2y$12$i6/mU4w0HhG8RQRXHjNCa.tG2OwGSVXb0GYUnf8MZUdeadE4voHbC','Petar','Jovic','KORISNIK');
              
INSERT INTO stadion (id, naziv, kapacitet, drzava, grad)
              VALUES (1,'Emirates Stadium', 60000,'ENG','London');
INSERT INTO stadion (id, naziv, kapacitet, drzava, grad)
              VALUES (2,'Villa Park', 42000,'ENG','Birmingham');
INSERT INTO stadion (id, naziv, kapacitet, drzava, grad)
              VALUES (3,'Brentford', 17000,'ENG','London');              
INSERT INTO stadion (id, naziv, kapacitet, drzava, grad)
              VALUES (4,'Falmer Stadium', 30000,'ENG','Brighton');
INSERT INTO stadion (id, naziv, kapacitet, drzava, grad)
              VALUES (5,'Turf Moor', 21000,'ENG','Burnley');
INSERT INTO stadion (id, naziv, kapacitet, drzava, grad)
              VALUES (6,'Stanford Bridge', 40000,'ENG','London');       
INSERT INTO stadion (id, naziv, kapacitet, drzava, grad)
              VALUES (7,'Selhurst Park', 39000,'ENG','London');              
INSERT INTO stadion (id, naziv, kapacitet, drzava, grad)
              VALUES (8,'Goodison Park', 39000,'ENG','Liverpool');
INSERT INTO stadion (id, naziv, kapacitet, drzava, grad)
              VALUES (9,'Elland Road', 37000,'ENG','Leeds');
INSERT INTO stadion (id, naziv, kapacitet, drzava, grad)
              VALUES (10,'King Power Stadiumm', 32000,'ENG','Leicester');
INSERT INTO stadion (id, naziv, kapacitet, drzava, grad)
              VALUES (11,'Anfield', 53000,'ENG','Liverpool');
INSERT INTO stadion (id, naziv, kapacitet, drzava, grad)
              VALUES (12,'Etihad Stadium', 55000,'ENG','Manchester');
INSERT INTO stadion (id, naziv, kapacitet, drzava, grad)
              VALUES (13,'Old Trafford', 74000,'ENG','Manchester');
INSERT INTO stadion (id, naziv, kapacitet, drzava, grad)
              VALUES (14,'St James Park', 52000,'ENG','Newcastle');
INSERT INTO stadion (id, naziv, kapacitet, drzava, grad)
              VALUES (15,'Carrow Road', 27000,'ENG','Norwich');
INSERT INTO stadion (id, naziv, kapacitet, drzava, grad)
              VALUES (16,'St Mary Stadium', 32000,'ENG','Southampton');
INSERT INTO stadion (id, naziv, kapacitet, drzava, grad)
              VALUES (17,'Tottenham Hotspur Stadium', 62000,'ENG','London');
INSERT INTO stadion (id, naziv, kapacitet, drzava, grad)
              VALUES (18,'vicarage Road', 22000,'ENG','Watford');
INSERT INTO stadion (id, naziv, kapacitet, drzava, grad)
              VALUES (19,'London Stadium', 60000,'ENG','London');
INSERT INTO stadion (id, naziv, kapacitet, drzava, grad)
              VALUES (20,'Molineux Stadium', 32000,'ENG','Wolverhampton');     
              
INSERT INTO trener (id, ime, prezime)
              VALUES (1,'Mikel', 'Arteta');
INSERT INTO trener (id, ime, prezime)
              VALUES (2,'Steven', 'Gerard');
INSERT INTO trener (id, ime, prezime)
              VALUES (3,'Thomas', 'Frank');
INSERT INTO trener (id, ime, prezime)
              VALUES (4,'Graham', 'Potter');
INSERT INTO trener (id, ime, prezime)
              VALUES (5,'Sean', 'Dyche');
INSERT INTO trener (id, ime, prezime)
              VALUES (6,'Thomas', 'Tuchel');
INSERT INTO trener (id, ime, prezime)
              VALUES (7,'Patrick', 'Vieira');
INSERT INTO trener (id, ime, prezime)
              VALUES (8,'Rafael', 'Benitez');
INSERT INTO trener (id, ime, prezime)
              VALUES (9,'Marcelo', 'Bielsa');
INSERT INTO trener (id, ime, prezime)
              VALUES (10,'Brendan', 'Rodgers');
INSERT INTO trener (id, ime, prezime)
              VALUES (11,'Jurgen', 'Kloop');
INSERT INTO trener (id, ime, prezime)
              VALUES (12,'Pep', 'Guardiola');
INSERT INTO trener (id, ime, prezime)
              VALUES (13,'Ralf', 'Rangnick');
INSERT INTO trener (id, ime, prezime)
              VALUES (14,'Eddie', 'Howe');
INSERT INTO trener (id, ime, prezime)
              VALUES (15,'Dean', 'Smith');
INSERT INTO trener (id, ime, prezime)
              VALUES (16,'Ralph', 'Hasenhuttl');
INSERT INTO trener (id, ime, prezime)
              VALUES (17,'Antonio', 'Conte');
INSERT INTO trener (id, ime, prezime)
              VALUES (18,'Claudio', 'Ranieri');
INSERT INTO trener (id, ime, prezime)
              VALUES (19,'David', 'Moyes');
INSERT INTO trener (id, ime, prezime)
              VALUES (20,'Bruno', 'Lage');  
              
INSERT INTO sudija (id, ime, prezime)
              VALUES (1,'Martin', 'Etkinson');
INSERT INTO sudija (id, ime, prezime)
              VALUES (2,'Andy', 'MAdley');
INSERT INTO sudija (id, ime, prezime)
              VALUES (3,'Craig', 'Pawson');
INSERT INTO sudija (id, ime, prezime)
              VALUES (4,'Paul', 'Tierney');
INSERT INTO sudija (id, ime, prezime)
              VALUES (5,'Jon', 'Moss');
INSERT INTO sudija (id, ime, prezime)
              VALUES (6,'Michael', 'Oliver');
INSERT INTO sudija (id, ime, prezime)
              VALUES (7,'Mike', 'Dean');
INSERT INTO sudija (id, ime, prezime)
              VALUES (8,'David', 'Coote');
INSERT INTO sudija (id, ime, prezime)
              VALUES (9,'Peter', 'Bankes');
INSERT INTO sudija (id, ime, prezime)
              VALUES (10,'Andre', 'Marriner');  
              
INSERT INTO takmicenje (id, naziv_takmicenja, organizator, godina)
              VALUES (1,'Premier League', 'Barclays', '2021/2022');
              
INSERT INTO klub (id, naziv, stadion_id, trener_id, slika)
              VALUES (1,'Arsenal', 1, 1, 'https://upload.wikimedia.org/wikipedia/sr/8/82/Arsenal_FC.png');                   
INSERT INTO klub (id, naziv, stadion_id, trener_id, slika)
              VALUES (2,'Aston Villa', 2, 2, 'https://upload.wikimedia.org/wikipedia/en/thumb/f/f9/Aston_Villa_FC_crest_%282016%29.svg/1200px-Aston_Villa_FC_crest_%282016%29.svg.png');                   
INSERT INTO klub (id, naziv, stadion_id, trener_id, slika)
              VALUES (3,'Brentford', 3, 3, 'https://upload.wikimedia.org/wikipedia/en/thumb/2/2a/Brentford_FC_crest.svg/1200px-Brentford_FC_crest.svg.png');                   
INSERT INTO klub (id, naziv, stadion_id, trener_id, slika)
              VALUES (4,'Brighton', 4, 4, 'https://upload.wikimedia.org/wikipedia/sr/thumb/f/fd/Brighton_%26_Hove_Albion_logo.svg/768px-Brighton_%26_Hove_Albion_logo.svg.png');                   
INSERT INTO klub (id, naziv, stadion_id, trener_id, slika)
              VALUES (5,'Burnley', 5, 5, 'https://upload.wikimedia.org/wikipedia/en/thumb/6/62/Burnley_F.C._Logo.svg/1200px-Burnley_F.C._Logo.svg.png');                   
INSERT INTO klub (id, naziv, stadion_id, trener_id, slika)
              VALUES (6,'Chelsea', 6, 6, 'https://upload.wikimedia.org/wikipedia/sco/thumb/c/cc/Chelsea_FC.svg/2048px-Chelsea_FC.svg.png');                   
INSERT INTO klub (id, naziv, stadion_id, trener_id, slika)
              VALUES (7,'Crystal Palace', 7, 7, 'https://www.logofootball.net/wp-content/uploads/Crystal-Palace-FC-HD-Logo.png');                   
INSERT INTO klub (id, naziv, stadion_id, trener_id, slika)
              VALUES (8,'Everton', 8, 8, 'https://upload.wikimedia.org/wikipedia/sh/thumb/7/7c/Everton_FC_logo.svg/1200px-Everton_FC_logo.svg.png');                   
INSERT INTO klub (id, naziv, stadion_id, trener_id, slika)
              VALUES (9,'Leeds United', 9, 9, 'https://upload.wikimedia.org/wikipedia/en/thumb/5/54/Leeds_United_F.C._logo.svg/1200px-Leeds_United_F.C._logo.svg.png');                   
INSERT INTO klub (id, naziv, stadion_id, trener_id, slika)
              VALUES (10,'Leicester City', 10, 10, 'https://logodownload.org/wp-content/uploads/2019/05/leicester-city-logo.png');                   
INSERT INTO klub (id, naziv, stadion_id, trener_id, slika)
              VALUES (11,'Liverpool', 11, 11, 'https://upload.wikimedia.org/wikipedia/sr/thumb/b/b2/Liverpool_FC_logo.png/1200px-Liverpool_FC_logo.png');                   
INSERT INTO klub (id, naziv, stadion_id, trener_id, slika)
              VALUES (12,'Mancester City', 12, 12, 'https://upload.wikimedia.org/wikipedia/sr/thumb/e/eb/Manchester_City_FC_badge.svg/1200px-Manchester_City_FC_badge.svg.png');                   
INSERT INTO klub (id, naziv, stadion_id, trener_id, slika)
              VALUES (13,'Manchester United', 13, 13, 'https://upload.wikimedia.org/wikipedia/en/thumb/7/7a/Manchester_United_FC_crest.svg/1200px-Manchester_United_FC_crest.svg.png');                   
INSERT INTO klub (id, naziv, stadion_id, trener_id, slika)
              VALUES (14,'Newcastle United', 14, 14, 'https://logodownload.org/wp-content/uploads/2019/10/newcastle-united-logo-1.png');                   
INSERT INTO klub (id, naziv, stadion_id, trener_id, slika)
              VALUES (15,'Norwich City', 15, 15, 'https://upload.wikimedia.org/wikipedia/en/thumb/8/8c/Norwich_City.svg/1200px-Norwich_City.svg.png');
INSERT INTO klub (id, naziv, stadion_id, trener_id, slika)
              VALUES (16,'Southampton', 16, 16, 'https://upload.wikimedia.org/wikipedia/en/thumb/c/c9/FC_Southampton.svg/1200px-FC_Southampton.svg.png');                   
INSERT INTO klub (id, naziv, stadion_id, trener_id, slika)
              VALUES (17,'Tottenham Hotspur', 17, 17, 'https://logowik.com/content/uploads/images/191_tottenhamhotspur.jpg');                   
INSERT INTO klub (id, naziv, stadion_id, trener_id, slika)
              VALUES (18,'Watford', 18, 18, 'https://upload.wikimedia.org/wikipedia/en/thumb/e/e2/Watford.svg/1200px-Watford.svg.png');                   
INSERT INTO klub (id, naziv, stadion_id, trener_id, slika)
              VALUES (19,'West Han United', 19, 19, 'https://upload.wikimedia.org/wikipedia/sr/thumb/c/c2/West_Ham_United_FC_logo.svg/1845px-West_Ham_United_FC_logo.svg.png');                   
INSERT INTO klub (id, naziv, stadion_id, trener_id, slika)
              VALUES (20,'Wolverhampton Wanderers', 20, 20, 'https://logodownload.org/wp-content/uploads/2019/04/wolverhampton-logo-escudo.png');                                 
              
              
INSERT INTO utakmica (id, datum_vreme, klub_domacin_id, klub_gost_id, sutevi_domacin, sutevi_gost, suteviugol_domacin, 
						suteviugol_gost, posed_domacin, posed_gost, stadion_id, golovi_domacin, golovi_gost, takmicenje_id, kolo, sudija_id, odigrana, video)
              VALUES (1, '2021-08-13 21:00', 3, 1, 8, 22, 3, 4, 35, 65, 3, 2, 0, 1, 1, 1, true, 'https://www.youtube.com/watch?v=RJxHDEC-jAk');
INSERT INTO utakmica (id, datum_vreme, klub_domacin_id, klub_gost_id, sutevi_domacin, sutevi_gost, suteviugol_domacin, 
						suteviugol_gost, posed_domacin, posed_gost, stadion_id, golovi_domacin, golovi_gost, takmicenje_id, kolo, sudija_id, odigrana, video)
              VALUES (2, '2021-08-14 13:30', 13, 9, 16, 10, 8, 3, 49, 51, 13, 5, 1, 1, 1, 2, true, 'https://www.youtube.com/watch?v=BuiYpgcBznc');
INSERT INTO utakmica (id, datum_vreme, klub_domacin_id, klub_gost_id, sutevi_domacin, sutevi_gost, suteviugol_domacin, 
						suteviugol_gost, posed_domacin, posed_gost, stadion_id, golovi_domacin, golovi_gost, takmicenje_id, kolo, sudija_id, odigrana)
              VALUES (3, '2021-08-14 16:00', 5, 4, 14, 14, 3, 8, 36, 64, 5, 1, 2, 1, 1, 3, true);
INSERT INTO utakmica (id, datum_vreme, klub_domacin_id, klub_gost_id, sutevi_domacin, sutevi_gost, suteviugol_domacin, 
						suteviugol_gost, posed_domacin, posed_gost, stadion_id, golovi_domacin, golovi_gost, takmicenje_id, kolo, sudija_id, odigrana)
              VALUES (4, '2021-08-14 16:00', 6, 7, 13, 4, 6, 1, 62, 38, 6, 3, 0, 1, 1, 4, true);
INSERT INTO utakmica (id, datum_vreme, klub_domacin_id, klub_gost_id, sutevi_domacin, sutevi_gost, suteviugol_domacin, 
						suteviugol_gost, posed_domacin, posed_gost, stadion_id, golovi_domacin, golovi_gost, takmicenje_id, kolo, sudija_id, odigrana)
              VALUES (5, '2021-08-14 16:00', 8, 16, 14, 6, 6, 3, 48, 52, 8, 3, 1, 1, 1, 5, true);
INSERT INTO utakmica (id, datum_vreme, klub_domacin_id, klub_gost_id, sutevi_domacin, sutevi_gost, suteviugol_domacin, 
						suteviugol_gost, posed_domacin, posed_gost, stadion_id, golovi_domacin, golovi_gost, takmicenje_id, kolo, sudija_id, odigrana)
              VALUES (6, '2021-08-14 16:00', 10, 20, 9, 17, 5, 3, 56, 44, 10, 1, 0, 1, 1, 6, true);
INSERT INTO utakmica (id, datum_vreme, klub_domacin_id, klub_gost_id, sutevi_domacin, sutevi_gost, suteviugol_domacin, 
						suteviugol_gost, posed_domacin, posed_gost, stadion_id, golovi_domacin, golovi_gost, takmicenje_id, kolo, sudija_id, odigrana)
              VALUES (7, '2021-08-14 16:00', 18, 2, 13, 11, 7, 2, 38, 62, 18, 3, 2, 1, 1, 7, true);
INSERT INTO utakmica (id, datum_vreme, klub_domacin_id, klub_gost_id, sutevi_domacin, sutevi_gost, suteviugol_domacin, 
						suteviugol_gost, posed_domacin, posed_gost, stadion_id, golovi_domacin, golovi_gost, takmicenje_id, kolo, sudija_id, odigrana)
              VALUES (8, '2021-08-14 18:30', 15, 11, 14, 19, 3, 8, 50, 50, 15, 0, 3, 1, 1, 8, true);
INSERT INTO utakmica (id, datum_vreme, klub_domacin_id, klub_gost_id, sutevi_domacin, sutevi_gost, suteviugol_domacin, 
						suteviugol_gost, posed_domacin, posed_gost, stadion_id, golovi_domacin, golovi_gost, takmicenje_id, kolo, sudija_id, odigrana)
              VALUES (9, '2021-08-15 15:00', 14, 19, 17, 18, 3, 9, 46, 54, 14, 2, 4, 1, 1, 9, true);
INSERT INTO utakmica (id, datum_vreme, klub_domacin_id, klub_gost_id, sutevi_domacin, sutevi_gost, suteviugol_domacin, 
						suteviugol_gost, posed_domacin, posed_gost, stadion_id, golovi_domacin, golovi_gost, takmicenje_id, kolo, sudija_id, odigrana)
              VALUES (10, '2021-08-15 17:30', 17, 12, 13, 18, 3, 4, 34, 66, 17, 1, 0, 1, 1, 10, true);
INSERT INTO utakmica (id, datum_vreme, klub_domacin_id, klub_gost_id, sutevi_domacin, sutevi_gost, suteviugol_domacin, 
						suteviugol_gost, posed_domacin, posed_gost, stadion_id, golovi_domacin, golovi_gost, takmicenje_id, kolo, sudija_id, odigrana)
              VALUES (11, '2021-08-21 18:30', 4, 18, 0, 0, 0, 0, 0, 0, 4, 0, 0, 1, 2, 1, false);
INSERT INTO utakmica (id, datum_vreme, klub_domacin_id, klub_gost_id, sutevi_domacin, sutevi_gost, suteviugol_domacin, 
						suteviugol_gost, posed_domacin, posed_gost, stadion_id, golovi_domacin, golovi_gost, takmicenje_id, kolo, sudija_id, odigrana)
              VALUES (12, '2021-08-21 16:00', 12, 15, 0, 0, 0, 0, 0, 0, 12, 0, 0, 1, 2, 2, false);
INSERT INTO utakmica (id, datum_vreme, klub_domacin_id, klub_gost_id, sutevi_domacin, sutevi_gost, suteviugol_domacin, 
						suteviugol_gost, posed_domacin, posed_gost, stadion_id, golovi_domacin, golovi_gost, takmicenje_id, kolo, sudija_id, odigrana)
              VALUES (13, '2021-08-21 16:00', 9, 8, 0, 0, 0, 0, 0, 0, 9, 0, 0, 1, 2, 3, false);
INSERT INTO utakmica (id, datum_vreme, klub_domacin_id, klub_gost_id, sutevi_domacin, sutevi_gost, suteviugol_domacin, 
						suteviugol_gost, posed_domacin, posed_gost, stadion_id, golovi_domacin, golovi_gost, takmicenje_id, kolo, sudija_id, odigrana)
              VALUES (14, '2021-08-21 16:00', 7, 3, 0, 0, 0, 0, 0, 0, 7, 0, 0, 1, 2, 4, false);   

    
INSERT INTO tabela (id, klub_id, odigrani_mecevi, pobede, neresene_utakmice, porazi, postignuti_golovi, primljeni_golovi, gol_razlika, bodovi)
              VALUES (1, 13, 1, 1, 0, 0, 5, 1, 4, 3);
INSERT INTO tabela (id, klub_id, odigrani_mecevi, pobede, neresene_utakmice, porazi, postignuti_golovi, primljeni_golovi, gol_razlika, bodovi)
              VALUES (2, 6, 1, 1, 0, 0, 3, 0, 3, 3);
INSERT INTO tabela (id, klub_id, odigrani_mecevi, pobede, neresene_utakmice, porazi, postignuti_golovi, primljeni_golovi, gol_razlika, bodovi)
              VALUES (3, 11, 1, 1, 0, 0, 3, 0, 3, 3);
INSERT INTO tabela (id, klub_id, odigrani_mecevi, pobede, neresene_utakmice, porazi, postignuti_golovi, primljeni_golovi, gol_razlika, bodovi)
              VALUES (4, 8, 1, 1, 0, 0, 3, 1, 2, 3);
INSERT INTO tabela (id, klub_id, odigrani_mecevi, pobede, neresene_utakmice, porazi, postignuti_golovi, primljeni_golovi, gol_razlika, bodovi)
              VALUES (5, 19, 1, 1, 0, 0, 4, 2, 2, 3);
INSERT INTO tabela (id, klub_id, odigrani_mecevi, pobede, neresene_utakmice, porazi, postignuti_golovi, primljeni_golovi, gol_razlika, bodovi)
              VALUES (6, 3, 1, 1, 0, 0, 2, 0, 2, 3);
INSERT INTO tabela (id, klub_id, odigrani_mecevi, pobede, neresene_utakmice, porazi, postignuti_golovi, primljeni_golovi, gol_razlika, bodovi)
              VALUES (7, 18, 1, 1, 0, 0, 3, 2, 1, 3);
INSERT INTO tabela (id, klub_id, odigrani_mecevi, pobede, neresene_utakmice, porazi, postignuti_golovi, primljeni_golovi, gol_razlika, bodovi)
              VALUES (8, 4, 1, 1, 0, 0, 2, 1, 1, 3);
INSERT INTO tabela (id, klub_id, odigrani_mecevi, pobede, neresene_utakmice, porazi, postignuti_golovi, primljeni_golovi, gol_razlika, bodovi)
              VALUES (9, 10, 1, 1, 0, 0, 1, 0, 1, 3);
INSERT INTO tabela (id, klub_id, odigrani_mecevi, pobede, neresene_utakmice, porazi, postignuti_golovi, primljeni_golovi, gol_razlika, bodovi)
              VALUES (10, 17, 1, 1, 0, 0, 1, 0, 1, 3);
INSERT INTO tabela (id, klub_id, odigrani_mecevi, pobede, neresene_utakmice, porazi, postignuti_golovi, primljeni_golovi, gol_razlika, bodovi)
              VALUES (11, 2, 1, 0, 0, 1, 2, 3, -1, 0);
INSERT INTO tabela (id, klub_id, odigrani_mecevi, pobede, neresene_utakmice, porazi, postignuti_golovi, primljeni_golovi, gol_razlika, bodovi)
              VALUES (12, 5, 1, 0, 0, 1, 1, 2, -1, 0);
INSERT INTO tabela (id, klub_id, odigrani_mecevi, pobede, neresene_utakmice, porazi, postignuti_golovi, primljeni_golovi, gol_razlika, bodovi)
              VALUES (13, 12, 1, 0, 0, 1, 0, 1, -1, 0);
INSERT INTO tabela (id, klub_id, odigrani_mecevi, pobede, neresene_utakmice, porazi, postignuti_golovi, primljeni_golovi, gol_razlika, bodovi)
              VALUES (14, 20, 1, 0, 0, 1, 0, 1, -1, 0);
INSERT INTO tabela (id, klub_id, odigrani_mecevi, pobede, neresene_utakmice, porazi, postignuti_golovi, primljeni_golovi, gol_razlika, bodovi)
              VALUES (15, 14, 1, 0, 0, 1, 2, 4, -2, 0);
INSERT INTO tabela (id, klub_id, odigrani_mecevi, pobede, neresene_utakmice, porazi, postignuti_golovi, primljeni_golovi, gol_razlika, bodovi)
              VALUES (16, 16, 1, 0, 0, 1, 1, 3, -2, 0);
INSERT INTO tabela (id, klub_id, odigrani_mecevi, pobede, neresene_utakmice, porazi, postignuti_golovi, primljeni_golovi, gol_razlika, bodovi)
              VALUES (17, 1, 1, 0, 0, 1, 0, 2, -2, 0);
INSERT INTO tabela (id, klub_id, odigrani_mecevi, pobede, neresene_utakmice, porazi, postignuti_golovi, primljeni_golovi, gol_razlika, bodovi)
              VALUES (18, 7, 1, 0, 0, 1, 0, 3, -3, 0);
INSERT INTO tabela (id, klub_id, odigrani_mecevi, pobede, neresene_utakmice, porazi, postignuti_golovi, primljeni_golovi, gol_razlika, bodovi)
              VALUES (19, 15, 1, 0, 0, 1, 0, 3, -3, 0);
INSERT INTO tabela (id, klub_id, odigrani_mecevi, pobede, neresene_utakmice, porazi, postignuti_golovi, primljeni_golovi, gol_razlika, bodovi)
              VALUES (20, 9, 1, 0, 0, 1, 1, 5, -4, 0);              
              

INSERT INTO igrac (id, ime, prezime, pozicija, broj, klub_id, broj_golova, broj_asistencija)
              VALUES (1, 'David', 'Raya', 'GK', 1, 3, 0, 0);
INSERT INTO igrac (id, ime, prezime, pozicija, broj, klub_id, broj_golova, broj_asistencija)
              VALUES (2, 'Kristoffer', 'Ajer', 'DEF', 20, 3, 0, 0);
INSERT INTO igrac (id, ime, prezime, pozicija, broj, klub_id, broj_golova, broj_asistencija)
              VALUES (3, 'Ethan', 'Pinnock', 'DEF', 5, 3, 0, 1);
INSERT INTO igrac (id, ime, prezime, pozicija, broj, klub_id, broj_golova, broj_asistencija)
              VALUES (4, 'Pontus', 'Jansson', 'DEF', 18, 3, 0, 0);
INSERT INTO igrac (id, ime, prezime, pozicija, broj, klub_id, broj_golova, broj_asistencija)
              VALUES (5, 'Frank', 'Onyeka', 'MID', 15, 3, 0, 0);
INSERT INTO igrac (id, ime, prezime, pozicija, broj, klub_id, broj_golova, broj_asistencija)
              VALUES (6, 'Rico', 'Henry', 'MID', 3, 3, 0, 0);
INSERT INTO igrac (id, ime, prezime, pozicija, broj, klub_id, broj_golova, broj_asistencija)
              VALUES (7, 'Christian', 'Norgaard', 'MID', 6, 3, 1, 0);
INSERT INTO igrac (id, ime, prezime, pozicija, broj, klub_id, broj_golova, broj_asistencija)
              VALUES (8, 'Sergi', 'Canos', 'MID', 7, 3, 1, 0);
INSERT INTO igrac (id, ime, prezime, pozicija, broj, klub_id, broj_golova, broj_asistencija)
              VALUES (9, 'Vitaly', 'Janelt', 'MID', 27, 3, 0, 0);
INSERT INTO igrac (id, ime, prezime, pozicija, broj, klub_id, broj_golova, broj_asistencija)
              VALUES (10, 'Ivan', 'Toney', 'ST', 17, 3, 0, 0);
INSERT INTO igrac (id, ime, prezime, pozicija, broj, klub_id, broj_golova, broj_asistencija)
              VALUES (11, 'Bryan', 'Mbeumo', 'ST', 19, 3, 0, 0);
INSERT INTO igrac (id, ime, prezime, pozicija, broj, klub_id, broj_golova, broj_asistencija)
              VALUES (12, 'Bernd', 'Leno', 'GK', 1, 1, 0, 0);
INSERT INTO igrac (id, ime, prezime, pozicija, broj, klub_id, broj_golova, broj_asistencija)
              VALUES (13, 'Kieran', 'Tierney', 'DEF', 3, 1, 0, 0);
INSERT INTO igrac (id, ime, prezime, pozicija, broj, klub_id, broj_golova, broj_asistencija)
              VALUES (14, 'Benjamin', 'White', 'DEF', 4, 1, 0, 0);
INSERT INTO igrac (id, ime, prezime, pozicija, broj, klub_id, broj_golova, broj_asistencija)
              VALUES (15, 'Calum', 'Chambers', 'DEF', 21, 1, 0, 0);
INSERT INTO igrac (id, ime, prezime, pozicija, broj, klub_id, broj_golova, broj_asistencija)
              VALUES (16, 'Pablo', 'Mari', 'DEF', 22, 1, 0, 0);
INSERT INTO igrac (id, ime, prezime, pozicija, broj, klub_id, broj_golova, broj_asistencija)
              VALUES (17, 'Emile', 'Smith', 'MID', 10, 1, 0, 0);
INSERT INTO igrac (id, ime, prezime, pozicija, broj, klub_id, broj_golova, broj_asistencija)
              VALUES (18, 'Nicolas', 'Pepe', 'MID', 19, 1, 0, 0);
INSERT INTO igrac (id, ime, prezime, pozicija, broj, klub_id, broj_golova, broj_asistencija)
              VALUES (19, 'Albert', 'Lokonga', 'MID', 23, 1, 0, 0);
INSERT INTO igrac (id, ime, prezime, pozicija, broj, klub_id, broj_golova, broj_asistencija)
              VALUES (20, 'Granit', 'Xhaka', 'MID', 34, 1, 0, 0);
INSERT INTO igrac (id, ime, prezime, pozicija, broj, klub_id, broj_golova, broj_asistencija)
              VALUES (21, 'Gabriel', 'Martinelli', 'MID', 35, 1, 0, 0);
INSERT INTO igrac (id, ime, prezime, pozicija, broj, klub_id, broj_golova, broj_asistencija)
              VALUES (22, 'Folarin', 'Balogun', 'ST', 26, 1, 0, 0);
INSERT INTO igrac (id, ime, prezime, pozicija, broj, klub_id, broj_golova, broj_asistencija)
              VALUES (23, 'Bruno', 'Fernandes', 'MID', 18, 13, 1, 0);
INSERT INTO igrac (id, ime, prezime, pozicija, broj, klub_id, broj_golova, broj_asistencija)
              VALUES (24, 'Mason', 'Greenwood', 'ST', 11, 13, 1, 0);
INSERT INTO igrac (id, ime, prezime, pozicija, broj, klub_id, broj_golova, broj_asistencija)
              VALUES (25, ' ', 'Fred', 'MID', 17, 13, 3, 0);
INSERT INTO igrac (id, ime, prezime, pozicija, broj, klub_id, broj_golova, broj_asistencija)
              VALUES (26, 'Viktor', 'Lindelof', 'DEF', 2, 13, 0, 1);
INSERT INTO igrac (id, ime, prezime, pozicija, broj, klub_id, broj_golova, broj_asistencija)
              VALUES (27, 'Paul', 'Pogba', 'MID', 6, 13, 0, 4);
INSERT INTO igrac (id, ime, prezime, pozicija, broj, klub_id, broj_golova, broj_asistencija)
              VALUES (28, 'Luke', 'Ayling', 'DEF', 2, 9, 1, 0);
INSERT INTO igrac (id, ime, prezime, pozicija, broj, klub_id, broj_golova, broj_asistencija)
              VALUES (29, 'Stuart', 'Dallas', 'DEF', 15, 9, 0, 1);              
              
INSERT INTO gol (id, strelac_gola_id, asistent_id, utakmica_id, minut)
              VALUES (1, 8, 3, 1, 22);
INSERT INTO gol (id, strelac_gola_id, asistent_id, utakmica_id, minut)
              VALUES (2, 7, null, 1, 73);
INSERT INTO gol (id, strelac_gola_id, asistent_id, utakmica_id, minut)
              VALUES (3, 23, 27, 2, 30);
INSERT INTO gol (id, strelac_gola_id, asistent_id, utakmica_id, minut)
              VALUES (4, 28, 29, 2, 49);              
INSERT INTO gol (id, strelac_gola_id, asistent_id, utakmica_id, minut)
              VALUES (5, 24, 27, 2, 52);
INSERT INTO gol (id, strelac_gola_id, asistent_id, utakmica_id, minut)
              VALUES (6, 23, 27, 2, 54);
INSERT INTO gol (id, strelac_gola_id, asistent_id, utakmica_id, minut)
              VALUES (7, 23, 26, 2, 60);
INSERT INTO gol (id, strelac_gola_id, asistent_id, utakmica_id, minut)
              VALUES (8, 25, 27, 2, 68);
              