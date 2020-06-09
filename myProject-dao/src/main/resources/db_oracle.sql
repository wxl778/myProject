--用户表
create table iuser
(
id number,
userid varchar2(100),
password varchar2(100),
username varchar2(100),
sex char(2),
tel varchar2(100),
is_admin char(2)
);
alter table IUSER add constraint PK_IUSER_ID primary key (ID);
alter table IUSER add constraint UNI_IUSER_USERID unique (USERID);

-- Create sequence
create sequence SEQ_IUSER_ID
minvalue 1
maxvalue 9999999999999999999999999999
start with 10001
increment by 1
cache 20;

insert into iuser values(10000,'admin','123456','管理员','男','0000','1');
insert into iuser values(SEQ_IUSER_ID.NEXTVAL,'wxl','123456','王训亮','男','0000','1');
commit;

--角色表 &关联用户

--单位部门表 &关联用户