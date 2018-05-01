package com.devglan.userportal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository repository;
    
    

  

    public UserServiceImpl() {
		super();
		
	}





	@Override
    public List<User> findAll() {
		
		// Add some test data to the embedded database.
		/*User user = new User();
		user.setFirstName("James");
		user.setLastName("Brown");
		user.setEmail("james.brown@gmail.com");
		
		repository.save(user);*/
		
        return repository.findAll();
    }





	@Override
	public void createTestData() {
		User user = new User();
		user.setFirstName("James");
		user.setLastName("Brown");
		user.setEmail("james.brown@gmail.com");
		repository.save(user);
		
		user = new User();
		user.setFirstName("Roger");
		user.setLastName("Williams");
		user.setEmail("roger.williams@gmail.com");
		repository.save(user);
		
		user = new User();
		user.setFirstName("Charles");
		user.setLastName("Manson");
		user.setEmail("charles.manson@gmail.com");
		repository.save(user);		
	}

   
}
