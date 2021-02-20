--------------------------------------------------------
--  파일이 생성됨 - 목요일-1월-21-2021   
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
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (140,'오늘은 1월 21일','아침','날씨가 좋은데 사람들이 우산을 들고다닌다

퇴근할때 비가 오는건 아닌지 걱정된다

',to_date('21/01/21','RR/MM/DD'),6,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (281,'이제는 우리가 밥먹으러 갈 시간','관리자','오후에 또 만나요~',to_date('21/01/21','RR/MM/DD'),0,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (1,'제목','작성자','내용',to_date('21/01/19','RR/MM/DD'),1,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (2,'제목2','작성자2','내용2',to_date('21/01/19','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (3,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (4,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (5,'제목','작성자','내용',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (6,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (7,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (8,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (9,'제목','작성자','내용',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (10,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (11,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (12,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (13,'제목','작성자','내용',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (14,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (15,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (16,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (17,'제목','작성자','내용',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (18,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (19,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (20,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (21,'제목','작성자','내용',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (22,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (23,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (24,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (25,'제목','작성자','내용',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (26,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (27,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (28,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (29,'제목','작성자','내용',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (30,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (31,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (32,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (33,'제목','작성자','내용',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (34,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (35,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (36,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (37,'제목','작성자','내용',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (38,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (39,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (40,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (41,'제목','작성자','내용',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (42,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (43,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (44,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (45,'제목','작성자','내용',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (46,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (47,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (48,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (49,'제목','작성자','내용',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (50,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (51,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (52,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (53,'제목','작성자','내용',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (54,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (55,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (56,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (57,'제목','작성자','내용',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (58,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (59,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (60,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (61,'제목','작성자','내용',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (62,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (63,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (64,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (65,'제목','작성자','내용',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (66,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (67,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (68,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (69,'제목','작성자','내용',to_date('21/01/20','RR/MM/DD'),1,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (70,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (71,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (72,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (73,'제목','작성자','내용',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (74,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (75,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (76,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (77,'제목','작성자','내용',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (78,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (79,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (80,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (81,'제목','작성자','내용',to_date('21/01/20','RR/MM/DD'),1,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (82,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),1,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (83,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (84,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (85,'제목','작성자','내용',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (86,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (87,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (88,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (89,'제목','작성자','내용',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (90,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (91,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (92,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),2,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (94,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (95,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (96,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (97,'제목','작성자','내용',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (98,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),1,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (99,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
commit;
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (100,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (101,'제목','작성자','내용',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (102,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),1,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (103,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (104,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (105,'제목','작성자','내용',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (106,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (107,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (108,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (109,'제목','작성자','내용',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (110,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (111,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (112,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (113,'제목','작성자','내용',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (114,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (115,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (116,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (117,'제목','작성자','내용',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (118,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),1,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (119,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (120,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (121,'제목','작성자','내용',to_date('21/01/20','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (122,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (123,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (124,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),1,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (125,'테스트','관리자','수정 인코딩',to_date('21/01/20','RR/MM/DD'),2,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (126,'제목2','작성자2','내용2',to_date('21/01/20','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (127,'제목3','작성자3','내용3',to_date('21/01/20','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (128,'제목4','작성자4','내용4',to_date('21/01/20','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (129,'오늘은 1월 20일','관리자','춥다',to_date('21/01/20','RR/MM/DD'),0,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (135,'오래 전 그날','윤종신','교복을 벗고 처음으로 만났던 너 그때가 너도 가끔 생각나니
뭐가 그렇게도 좋았었는지 우리들만 있으면

너의 집 데려다 주던 길을 걸으며 수줍게 나눴던 많은 꿈
너를 지켜주겠다던 다짐속에 그렇게 몇해는 지나

너의 새 남자친구 얘길 들었지 나 제대하기 얼마전
이해했던 만큼 미움도 커졌었지만

오늘 난 감사드렸어
몇 해 지나 얼핏 너를 봤을때
누군가 널 그처럼 아름답게 지켜주고 있었음을
그리고 지금 내곁엔 나만을 믿고 있는 한 여자와
잠 못드는 나를 달래는 오래전 그 노래만이



새학기가 시작되는 학교에는 그 옛날 우리의 모습이 있지
뭔가 분주하게 약속이 많은 스무살의 설레임

너의 학교 그앞을 난 가끔 거닐지 일상에 찌들어 갈때면
우리 슬픈 계산이 없었던 시절 난 만날 수 있을테니

너의 새 남자친구 얘길 들었지 나 제대하기 얼마전
이해했던 만큼 미움도 커졌었지만


오늘 난 감사드렸어
몇 해 지나 얼핏 너를 봤을때
누군가 널 그처럼 아름답게 지켜주고 있었음을
그리고 지금 내곁엔 나만을 믿고 있는 한 여자와
잠 못드는 나를 달래는 오래전 그 노래만이',to_date('21/01/20','RR/MM/DD'),3,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (136,'안녕하세요','소영','안녕하세요',to_date('21/01/20','RR/MM/DD'),3,'192.168.0.83');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (141,'시간 있어요?','관리자','시간 null null 해요

ㅋㅋㅋㅋㅋ
',to_date('21/01/21','RR/MM/DD'),34,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (137,'좋니','윤종신','이제 괜찮니 너무 힘들었잖아
우리 그 마무리가
고작 이별뿐인 건데
우린 참 어려웠어
잘 지낸다고 전해 들었어 가끔
벌써 참 좋은 사람
만나 잘 지내고 있어
굳이 내게 전하더라
잘했어 넌 못 참았을 거야
그 허전함을 견뎌 내기엔
좋으니 사랑해서 사랑을 시작할 때
니가 얼마나 예쁜지 모르지
그 모습을 아직도 못 잊어
헤어 나오지 못해 니 소식 들린 날은 더
좋으니 그 사람 솔직히 견디기 버거워
니가 조금 더 힘들면 좋겠어
진짜 조금 내 십 분의 일 만이라도
아프다 행복해줘
억울한가 봐 나만 힘든 것 같아
나만 무너진 건가
고작 사랑 한번 따위
나만 유난 떠는 건지
복잡해 분명 행복 바랬어
이렇게 빨리 보고 싶을 줄
좋으니 사랑해서 사랑을 시작할 때
니가 얼마나 예쁜지 모르지
그 모습을 아직도 못 잊어
헤어 나오지 못해 니 소식 들린 날은 더
좋으니 그 사람 솔직히 견디기 버거워
너도 조금 더 힘들면 좋겠어
진짜 조금 내 십 분의 일 만이라도
아프다 행복해줘
혹시 잠시라도 내가 떠오르면
걘 잘 지내 물어 봐줘
잘 지내라고 답할 걸 모두 다
내가 잘 사는 줄 다 아니까
그 알량한 자존심 때문에
너무 잘 사는 척 후련한 척 살아가
좋아 정말 좋으니
딱 잊기 좋은 추억 정도니
난 딱 알맞게 사랑하지 못한
뒤끝 있는 너의 예전 남자친구일 뿐
스쳤던 그저 그런 사랑
Oh uh
Ah ah uh...',to_date('21/01/20','RR/MM/DD'),2,'192.168.0.89');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (132,'게시글 작성 테스트','관리자','123123',to_date('21/01/20','RR/MM/DD'),2,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (142,'이제 페이징 섹션을 나누어서 처리합니다','관리자','ㅋ
ㅋ
ㅋ
',to_date('21/01/21','RR/MM/DD'),2,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (139,'하...','^^','조회수 안오르노....',to_date('21/01/20','RR/MM/DD'),4,'192.168.0.87');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (143,'오늘은 1월 21일','아침','날씨가 좋은데 사람들이 우산을 들고다닌다

퇴근할때 비가 오는건 아닌지 걱정된다

',to_date('21/01/21','RR/MM/DD'),0,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (144,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (145,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (146,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (147,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (148,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (149,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (150,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (151,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (152,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (153,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (154,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (155,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (156,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (157,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (158,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (159,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (160,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (161,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (162,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (163,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (164,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (165,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (166,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (167,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (168,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (169,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (170,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (171,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (172,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (173,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (174,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (175,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (176,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (177,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (178,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (179,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (180,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (181,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (182,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (183,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (184,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (185,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (186,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (187,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (188,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (189,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (190,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (191,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (192,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (193,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (194,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (195,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (196,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (197,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (198,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (199,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (200,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (201,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (202,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (203,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (204,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (205,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
commit;
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (206,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (207,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (208,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (209,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (210,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (211,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (212,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (213,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (214,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (215,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (216,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (217,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (218,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (219,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (220,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (221,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (222,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (223,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (224,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (225,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (226,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (227,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (228,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (229,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (230,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (231,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (232,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (233,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (234,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (235,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (236,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (237,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (238,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (239,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (134,'줄 바꿈 테스트','관리자','1
2
3
4
5
6
7
',to_date('21/01/20','RR/MM/DD'),2,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (138,'JSP 어렵다','KING','JSP 어렵다
아 난 바보인가 자괴감

=======================

JSP 어렵지 않아요~
',to_date('21/01/20','RR/MM/DD'),6,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (240,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (241,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (242,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (243,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (244,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),1,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (245,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (246,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (247,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (248,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (249,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (250,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (251,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (252,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (253,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (254,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (255,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (256,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (257,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (258,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (259,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (260,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (261,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (262,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (263,'제목','작성자','내용',to_date('21/01/21','RR/MM/DD'),0,'1.1.1.1');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (264,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (265,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (266,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (267,'테스트','관리자','수정 인코딩',to_date('21/01/21','RR/MM/DD'),0,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (268,'제목2','작성자2','내용2',to_date('21/01/21','RR/MM/DD'),0,'2.2.2.2');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (269,'제목3','작성자3','내용3',to_date('21/01/21','RR/MM/DD'),0,'3.3.3.3');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (270,'제목4','작성자4','내용4',to_date('21/01/21','RR/MM/DD'),0,'4.4.4.4');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (271,'오늘은 1월 20일','관리자','춥다',to_date('21/01/21','RR/MM/DD'),0,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (272,'오래 전 그날','윤종신','교복을 벗고 처음으로 만났던 너 그때가 너도 가끔 생각나니
뭐가 그렇게도 좋았었는지 우리들만 있으면

너의 집 데려다 주던 길을 걸으며 수줍게 나눴던 많은 꿈
너를 지켜주겠다던 다짐속에 그렇게 몇해는 지나

너의 새 남자친구 얘길 들었지 나 제대하기 얼마전
이해했던 만큼 미움도 커졌었지만

오늘 난 감사드렸어
몇 해 지나 얼핏 너를 봤을때
누군가 널 그처럼 아름답게 지켜주고 있었음을
그리고 지금 내곁엔 나만을 믿고 있는 한 여자와
잠 못드는 나를 달래는 오래전 그 노래만이



새학기가 시작되는 학교에는 그 옛날 우리의 모습이 있지
뭔가 분주하게 약속이 많은 스무살의 설레임

너의 학교 그앞을 난 가끔 거닐지 일상에 찌들어 갈때면
우리 슬픈 계산이 없었던 시절 난 만날 수 있을테니

너의 새 남자친구 얘길 들었지 나 제대하기 얼마전
이해했던 만큼 미움도 커졌었지만


오늘 난 감사드렸어
몇 해 지나 얼핏 너를 봤을때
누군가 널 그처럼 아름답게 지켜주고 있었음을
그리고 지금 내곁엔 나만을 믿고 있는 한 여자와
잠 못드는 나를 달래는 오래전 그 노래만이',to_date('21/01/21','RR/MM/DD'),0,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (273,'안녕하세요','소영','안녕하세요',to_date('21/01/21','RR/MM/DD'),0,'192.168.0.83');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (274,'시간 있어요?','관리자','시간 null null 해요

ㅋㅋㅋㅋㅋ
',to_date('21/01/21','RR/MM/DD'),0,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (275,'좋니','윤종신','이제 괜찮니 너무 힘들었잖아
우리 그 마무리가
고작 이별뿐인 건데
우린 참 어려웠어
잘 지낸다고 전해 들었어 가끔
벌써 참 좋은 사람
만나 잘 지내고 있어
굳이 내게 전하더라
잘했어 넌 못 참았을 거야
그 허전함을 견뎌 내기엔
좋으니 사랑해서 사랑을 시작할 때
니가 얼마나 예쁜지 모르지
그 모습을 아직도 못 잊어
헤어 나오지 못해 니 소식 들린 날은 더
좋으니 그 사람 솔직히 견디기 버거워
니가 조금 더 힘들면 좋겠어
진짜 조금 내 십 분의 일 만이라도
아프다 행복해줘
억울한가 봐 나만 힘든 것 같아
나만 무너진 건가
고작 사랑 한번 따위
나만 유난 떠는 건지
복잡해 분명 행복 바랬어
이렇게 빨리 보고 싶을 줄
좋으니 사랑해서 사랑을 시작할 때
니가 얼마나 예쁜지 모르지
그 모습을 아직도 못 잊어
헤어 나오지 못해 니 소식 들린 날은 더
좋으니 그 사람 솔직히 견디기 버거워
너도 조금 더 힘들면 좋겠어
진짜 조금 내 십 분의 일 만이라도
아프다 행복해줘
혹시 잠시라도 내가 떠오르면
걘 잘 지내 물어 봐줘
잘 지내라고 답할 걸 모두 다
내가 잘 사는 줄 다 아니까
그 알량한 자존심 때문에
너무 잘 사는 척 후련한 척 살아가
좋아 정말 좋으니
딱 잊기 좋은 추억 정도니
난 딱 알맞게 사랑하지 못한
뒤끝 있는 너의 예전 남자친구일 뿐
스쳤던 그저 그런 사랑
Oh uh
Ah ah uh...',to_date('21/01/21','RR/MM/DD'),0,'192.168.0.89');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (276,'게시글 작성 테스트','관리자','123123',to_date('21/01/21','RR/MM/DD'),0,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (277,'이제 페이징 섹션을 나누어서 처리합니다','관리자','ㅋ
ㅋ
ㅋ
',to_date('21/01/21','RR/MM/DD'),0,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (278,'하...','^^','조회수 안오르노....

아이코스 한대 빨면서 하고 싶네...',to_date('21/01/21','RR/MM/DD'),2,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (279,'줄 바꿈 테스트','관리자','1
2
3
4
5
6
7
',to_date('21/01/21','RR/MM/DD'),1,'192.168.0.222');
Insert into C##ITBANK.BOARD1 (IDX,TITLE,WRITER,CONTEXT,CREATIONDATE,VIEWCOUNT,IPADDR) values (280,'JSP 어렵다','KING','JSP 어렵다
아 난 바보인가 자괴감

=======================

JSP 어렵지 않아요~
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
