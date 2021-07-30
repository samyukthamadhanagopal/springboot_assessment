
DROP TABLE IF EXISTS project;

create table `project` (
	`id` bigint auto_increment primary key,
    `name` varchar(50) not null,
    `status` varchar(20) not null,
	`datecreated` timestamp null default current_timestamp,
	`archived` Boolean

);

INSERT INTO project(id, name, status, datecreated, archived)
VALUES (1, 'projectA', 'FINISHED', CURRENT_TIME(), FALSE);

