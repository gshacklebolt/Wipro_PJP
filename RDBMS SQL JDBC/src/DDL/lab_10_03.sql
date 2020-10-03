CREATE TABLE EMP(
                id number(7) CONSTRAINT emp_table_id_pk PRIMARY KEY,
                last_name varchar2(25) CONSTRAINT emp_table_last_name_nn NOT NULL,
                first_name varchar2(25),
                dept_id number(7) CONSTRAINT emp_table_dept_id_fk REFERENCES dept(dept_id)
                );
DESCRIBE EMP;


INSERT INTO emp VALUES (101,'Sam','Sundar',10);

/*Error: Duplicate entry
INSERT INTO emp VALUES (101,'Ram','Krishna',20);
*/

INSERT INTO emp VALUES (102,'Gopi',null,40);

/*Error: NULL value not accepted
INSERT INTO emp VALUES (103,null,'ram',20);
*/