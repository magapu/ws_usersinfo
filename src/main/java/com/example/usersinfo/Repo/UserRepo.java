package com.example.usersinfo.Repo;


import com.example.usersinfo.Entity.Sripy;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<Sripy, Integer> {
}
