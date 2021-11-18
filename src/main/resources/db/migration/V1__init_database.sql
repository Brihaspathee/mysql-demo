drop table if exists book;
drop table if exists hibernate_sequence;

create table book (
    book_id varchar(36) not null,
    book_name varchar(255),
    author_name varchar(255),
    primary key (book_id)
);

create table hibernate_sequence (
    next_val bigint
);

insert into hibernate_sequence values (10001);