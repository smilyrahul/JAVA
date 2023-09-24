public class parta {
    
}
PROGRAM1.Draw the E-R diagram and convert entities and relationships to relation table for a given scenario
Solution
1.COLLEGE DATABSE
STUDENT(USN,SName,Address,Phone,Gender)
SEMSEC(SSID,Sem,Sec)
CLASS(USN,SSID)
SUBJECT(Subcode,Title,Sem,CREDITS)
IAMARKS (USN,Subcode,SSID,Test1,Test2,Test3,FinallA)

2.COMPANY DATABASE
	EMPLOYEE(SSN,Name,Address,Sex, Salary, SuperSSN, DNo)
	DEPARTMENT(DNo,DName, MgrSSN, MgrStartDate)
	DLOCATION(DNo, DLoc)
	PROJECT(PNo, PName , PLocation , DNo)
WORKS_ON(SSN,PNo, Hours)
 


Mapping Entities and relationships to relation table (Schema Diagram)
 




 	









Company DataBase : E-R Diagram
 

Company Database : Schema Diagram
 









PROGRAM 2.
Viewing all databases, creating a database, viewing all tables in a Database, creating tables (With and Without constraints), Inserting/Updating/Deleting Records in a Table, Saving (Commit) and Undoing(rollback)
Solution
Consider the Inventory Database with the following tables
Product(PID:number;Name:Text;Price:Number)
Purchase(PO:Number;PID:Number;Qty:Number)
Steps:
	1.Create Database Inventory
	2.Create tables Product and Purchase with and without constraint
	3.View all tables in inventory database
	4.Insert five tuples into each relation
	5.Display all the tuples in the Product and Purchase Table
	6.Update the product name for the PID = 4 as CAMERA
	7.Delete information about the product whose PID = 5
	8.Perform saving and Undoing
Step 1 : Create Database inventory(Creating a database means creating a user or schema)
CREATE DATABASE INVENTORY
Commands completed successfully.
2.Create tables Product and Purchase with and without constraint
CREATE TABLE Product(PID INT,
Name_ VARCHAR(20),Price INT
)

CREATE TABLE Purchase
(PO INT,
PID INT,QTY INT
)
3.View all tables in inventory database
SELECT table_name
FROM INFORMATION_SCHEMA.TABLES
WHERE table_type = 'BASE TABLE'
 
SELECT * FROM Product
SELECT * FROM Purchase
4.Insert five tuples into each relation
INSERT INTO Product VALUES
(1,'PRINTER',20000),
(2,'KEYBOARD',10000),
(3,'MONITOR',15000),
(4,'UPS',10000),
(5,'SCANNER',14000)
5.Display all the tuples in the Product and Purchase Table
SELECT * FROM Product


PID	Name_		Price
1	PRINTER	20000
2	KEYBOARD	10000
3	MONITOR	15000
4	UPS		10000
5	SCANNER	14000

INSERT INTO Purchase VALUES
(101,5,25),
(102,1,15),
(103,3,18),
(104,2,16),
(105,4,19)

SELECT * FROM Purchase

PO	PID	QTY
101	5	25
102	1	15
103	3	18
104	2	16
105	4	19
6.Update the product name for the PID = 4 as CAMERA

UPDATE Product SET Name_ = 'CAMERA' 
WHERE PID =4 
(1 row affected)

PID	Name_		Price
1	PRINTER	20000
2	KEYBOARD	10000
3	MONITOR	15000
4	CAMERA		10000
5	SCANNER	14000
7.Delete information about the product whose PID = 5


DELETE FROM Product
WHERE PID = 5
(1 row affected)
PID	Name_		Price
1	PRINTER	20000
2	KEYBOARD	10000
3	MONITOR	15000
4	CAMERA		10000
8.Perform saving and Undoing
INSERT INTO Product VALUES
(5,'MOBILE',35000)
(1 row affected)

INSERT INTO Product VALUES
(6,'LAPTOP',70000)
(1 row affected)

COMMIT
Commit complete

SELECT * FROM Product
PID	Name_		Price
1	PRINTER	20000
2	KEYBOARD	10000
3	MONITOR	15000
4	CAMERA		10000
5	MOBILE		35000
6	LAPTOP		70000

SAVEPOINT S1

INSERT INTO Product VALUES
(7,'MOTHERBOARD',20000)
(1 row affected)

INSERT INTO Product VALUES
(8,'CHAIR',25000)
(1 row affected)
ROLLBACK TO S1
Rollback complete

SELECT * FROM Product
PID	Name_		Price
1	PRINTER	20000
2	KEYBOARD	10000
3	MONITOR	15000
4	CAMERA		10000
5	MOBILE		35000
6	LAPTOP		70000





Program 3
.Altering a Table, Dropping/Truncating / Renaming a table, backing up/ Restoring a Database
Consider the library database with the following data and execute the queries
LIB(BID,TITLE,AUTHOR,PUBLICATION,YEAR OF PUBLICATION)
STEPS
1.Create LIB table by properly specifying the constraint
2.Rename the LIB as LIBRARY 
3.Add a new column price with not null contraints to the existing table library
4.All the constraints and views that reference the column are dropped automatically along with the column.
5.Rename the BID to BOOKID in the LIBRARY table.
6.Insert Data into LIBRARY table
7. Truncate table to delete the record.
8.Drop Table.

1.Create LIB table by properly specifying the constraint
CREATE TABLE LIB
(
BID VARCHAR(8) PRIMARY KEY,
TITLE VARCHAR(20) NOT NULL,
AUTHOR VARCHAR(20),
PUBLICATION VARCHAR (20),
YEAR_OF_PUBLICATION VARCHAR(5))

Table created.
DESC LIB
NAME	NULL?	TYPE
BID	NOT NULL	VARCHAR(8)
TITLE	NOT NULL	VARCHAR(20)
AUTHOR		VARCHAR(20)
PUBLICATION		VARCHAR(20)
YEAR_OF_PUBLICATION		VARCHAR(5)

2.Rename the LIB as LIBRARY 
ALTER TABLE LIB RENAME TO LIBRARY
DESC LIBRARY
NAME	NULL?	TYPE
BID	NOT NULL	VARCHAR(8)
TITLE	NOT NULL	VARCHAR(20)
AUTHOR		VARCHAR(20)
PUBLICATION		VARCHAR(20)
YEAR_OF_PUBLICATION		VARCHAR(5)

3.Add a new column price with not null constraints to the existing table library
ALTER TABLE LIBRARY ADD PRICE INT NOT NULL
Table altered
DESC LIBRARY
NAME	NULL?	TYPE
BID	NOT NULL	VARCHAR(8)
TITLE	NOT NULL	VARCHAR(20)
AUTHOR		VARCHAR(20)
PUBLICATION		VARCHAR(20)
YEAR_OF_PUBLICATION		VARCHAR(5)
PRICE 	NOT NULL?	INT

4.All the constraints and views that reference the column are dropped automatically along with the column.
ALTER TABLE LIBRARY DROP COLUMN AUTHOR CASCADE CONSTRAINTS
Table altered
DESC LIBRARY
NAME	NULL?	TYPE
BID	NOT NULL	VARCHAR(8)
TITLE	NOT NULL	VARCHAR(20)
PUBLICATION		VARCHAR(20)
YEAR_OF_PUBLICATION		VARCHAR(5)


5.Rename the BID to BOOKID in the LIBRARY table.
ALTER TABLE LIBRARY RENAME COLUMN BID TO BOOKID
Table altered
DESC LIBRARY
DESC LIBRARY
NAME	NULL?	TYPE
BID	NOT NULL	VARCHAR(8)
TITLE	NOT NULL	VARCHAR(20)
AUTHOR		VARCHAR(20)
PUBLICATION		VARCHAR(20)
YEAR_OF_PUBLICATION		VARCHAR(5)
PRICE 	NOT NULL?	INT


6.Insert Data into LIBRARY table
INSERT INTO LIBRARY VALUES (‘SP001’,’DBMS’,’SKYWARD PUBLISHERS’,2022,300)
(1 row affected)
DESC LIBRARY
NAME	NULL?	TYPE
BOOKID	NOT NULL	VARCHAR(8)
TITLE	NOT NULL	VARCHAR(20)
PUBLICATION		VARCHAR(20)
YEAR_OF_PUBLICATION		VARCHAR(5)
PRICE 	NOT NULL?	INT

7. Truncate table to delete the record.
TRUNCATE TABLE LIBRARY
Table LIBRARY truncated
DESC LIBRARY
NAME	NULL?	TYPE
BOOKID	NOT NULL	VARCHAR(8)
TITLE	NOT NULL	VARCHAR(20)
PUBLICATION		VARCHAR(20)
YEAR_OF_PUBLICATION		VARCHAR(5)
PRICE 	NOT NULL?	INT

8.Drop Table.
DROP TABLE LIBRARY
Table dropped

DESC LIBRARY
ERROR
Object LIBRARY does not exist











PROGRAM 4.
For a given set of relation schemes, create tables and perform the following simple Queries,  Simple Queries with aggregate functions, Queries with aggregate functions(group by and having clause)
STEPS
1.Create table Salary
2.Enter five tuples into the table
3.Display employee number and their salary
4.Find the sum of salaries of all the employees
5.Find the sum and average salaries of employees of a particular department
6.Find the number of employees working for each department.
7.Dispaly employee information in ascending  and descending order of their date of joining 
8.Find the highest salary that an employee draws
9.Find the leat salary that an employee draws
10.Display the details of employee whose name is Rushank and salary is greater than 50000
1.Create table Salary

CREATE TABLE SLARYDB (ENO VARCHAR(8) PRIMARY KEY, NAME VARCHAR(15) NOT NULL
,DEPT VARCHAR(10), DOJ DATE,SALARY INT)
Table created
DESC SALARY DB
Name	Null	Type
ENO	NOT NULL	VARCHAR(8)
NAME	NOT NULL	VARCHAR(15)
DEPT		VARCHAR (10)
DOJ		DATE
SALARY		INT
 
2.Enter five tuples into the table
INSERT INTO SALARYDB
(
(‘SC1010’, ‘AHANA’ , ‘HR’ , ’15-FEB-2010’, 60000),
(‘SC1011’, ‘RAMESH’, ‘ FINANCE’, ’10-MAR-2012’, 45000 ),
(‘SC1013’, ‘NAVEEN’, ‘MARKETING’, ‘8-JAN-2009’, 55000),
(‘SC1014’, ‘ANAGHA’, ‘HR’, ’14-APR-2012’, 35000),
(‘SC1015’, ‘RUSHANK’, ‘ADMIN’, ’16-MAY-2021’, 55000),
(‘SC1016’,’RUSHANK’, ‘FINANCE’, ‘4-JUN-2008’, 25000)
)
SELECT * FROM SALARYDB
ENO	NAME	DEPT	DOJ	SALARY
SC1010	AHANA	HR	15-FEB-2010	60000
SC1011	RAMESH	FINANCE	10-MAR-2012	45000
SC1013	NAVEEN	MARKETING	8-JAN-2009	55000
SC1014	ANAGHA	HR	14-APR-2012	35000
SC1015	RUSHANK	ADMIN	16-MAY-2021	55000
SC1016	RUSHANK	FINANCE	4-JUN-2008	25000

6 row selected
3.Display employee number and their salary
SELECT ENO , SALARY FROM SALARYDB
ENO	SALARY
SC1010	60000
SC1011	45000
SC1013	55000
SC1014	35000
SC1015	55000
SC1016	25000

6 rows selected
4.Find the sum of salaries of all the employees
SELECT SUM(SALARY) AS “TOTAL_SALARY” FROM SALARYDB
TOTAL_SALARY
275000

5.Find the sum and average salaries of employees of a particular department
SELECT DEPT,SUM(SALARY) AS “TOTAL_SALARY”,AVG(SALARY)AS “AVERAGE_SALARY”
FROM SALARYDB GROUP BY DEPT
DEPT	TOTAL_SALARY	AVERAGE_SALARY
ADMIN	55000	55000
HR	95000	47500
FINANCE	70000	35000
MARKETING	55000	55000

6.Find the number of employees working for each department.
SELECT DEPT COUNT(*) AS “NUMBER_OF_EMPLOYEES” FROM SALARYDB GROUP BY DEPT
DEPT	NUMBER_OF_EMPLOYEES
ADMIN	1
HR	2
FINANCE	2
MARKETING	1

7.Dispaly employee information in ascending  and descending order of their date of joining 
SELECT * FROM SALARYDB ORDER BY DOJ ASC
ENO	NAME	DEPT	DOJ	SALARY
SC1016	RUSHANK	FINANCE	04-JUN-2008	25000
SC1013	NAVEEN	MARKETING	08-JAN-2009	55000
SC1010	AHANA	HR	15-FEB-2010	60000
SC1015	RUSHANK	ADMIN	16-MAY-2011	55000
SC1011	RAMESH	FINANCE	10-MAR-2012	45000
SC1014	ANAGHA	HR	14-APR-2012	35000

SELECT * FROM SALARYDB ORDER BY DOJ DESC
ENO	NAME	DEPT	DOJ	SALARY
SC1014	ANAGHA	HR	14-APR-2012	35000
SC1011	RAMESH	FINANCE	10-MAR-2012	45000
SC1015	RUSHANK	ADMIN	16-MAY-2011	55000
SC1010	AHANA	HR	15-FEB-2010	60000
SC1013	NAVEEN	MARKETING	08-JAN-2009	55000
SC1016	RUSHANK	FINANCE	04-JUN-2008	25000


8.Find the highest salary that an employee draws
SELECT MAX(SALARY) AS “HIGHEST_SALARY” FROM SALARYDB
HIGHEST_SALARY
60000


9.Find the least salary that an employee draws
SELECT MIN(SALARY) AS “LEAST_SALARY” FROM SALARYDB

LEAST_SALARY
25000


10.Display the details of employee whose name is Rushank and salary is greater than 50000
SELECT * FROM SALARYDB
WHERE NAME = “RUSHANK” AND SALARY >50000
ENO	NAME	DEPT	DOJ	SALARY
SC1015	RUSHANK	ADMIN	16-MAY-2011	55000


PROGRAM 5.
 Execute the following queries
Create tables by properly specifying primary key and foreign keys 
CREATE TABLE DEPT (DNO INT PRIMARY KEY , DNAME VARCHAR(20) NOT NULL , DLOCATION VARCHAR(20))
Table created
CREATE TABLE EMP (ENO INT PRIMARY KEY, ENAME VARCHAR(20) NOT NULL, EBDATE DATE,
ADDRESS VARCHAR(20),GENDER CHAR, SALARY INT,DEPTNO INT  REFERENCES DEPT)
Table created
DESC DEPT
NAME	NULL?	TYPE 
DNO	NOT NULL	INT 
DNAME	NOT NULL	VARCHAR(20)
DLOCATION		VARCHAR(20)

DESC EMP
NAME	NULL	TYPE
ENO	NOT NULL	INT
ENAME	NOT NULL	VARCHAR(20)
EBDATE		DATE 
ADDRESS		VARCHAR(20)
GENDER		CHAR(1)
SALARY	NOT NULL	INT
DEPTNO		INT

CREATE TABLE PROJECT (PNO INT PRIMARY KEY), PNAME VARCHAR(20) NOT NULL, DNUM INT 
REFERENCES DEPT)
Table created
DESC PROJECT
NAME	NULL?	TYPE
PNO	NOT NULL	INT
PNAME	NOT NULL	VARCHAR(20)
DNUM		INT

CREATE TABLE WORKSON (ENO INT REFERENCES EMP NOT NULL , PNUM INT REFERENCES PROJECT NOT NULL , HOURS INT NOT NULL, PRIMARY KEY(ENO,PNUM))
Table created

DESC WORKSON
NAME	NULL?	TYPE
ENO	NOT NULL	INT 
PNUM	NOT NULL	INT
HOURS	NOT NULL	INT

INSERT INTO DEPT(DNO,DNAME,DLOCATION) VALUES 
(
(2,’ACCOUNTS’, ‘JAYANAGAR’)
)
1 row created

INSERT INTO DEPT(DNO,DNAME,DLOCATION) VALUES 
(
(4,’RESEARCH’, ‘KENGERI’)
)
1 row created
INSERT INTO DEPT(DNO,DNAME,DLOCATION) VALUES 
(
(5,’ADMIN’, ‘SOUTHEND’)
)
1 row created

INSERT INTO EMP(ENO,ENAME,EBDATE,ADDRESS,GENDER,SALARY,DEPTNO) VALUES
(
(1001, ‘ANIRUDH’, ‘14-01-1990’, ‘BANGALORE’ , ‘M’,4500, 4)
)
1 row created

INSERT INTO EMP(ENO,ENAME,EBDATE,ADDRESS,GENDER,SALARY,DEPTNO) VALUES
(
(1004, ‘LAKSHMI’, ‘04-03-1998’, ‘MYSORE’ , ‘F’, 5500,4)
)
1 row created

INSERT INTO EMP(ENO,ENAME,EBDATE,ADDRESS,GENDER,SALARY,DEPTNO) VALUES
(
(1002, ‘SINHASANA’, ‘22-12-1990’, ‘BANGALORE’ , ‘F’, 5000,2)
)
1 row created
INSERT INTO EMP(ENO,ENAME,EBDATE,ADDRESS,GENDER,SALARY,DEPTNO) VALUES
(
(1007, ‘PRASANTH’, 26-01-1989, ‘DARVAD’ , ‘M’,2000,4)
)
1 row created

INSERT INTO EMP(ENO,ENAME,EBDATE,ADDRESS,GENDER,SALARY,DEPTNO) VALUES
(
(1003, ‘VINAY’, ’26-11-1990’, ‘HUBLI’ , ‘M’, 3000,2)
)
1 row created

INSERT INTO EMP(ENO,ENAME,EBDATE,ADDRESS,GENDER,SALARY,DEPTNO) VALUES
(
(1005, ‘vidya’, ’26-11-1978’, ‘HUBLI’ , ‘F’, 35000,4)
)
1 row created
INSERT INTO EMP(ENO,ENAME,EBDATE,ADDRESS,GENDER,SALARY,DEPTNO) VALUES
(
(1006, ‘PRAJWAL’, ’02-02-1974, ‘BANGALORE’ , ‘M’, 65000,5)
)
1 row created

INSERT INTO EMP(ENO,ENAME,EBDATE,ADDRESS,GENDER,SALARY,DEPTNO) VALUES
(
(1008, ‘RAJESH’, ’2 -02-2010’, ‘BANGALORE’ , ‘M’, 25000,2)
)
1 row created

SELECT * FROM EMP
ENO	ENAME	EBDATE	ADDRESS	G	SALARY	DEPTNO
1001	ANIRUDH	14-01-90	BANGALORE	M	45000	4
1004	LAKSHMI	04-03-98	MYSORE	F	5500	4
1002	SINCHANA	22-12-90	MANGALORE	F	5000	2
1007	PRASANTH	26-01-89	DHARWAD	M	20000	4
1003	VINAY	26-11-90	HUBLI	M	3000	2
1005	VIDYA	26-1178	HUBLI	F	35000	4
1006	PRAJWAL	02-02-78	BANGALORE	M	65000	5
1008	RAJESH	02-02-10	BANGALORE	M	25000	2
8 row selected

SELECT * FROM DEPT


Dno	Dname	Dlocation
2	Accounts	Jayanagar
4	Research	Kengeri
5	Admin	southend
Insert into project (pno,pname,dnum)values(10,’ERP’,5),(20,’BANKING’,2),(30,’CONNECT_TECH’,4),(40,’SMART_TECH’,5),(50,’SMART_SEEK’,5),(50,’FINANACE’,2),(60,’ANALYTICA’,4),(70,’MARKET_RESEARCH’,4);
SELECT *FROM PROJECT;
PNO	PNAME	DNUM
10	ERP	5
20	BANKING	2
30	CONNECT_TECH	4
40	SMART_SEEK	5
50	FINANCE	2
60	ANALYTICA	4
70	MARKET_RESEARCH	4

INSERT INTO WORKS_ON(ENO,PNUM,HOURS)VALUES(1001,10,4.5),
                                                                                                (1002.10,6),(1008,10,4),(1006,20,4),(1004,20,8),(1005,40,8),(1003,50,8),(1007,60,5);
SELECT *FROM WORKS_ON;
ENO	PNUM	HOURS
1001	10	4.5
1002	10	6
1008	10	4
1006	20	4
1004	20	8
1005	40	8
1003	50	8
1007	60	5


(a)How the resulting salaries , if every employee working on the ‘research ’ departments is given a 10% raise
SELECT E.ENUM,E.ENAME,D.DNAME,E.SALARY AS ‘INC_SALARY’ FROM EMP E ,DEPARTMENT D WHERE E.DEPTNO=D.DNO AND D.NAME=’RESEARCH’;
ENO	ENAME	DNAME	INC_SALARY
1001	ANIRUDH	RESEARCH	49500
1004	LAKSHMI	RESEARCH	60500
1007	PRASANTH	RESEARCH	22000
1005	VIDYA	RESEARCH	38500

(b)Find the sum of the salaries of all employees of the ‘Accounts’ department , as well as the maximum salary, the minimum salary, and the average salary in this department.
SELECT MAX(E.SALARY),MIN(E.SALARY),SUM(E.SALARY),AVG(E.SALARY)FROM EMP E,DEPT D WHERE E.DEPTNO=D.DNO AND D.DNAME=’ACCOUNTS’;
MAX(E.SALARY)	MIN(E.SALARY)	SUM(E.SALARY)	AVG(E.SALARY)
50000	25000	105000	35000




PROGRAM 6. 
Execute the following queries
(a)	Retrieve the name of each employee controlled by Department number 5 (use EXISTS operator )

SELECT E.ENAME FROM EMP E
WHERE EXISTS(SELECT D.DNO FROM DEPT D WHERE E.DETNO = DNO AND EPTNO=5)
ENAME
PRAJWAL

(b)	Retrieve the name of each dept and number of employees working in each department which has at least 2 employees.

SELECT D.DANME.COUNT(*) FROM EMP E.DEPT D
WHERE E.DEPTNO=D.DNO GROUP BY D.NAME HAVING COUNT(*)>=2
DNAME	COUNT(*)
ACCOUNTS	3
RESEARCH	4


PROGRAM 7.
 Execute the following queries
(a)	For each project retrieve the project number, the project name and the number of employees who work on that project. (use GROUPBY)

SELECT P.PNO, P.PNAME COUNT(*) AS “NO_OF_EMP” FROM PROJECT P.WORKS_ON W WHERE P.PNO=W.PNUM GROUP BY P.PNO,P.PNAME

PNO	PNAME	NO_OF_EMP
10	ERP	3
60	ANALYTICA	1
20	BANKING	2
40	SMART_SEEK	1
50	FINANCE	1

(b)	Retrieve the name of employees who born in the year 1990’s

SELECT ENAME,EBDATE FROM EMP WHERE EBDATE LIKE ‘%-%-90’

ENAME	EBDATE
ANIRUDH	14-JAN-90
SINHCANA	22-DEC-90
VINAY	26-NOV-90

PROGRAM 8.
Execute the following queries
	1.For each department that has more than five employees , retrieve the department number and number of employees who are making salary more than 40000.
SELECT D.DNAME,D.DNO COUNT(*) AS “NO_OF_EMP” FROM EMP E.DEPT D
WHERE E.DEPTNO = D.DNO AND E.SALARY >40000 AND
D.DNO IN(SELECT DEPTNO FROM EMP GROUP BY DEPTNO HAVING COUNT(*)>=5)
GROUP BY D.DNO , D.DNAME
No rows selected
2. For each department that has more than two employees , retrieve the department number and number of employees who are making salary more than 40000.
SELECT D.DNAME,D.DNO COUNT(*) FROM EMP E, DEPT D
WHERE E.DEPTNO = D.DNO AND E.SALARY>40000 AND
D.DNO IN(SELECT DEPTNO FROM EMP14 GROUP BY DEPTNO HAVING COUNT(*)>2
GROUP BY D.DNO,D.DNAME
DNAME	DNO	COUNT(*)
ACCOUNTS	2	1
RESEARCH	4	2

PROGRAM 9.
For each project on which more than two employees work, retrieve the project number, project name and the number of employees who work on that project.
SELECT P.PNO, P.NAME COUNT(*) AS “NO_OF_EMP_WORKING” FROM PROJECT P.EORKS ON W
WHERE P.PNO =W.PNUM GROUP BY P.PNO,P.PNAME HAVING COUNT(*)>2
PNO	PNAME	NO_OF_EMP_WORKING
10	ERP	3

PROGRAM 10.For a given set of relation tables perform the following . Creating views (with and without check option). Dropping views, Selecting from a view.
1.Without Check Option
Step 1 : Create View
	CREATE VIEW EMP_DEPT AS (SELECT E.ENO,E.ENAME,E.SALARY,E.DEPTNO,D.DNAME
FROM EMP E.DEPT D WHERE E.DEPTNO = D.DNO)
Step 2: Display all the rows of a view.
	SELECT * FROM EMP_DEPT
	
ENO	ENAME	SALARY	DEPTNO	DNAME
1001	ANIRUDH	45000	4	RESEARCH
1004	LAKSHMI	55000	4	RESEARCH
1002	SINHCANA	50000	2	ACCOUNTS
1007	PRASHANT	20000	4	RESEARCH
1003	VINAY	30000	2	ACCOUNTS
1005	VIDYA	35000	4	RESEARCH
1006	PRAJWAL	65000	5	ADMIN
1008	RAJESH	25000	2	ACCOUNTS
				

Step3 : Insert records into a view
INSERT INTO EMP_DEPT(ENO,EANME,SLARY,DEPTNO) VALUES (1009,”SRIKANTH”, 90000,5,”ADMIN”)
1 row sreated
Step 4: Display all the rows of a view
	SELECT * FROM EMP_DEPT
ENO	ENAME	SALARY	DEPTNO	DNAME
1001	ANIRUDH	45000	4	RESEARCH
1004	LAKSHMI	55000	4	RESEARCH
1002	SINHCANA	50000	2	ACCOUNTS
1007	PRASHANT	20000	4	RESEARCH
1003	VINAY	30000	2	ACCOUNTS
1005	VIDYA	35000	4	RESEARCH
1006	PRAJWAL	65000	5	ADMIN
1008	RAJESH	25000	2	ACCOUNTS
1009	SRIKANTH	90000	5	ADMIN

Step 5: Drop view
	DROP VIEW EMP_DEPT
	View dropped





2.With check option

Step 1: Let us create simple view on EMP table with check option of salary less than 50000 in where condition
CREATE VIEW EMP_VIEW AS
(SELECT ENO,ENAME,SALRY FROM EMP WHERE SALARY<=50000) WITH CHECK OPTION
View EMP_VIEW created
Step 2: Display all the rows of a view
SELECT * FROM EMP_VIEW
ENO	ENAME	SALARY
1001	ANIRUDH	45000
1002	SINHCANA	50000
1007	PRASHANT	20000
1003	VINAY	30000
1005	VIDYA	35000
1008	RAJESH	25000
 6rows selected

Step 3. Insert a row where employee salary is less than 50000
INSERT INTO EMP_VIEW(ENO,ENAME,SALARY)VALUES(1011,’SNIGDHA’,39000)
1 row inserted
Step 4: Display all the rows of a view
SELECT * FROM EMP_VIEW
ENO	ENAME	SALARY
1001	ANIRUDH	45000
1002	SINHCANA	50000
1007	PRASHANT	20000
1003	VINAY	30000
1005	VIDYA	35000
1008	RAJESH	25000
1011	SNIGDHA	39000

Step 5 : Insert a row where employee salary is greater than 50000. This will give an error
INSERT INTO EMP_VIEW(ENO,ENAME,SALARY) VALUES (1012,’SMAYAN’,99999)
ORA-01402:view WITH CHECK OPTION where-clause violation
Step 6: Drop View
DROP VIES EMP_VIEW
View dropped

