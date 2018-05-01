package com.devglan.userportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping({"/api"})
public class UserController {

    @Autowired
    private UserService userService;

  


    public UserController() {
		super();

		
	}

    @RequestMapping("/setup")
    public void setup() {
    	userService.createTestData();
    }


	@GetMapping
    public List<User> findAll(){
        return userService.findAll();
    }
}
