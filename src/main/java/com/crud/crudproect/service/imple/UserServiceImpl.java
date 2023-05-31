package com.crud.crudproect.service.imple;

import com.crud.crudproect.entity.Users;
import com.crud.crudproect.repository.UserRepository;
import com.crud.crudproect.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;
    public List<Users> getAllUsers(){
        return (List<Users>) userRepository.findAll();
    }

    @Override
    public Users getUserById(int Id) {
        return userRepository.findById(Id).orElse(null);
    }

    @Override
    public Users addOrUpdateUser(Users user) {

        return userRepository.save(user);
    }

    @Override
    public Users deleteUser(int Id) throws Exception {
        Users deletedUser=null;
        try{
            deletedUser=userRepository.findById(Id).orElse(null);
            if(deletedUser==null){
                throw new Exception("user not available");
            }else{
                userRepository.deleteById(Id);
            }
        }
        catch(Exception ex){
            throw ex;
        }
        return deletedUser;
    }
}
