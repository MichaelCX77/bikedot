package com.mcx.bikedotoauth.feignclients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mcx.bikedotoauth.entity.User;

@Component
@FeignClient(name = "bikedot-register", path="/users")
public interface UserFeignClient {

	@GetMapping("/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email);
	
}
