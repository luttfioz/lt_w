package com.lt.web;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.github.fakemongo.Fongo;
import com.mongodb.Mongo;

@Configuration
@EnableMongoRepositories(basePackages = "com.lt.web")
public class MongoConfig extends AbstractMongoConfiguration {

  private static final String DB_NAME = "test";

  @Override
  protected String getDatabaseName() {
    return DB_NAME;
  }

  @Override
  @Bean
  public Mongo mongo() {
    return new Fongo(getDatabaseName()).getMongo();
  }

  @Override
  protected String getMappingBasePackage() {
    return "com.lt.web";
  }
}