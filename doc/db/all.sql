drop table if exists `test`;
create table `test` (
    `id` int not null comment 'id',
    `name` varchar(50) comment 'name',
    primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='test';

insert into `test` (id, name) VALUES (1, 'test');

insert into `test` (id, name) VALUES (2, 'test2');