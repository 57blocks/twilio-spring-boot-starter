package io._57blocks.twilio.config;

import com.twilio.Twilio;
import com.twilio.http.TwilioRestClient;
import io._57blocks.twilio.config.properties.TwilioProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Twilio.class)
@ConditionalOnProperty("io.57blocks.twilio.account-sid")
@EnableConfigurationProperties(TwilioProperties.class)
public class TwilioAutoConfig {

  @Autowired
  private TwilioProperties properties;

  @Bean
  @ConditionalOnMissingBean
  public TwilioRestClient twilioRestClient() {
    Twilio.init(properties.getAccountSid(), properties.getAuthToken());
    return Twilio.getRestClient();
  }

}
