package com.itheima.controller;

import com.itheima.domain.User;
import org.springframework.web.bind.annotation.*;

/**
 * Restful风格，简化开发
 */
@RestController
@RequestMapping("/users")
public class UserController {

//    @RequestMapping(method = RequestMethod.GET)
    @GetMapping("/{id}")
    public String getById(@PathVariable Integer id){
        System.out.println("user getById..."+id);
        return "{'module':'user getById'}";
    }

//    @RequestMapping(value = "/users", method = RequestMethod.GET)
    @GetMapping
    public String getAll(){
        System.out.println("user getAll...");
        return "{'module':'user getAll'}";
    }


//    @RequestMapping(value = "/users", method = RequestMethod.POST)
    @PostMapping
    public String save(){
        System.out.println("user save...");
        return "{'module':'user save'}";
    }

//    @RequestMapping(value = "/users", method = RequestMethod.PUT)
    @PutMapping
    public String update(@RequestBody User user){
        System.out.println("user update..."+user);
        return "{'module':'user update'}";
    }

//    @RequestMapping(value = "/users/{id}", method = RequestMethod.DELETE)
    @DeleteMapping("/{id}")
    public String delete(@PathVariable Integer id){
        System.out.println("user delete..."+id);
        return "{'module':'user delete'}";
    }
}
