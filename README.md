This POC securely connects to Confluent Cloud. It sends and receives String messages. Messages are logged to the console. 

When the app starts and initial message will be sent. Additional messages can be send via a URL.

To run this POC you will need to have an account with Confluent. You will also need the broker url, key and secret.
- Set the broker URL in application.properties
- Set the key/secret via Program arguments
    - --confluent-key=
    - --confluent-secret=

You will not get the message produced by the CommandLineRummer the first time 
because the consumer group offset has not been set yet.

To send more messages call http://localhost:8080/ with a browser or curl. It is a GET so that curl is not needed.

If you want to just use Kafka locally you can by doing the following in application.properties:
- Supply the local broker URL
- Comment the lines out mkn.kafka-username and mkn.kafka-password
- Change mkn.producer-uri to mkn.producer-uri=kafka:spring-boot-poc?brokers=${mkn.kafka-brokers}


Additional Info
This app runs with embedded Hawtio to view routes.
Apache Camel Kafka Component - https://camel.apache.org/components/latest/kafka-component.html

