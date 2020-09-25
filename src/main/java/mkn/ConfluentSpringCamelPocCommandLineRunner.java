package mkn;

import java.time.LocalDateTime;

import org.apache.camel.ProducerTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ConfluentSpringCamelPocCommandLineRunner implements CommandLineRunner {
  private ProducerTemplate producerTemplate;
  private ConfluentSpringCamelPocProperties properties;
  
  @Override
  public void run(String... args) throws Exception {
    producerTemplate.sendBody(properties.getProducerUri(), "CommandLineRunner Test - " + LocalDateTime.now());
  }
}    