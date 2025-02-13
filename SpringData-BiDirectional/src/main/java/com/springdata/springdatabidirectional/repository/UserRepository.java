package com.springdata.springdatabidirectional.repository;


import com.springdata.springdatabidirectional.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
