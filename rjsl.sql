create database rjsl;

use rjsl;

create table department 
(
	did Integer primary key,
	dname varchar(20) not null,
	ddesc varchar(100)
)engine=innodb default charset=utf8 comment '部门表';

create table employee
(
	eid int primary key auto_increment,
	ename varchar(20) not null,
	sex char(2),
	age int,
	did int
)engine=innodb default charset=utf8 comment '员工列表';

alter table employee add constraint fk_employee_eid foreign key(did)
references department(did);

insert into department values("信息技术研究院","从事软件开发、土地测绘、土地确权......");

insert into employee values("杨朝富","男","25",1);
