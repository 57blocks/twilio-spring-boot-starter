[![Travis-CI](https://travis-ci.org/57blocks/twilio-spring-boot-starter.svg?branch=master)](https://travis-ci.org/57blocks/twilio-spring-boot-starter)
[![License: MIT](https://img.shields.io/github/license/57blocks/twilio-spring-boot-starter.svg)](https://opensource.org/licenses/MIT)
[![Maven Central](https://maven-badges.herokuapp.com/maven-central/io.57blocks/twilio-spring-boot-starter/badge.svg)](https://search.maven.org/search?q=a:twilio-spring-boot-starter)
# Twilio Spring Boot Starter
Configure [twilio](https://www.twilio.com/), make `TwilioRestClient` available in the spring context.

## Getting Started
### Add the Starter in Maven Dependency
Edit `pom.xml`, add the starter:
```xml
    <dependency>
      <groupId>io.57blocks</groupId>
      <artifactId>twilio-spring-boot-starter</artifactId>
      <version>0.1.1</version>
    </dependency>
```
### Configure Twilio Credentials
Edit `application.yml`, add the following properties:
```yaml
io.57blocks.twilio:
  account_sid: ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX
  auth_token: your_auth_token
```

