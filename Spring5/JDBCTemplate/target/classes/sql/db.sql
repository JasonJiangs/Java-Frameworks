create database if not exists user_db;


-- auto-generated definition
create table if not exists t_user
(
    user_id  bigint       not null
        primary key,
    username varchar(100) not null,
    status   varchar(50)  not null
);


-- auto-generated definition
create table if not exists user_account
(
    id       int          not null
        primary key,
    username varchar(100) not null,
    money    int          not null
);

