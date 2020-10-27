DROP SCHEMA IF EXISTS oblig4 CASCADE;
CREATE SCHEMA oblig4;
SET search_path = oblig4;

CREATE TABLE deltager 
(
   fornavn CHARACTER VARYING (20),
   etternavn CHARACTER VARYING (20),
   mobilnummer VARCHAR (8),
   pwd_hash CHARACTER (64),
   pwd_salt CHARACTER (32),
   kjonn CHARACTER VARYING (6),
   PRIMARY KEY (mobilnummer)
);

INSERT INTO deltager VALUES 
    ('per', 'hansen', '12345678','passord','salt','MANN'),
    ('kari','normann','98765432', '12345','pepper','KVINNE'),
    ('espen', 'askeladd', '44441122', 'banan', 'sukker', 'MANN');