package com.example.mysqldemo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created in Intellij IDEA
 * User: Balaji Varadharajan
 * Date: 24, November 2021
 * Time: 7:08 AM
 * Project: mysql-demo
 * Package Name: com.example.mysqldemo.config
 * To change this template use File | Settings | File and Code Template
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    // Swagger URL for reference: http://localhost:8080/swagger-ui/index.html

    @Bean
    public Docket swaggerConfiguration(){
        Docket docket = new Docket(DocumentationType.OAS_30)
                .select()
                //.paths(PathSelectors.ant("/api/v1/*"))
                .apis(RequestHandlerSelectors.basePackage("com.example.mysqldemo"))
                .build().apiInfo(setApiInfo());
        return  docket;
    }

    private ApiInfo setApiInfo(){
        return new ApiInfoBuilder()
                .title("Sample Books and Author Service APIs")
                .version("1.0.0").contact(
                        new Contact("Balaji Varadharajan","google.com","vbalaji215@outlook.com"))
                .description("All endpoints to access member information are provided")
                .license("Free for All")
                .build();
    }
}
