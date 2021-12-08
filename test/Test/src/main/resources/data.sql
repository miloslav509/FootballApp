INSERT INTO adresa (id, ulica, broj) VALUES (1,'Bulevar Cara Lazara', 5);
INSERT INTO adresa (id, ulica, broj) VALUES (2, 'Dalmatinska', 7);

INSERT INTO korisnik (id, e_mail, korisnicko_ime, lozinka, ime, prezime, uloga, adresa_id)
              VALUES (1,'miroslav@maildrop.cc','miroslav','$2y$12$NH2KM2BJaBl.ik90Z1YqAOjoPgSd0ns/bF.7WedMxZ54OhWQNNnh6','Miroslav','Simic','ADMIN',1);
INSERT INTO korisnik (id, e_mail, korisnicko_ime, lozinka, ime, prezime, uloga, adresa_id)
              VALUES (2,'tamara@maildrop.cc','tamara','$2y$12$DRhCpltZygkA7EZ2WeWIbewWBjLE0KYiUO.tHDUaJNMpsHxXEw9Ky','Tamara','Milosavljevic','KORISNIK',2);
INSERT INTO korisnik (id, e_mail, korisnicko_ime, lozinka, ime, prezime, uloga, adresa_id)
              VALUES (3,'petar@maildrop.cc','petar','$2y$12$i6/mU4w0HhG8RQRXHjNCa.tG2OwGSVXb0GYUnf8MZUdeadE4voHbC','Petar','Jovic','KORISNIK',2);
              
INSERT INTO mesto (id, grad, drzava) VALUES (1, 'Kisac', 'SRB');
INSERT INTO mesto (id, grad, drzava) VALUES (2, 'Budimpesta', 'HuN');
INSERT INTO mesto (id, grad, drzava) VALUES (3, 'Novi Sad', 'SRB');


INSERT INTO festival (id, naziv, datum_pocetka, datum_zavrsetka, cena, broj_karata, mesto_id) VALUES (1, 'EXIT', '01.07', '04.07', 500.00, 1000, 3);
INSERT INTO festival (id, naziv, datum_pocetka, datum_zavrsetka, cena, broj_karata, mesto_id) VALUES (2, 'Sziget', '08.07', '12.07', 300.00, 100, 2);
INSERT INTO festival (id, naziv, datum_pocetka, datum_zavrsetka, cena, broj_karata, mesto_id) VALUES (3, 'Gitarijada Kisac', '21.06', '24.06', 200.00, 5000, 1);


INSERT INTO rezervacija (id, broj_karata, ukupna_cena, festival_id) VALUES (1, 4, 800.00, 3);
INSERT INTO rezervacija (id, broj_karata, ukupna_cena, festival_id) VALUES (2, 3, 900.00, 2);
INSERT INTO rezervacija (id, broj_karata, ukupna_cena, festival_id) VALUES (3, 2, 1000.00, 1);
