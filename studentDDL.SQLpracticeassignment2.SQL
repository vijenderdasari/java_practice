--create table student(sid int,sfname varchar(10),slname varchar(20),sage int,semailid varchar(30),sgender varchar(2),sadd varchar(5),srollno int);
--create table deptDetails(did int,deptname varchar(16),createdate DATE);
--create table subjectdeptdetails(subjectid int,subject varchar(10),deptid int);
--create table studentmarks(smid int,studentid int,subjectid int,marks int,percentage float);
--create table studentdeptdetails(sdeptid int,studentid int,deptid int);
--insert into student values(1,"vijay","dasari",25,"agmail1.com","m","wrgl",1234),(2,"praveen","cheruku",24,"bgmail2.com","m","hyd",1235),(3,"akash","ramanna",26,"cgmail3.com","m","ngl",1234),(4,"sai","devarakonda",27,"dgmail4.com","m","bhpl",1236);
--select *from student;
--insert into deptDetails values(1,"cse",'2020-10-06'),(2,"ece",'2019-09-03'),(3,"eee",'2018-05-02');
--select *from deptDetails;
--insert into subjectdeptdetails values(1,"java",123),(2,"python",121),(3,"sql",111),(4,"javapoint",122),(5,"c++",133);
--select *from subjectdeptdetails;
--insert into studentmarks values(12,1,123,90,8),(13,2,124,80,9),(14,3,125,70,7),(15,4,126,75,4);
--select *from studentmarks;
--insert into studentdeptdetails values(1,123,1234),(2,111,1235),(3,124,1236),(4,125,1237),(5,126,1237),(6,127,1234);
--select *from studentdeptdetails;
--select studentid from studentdeptdetails;
--select *from student where sage>20;
--select *from student where sid<10;
--select *from student where sid=1 or sid=3 or sid=4;
--select *from student where sid>1 and sid<4;
--update student set sfname="naveen" where sid=1;
--update deptDetails set deptname='cse' where did=3;
--update student set sage=20 where sid=1 or sid=2 or sid=3;
--delete from deptDetails where deptname=null;
--select *from student where sfname!=null;
--select distinct sage from student;
--select max(marks) from studentmarks;
--select *from student order by srollno desc;
--select *from student order by sid;
--select *from student order by sfname;

--update student set sage=20 where sfname like "v%";
--select sage from student where sfname like "%y";
--delete from student where sfname like "n%";
--select *from student where sage between 20 and 27 group by sfname like "v%";
--select max(marks),subjectid from studentmarks;
--select *from student order by srollno desc;
--select count(sage) from student where sage<21;
--select max(sage),sfname from student group by sfname;
--select sum(sage),sfname from student group by sfname;
--select max(marks),smid from studentmarks group by smid having sum(marks)>70;
--select min(marks),smid from studentmarks group by smid having sum(marks)>70;
--select subject from subjectdeptdetails group by subject like "j%" and deptid in(1,2,5);
--select count(sgender) from student group by sgender='m';
--select count(sfname) from student group by sadd having count(sadd)>1;




