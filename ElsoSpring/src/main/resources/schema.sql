drop table if exists Blogger;

CREATE TABLE Blogger (
    id bigint not null,
    name varchar(255),
    age int,
    primary key (id)
);


drop table if exists Story;

CREATE TABLE Story (
    id bigint not null,
    cim varchar(255),
    content varchar(255),
    posted date,
    blogger_id int,
    primary key (id)
);