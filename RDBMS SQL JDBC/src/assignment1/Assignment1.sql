CREATE OR REPLACE PROCEDURE CAL_NETSALARY(
    empployeeNum IN emp.empno%TYPE,
    netSal OUT emp.sal%TYPE
) 
IS
    salary emp.sal%TYPE;
    commision emp.comm%TYPE;
    grossSal emp.sal%TYPE;
BEGIN
    SELECT sal,comm INTO salary,commision 
    FROM emp 
    WHERE empno=empployeeNum;

    --Commision might be null, so using NVL to prevent addittion with null.
    grossSal:=salary+NVL(commision,0);
    
    IF commision IS NULL THEN
        netSal:=grossSal-(0.10*grossSal);
    ELSIF (commision<500) THEN
        netSal:=grossSal-(0.15*grossSal);
    ELSE
        netSal:=grossSal-(0.20*grossSal);
    END IF;
END;