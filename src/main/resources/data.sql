CREATE TABLE IF NOT EXISTS PLANT_TABLE
(
    ID          VARCHAR(26) PRIMARY KEY,
    NAME        VARCHAR NOT NULL,
    DESCRIPTION VARCHAR NOT NULL
);

INSERT INTO PLANT_TABLE (ID, NAME, DESCRIPTION)
VALUES ('1', 'Monstera', 'Huge plant!'),
       ('2', 'Gullranke', 'Prapagation is easy'),
       ('3', 'Coleus', 'Propagate this one'),
       ('4', 'ZZ Plant', 'The zebra plant');
