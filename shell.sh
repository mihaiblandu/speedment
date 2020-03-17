docker network create --subnet=172.23.0.0/16 mynet

docker build -t data DBDOKER/
docker run --net mynet --ip  172.23.0.2 -e MYSQL_ROOT_PASSWORD=password -e MYSQL_DATABASE=sakila -e YSQL_USER=user -e  MYSQL_PASSWORD=password -p 3306:3306 --name data -d data
docker build -t speedapp .
docker run --net mynet --ip  172.23.0.3 -p 8878:8080 --name speedapp -d speedapp
