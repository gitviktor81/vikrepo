insert into Blogger (name, age) values ('Gyula', 21);
insert into Story (title, content, posted, blogger_id ) values ('Teszt cím', 'Teszt tartalom', CURRENT_DATE, (select id from blogger where name = 'Gyula'));