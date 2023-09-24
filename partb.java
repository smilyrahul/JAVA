public class partb {
    
}
PART B
Create the following tables with properly specifying Primary keys, Foreign keys and solve the following queries.
BRANCH (Branchid, Branchname, HOD)
STUDENT (USN, Name, Address, Branchid, sem)
BOOK (Bookid, Bookname, Authorid, Publisher, Branchid)
AUTHOR (Authorid, Authorname, Country, age)
BORROW (USN, Bookid, Borrowed_Date)
•	mysql> create table Branch (BRID INT PRIMARY KEY,BNAME VARCHAR(15)NOT NULL,HOD VARCHAR(10));
Query OK, 0 rows affected (0.34 sec)
mysql> DESC BRANCH;
-------+-------------+------+-----+---------+-------+
| Field | Type        | Null | Key | Default | Extra |
+-------+-------------+------+-----+---------+-------+
| BRID  | int(11)     | NO   | PRI | NULL    |       |
| BNAME | varchar(15) | NO   |     | NULL    |       |
| HOD   | varchar(10) | YES  |     | NULL    |       |
+-------+-------------+------+-----+---------+-------+
•	mysql> CREATE TABLE STUDENT(USN VARCHAR(15)PRIMARY KEY,NAME VARCHAR(20),ADDRESS VARCHAR(15),BRID INT REFERENCES BRANCH,SEM VARCHAR(5));
Query OK, 0 rows affected (0.39 sec)

mysql> DESC STUDENT;
+---------+-------------+------+-----+---------+-------+
| Field   | Type        | Null | Key | Default | Extra |
+---------+-------------+------+-----+---------+-------+
| USN     | varchar(15) | NO   | PRI | NULL    |       |
| NAME    | varchar(20) | YES  |     | NULL    |       |
| ADDRESS | varchar(15) | YES  |     | NULL    |       |
| BRID    | int(11)     | YES  |     | NULL    |       |
| SEM     | varchar(5)  | YES  |     | NULL    |       |
+---------+-------------+------+-----+---------+-------+
5 rows in set (0.00 sec)
•	mysql> CREATE TABLE AUTHOR(AID INT PRIMARY KEY,ANAME VARCHAR(15),COUNTRY VARCHAR(15),AGE INT);
Query OK, 0 rows affected (0.41 sec)

mysql> DESC AUTHOR;
+---------+-------------+------+-----+---------+-------+
| Field   | Type        | Null | Key | Default | Extra |
+---------+-------------+------+-----+---------+-------+
| AID     | int(11)     | NO   | PRI | NULL    |       |
| ANAME   | varchar(15) | YES  |     | NULL    |       |
| COUNTRY | varchar(15) | YES  |     | NULL    |       |
| AGE     | int(11)     | YES  |     | NULL    |       |
+---------+-------------+------+-----+---------+-------+
4 rows in set (0.00 sec)
•	mysql> CREATE TABLE BOOK(BKID VARCHAR(10)PRIMARY KEY,BNAME VARCHAR(15),AID VARCHAR(10)REFERENCES AUTHOR,PUBLISHER VARCHAR(20),BRID INT REFERENCES BRANCH);
Query OK, 0 rows affected (0.43 sec)

mysql> DESC BOOK;
+-----------+-------------+------+-----+---------+-------+
| Field     | Type        | Null | Key | Default | Extra |
+-----------+-------------+------+-----+---------+-------+
| BKID      | varchar(10) | NO   | PRI | NULL    |       |
| BNAME     | varchar(15) | YES  |     | NULL    |       |
| AID       | varchar(10) | YES  |     | NULL    |       |
| PUBLISHER | varchar(20) | YES  |     | NULL    |       |
| BRID      | int(11)     | YES  |     | NULL    |       |
+-----------+-------------+------+-----+---------+-------+
5 rows in set (0.00 sec)
mysql> CREATE TABLE BORROW(USN VARCHAR(15)REFERENCES STUDENT,BKID VARCHAR(10) REFERENCES BOOK,BORROW_DATE DATE);
Query OK, 0 rows affected (0.39 sec)

•	mysql> DESC BORROW;
+-------------+-------------+------+-----+---------+-------+
| Field       | Type        | Null | Key | Default | Extra |
+-------------+-------------+------+-----+---------+-------+
| USN         | varchar(15) | YES  |     | NULL    |       |
| BKID        | varchar(10) | YES  |     | NULL    |       |
| BORROW_DATE | date        | YES  |     | NULL    |       |
+-------------+-------------+------+-----+---------+-------+
3 rows in set (0.00 sec)

1. Perform the following:
a. Viewing all databases,
 Creating a Database,
Viewing all Tables in a Database,
Creating Tables (With and Without Constraints),
Inserting/Updating/Deleting Records in a Table, Saving (Commit) and Undoing (rollback)
•	Viewing all Tables in a Database
mysql> SHOW TABLES;
+-------------------+
| Tables_in_aswathy |
+-------------------+
| author            |
| book              |
| borrow            |
| branch            |
| student           |
+-------------------+
5 rows in set (0.04 sec)
•	Inserting records in a table
mysql> insert INTO BRANCH(BRID,BNAME,HOD)VALUES(10,'BCA','SANTHOSH');
Query OK, 1 row affected (0.12 sec)

mysql> insert INTO BRANCH(BRID,BNAME,HOD)VALUES(20,'BBA','RASHMI');
Query OK, 1 row affected (0.18 sec)

mysql> insert INTO BRANCH(BRID,BNAME,HOD)VALUES(30,'BCOM','RAMESH');
Query OK, 1 row affected (0.10 sec)

mysql> insert INTO BRANCH(BRID,BNAME,HOD)VALUES(40,'BSC','ADITYA');
Query OK, 1 row affected (0.14 sec)

mysql> insert INTO BRANCH(BRID,BNAME,HOD)VALUES(50,'BA','ASHA');
Query OK, 1 row affected (0.21 sec)

mysql> SELECT *FROM BRANCH;
+------+-------+----------+
| BRID | BNAME | HOD      |
+------+-------+----------+
|   10 | BCA   | SANTHOSH |
|   20 | BBA   | RASHMI   |
|   30 | BCOM  | RAMESH   |
|   40 | BSC   | ADITYA   |
|   50 | BA    | ASHA     |
+------+-------+----------+
5 rows in set (0.00 sec)
mysql> INSERT INTO STUDENT(USN,NAME,ADDRESS,BRID,SEM)VALUES('SCAS202201','ANURADHA','JAYANAGAR',10,'IISEM');
Query OK, 1 row affected (0.14 sec)

mysql> INSERT INTO STUDENT(USN,NAME,ADDRESS,BRID,SEM)VALUES('SCAS202202','MANJULA','BASAVANGUDI',10,'IISEM');
Query OK, 1 row affected (0.18 sec)

mysql> INSERT INTO STUDENT(USN,NAME,ADDRESS,BRID,SEM)VALUES('SCAS202203','LAKSHMI','BASAVANGUDI',10,'IVSEM');
Query OK, 1 row affected (0.16 sec)

mysql> INSERT INTO STUDENT(USN,NAME,ADDRESS,BRID,SEM)VALUES('SCAS202204','RENUKA','HANUMANTANAGAR',20,'IVSEM');
Query OK, 1 row affected (0.14 sec)

mysql> INSERT INTO STUDENT(USN,NAME,ADDRESS,BRID,SEM)VALUES('SCAS202205','ARUN','JPNAGAR',30,'IISEM');
Query OK, 1 row affected (0.36 sec)

mysql> INSERT INTO STUDENT(USN,NAME,ADDRESS,BRID,SEM)VALUES('SCAS202206','ABHI','GIRINAGAR',40,'IISEM');
Query OK, 1 row affected (0.15 sec)

mysql> INSERT INTO STUDENT(USN,NAME,ADDRESS,BRID,SEM)VALUES('SCAS202207','DEEPTHI','GIRINAGAR',50,'IISEM');
Query OK, 1 row affected (0.11 sec)
mysql> SELECT *FROM STUDENT;
+------------+----------+----------------+------+-------+
| USN        | NAME     | ADDRESS        | BRID | SEM   |
+------------+----------+----------------+------+-------+
| SCAS202201 | ANURADHA | JAYANAGAR      |   10 | IISEM |
| SCAS202202 | MANJULA  | BASAVANGUDI    |   10 | IISEM |
| SCAS202203 | LAKSHMI  | BASAVANGUDI    |   10 | IVSEM |
| SCAS202204 | RENUKA   | HANUMANTANAGAR |   20 | IVSEM |
| SCAS202205 | ARUN     | JPNAGAR        |   30 | IISEM |
| SCAS202206 | ABHI     | GIRINAGAR      |   40 | IISEM |
| SCAS202207 | DEEPTHI  | GIRINAGAR      |   50 | IISEM |
+------------+----------+----------------+------+-------+
7 rows in set (0.00 sec)
mysql> insert into AUTHOR(AID,ANAME,COUNTRY,AGE)VALUES('123','ARUNA','INDIA',36);
Query OK, 1 row affected (0.22 sec)

mysql> insert into AUTHOR(AID,ANAME,COUNTRY,AGE)VALUES('143','SUMA','INDIA',38);
Query OK, 1 row affected (0.20 sec)

mysql> insert into AUTHOR(AID,ANAME,COUNTRY,AGE)VALUES('144','SANGEETHA','INDIA',42);
Query OK, 1 row affected (0.14 sec)

mysql> insert into AUTHOR(AID,ANAME,COUNTRY,AGE)VALUES('145','DILEEP','INDIA',39);
Query OK, 1 row affected (0.14 sec)

mysql> insert into AUTHOR(AID,ANAME,COUNTRY,AGE)VALUES('155','SKHEKARP','INDIA',44);
Query OK, 1 row affected (0.18 sec)

mysql> SELECT *FROM AUTHOR;
+-----+-----------+---------+------+
| AID | ANAME     | COUNTRY | AGE  |
+-----+-----------+---------+------+
| 123 | ARUNA     | INDIA   |   36 |
| 143 | SUMA      | INDIA   |   38 |
| 144 | SANGEETHA | INDIA   |   42 |
| 145 | DILEEP    | INDIA   |   39 |
| 155 | SKHEKARP  | INDIA   |   44 |
+-----+-----------+---------+------+
5 rows in set (0.00 sec)
mysql> INSERT INTO BOOK(BKID,BNAME,AID,PUBLISHER,BRID)VALUES('NEPDBMS','DBMS',123,'SKYWARD',10);
Query OK, 1 row affected (0.14 sec)

mysql> INSERT INTO BOOK(BKID,BNAME,AID,PUBLISHER,BRID)VALUES('NEPSE','SE',143,'SKYWARD',10);
Query OK, 1 row affected (0.14 sec)

mysql> INSERT INTO BOOK(BKID,BNAME,AID,PUBLISHER,BRID)VALUES('NEPJAVA','JAVA',144,'OXFORD',20);
Query OK, 1 row affected (0.09 sec)

mysql> INSERT INTO BOOK(BKID,BNAME,AID,PUBLISHER,BRID)VALUES('NEPMATHS','MATHS',145,'OXFORD',20);
Query OK, 1 row affected (0.17 sec)

mysql> SELECT *FROM BOOK;
+----------+-------+------+-----------+------+
| BKID     | BNAME | AID  | PUBLISHER | BRID |
+----------+-------+------+-----------+------+
| NEPDBMS  | DBMS  | 123  | SKYWARD   |   10 |
| NEPJAVA  | JAVA  | 144  | OXFORD    |   20 |
| NEPMATHS | MATHS | 145  | OXFORD    |   20 |
| NEPSE    | SE    | 143  | SKYWARD   |   10 |
+----------+-------+------+-----------+------+
4 rows in set (0.00 sec)
mysql> INSERT INTO BORROW(USN,BKID,BORROW_DATE)VALUES('SCA2021','NEPDBMS','2008-11-11');
Query OK, 1 row affected (0.13 sec)

mysql> INSERT INTO BORROW(USN,BKID,BORROW_DATE)VALUES('SCAS202201','NEPSE','2009-10-11');
Query OK, 1 row affected (0.14 sec)

mysql> INSERT INTO BORROW(USN,BKID,BORROW_DATE)VALUES('SCAS202204','NEPMATHS','2009-10-11');
Query OK, 1 row affected (0.20 sec)

mysql> SELECT *FROM BORROW;
+------------+----------+-------------+
| USN        | BKID     | BORROW_DATE |
+------------+----------+-------------+
| SCA2021    | NEPDBMS  | 2008-11-11  |
| SCAS202201 | NEPSE    | 2009-10-11  |
| SCAS202204 | NEPMATHS | 2009-10-11  |
+------------+----------+-------------+
3 rows in set (0.00 sec)
3.uPDATING RECORDS IN A TABLE
mysql> UPDATE BOOK SET PUBLISHER='SKYWARD' WHERE BKID='NEPJAVA';
Query OK, 1 row affected (0.14 sec)
Rows matched: 1  Changed: 1  Warnings: 0

mysql> SELECT *FROM BOOK;
+----------+-------+------+-----------+------+
| BKID     | BNAME | AID  | PUBLISHER | BRID |
+----------+-------+------+-----------+------+
| NEPDBMS  | DBMS  | 123  | SKYWARD   |   10 |
| NEPJAVA  | JAVA  | 144  | SKYWARD   |   20 |
| NEPMATHS | MATHS | 145  | OXFORD    |   20 |
| NEPSE    | SE    | 143  | SKYWARD   |   10 |
+----------+-------+------+-----------+------+
4 rows in set (0.00 sec)4

4.DELETING RECORDS FROM A TABLE
mysql> DELETE FROM  BOOK WHERE BKID='NEPSE';
Query OK, 1 row affected (0.39 sec)

mysql> SELECT *FROM BOOK;
+----------+-------+------+-----------+------+
| BKID     | BNAME | AID  | PUBLISHER | BRID |
+----------+-------+------+-----------+------+
| NEPDBMS  | DBMS  | 123  | SKYWARD   |   10 |
| NEPJAVA  | JAVA  | 144  | SKYWARD   |   20 |
| NEPMATHS | MATHS | 145  | OXFORD    |   20 |
+----------+-------+------+-----------+------+
3 rows in set (0.00 sec)
5.PERFORM SAVING
mysql> INSERT INTO BRANCH(BRID,BNAME,HOD)VALUES(60,'MCA','NARAYAN');
Query OK, 1 row affected (0.23 sec)

mysql> COMMIT;
Query OK, 0 rows affected (0.00 sec)

mysql> SELECT *FROM BRANCH;
+------+-------+----------+
| BRID | BNAME | HOD      |
+------+-------+----------+
|   10 | BCA   | SANTHOSH |
|   20 | BBA   | RASHMI   |
|   30 | BCOM  | RAMESH   |
|   40 | BSC   | ADITYA   |
|   50 | BA    | ASHA     |
|   60 | MCA   | NARAYAN  |
+------+-------+----------+
6 rows in set (0.00 sec)
6.PERFORM UNDOING
SAVEPOINT S1;
mysql> SAVEPOINT S1;
Query OK, 0 rows affected (0.00 sec)

mysql> INSERT INTO BRANCH(BRID,BNAME,HOD)VALUES(70,'ME','PRABHU');
Query OK, 1 row affected (0.16 sec)

mysql> INSERT INTO BRANCH(BRID,BNAME,HOD)VALUES(80,'BE','AKASH');
Query OK, 1 row affected (0.16 sec)

mysql> ROLL BACK S1;
mysql> SELECT *FROM BRANCH;
+------+-------+----------+
| BRID | BNAME | HOD      |
+------+-------+----------+
|   10 | BCA   | SANTHOSH |
|   20 | BBA   | RASHMI   |
|   30 | BCOM  | RAMESH   |
|   40 | BSC   | ADITYA   |
|   50 | BA    | ASHA     |
|   60 | MCA   | NARAYAN  |
+------+-------+----------+
PROGRAM 2.
 a. List the details of Students who are all studying in 2nd sem BCA.
ysql> SELECT *FROM STUDENT S,BRANCH BR WHERE S.BRID=BR.BRID AND S.SEM='IISEM' AND BR.BNAME='BCA';
+------------+----------+-------------+------+-------+------+-------+----------+
| USN        | NAME     | ADDRESS     | BRID | SEM   | BRID | BNAME | HOD      |
+------------+----------+-------------+------+-------+------+-------+----------+
| SCAS202201 | ANURADHA | JAYANAGAR   |   10 | IISEM |   10 | BCA   | SANTHOSH |
| SCAS202202 | MANJULA  | BASAVANGUDI |   10 | IISEM |   10 | BCA   | SANTHOSH |
+------------+----------+-------------+------+-------+------+-------+----------+
2 rows in set (0.04 sec)
 b. List the students who are not borrowed any books.
ysql> SELECT *FROM STUDENT S WHERE S.USN NOT IN(SELECT B.USN FROM BORROW B);
+------------+---------+-------------+------+-------+
| USN        | NAME    | ADDRESS     | BRID | SEM   |
+------------+---------+-------------+------+-------+
| SCAS202202 | MANJULA | BASAVANGUDI |   10 | IISEM |
| SCAS202203 | LAKSHMI | BASAVANGUDI |   10 | IVSEM |
| SCAS202205 | ARUN    | JPNAGAR     |   30 | IISEM |
| SCAS202206 | ABHI    | GIRINAGAR   |   40 | IISEM |
| SCAS202207 | DEEPTHI | GIRINAGAR   |   50 | IISEM |
+------------+---------+-------------+------+-------+
5 rows in set (0.08 sec)
PROGRAM 3..
 a. Display the USN, Student name, Branch_name, Book_name, Author_name, Books_Borrowed_ Date of 2nd sem BCA Students who borrowed books.

mysql> SELECT S.USN,S.NAME,S.SEM,BR.BNAME,BK.BKNAME,A.ANANE,B.BORROW_DATE FROM STUDENT S,BRANCH BR,BOOK BK,AUTHOR A,BORROW B,WHERE S.BRID=BR.BRID AND S.BRID=BK.BRID AND A.AID=BK.AID AND B.USN=S.USN AND BK.BKID=B.BKID AND S.SEM='IISEM' AND BR.BNAME='BCA';
b. Display the number of books written by each Author
mysql> SELECT A.ANAME,COUNT(DISTINCT BK.BKID)AS "NO OF BOOKS" FROM AUTHOR A,BOOK BK WHERE A.AID=BK.AID GROUP BY A.ANAME;
+-----------+-------------+
| ANAME     | NO OF BOOKS |
+-----------+-------------+
| ARUNA     |           1 |
| DILEEP    |           1 |
| SANGEETHA |           1 |
+-----------+-------------+
3 rows in set (0.05 sec)
PROGRAM 4.
 a. Display the student details who borrowed more than two books.
mysql> SELECT S.NAME FROM STUDENT S,BORROW B WHERE S.USN=B.USN GROUP BY S.NAME HAVING COUNT(DISTINCT B.BKID)>2;
Empty set (0.00 sec)
 b.Display the student details who borrowed books of more than oneAuthor
mysql> SELECT S.NAME,COUNT(DISTINCT BK.AID)FROM STUDENT S,BOOK BK,BORROW B WHERE S.USN=B.USN AND B.BKID=BK.BKID GROUP BY S.NAME HAVING COUNT(DISTINCT BK.AID)>1;
Empty set (0.00 sec)
PROGRAM 5
a. Display the Book names in descending order of their names.
mysql> SELECT *FROM BOOK ORDER BY BNAME DESC;
+----------+-------+------+-----------+------+
| BKID     | BNAME | AID  | PUBLISHER | BRID |
+----------+-------+------+-----------+------+
| NEPMATHS | MATHS | 145  | OXFORD    |   20 |
| NEPJAVA  | JAVA  | 144  | SKYWARD   |   20 |
| NEPDBMS  | DBMS  | 123  | SKYWARD   |   10 |
+----------+-------+------+-----------+------+
3 rows in set (0.00 sec)
 b. List the details of students who borrowed the books which are all published by the same publisher. Consider the following schema: STUDENT (USN, name, date_of_birth, branch, mark1, mark2, mark3, total, GPA
mysql> SELECT S.NAME,COUNT(BK.PUBLISHER)FROM STUDENT S, BOOK BK,BORROW B  WHERE S.USN=B.USN AND B.BKID=BK.BKID GROUP BY S.NAME HAVING COUNT(BK.PUBLISHER)>1;
Empty set (0.00 sec)
PROGRAM 6
. Perform the following:
a.	Creating Tables (With and Without Constraints),Inserting/Updating/Deleting Records in a Table, Saving (Commit) and Undoing (rollback)
•	Creating Tables (With and Without Constraints),
mysql> create table students(usn varchar(10)primary key,name varchar(20)not null,dob date,branch varchar(20)not null,marki int,mark2 int,mark3 int,total int,gpa int);
Query OK, 0 rows affected (0.50 sec)

mysql> desc students;
+--------+-------------+------+-----+---------+-------+
| Field  | Type        | Null | Key | Default | Extra |
+--------+-------------+------+-----+---------+-------+
| usn    | varchar(10) | NO   | PRI | NULL    |       |
| name   | varchar(20) | NO   |     | NULL    |       |
| dob    | date        | YES  |     | NULL    |       |
| branch | varchar(20) | NO   |     | NULL    |       |
| marki  | int(11)     | YES  |     | NULL    |       |
| mark2  | int(11)     | YES  |     | NULL    |       |
| mark3  | int(11)     | YES  |     | NULL    |       |
| total  | int(11)     | YES  |     | NULL    |       |
| gpa    | int(11)     | YES  |     | NULL    |       |
+--------+-------------+------+-----+---------+-------+
9 rows in set (0.07 sec)
•	Inserting records into the table
mysql> insert into students(usn,name,dob,branch,marki,mark2,mark3,total,gpa)values('sca202201','sanjana','2022-04-2','bca',85,96,97,NULL,NULL);
Query OK, 1 row affected (0.19 sec)

mysql> insert into students(usn,name,dob,branch,marki,mark2,mark3,total,gpa)values('sca202202','ANIL','2022-04-4','bcOM',85,96,97,NULL,NULL);
Query OK, 1 row affected (0.15 sec)

mysql> insert into students(usn,name,dob,branch,marki,mark2,mark3,total,gpa)values('sca202203','AKASH','2022-04-5','bSC',85,96,97,NULL,NULL);
Query OK, 1 row affected (0.10 sec)
mysql> SELECT *FROM STUDENTS;
+-----------+---------+------------+--------+-------+-------+-------+-------+------+
| usn       | name    | dob        | branch | marki | mark2 | mark3 | total | gpa  |
+-----------+---------+------------+--------+-------+-------+-------+-------+------+
| sca202201 | sanjana | 2022-04-02 | bca    |    85 |    96 |    97 |  NULL | NULL |
| sca202202 | ANIL    | 2022-04-04 | bcOM   |    85 |    96 |    97 |  NULL | NULL |
| sca202203 | AKASH   | 2022-04-05 | bSC    |    85 |    96 |    97 |  NULL | NULL |
+-----------+---------+------------+--------+-------+-------+-------+-------+------+
3 rows in set (0.00 sec)
•	INSERTING Records into a table and saving
mysql> insert into students(usn,name,dob,branch,marki,mark2,mark3,total,gpa)values('sca202204','bhavana','2022-04-6','ba',85,96,97,NULL,NULL);
Query OK, 1 row affected (0.17 sec)

mysql> insert into students(usn,name,dob,branch,marki,mark2,mark3,total,gpa)values('sca202205','ANIJA','2022-04-7','ba',85,96,97,NULL,NULL);
Query OK, 1 row affected (0.18 sec)

mysql> COMMIT;
Query OK, 0 rows affected (0.00 sec)
•	Deleting records from  table and saving
ysql> delete from  students where usn='sca202201';
Query OK, 1 row affected (0.18 sec)

mysql> savepoint s1;
Query OK, 0 rows affected (0.00 sec)

mysql> insert into students(usn,name,dob,branch,marki,mark2,mark3,total,gpa)values('sca202206','ANnA','2022-04-7','ba',85,96,97,NULL,NULL);
Query OK, 1 row affected (0.16 sec)
mysql> select *from students;
+-----------+---------+------------+--------+-------+-------+-------+-------+------+
| usn       | name    | dob        | branch | marki | mark2 | mark3 | total | gpa  |
+-----------+---------+------------+--------+-------+-------+-------+-------+------+
| sca202202 | ANIL    | 2022-04-04 | bcOM   |    85 |    96 |    97 |  NULL | NULL |
| sca202203 | AKASH   | 2022-04-05 | bSC    |    85 |    96 |    97 |  NULL | NULL |
| sca202204 | bhavana | 2022-04-06 | ba     |    85 |    96 |    97 |  NULL | NULL |
| sca202205 | ANIJA   | 2022-04-07 | ba     |    85 |    96 |    97 |  NULL | NULL |
| sca202206 | ANnA    | 2022-04-07 | ba     |    85 |    96 |    97 |  NULL | NULL |
+-----------+---------+------------+--------+-------+-------+-------+-------+------+
5 rows in set (0.00 sec)
Updating Records in atable
mysql> update students set total=marki+mark2+mark3;
Query OK, 5 rows affected (0.12 sec)
Rows matched: 5  Changed: 5  Warnings: 0

mysql> select *from students;
+-----------+---------+------------+--------+-------+-------+-------+-------+------+
| usn       | name    | dob        | branch | marki | mark2 | mark3 | total | gpa  |
+-----------+---------+------------+--------+-------+-------+-------+-------+------+
| sca202202 | ANIL    | 2022-04-04 | bcOM   |    85 |    96 |    97 |   278 | NULL |
| sca202203 | AKASH   | 2022-04-05 | bSC    |    85 |    96 |    97 |   278 | NULL |
| sca202204 | bhavana | 2022-04-06 | ba     |    85 |    96 |    97 |   278 | NULL |
| sca202205 | ANIJA   | 2022-04-07 | ba     |    85 |    96 |    97 |   278 | NULL |
| sca202206 | ANnA    | 2022-04-07 | ba     |    85 |    96 |    97 |   278 | NULL |
+-----------+---------+------------+--------+-------+-------+-------+-------+------+
5 rows in set (0.00 sec)
PROGRAM 7. Execute the following queries:
 a. Find the GPA score of all the students. 
b. Find the students who born on a particular year of birth from the date_of_birth column.
ysql> UPDATE STUDENTS SET gpa=((100*TOTAL)/300)/10;
Query OK, 5 rows affected (0.17 sec)
Rows matched: 5  Changed: 5  Warnings: 0

mysql> select *from students;
+-----------+---------+------------+--------+-------+-------+-------+-------+------+
| usn       | name    | dob        | branch | marki | mark2 | mark3 | total | gpa  |
+-----------+---------+------------+--------+-------+-------+-------+-------+------+
| sca202202 | ANIL    | 2022-04-04 | bcOM   |    85 |    96 |    97 |   278 |    9 |
| sca202203 | AKASH   | 2022-04-05 | bSC    |    85 |    96 |    97 |   278 |    9 |
| sca202204 | bhavana | 2022-04-06 | ba     |    85 |    96 |    97 |   278 |    9 |
| sca202205 | ANIJA   | 2022-04-07 | ba     |    85 |    96 |    97 |   278 |    9 |
| sca202206 | ANnA    | 2022-04-07 | ba     |    85 |    96 |    97 |   278 |    9 |
+-----------+---------+------------+--------+-------+-------+-------+-------+------+
5 rows in set (0.00 sec)
•	mysql> SELECT USN,NAME,BRANCH,BOB,FROM STUDENTS WHERE DOB LIKE '%_%_06';
+-----------+---------+------------+--------+-------+-------+-------+-------+------+
| usn       | name    | dob        | branch | marki | mark2 | mark3 | total | gpa  |
+-----------+---------+------------+--------+-------+-------+-------+-------+------+
| sca202204 | bhavana | 2022-04-06 | ba     |    85 |    96 |    97 |   278 |    9 |
+-----------+---------+------------+--------+-------+-------+-------+-------+------+
1 row in set (0.00 sec)
PROGRAM 8. 
a.	List the students who are studying in a particular branch of study. 
mysql> SELECT USN,NAME,BRANCH,dOB FROM STUDENTS WHERE BRANCH='ba';
+-----------+---------+--------+------------+
| USN       | NAME    | BRANCH | dOB        |
+-----------+---------+--------+------------+
| sca202204 | bhavana | ba     | 2022-04-06 |
| sca202205 | ANIJA   | ba     | 2022-04-07 |
| sca202206 | ANnA    | ba     | 2022-04-07 |
+-----------+---------+--------+------------+
3 rows in set (0.00 sec)
b.	Find the maximum GPA score of the student branch-wise
mysql> select branch,max(gpa)from students group by branch;
+--------+----------+
| branch | max(gpa) |
+--------+----------+
| bcOM   |        9 |
| bSC    |        9 |
| ba     |        9 |
+--------+----------+
3 rows in set (0.04 sec)
