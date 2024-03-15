-- SQLite
SELECT * FROM Persons;

SELECT * FROM Persons ORDER BY Age ASC;

SELECT * FROM Persons ORDER BY Age DESC;

SELECT * FROM Persons ORDER BY Age, PhoneNumber DESC;

SELECT * FROM Persons WHERE Name LIKE '%田%' ORDER BY Age;

SELECT * FROM Persons WHERE Name LIKE '%田%' ORDER BY Name LIMIT 3;