insert into Blogger (id, name, age) values (1, 'Gyula', 21);
insert into Story (id, cim, content, posted, blogger_id ) values (1, 'Teszt cím', 'Teszt tartalom', CURRENT_DATE, (select id from blogger where name = 'Gyula'));