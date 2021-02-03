## Spring-Cloud-from-entry-to-abandonment

~~~~
Spring Cloud
~~~~

##### 建表语句

~~~~
create table payment
(
	id bigint auto_increment,
	serial varchar(200) default '' null,
	constraint payment_pk
		primary key (id)
);

