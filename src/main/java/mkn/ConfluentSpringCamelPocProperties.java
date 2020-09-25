package mkn;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;

@Component
@ConfigurationProperties(prefix = "mkn")
@Getter @Setter
public class ConfluentSpringCamelPocProperties {
  /**
   * The Camel Producer URI to publish messages to.
   */
  private String producerUri;
  
  /**
   * The Camel Consumer URI from consume messages from.
   */
  private String consumerUri;
  
  /**
   * The Kafka Consumer Group ID.
   */
  private String kafkaGroupId;
  
  /**
   * A comma separated list of Kafka brokers - host:port,host:port
   */
  private String kafkaBrokers;
  
  /**
   * The Kafka sasl.jaas.config parameter username
   */
  private String kafkaUsername;
  
  /**
   * The Kafka sasl.jaas.config parameter password 
   */
  private String kafkaPassword;
}
