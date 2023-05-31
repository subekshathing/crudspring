package com.crud.crudproect.service;

import com.crud.crudproect.entity.Users;

import java.util.List;

public interface UserService {

    public List<Users> getAllUsers();
    public Users getUserById(int Id);
    public Users addOrUpdateUser(Users user);
    public Users deleteUser(int Id) throws Exception;


}
