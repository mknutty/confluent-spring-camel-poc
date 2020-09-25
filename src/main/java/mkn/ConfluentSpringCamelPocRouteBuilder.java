package mkn;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class ConfluentSpringCamelPocRouteBuilder extends RouteBuilder {
  private ConfluentSpringCamelPocProperties properties;
  
  @Override
  public void configure() throws Exception {
    from(properties.getConsumerUri())
      .log("Header - ${header.testheader}")
      .log("Message - ${body}");
  }

}
