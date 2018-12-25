# Twilio Spring Boot Starter
Configure [twilio](https://www.twilio.com/), make `TwilioRestClient` available in the spring context.

## Getting Started
### Add the Starter in Maven Dependency
Edit `pom.xml`, add the starter:
```xml
    <dependency>
      <groupId>io.57blocks</groupId>
      <artifactId>twilio-spring-boot-starter</artifactId>
      <version>${io.57blocks.twilio.version}</version>
    </dependency>
```
### Configure Twilio Credentials
Edit `application.yml`, add the following properties:
```yaml
io.57blocks.twilio:
  account_sid: ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
  auth_token: your_auth_token
```

