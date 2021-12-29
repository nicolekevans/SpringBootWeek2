/**
 * 
 */
package com.promineotech.jeep;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

/**
 * @author nicoleevans
 *
 */
@SpringBootApplication
public class JeepSales {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(JeepSales.class, args);

	}
	
	//ask about this, only way i could get the getRestTemplate to work.
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
