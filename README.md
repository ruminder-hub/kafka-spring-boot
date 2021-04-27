# kafka-spring-boot

### Environment for running
* Java JDK 1.8
* Maven
* Zookeeper
* Kafka

Download the zookeeper from this [link](https://zookeeper.apache.org/releases.html) <br/>Download kafka using this [link](https://kafka.apache.org/downloads)

### Running the application
Before running the application, make sure zookeeper and kafka cluster is running.
To run zookeeper run following command from zookeper folder:
* bin/zkServer.sh start      <br/>name of file (zkServer) can be different depending on version

To run kafka cluster run following command.
* bin/kafka-server-start.sh config/server.properties.

Now kafka and zookeeper are running. Run following command to run applicaiton:
* mvn install
* mvn spring:boot run

To check if consumer and producer are working either use postman or use following command:
* curl -X POST -F 'message=hello' http://localhost:9000/kafka/publish




