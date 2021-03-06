/**
 * CONFIDENTIAL INFORMATION
 *
 * All Rights Reserved.  Unauthorized reproduction, transmission, or
 * distribution of this software is a violation of applicable laws.
 *
 * Date: Feb 15, 2017
 * Copyright 2017 innoirvinge@gmail.com
 */
package com.tcss558.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author irving09 <innoirvinge@gmail.com>
 */
@Configuration
public class ApplicationConfig {

  @Bean
  public Docket swaggerAPI() {
    return new Docket(DocumentationType.SWAGGER_2)
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.tcss558"))
        .paths(PathSelectors.any())
        .build();
  }

}
