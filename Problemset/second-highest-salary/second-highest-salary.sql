
-- @Title: 第二高的薪水 (Second Highest Salary)
-- @Author: tongyaocheng@gmail.com
-- @Date: 2021-08-26 10:41:39
-- @Runtime: 319 ms
-- @Memory: 0 B

# Write your MySQL query statement below

SELECT
    (SELECT DISTINCT
            Salary
        FROM
            Employee
        ORDER BY Salary DESC
        LIMIT 1 OFFSET 1) AS SecondHighestSalary
;

