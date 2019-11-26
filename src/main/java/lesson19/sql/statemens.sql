delete from messages;
delete from messages where ;

call my_procedure(1,2,3);

update messages set id = id + 100;

insert into messages (content, user_from, user_to) values (?,?,?);

select messages.id,
       messages.content,
       u_from.name,
       u_to.name
from       messages
               join users u_from on (u_from.id = messages.user_from)
               left outer join users u_to on (u_to.id = messages.user_to)
               join (select * from users where u_date > "2019-01")

where messages.id=3
