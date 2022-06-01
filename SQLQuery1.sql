CREATE DATABASE CAJERO;
USE CAJERO;
CREATE TABLE USUARIOS(
usuario varchar(5) PRIMARY KEY not null,
nip varchar(5) not null,
dinero bigint NOT NULL
)
INSERT INTO USUARIOS VALUES ('12345','20101','20000');
INSERT INTO USUARIOS VALUES ('15963','00120','12000');
INSERT INTO USUARIOS VALUES ('66052','74586','5000');
INSERT INTO USUARIOS VALUES ('37849','13456','1000');
INSERT INTO USUARIOS VALUES ('11111','11111','100');
SELECT * FROM USUARIOS;

CREATE TABLE RELLENO(
fecha DATETIME PRIMARY KEY NOT NULL,
bcp INT NOT NULL,
bdp INT NOT NULL,
bmp	INT NOT NULL)
INSERT INTO RELLENO VALUES(1,'2020-04-23',2000,1500,1000);
SELECT * FROM RELLENO
Update USUARIOS set nip='11111' where usuario='11111'

CREATE PROCEDURE B_USNIP @USUA VARCHAR(5) AS BEGIN SELECT usuario, nip, dinero from USUARIOS WHERE @USUA=usuario end
CREATE PROCEDURE Bfecha @fecha datetime AS BEGIN SELECT * from RELLENO WHERE @fecha=fecha end
CREATE PROCEDURE insertar @fecha datetime, @bic int, @bid int, @biq int as begin set dateformat YMD insert into RELLENO values(@fecha, @bic, @bid, @biq) end
Create procedure Act @cuenta varchar(5), @nip varchar(5), @mon bigint as begin update USUARIOS Set usuario=@cuenta, nip=@nip, dinero=@mon where usuario=@cuenta end
create procedure act_2 @fecha datetime, @bcp int, @bdp int, @bmp int as begin update RELLENO set fecha=@fecha, bcp=@bcp, bdp=@bdp, bmp=@bmp where fecha=@fecha end