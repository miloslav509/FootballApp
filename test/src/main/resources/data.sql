
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
              
INSERT INTO klub (id, naziv, stadion_id, trener_id)
              VALUES (1,'Arsenal', 1, 1);                   
INSERT INTO klub (id, naziv, stadion_id, trener_id)
              VALUES (2,'Aston Villa', 2, 2);                   
INSERT INTO klub (id, naziv, stadion_id, trener_id)
              VALUES (3,'Brentford', 3, 3);                   
INSERT INTO klub (id, naziv, stadion_id, trener_id)
              VALUES (4,'Brighton', 4, 4);                   
INSERT INTO klub (id, naziv, stadion_id, trener_id)
              VALUES (5,'Burnley', 5, 5);                   
INSERT INTO klub (id, naziv, stadion_id, trener_id)
              VALUES (6,'Chelsea', 6, 6);                   
INSERT INTO klub (id, naziv, stadion_id, trener_id)
              VALUES (7,'Crystal Palace', 7, 7);                   
INSERT INTO klub (id, naziv, stadion_id, trener_id)
              VALUES (8,'Everton', 8, 8);                   
INSERT INTO klub (id, naziv, stadion_id, trener_id)
              VALUES (9,'Leeds United', 9, 9);                   
INSERT INTO klub (id, naziv, stadion_id, trener_id)
              VALUES (10,'Leicester City', 10, 10);                   
INSERT INTO klub (id, naziv, stadion_id, trener_id)
              VALUES (11,'Liverpool', 11, 11);                   
INSERT INTO klub (id, naziv, stadion_id, trener_id)
              VALUES (12,'Mancester City', 12, 12);                   
INSERT INTO klub (id, naziv, stadion_id, trener_id)
              VALUES (13,'Manchester United', 13, 13);                   
INSERT INTO klub (id, naziv, stadion_id, trener_id)
              VALUES (14,'Newcastle United', 14, 14);                   
INSERT INTO klub (id, naziv, stadion_id, trener_id)
              VALUES (15,'Norwich City', 15, 15);
INSERT INTO klub (id, naziv, stadion_id, trener_id)
              VALUES (16,'Southampton', 16, 16);                   
INSERT INTO klub (id, naziv, stadion_id, trener_id)
              VALUES (17,'Tottenham Hotspur', 17, 17);                   
INSERT INTO klub (id, naziv, stadion_id, trener_id)
              VALUES (18,'Watford', 18, 18);                   
INSERT INTO klub (id, naziv, stadion_id, trener_id)
              VALUES (19,'West Han United', 19, 19);                   
INSERT INTO klub (id, naziv, stadion_id, trener_id)
              VALUES (20,'Wolverhampton Wanderers', 20, 20);                                 
              
              
INSERT INTO utakmica (id, datum_vreme, klub_domacin_id, klub_gost_id, sutevi_domacin, sutevi_gost, suteviugol_domacin, 
						suteviugol_gost, posed_domacin, posed_gost, stadion_id, golovi_domacin, golovi_gost, takmicenje_id, kolo, sudija_id)
              VALUES (1, '2021-08-13 21:00', 3, 1, 8, 22, 3, 4, 35, 65, 3, 2, 0, 1, 1, 1);
INSERT INTO utakmica (id, datum_vreme, klub_domacin_id, klub_gost_id, sutevi_domacin, sutevi_gost, suteviugol_domacin, 
						suteviugol_gost, posed_domacin, posed_gost, stadion_id, golovi_domacin, golovi_gost, takmicenje_id, kolo, sudija_id)
              VALUES (2, '2021-08-14 13:30', 13, 9, 16, 10, 8, 3, 49, 51, 13, 5, 1, 1, 1, 2);
INSERT INTO utakmica (id, datum_vreme, klub_domacin_id, klub_gost_id, sutevi_domacin, sutevi_gost, suteviugol_domacin, 
						suteviugol_gost, posed_domacin, posed_gost, stadion_id, golovi_domacin, golovi_gost, takmicenje_id, kolo, sudija_id)
              VALUES (3, '2021-08-14 16:00', 5, 4, 14, 14, 3, 8, 36, 64, 5, 1, 2, 1, 1, 3);
INSERT INTO utakmica (id, datum_vreme, klub_domacin_id, klub_gost_id, sutevi_domacin, sutevi_gost, suteviugol_domacin, 
						suteviugol_gost, posed_domacin, posed_gost, stadion_id, golovi_domacin, golovi_gost, takmicenje_id, kolo, sudija_id)
              VALUES (4, '2021-08-14 16:00', 6, 7, 13, 4, 6, 1, 62, 38, 6, 3, 0, 1, 1, 4);
INSERT INTO utakmica (id, datum_vreme, klub_domacin_id, klub_gost_id, sutevi_domacin, sutevi_gost, suteviugol_domacin, 
						suteviugol_gost, posed_domacin, posed_gost, stadion_id, golovi_domacin, golovi_gost, takmicenje_id, kolo, sudija_id)
              VALUES (5, '2021-08-14 16:00', 8, 16, 14, 6, 6, 3, 48, 52, 8, 3, 1, 1, 1, 5);
INSERT INTO utakmica (id, datum_vreme, klub_domacin_id, klub_gost_id, sutevi_domacin, sutevi_gost, suteviugol_domacin, 
						suteviugol_gost, posed_domacin, posed_gost, stadion_id, golovi_domacin, golovi_gost, takmicenje_id, kolo, sudija_id)
              VALUES (6, '2021-08-14 16:00', 10, 20, 9, 17, 5, 3, 56, 44, 10, 1, 0, 1, 1, 6);
INSERT INTO utakmica (id, datum_vreme, klub_domacin_id, klub_gost_id, sutevi_domacin, sutevi_gost, suteviugol_domacin, 
						suteviugol_gost, posed_domacin, posed_gost, stadion_id, golovi_domacin, golovi_gost, takmicenje_id, kolo, sudija_id)
              VALUES (7, '2021-08-14 16:00', 18, 2, 13, 11, 7, 2, 38, 62, 18, 3, 2, 1, 1, 7);
INSERT INTO utakmica (id, datum_vreme, klub_domacin_id, klub_gost_id, sutevi_domacin, sutevi_gost, suteviugol_domacin, 
						suteviugol_gost, posed_domacin, posed_gost, stadion_id, golovi_domacin, golovi_gost, takmicenje_id, kolo, sudija_id)
              VALUES (8, '2021-08-14 18:30', 15, 11, 14, 19, 3, 8, 50, 50, 15, 0, 3, 1, 1, 8);
INSERT INTO utakmica (id, datum_vreme, klub_domacin_id, klub_gost_id, sutevi_domacin, sutevi_gost, suteviugol_domacin, 
						suteviugol_gost, posed_domacin, posed_gost, stadion_id, golovi_domacin, golovi_gost, takmicenje_id, kolo, sudija_id)
              VALUES (9, '2021-08-15 15:00', 14, 19, 17, 18, 3, 9, 46, 54, 14, 2, 4, 1, 1, 9);
INSERT INTO utakmica (id, datum_vreme, klub_domacin_id, klub_gost_id, sutevi_domacin, sutevi_gost, suteviugol_domacin, 
						suteviugol_gost, posed_domacin, posed_gost, stadion_id, golovi_domacin, golovi_gost, takmicenje_id, kolo, sudija_id)
              VALUES (10, '2021-08-15 17:30', 17, 12, 13, 18, 3, 4, 34, 66, 17, 1, 0, 1, 1, 10);
INSERT INTO utakmica (id, datum_vreme, klub_domacin_id, klub_gost_id, stadion_id, takmicenje_id, kolo, sudija_id)
              VALUES (11, '2021-08-21 18:30', 4, 18, 4, 1, 2, 1);
INSERT INTO utakmica (id, datum_vreme, klub_domacin_id, klub_gost_id, stadion_id, takmicenje_id, kolo, sudija_id)
              VALUES (12, '2021-08-21 16:00', 12, 15, 12, 1, 2, 2);
INSERT INTO utakmica (id, datum_vreme, klub_domacin_id, klub_gost_id, stadion_id, takmicenje_id, kolo, sudija_id)
              VALUES (13, '2021-08-21 16:00', 9, 8, 9, 1, 2, 3);
INSERT INTO utakmica (id, datum_vreme, klub_domacin_id, klub_gost_id, stadion_id, takmicenje_id, kolo, sudija_id)
              VALUES (14, '2021-08-21 16:00', 7, 3, 7, 1, 2, 4);   
              

              
           