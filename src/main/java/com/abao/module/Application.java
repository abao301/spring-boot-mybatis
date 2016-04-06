package com.abao.module;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * Todo:
 * Created with: IntelliJ IDEA.
 * User: kevin
 * Date: 2016-04-04-下午5:45
 */
//@SpringBootApplication
@Configuration
@ComponentScan( basePackages = {"com.abao.module"})
@ImportResource(value = {"spring/applicationContext-mybatis.xml", "spring/applicationContext-transaction.xml"})
@EnableAutoConfiguration
@EnableTransactionManagement
public class Application {


    public static void main( String[] args )
    {
        SpringApplication.run(Application.class,args);
    }
}