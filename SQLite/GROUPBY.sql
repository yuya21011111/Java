-- SQLite
SELECT Age, COUNT(*),SUM(Salary), MAX(Salary), MIN(Salary), AVG(Salary) 
FROM Users GROUP BY Age;


SELECT Age, COUNT(*), AVG(Salary) FROM Users WHERE Salary > 5000000
GROUP BY Age;

SELECT Age, COUNT(*), AVG(Salary) FROM Users WHERE Salary > 5000000
GROUP BY Age HAVING COUNT(*) > 3;

SELECT Age, COUNT(*), AVG(Salary) FROM Users WHERE Salary > 5000000
GROUP BY Age HAVING COUNT(*) > 3 ORDER BY AVG(Salary) LIMIT 3;