--------------------------------------------------------
--  파일이 생성됨 - 목요일-1월-14-2021   
--------------------------------------------------------
DROP TABLE "C##ITBANK"."MEMBER" cascade constraints;
--------------------------------------------------------
--  DDL for Table MEMBER
--------------------------------------------------------

  CREATE TABLE "C##ITBANK"."MEMBER" 
   (	"IDNUMBER" VARCHAR2(20 BYTE), 
	"NAME" VARCHAR2(100 BYTE), 
	"AGE" NUMBER, 
	"GENDER" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into C##ITBANK.MEMBER
SET DEFINE OFF;
Insert into C##ITBANK.MEMBER (IDNUMBER,NAME,AGE,GENDER) values ('930516-2345678','이지은',29,'여성');
Insert into C##ITBANK.MEMBER (IDNUMBER,NAME,AGE,GENDER) values ('820222-1222222','홍진호',38,'남성');
Insert into C##ITBANK.MEMBER (IDNUMBER,NAME,AGE,GENDER) values ('200101-3456789','펭수',10,'남성');
commit;
--------------------------------------------------------
--  DDL for Index TABLE1_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##ITBANK"."TABLE1_PK" ON "C##ITBANK"."MEMBER" ("IDNUMBER") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  Constraints for Table MEMBER
--------------------------------------------------------

  ALTER TABLE "C##ITBANK"."MEMBER" MODIFY ("IDNUMBER" NOT NULL ENABLE);
  ALTER TABLE "C##ITBANK"."MEMBER" ADD CONSTRAINT "TABLE1_PK" PRIMARY KEY ("IDNUMBER")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
