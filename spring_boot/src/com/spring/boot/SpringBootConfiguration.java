/**
 * 
 */
package com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author srikanth.maddikunta
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class SpringBootConfiguration extends SpringBootServletInitializer{

	public SpringBootConfiguration() {
		super();
	    setRegisterErrorPageFilter(false);
	}
	
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SpringBootConfiguration.class);
    }
		
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringBootConfiguration.class, args);
	}

}
