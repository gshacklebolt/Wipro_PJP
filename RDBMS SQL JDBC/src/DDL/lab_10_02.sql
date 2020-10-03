INSERT INTO dept (dept_id,dept_name)
SELECT department_id,department_name 
FROM departments;

/* ERROR
INSERT INTO dept (dept_id,dept_name) VALUES (10,'Accounts');

INSERT INTO dept (dept_id,dept_name) VALUES (null,'TT');

UPDATE dept SET dept_id=20 
WHERE dept_name='TT';

INSERT INTO dept (dept_id,dept_name) VALUES ('A1','Accounts');

UPDATE dept SET dept_id=30 
WHERE dept_name='Accounts';
*/
