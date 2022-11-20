-- auto-generated definition
create table t_dept
(
    did       int auto_increment
        primary key,
    dept_name varchar(20) not null
);

-- auto-generated definition
create table t_emp
(
    eid      int auto_increment
        primary key,
    emp_name varchar(20) not null,
    age      int         not null,
    sex      char        not null,
    email    varchar(50) not null,
    did      int         null
);

