/*COPY TABLE*/
CREATE TABLE employee_CRUD
(
empNo INT NOT NULL PRIMARY KEY,
empName VARCHAR(30) NOT NULL,
salary INT DEFAULT 2000,
department VARCHAR(100),
jobPosition VARCHAR(100),
registerDate Date,
city VARCHAR(30),
dob Date,
phoneNo VARCHAR(20)
);

/*COPY DATA*/
INSERT INTO employee_CRUD (empNo,empName,salary,department,jobPosition,registerDate,city,dob,phoneNo) VALUES
(101,'Kim So Hyun',9000,'Electronics','Manager','2012-12-24','Yangon','1988-03-05','09234433321'),
(102,'Yoo Seung Ho',8200,'Electronics','Accountant','2014-02-04','Yangon','1994-08-14','09123349954'),
(103,'Ji Chang Wook',7800,'Electronics','Auditor','2011-09-03','Yangon','1988-09-02','09444493329'),
(105,'Kim Tae Hyung',6000,'Software Engineering','Sale','2015-03-09','Mandalay','1996-03-08','09449983381'),
(106,'Jung Kook',6000,'Software Engineering','Sale','2015-03-09','Mandalay','1997-08-23','09794487791'),
(107,'Sugar',9200,'Software Engineering','Manager','2015-03-09','PyinOoLwin','1994-12-03','09393389491'),
(108,'Park Shin Hye',9800,'HR','Manager','2013-11-08','Yangon','1992-10-22','09339995521'),
(109,'Suzy', 4000,'HR','Sale','2014-12-09','TaungGyi','1996-05-12','09342293382'),
(110,'J Hope',4200,'HR','Developer','2014-12-09','Monywa','1995-09-03','09492289983');



                        /*Start CRUD assignment*/
                        
/*No.1 Assignment*/
INSERT INTO employee_crud (empName,registerDate,empNo) VALUES 
 ('NANASHI','2019-9-08',111);
 
/*No.2 Assignment*/
UPDATE employee_crud 
SET city = 'Yangon', dob = '1994-4-03', jobPosition = 'Administrative Assistant', phoneNo = '09123456789'
WHERE empNo = 111;

/*No.3 Assignment*/
SELECT * FROM employee_crud WHERE empNo=111;

/*No.4*/
SELECT * FROM employee_crud;

/*No.5*/
DELETE FROM employee_crud WHERE empNo= 109 OR empNo=110;

