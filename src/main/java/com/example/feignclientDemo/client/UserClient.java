package com.example.feignclientDemo.client;
import com.example.feignclientDemo.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(value = "feign", url = "http://localhost:8082/api/add")
public interface UserClient {
  /* @GetMapping("")
    List<User> findAll();
*/
   @PostMapping("")
    void add(User user);

}