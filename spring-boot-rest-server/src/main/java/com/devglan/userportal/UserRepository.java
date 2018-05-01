package com.devglan.userportal;

import org.springframework.data.mongodb.repository.MongoRepository;



public interface UserRepository extends MongoRepository<User, String> {

    //void delete(User user);

    //List<User> findAll();

    //User findOne(int id);

    //User save(User user);
}
