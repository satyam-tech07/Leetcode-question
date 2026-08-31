# Write your MySQL query statement below
select e.name as Employee
from Employee as e
 left join Employee as s
 on e.managerId=s.id
 where e.salary>s.salary ;
