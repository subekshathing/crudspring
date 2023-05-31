package com.crud.crudproect.repository;


import com.crud.crudproect.entity.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface UserRepository extends CrudRepository<Users,Integer> {
}
