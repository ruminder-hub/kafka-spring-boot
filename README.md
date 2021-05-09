# kafka-spring-boot

### About Project.
3 indpendent microservices are created. Eureka Server is used to keep registry of all the microservices. The produer uses application.yml to create producer, and consumer used kafka spring classes to consume the messages.

## Software dependencies
* Kafka
* Zookeeper


## Running the Project

### Kafka and Zookeeper
* Run the zookeeper first and kafka will try to register it to zookeeper
* Run kafka using command:
  bin/kafka-server-start.sh config/server.properties
  
### Kafka Eureka
For this project I have create independent consumer and producer microservices which register themselves to eureka server. If you donot start it before producer and consumer, you will be getting error as services will try to register to it.
Go to kafka-eureka folder and run command
 mvn spring-boot:run
 
### Kafka Producer
From new terminal open project and go to kafka-producer folder. Run command:
  mvn spring-boot:run
  
### Kafka Consumer
From new terminal open project and go to kafka-consumer folder. Run command:
  mvn spring-boot:run
  
### Testing 
Now our all services are running. We need to check if message produced by producer is received in Kafka and later consumed by consumer.
Call the producer api to produce message using command:
curl -X POST -F 'message=test' http://localhost:9000/kafka/publish

You can also use Postman to do this.
In logs producer will send the message and consumer will consume this, printing in the logs.

* Before running the project, run the Kafka and Zookeeper.
* cd kafka-eureka
* mvn spring-boot:run
* From new terminal open project and go to kafka-producer folder.
* Run mvn spring-boot: run command
* 
