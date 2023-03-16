package com.nosql.demo.repositories;
import com.nosql.demo.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<User, String> {
}
