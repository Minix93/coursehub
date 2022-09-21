drop table if exists `test`;
create table `test` (
    `id` int not null comment 'id',
    `name` varchar(50) comment 'name',
    primary key (`id`)
) engine=innodb default charset=utf8mb4 comment='test';

insert into `test` (id, name) VALUES (1, 'test');

insert into `test` (id, name) VALUES (2, 'test2');



drop table if exists `chapter`;
create table `chapter` (
    `id` char(8) not null comment 'ID',
    `course_id` char(8) comment 'CourseID',
    `name` varchar(50) comment 'name',
    primary key (`id`)
) engine=innodb default charset=utf8mb4 comment ='Outline';

insert into `chapter` (id, course_id, name) VALUES ('00000000', '00000000', 'test chapter 1');
insert into `chapter` (id, course_id, name) VALUES ('00000001', '00000000', 'test chapter 1');