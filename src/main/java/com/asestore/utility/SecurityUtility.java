package com.asestore.utility;

import java.security.SecureRandom;
import java.util.Random;

import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

@Component
public class SecurityUtility {
	
	private static final  String BOAR = "boar"; // encryption key
	
	@Bean
	public static BCryptPasswordEncoder passwordEncoder(){
		
		return new BCryptPasswordEncoder(12, new SecureRandom(BOAR.getBytes()));
	}
	
	
	@Bean
	public static String randomPassword(){
		String BOARCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
		StringBuilder boar = new StringBuilder();
		Random random = new Random();
		
		while (boar.length()<18){
			
			int index = (int) (random.nextFloat()*BOARCHARS.length());
			boar.append(BOARCHARS.charAt(index));
			
		}
		String boarString = boar.toString();
		return boarString;
		
	}
	
}
