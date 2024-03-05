-- SQLite
INSERT INTO Persons (PersonID, LastName, FirstName, PhoneNumber, DateOfBirth, Coment)
VALUES (1, 'Taro','Yamada','08011111111','2019-01-10 11:11:11','Coment1');

INSERT INTO Persons (PersonID, LastName, FirstName, PhoneNumber, DateOfBirth, Coment)
VALUES (2, 'Taro','Suzuki','08011111112','2019-01-10 11:11:12','Coment2');

INSERT INTO Persons (PersonID, LastName, FirstName, PhoneNumber, DateOfBirth, Coment)
VALUES (3, 'Taro','Wada','08011111113','2019-01-10 11:11:13','Coment3');


SELECT PersonID FROM Persons

CREATE TABLE NewPersons AS
SELECT
*
FROM
Persons

DROP TABLE NewPersons