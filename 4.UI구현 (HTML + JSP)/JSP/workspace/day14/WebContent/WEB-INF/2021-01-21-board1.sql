--------------------------------------------------------
--  ������ ������ - �����-1��-21-2021   
--------------------------------------------------------
DROP TABLE "C##ITBANK"."BOARD1" cascade constraints;
--------------------------------------------------------
--  DDL for Sequence BOARD1_SEQ
--------------------------------------------------------

   CREATE SEQUENCE  "C##ITBANK"."BOARD1_SEQ"  MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 282 NOCACHE  NOORDER  NOCYCLE  NOKEEP  NOSCALE  GLOBAL ;
--------------------------------------------------------
--  DDL for Table BOARD1
--------------------------------------------------------

  CREATE TABLE "C##ITBANK"."BOARD1" 
   (	"IDX" NUMBER, 
	"TITLE" VARCHAR2(200 BYTE), 
	"WRITER" VARCHAR2(100 BYTE), 
	"CONTEXT" VARCHAR2(2000 BYTE), 
	"CREATIONDATE" DATE DEFAULT sysdate, 
	"VIEWCOUNT" NUMBER DEFAULT 0, 
	"IPADDR" VARCHAR2(20 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
REM INSERTING into C##ITBANK.BOARD1
SET DEFINE OFF;
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (140,'������ 1�� 21��','��ħ','������ ������ ������� ����� ���ٴѴ�

����Ҷ� �� ���°� �ƴ��� �����ȴ�

',to_date('21/01/21','RR/MM/DD'),6,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (281,'������ �츮�� ������� �� �ð�','������','���Ŀ� �� ������~',to_date('21/01/21','RR/MM/DD'),0,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (1,'����','�ۼ���','����',to_date('21/01/19','RR/MM/DD'),1,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (2,'����2','�ۼ���2','����2',to_date('21/01/19','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (3,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (4,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (5,'����','�ۼ���','����',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (6,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (7,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (8,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (9,'����','�ۼ���','����',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (10,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (11,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (12,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (13,'����','�ۼ���','����',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (14,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (15,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (16,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (17,'����','�ۼ���','����',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (18,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (19,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (20,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (21,'����','�ۼ���','����',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (22,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (23,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (24,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (25,'����','�ۼ���','����',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (26,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (27,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (28,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (29,'����','�ۼ���','����',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (30,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (31,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (32,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (33,'����','�ۼ���','����',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (34,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (35,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (36,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (37,'����','�ۼ���','����',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (38,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (39,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (40,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (41,'����','�ۼ���','����',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (42,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (43,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (44,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (45,'����','�ۼ���','����',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (46,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (47,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (48,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (49,'����','�ۼ���','����',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (50,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (51,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (52,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (53,'����','�ۼ���','����',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (54,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (55,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (56,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (57,'����','�ۼ���','����',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (58,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (59,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (60,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (61,'����','�ۼ���','����',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (62,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (63,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (64,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (65,'����','�ۼ���','����',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (66,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (67,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (68,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (69,'����','�ۼ���','����',to_date('21/01/20','RR/MM/DD'),1,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (70,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (71,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (72,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (73,'����','�ۼ���','����',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (74,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (75,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (76,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (77,'����','�ۼ���','����',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (78,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (79,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (80,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (81,'����','�ۼ���','����',to_date('21/01/20','RR/MM/DD'),1,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (82,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),1,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (83,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (84,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (85,'����','�ۼ���','����',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (86,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (87,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (88,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (89,'����','�ۼ���','����',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (90,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (91,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (92,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),2,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (94,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (95,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (96,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (97,'����','�ۼ���','����',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (98,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),1,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (99,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
commit;
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (100,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (101,'����','�ۼ���','����',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (102,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),1,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (103,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (104,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (105,'����','�ۼ���','����',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (106,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (107,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (108,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (109,'����','�ۼ���','����',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (110,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (111,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (112,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (113,'����','�ۼ���','����',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (114,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (115,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (116,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (117,'����','�ۼ���','����',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (118,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),1,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (119,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (120,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (121,'����','�ۼ���','����',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (122,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (123,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (124,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),1,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (125,'�׽�Ʈ','������','���� ���ڵ�',to_date('21/01/20','RR/MM/DD'),2,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (126,'����2','�ۼ���2','����2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (127,'����3','�ۼ���3','����3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (128,'����4','�ۼ���4','����4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (129,'������ 1�� 20��','������','���',to_date('21/01/20','RR/MM/DD'),0,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (135,'���� �� �׳�','������','������ ���� ó������ ������ �� �׶��� �ʵ� ���� ��������
���� �׷��Ե� ���Ҿ����� �츮�鸸 ������

���� �� ������ �ִ� ���� ������ ���ݰ� ������ ���� ��
�ʸ� �����ְڴٴ� �����ӿ� �׷��� ���ش� ����

���� �� ����ģ�� ��� ����� �� �����ϱ� ����
�����ߴ� ��ŭ �̿� Ŀ��������

���� �� �����Ⱦ�
�� �� ���� ���� �ʸ� ������
������ �� ��ó�� �Ƹ���� �����ְ� �־�����
�׸��� ���� ���翣 ������ �ϰ� �ִ� �� ���ڿ�
�� ����� ���� �޷��� ������ �� �뷡����



���бⰡ ���۵Ǵ� �б����� �� ���� �츮�� ����� ����
���� �����ϰ� ����� ���� �������� ������

���� �б� �׾��� �� ���� �Ŵ��� �ϻ� ���� ������
�츮 ���� ����� ������ ���� �� ���� �� �����״�

���� �� ����ģ�� ��� ����� �� �����ϱ� ����
�����ߴ� ��ŭ �̿� Ŀ��������


���� �� �����Ⱦ�
�� �� ���� ���� �ʸ� ������
������ �� ��ó�� �Ƹ���� �����ְ� �־�����
�׸��� ���� ���翣 ������ �ϰ� �ִ� �� ���ڿ�
�� ����� ���� �޷��� ������ �� �뷡����',to_date('21/01/20','RR/MM/DD'),3,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (136,'�ȳ��ϼ���','�ҿ�','�ȳ��ϼ���',to_date('21/01/20','RR/MM/DD'),3,'192.168.0.83');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (141,'�ð� �־��?','������','�ð� null null �ؿ�

����������
',to_date('21/01/21','RR/MM/DD'),34,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (137,'����','������','���� ������ �ʹ� ������ݾ�
�츮 �� ��������
���� �̺����� �ǵ�
�츰 �� �������
�� �����ٰ� ���� ����� ����
���� �� ���� ���
���� �� ������ �־�
���� ���� ���ϴ���
���߾� �� �� ������ �ž�
�� �������� �ߵ� ���⿣
������ ����ؼ� ����� ������ ��
�ϰ� �󸶳� ������ ����
�� ����� ������ �� �ؾ�
��� ������ ���� �� �ҽ� �鸰 ���� ��
������ �� ��� ������ �ߵ�� ���ſ�
�ϰ� ���� �� ����� ���ھ�
��¥ ���� �� �� ���� �� ���̶�
������ �ູ����
����Ѱ� �� ���� ���� �� ����
���� ������ �ǰ�
���� ��� �ѹ� ����
���� ���� ���� ����
������ �и� �ູ �ٷ���
�̷��� ���� ���� ���� ��
������ ����ؼ� ����� ������ ��
�ϰ� �󸶳� ������ ����
�� ����� ������ �� �ؾ�
��� ������ ���� �� �ҽ� �鸰 ���� ��
������ �� ��� ������ �ߵ�� ���ſ�
�ʵ� ���� �� ����� ���ھ�
��¥ ���� �� �� ���� �� ���̶�
������ �ູ����
Ȥ�� ��ö� ���� ��������
�� �� ���� ���� ����
�� ������� ���� �� ��� ��
���� �� ��� �� �� �ƴϱ�
�� �˷��� ������ ������
�ʹ� �� ��� ô �ķ��� ô ��ư�
���� ���� ������
�� �ر� ���� �߾� ������
�� �� �˸°� ������� ����
�ڳ� �ִ� ���� ���� ����ģ���� ��
���ƴ� ���� �׷� ���
Oh uh
Ah ah uh...',to_date('21/01/20','RR/MM/DD'),2,'192.168.0.89');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (132,'�Խñ� �ۼ� �׽�Ʈ','������','123123',to_date('21/01/20','RR/MM/DD'),2,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (142,'���� ����¡ ������ ����� ó���մϴ�','������','��
��
��
',to_date('21/01/21','RR/MM/DD'),2,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (139,'��...','^^','��ȸ�� �ȿ�����....',to_date('21/01/20','RR/MM/DD'),4,'192.168.0.87');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (143,'������ 1�� 21��','��ħ','������ ������ ������� ����� ���ٴѴ�

����Ҷ� �� ���°� �ƴ��� �����ȴ�

',to_date('21/01/21','RR/MM/DD'),0,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (144,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (145,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (146,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (147,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (148,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (149,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (150,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (151,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (152,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (153,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (154,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (155,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (156,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (157,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (158,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (159,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (160,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (161,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (162,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (163,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (164,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (165,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (166,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (167,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (168,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (169,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (170,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (171,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (172,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (173,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (174,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (175,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (176,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (177,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (178,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (179,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (180,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (181,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (182,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (183,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (184,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (185,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (186,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (187,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (188,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (189,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (190,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (191,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (192,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (193,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (194,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (195,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (196,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (197,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (198,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (199,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (200,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (201,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (202,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (203,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (204,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (205,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
commit;
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (206,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (207,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (208,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (209,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (210,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (211,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (212,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (213,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (214,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (215,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (216,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (217,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (218,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (219,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (220,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (221,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (222,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (223,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (224,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (225,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (226,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (227,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (228,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (229,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (230,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (231,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (232,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (233,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (234,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (235,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (236,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (237,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (238,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (239,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (134,'�� �ٲ� �׽�Ʈ','������','1
2
3
4
5
6
7
',to_date('21/01/20','RR/MM/DD'),2,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (138,'JSP ��ƴ�','KING','JSP ��ƴ�
�� �� �ٺ��ΰ� �ڱ���

=======================

JSP ����� �ʾƿ�~
',to_date('21/01/20','RR/MM/DD'),6,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (240,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (241,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (242,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (243,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (244,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),1,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (245,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (246,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (247,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (248,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (249,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (250,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (251,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (252,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (253,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (254,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (255,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (256,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (257,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (258,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (259,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (260,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (261,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (262,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (263,'����','�ۼ���','����',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (264,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (265,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (266,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (267,'�׽�Ʈ','������','���� ���ڵ�',to_date('21/01/21','RR/MM/DD'),0,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (268,'����2','�ۼ���2','����2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (269,'����3','�ۼ���3','����3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (270,'����4','�ۼ���4','����4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (271,'������ 1�� 20��','������','���',to_date('21/01/21','RR/MM/DD'),0,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (272,'���� �� �׳�','������','������ ���� ó������ ������ �� �׶��� �ʵ� ���� ��������
���� �׷��Ե� ���Ҿ����� �츮�鸸 ������

���� �� ������ �ִ� ���� ������ ���ݰ� ������ ���� ��
�ʸ� �����ְڴٴ� �����ӿ� �׷��� ���ش� ����

���� �� ����ģ�� ��� ����� �� �����ϱ� ����
�����ߴ� ��ŭ �̿� Ŀ��������

���� �� �����Ⱦ�
�� �� ���� ���� �ʸ� ������
������ �� ��ó�� �Ƹ���� �����ְ� �־�����
�׸��� ���� ���翣 ������ �ϰ� �ִ� �� ���ڿ�
�� ����� ���� �޷��� ������ �� �뷡����



���бⰡ ���۵Ǵ� �б����� �� ���� �츮�� ����� ����
���� �����ϰ� ����� ���� �������� ������

���� �б� �׾��� �� ���� �Ŵ��� �ϻ� ���� ������
�츮 ���� ����� ������ ���� �� ���� �� �����״�

���� �� ����ģ�� ��� ����� �� �����ϱ� ����
�����ߴ� ��ŭ �̿� Ŀ��������


���� �� �����Ⱦ�
�� �� ���� ���� �ʸ� ������
������ �� ��ó�� �Ƹ���� �����ְ� �־�����
�׸��� ���� ���翣 ������ �ϰ� �ִ� �� ���ڿ�
�� ����� ���� �޷��� ������ �� �뷡����',to_date('21/01/21','RR/MM/DD'),0,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (273,'�ȳ��ϼ���','�ҿ�','�ȳ��ϼ���',to_date('21/01/21','RR/MM/DD'),0,'192.168.0.83');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (274,'�ð� �־��?','������','�ð� null null �ؿ�

����������
',to_date('21/01/21','RR/MM/DD'),0,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (275,'����','������','���� ������ �ʹ� ������ݾ�
�츮 �� ��������
���� �̺����� �ǵ�
�츰 �� �������
�� �����ٰ� ���� ����� ����
���� �� ���� ���
���� �� ������ �־�
���� ���� ���ϴ���
���߾� �� �� ������ �ž�
�� �������� �ߵ� ���⿣
������ ����ؼ� ����� ������ ��
�ϰ� �󸶳� ������ ����
�� ����� ������ �� �ؾ�
��� ������ ���� �� �ҽ� �鸰 ���� ��
������ �� ��� ������ �ߵ�� ���ſ�
�ϰ� ���� �� ����� ���ھ�
��¥ ���� �� �� ���� �� ���̶�
������ �ູ����
����Ѱ� �� ���� ���� �� ����
���� ������ �ǰ�
���� ��� �ѹ� ����
���� ���� ���� ����
������ �и� �ູ �ٷ���
�̷��� ���� ���� ���� ��
������ ����ؼ� ����� ������ ��
�ϰ� �󸶳� ������ ����
�� ����� ������ �� �ؾ�
��� ������ ���� �� �ҽ� �鸰 ���� ��
������ �� ��� ������ �ߵ�� ���ſ�
�ʵ� ���� �� ����� ���ھ�
��¥ ���� �� �� ���� �� ���̶�
������ �ູ����
Ȥ�� ��ö� ���� ��������
�� �� ���� ���� ����
�� ������� ���� �� ��� ��
���� �� ��� �� �� �ƴϱ�
�� �˷��� ������ ������
�ʹ� �� ��� ô �ķ��� ô ��ư�
���� ���� ������
�� �ر� ���� �߾� ������
�� �� �˸°� ������� ����
�ڳ� �ִ� ���� ���� ����ģ���� ��
���ƴ� ���� �׷� ���
Oh uh
Ah ah uh...',to_date('21/01/21','RR/MM/DD'),0,'192.168.0.89');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (276,'�Խñ� �ۼ� �׽�Ʈ','������','123123',to_date('21/01/21','RR/MM/DD'),0,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (277,'���� ����¡ ������ ����� ó���մϴ�','������','��
��
��
',to_date('21/01/21','RR/MM/DD'),0,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (278,'��...','^^','��ȸ�� �ȿ�����....

�����ڽ� �Ѵ� ���鼭 �ϰ� �ͳ�...',to_date('21/01/21','RR/MM/DD'),2,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (279,'�� �ٲ� �׽�Ʈ','������','1
2
3
4
5
6
7
',to_date('21/01/21','RR/MM/DD'),1,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (280,'JSP ��ƴ�','KING','JSP ��ƴ�
�� �� �ٺ��ΰ� �ڱ���

=======================

JSP ����� �ʾƿ�~
',to_date('21/01/21','RR/MM/DD'),1,'192.168.0.222');
commit;
--------------------------------------------------------
--  DDL for Index BOARD1_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "C##ITBANK"."BOARD1_PK" ON "C##ITBANK"."BOARD1" ("IDX") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS" ;
--------------------------------------------------------
--  DDL for Trigger BOARD1_TRG
--------------------------------------------------------

  CREATE OR REPLACE EDITIONABLE TRIGGER "C##ITBANK"."BOARD1_TRG" 
BEFORE INSERT ON BOARD1 
FOR EACH ROW 
BEGIN
  <<COLUMN_SEQUENCES>>
  BEGIN
    IF INSERTING AND :NEW.IDX IS NULL THEN
      SELECT BOARD1_SEQ.NEXTVAL INTO :NEW.IDX FROM SYS.DUAL;
    END IF;
  END COLUMN_SEQUENCES;
END;
/
ALTER TRIGGER "C##ITBANK"."BOARD1_TRG" ENABLE;
--------------------------------------------------------
--  Constraints for Table BOARD1
--------------------------------------------------------

  ALTER TABLE "C##ITBANK"."BOARD1" MODIFY ("IDX" NOT NULL ENABLE);
  ALTER TABLE "C##ITBANK"."BOARD1" MODIFY ("TITLE" NOT NULL ENABLE);
  ALTER TABLE "C##ITBANK"."BOARD1" MODIFY ("WRITER" NOT NULL ENABLE);
  ALTER TABLE "C##ITBANK"."BOARD1" MODIFY ("CONTEXT" NOT NULL ENABLE);
  ALTER TABLE "C##ITBANK"."BOARD1" MODIFY ("CREATIONDATE" NOT NULL ENABLE);
  ALTER TABLE "C##ITBANK"."BOARD1" MODIFY ("VIEWCOUNT" NOT NULL ENABLE);
  ALTER TABLE "C##ITBANK"."BOARD1" MODIFY ("IPADDR" NOT NULL ENABLE);
  ALTER TABLE "C##ITBANK"."BOARD1" ADD CONSTRAINT "BOARD1_PK" PRIMARY KEY ("IDX")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "USERS"  ENABLE;
