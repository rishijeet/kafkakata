# Kafka Kata
Kafka Kata Repository using JDK20 and Gradle

### Pre-requisites
1. Java 20
2. Gradle 
3. Kafka
4. Zookeeper

## Install Kafka Server
```bash
$ brew install kafka
```

The above command would install Kafka and Zookeeper from the brew server. 

## Configure Kafka
Comment out the below line in the kafka config to run the kafka on different port
```bash
vim /usr/local/etc/kafka/server.properties
```


```bash
# The address the socket server listens on. It will get the value returned from 
# java.net.InetAddress.getCanonicalHostName() if not configured.
#   FORMAT:
#     listeners = listener_name://host_name:port
#   EXAMPLE:
#     listeners = PLAINTEXT://your.host.name:9092
# Changing to port 9999
listeners=PLAINTEXT://localhost:9999
```

## Start Zookeeper and Kafka

Start the Zookeeper and Kafka respectively

```bash
$ zookeeper-server-start /usr/local/etc/kafka/zookeeper.properties

$ kafka-server-start /usr/local/etc/kafka/server.properties
```

