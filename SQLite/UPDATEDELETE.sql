-- SQLite
SELECT * FROM  Persons

SELECT FirstName, LastName FROM Persons

SELECT 1 + 1

SELECT FirstName AS 名前, LastName AS 名字 FROM Persons

SELECT * FROM Persons WHERE PersonID=3

SELECT LastName || FirstName AS 本名 FROM Persons WHERE PersonID=3

CREATE TABLE Countries
(
  Id INT,
  Name VARCHAR(255),
  Capital VARCHAR(255)
);

INSERT INTO Countries VALUES
(
  1, 'Japan', 'Tokyo'
)

INSERT INTO Countries
(
  Name, Capital
)VALUES
('US', 'NewYork')

INSERT INTO Countries
(
  Id, Name, Capital
)VALUES
(
  2,'UK','Rondon'
),
(
  3,'France','Paris'
),
(
  3,'Italy','Roma'
)

CREATE TABLE Capitals
(
  Id INT,
  Name VARCHAR(255)
);

INSERT INTO Capitals
SELECT Id, Capital
FROM Countries

UPDATE Countries set Capital = 'City';

UPDATE Countries set Capital = 'Tokyo' WHERE Name = 'Japan'
UPDATE Countries set Id= 4 WHERE Name = 'Italy'

DELETE FROM Countries WHERE Name='US'