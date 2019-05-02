package com.revature.intercomm;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * The Interface UserClient.
 * Interface for making use of UserClient
 */
@FeignClient(name = "user-service", fallback=UserClientFallback.class)
public interface UserClient {
	
	/**
	 * Find all.
	 * Method will find all users in database.
	 * 
	 * @return the string result from findAll() method
	 */
	@GetMapping("/users")
	String findAll();
}
