# mariadb guide

## install mariadb using docker

```bash
docker pull mariadb:[tag]
```

## Run mariadb container

set the mariadb root password
```shell
docker run -p 3306:3306 --name my-mariadb -e MARIADB_ROOT_PASSWORD=[password] -d mariadb:10.7.1
```

## Show maraidb version
```shell
docker exec -it my-mariadb 'mysql --version'
```

## Connect to db
```shell
mysql -u root -p
```

## mariadb characterset

### check mysql
```shell
status
```
### set characterset
```shell
apt update; apt install -y vim;
vim /etc/mysql/my.cnf

---
[client]
default-character-set=utf8mb4

[mysql]
default-character-set=utf8mb4

[mysqld]
character-set-server=utf8mb4
collation-server=utf8mb4_unicode_ci
skip-character-set-client-handshake
```

## references
- https://wecandev.tistory.com/63