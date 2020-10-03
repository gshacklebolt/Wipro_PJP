--Task 1:
--Drop in case duplicates exist
--DROP TABLE TBL_SALES;
--DROP TABLE TBL_STOCK;

CREATE TABLE TBL_STOCK (
    Product_ID VARCHAR2(6) CONSTRAINT tbl_stock_pk PRIMARY KEY,
    Product_Name VARCHAR2(20) CONSTRAINT tbl_stock_product_name_uk UNIQUE,
    Quantity_On_Hand NUMBER,
    Product_Unit_Price NUMBER,
    Reorder_Level NUMBER,
    CONSTRAINT tbl_stock_check1 CHECK(Quantity_On_Hand>=0),
    CONSTRAINT tbl_stock_check2 CHECK(Product_Unit_Price>=0),
    CONSTRAINT tbl_stock_check3 CHECK(Reorder_Level>=0)
);

CREATE TABLE TBL_SALES(
    Sales_ID VARCHAR2(6) CONSTRAINT tbl_sales_pk PRIMARY KEY,
    Sales_Date DATE,
    Product_ID VARCHAR2(6) CONSTRAINT tbl_sales_fk REFERENCES TBL_STOCK(Product_ID),
    Quantity_Sold NUMBER,
    Sales_Price_Per_Unit NUMBER,
    CONSTRAINT tbl_sales_check1 CHECK(Quantity_Sold>=0),
    CONSTRAINT tbl_sales_check2 CHECK(Sales_Price_Per_Unit>=0)
);

--Task 2:
INSERT ALL
    INTO TBL_STOCK VALUES ('RE1001','REDMI Note 3',20,12000,5)
    INTO TBL_STOCK VALUES ('ip1002','Iphone 5S',10,21000,2)
    INTO TBL_STOCK VALUES ('PA1003','Panasonic P55',50,5500,5)
SELECT * FROM DUAL;

--Task 3:
--DROP SEQUENCE SEQ_SALES_ID;
--DROP SEQUENCE SEQ_PRODUCT_ID;

CREATE SEQUENCE SEQ_SALES_ID START WITH 1000 INCREMENT BY 1;
CREATE SEQUENCE SEQ_PRODUCT_ID START WITH 1004 INCREMENT BY 1;

--Task 4:
--DROP VIEW V_SALES_REPORT;

CREATE VIEW V_SALES_REPORT 
AS
SELECT 
    tbl_sales.sales_id,
    tbl_sales.sales_date,
    tbl_stock.product_id,
    tbl_stock.product_name,
    tbl_sales.quantity_sold,
    tbl_stock.product_unit_price,
    tbl_sales.sales_price_per_unit,
    (tbl_sales.sales_price_per_unit-tbl_stock.product_unit_price) AS Profit_Amount
FROM 
    tbl_stock 
FULL OUTER JOIN tbl_sales ON tbl_stock.product_id=tbl_sales.product_id
ORDER BY Profit_Amount DESC,Sales_ID ASC;

COMMIT;







