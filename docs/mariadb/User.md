# user 

## list all users at in db
```shell
SELECT User, Host, Password FROM mysql.user;
```

## create a user for db
```shell
CREATE USER 'user1'@localhost IDENTIFIED BY 'password1';
GRANT ALL PRIVILEGES ON *.* TO 'user1'@localhost IDENTIFIED BY 'password1';
```

## references
- https://www.rosehosting.com/blog/mysql-show-users/