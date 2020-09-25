package mkn;

import java.time.LocalDateTime;

import org.apache.camel.ProducerTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class ConfluentSpringCamelPocController {
  private ProducerTemplate producerTemplate;
  private ConfluentSpringCamelPocProperties properties;
  
  @GetMapping
  public String sendMessage() {
    String body = "Controller Test - " + LocalDateTime.now();
    producerTemplate.sendBodyAndHeader(properties.getProducerUri(), body, "testheader", "header  value");
    return "Sent: " +  body;
  }
}
