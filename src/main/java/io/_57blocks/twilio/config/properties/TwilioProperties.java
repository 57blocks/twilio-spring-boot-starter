package io._57blocks.twilio.config.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties("io.57blocks.twilio")
public class TwilioProperties {

  private String accountSid;
  private String authToken;
}
