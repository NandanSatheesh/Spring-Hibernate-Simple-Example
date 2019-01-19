package com.techprimers.jpa.springjpahibernateexample.resource;

import com.techprimers.jpa.springjpahibernateexample.model.Users;
import com.techprimers.jpa.springjpahibernateexample.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rest/users")
public class UserResource {

    @Autowired
    UsersRepository usersRepository ;


    @GetMapping("/all")
    public List<Users> getAll() {

        return usersRepository.findAll() ;

    }

    @GetMapping("/id/{id}")
    public Optional<Users> getId(@PathVariable final Integer id){

        return usersRepository.findById(id);
    }

    @GetMapping("{name}")
    public List<Users> getName(@PathVariable("name") final String name){


        return usersRepository.findByName(name) ;
    }

    @GetMapping("/update/{id}/{name}")
    public Users update(@PathVariable("id") final Integer id , @PathVariable("name") final String name){

        Users users = usersRepository.findById(id).orElseThrow( () -> new RuntimeException());

        users.setName(name);


        Users newUser = usersRepository.save(users) ;

        return newUser ;




    }








}
