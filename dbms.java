public class DBMS {
    
}

part b --1 

//for updating 
 update book set publisher = 'skyward' where bkid = 'nepjava'; 

 //for delete 
 DELETE FROM WHERE BOOKID ='NEPSE';

 //FOR SAVING AND UNDOING
INSERT INTO BRANCH(BRID,BNAME,HOD)VALUES(60,'MCA','NARAYAN');

COMMIT;
START TRANSACTION;
SAVEPOINT S1;
INSERT INTO BRANCH(BRID,BNAME,HOD)VALUES(70,'ME','PRABHU');
INSERT INTO BRANCH(BRID,BNAME,HOD)VALUES(80,'BE','AKASH');

ROLLBACK TO S1;


->-> PART B -2

 (A) -> SELECT *FROM STUDENT S,BRANCH BR WHERE S.BRID=BR.BRID AND S.SEM='IISEM' AND BR.BNAME='BCA';
 (B) -> SELECT *FROM STUDENT S WHERE S.USN NOT IN(SELECT B.USN FROM BORROW B);

 [->  PART B - 3 <-  ]

 (A) -> SELECT S.USN,S.NAME,S.SEM,BR.BNAME,BK.BKNAME,A.ANANE,B.BORROW_DATE FROM STUDENT S,BRANCH BR,BOOK BK,AUTHOR A,BORROW B,WHERE S.BRID=BR.BRID AND S.BRID=BK.BRID AND A.AID=BK.AID AND B.USN=S.USN AND BK.BKID=B.BKID AND S.SEM='IISEM' AND BR.BNAME='BCA'
 (B) -> SELECT A.ANAME,COUNT(DISTINCT BK.BKID)AS "NO OF BOOKS" FROM AUTHOR A,BOOK BK WHERE A.AID=BK.AID GROUP BY A.ANAME;

 [ || PART B  4 ||]

  (A) -> SELECT S.NAME FROM STUDENT S,BORROW B WHERE S.USN=B.USN GROUP BY S.NAME HAVING COUNT(DISTINCT B.BKID)>2;
  (B) ->SELECT S.NAME,COUNT(DISTINCT BK.AID)FROM STUDENT S,BOOK BK,BORROW B WHERE S.USN=B.USN AND B.BKID=BK.BKID GROUP BY S.NAME HAVING COUNT(DISTINCT BK.AID)>1;

=> PART B -5
 (A) ->SELECT *FROM BOOK ORDER BY BNAME DESC;
 (B) ->SELECT S.NAME,COUNT(BK.PUBLISHER)FROM STUDENT S, BOOK BK,BORROW B  WHERE S.USN=B.USN AND B.BKID=BK.BKID GROUP BY S.NAME HAVING COUNT(BK.PUBLISHER)>1;

 PART B 
 QUE 6

 create table students(usn varchar(10)primary key,name varchar(20)not null,dob date,branch varchar(20)not null,marki int,mark2 int,mark3 int,total int,gpa int);
  insert into students(usn,name,dob,branch,marki,mark2,mark3,total,gpa)values('sca202201','sanjana','2022-04-2','bca',85,96,97,NULL,NULL);
  
  •	INSERTING Records into a table and saving
  > insert into students(usn,name,dob,branch,marki,mark2,mark3,total,gpa)values('sca202204','bhavana','2022-04-6','ba',85,96,97,NULL,NULL);
   INSERT ONE MORE ;
    COMMIT;
    START TRANSACTION;
    delete from  students where usn='sca202201';
    SAVEPOINT S1;
    insert into students(usn,name,dob,branch,marki,mark2,mark3,total,gpa)values('sca202206','ANnA','2022-04-7','ba',85,96,97,NULL,NULL);
    update students set total=marki+mark2+mark3;
     
    PART B 
    Q7
    (A) -> UPDATE STUDENTS SET gpa=((100*TOTAL)/300)/10;
    (B) -> SELECT USN,NAME,BRANCH,BOB,FROM STUDENTS WHERE DOB LIKE '%_%_06';

    PART b
     Q 8 
     (A) ->SELECT USN,NAME,BRANCH,dOB FROM STUDENTS WHERE BRANCH='ba';
     (B) ->select branch,max(gpa)from students group by branch;
    
