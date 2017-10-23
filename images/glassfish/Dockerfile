FROM oracle/glassfish:4.1.1
# See: https://hub.docker.com/r/glassfish/server/~/dockerfile/
# See: https://github.com/glassfish/docker/tree/master/4.1.1


MAINTAINER Olivier Liechti <olivier.liechti@heig-vd.ch>


ADD drivers/mysql-connector-java-5.1.44-bin.jar /glassfish4/glassfish/lib/
ADD autodeploy/AMT2017Project1-1.0-SNAPSHOT.war /glassfish4/glassfish/domains/domain1/autodeploy

RUN echo "AS_ADMIN_PASSWORD=glassfish" > /tmp/gfpw.txt && \
	./glassfish4/glassfish/bin/asadmin start-domain domain1 && \
	./glassfish4/glassfish/bin/asadmin create-jdbc-connection-pool --restype javax.sql.DataSource --datasourceclassname com.mysql.jdbc.jdbc2.optional.MysqlDataSource --property user=root:password=adminpw:DatabaseName=books_db:ServerName=db:port=3306 book_pool && \
	./glassfish4/glassfish/bin/asadmin create-jdbc-resource --connectionpoolid book_pool jdbc/books

	RUN ./glassfish4/glassfish/bin/asadmin stop-domain domain1