package com.dio.springbootconfig.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;


@Configuration
@ConfigurationProperties("spring.datasource")// mapeia tudo o que for spring.datasource do properties e trás para esse conjunto.
@Getter //trazido pelo lombok para reduzir a escrita de código dependency no pom.xml
@Setter // trazido pelo lombok
public class DBConfiguration {
    private String driverClassName;
    private String url;
    private String username;
    private String password;

    @Profile("dev") //Define aqui o profile que esse método é chamado
    @Bean //instancia como Bean - assim ele mostra o conteúdo mapeado no iniciamento do sistema
    public String testDatabaseConnection(){
        System.out.println("DB Coonnection for Dev - H2");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection to mysql test - test instance";
    }

    @Profile("prod") //Define aqui o profile que esse método é chamado
    @Bean //instancia como Bean - assim ele mostra o conteúdo mapeado no iniciamento do sistema
    public String productionDatabaseConnection(){
        System.out.println("DB Coonnection for Prod - MYSQL");
        System.out.println(driverClassName);
        System.out.println(url);
        return "DB Connection to mysql Production.";
    }



}
