package com.example.demo.controller;

import com.example.demo.entity.Blog;
import com.example.demo.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/blog")
public class BlogController {

    @Autowired // dependency injection. instanse ekak aran ena eka
    private BlogRepository blogRepository;

    // save
    @PostMapping("/SavePost")
    public Blog savePost(@RequestBody Blog blog){

        return blogRepository.save(blog);
    }

    // get all
    @GetMapping("/GetAllPost") // apita thiyena okkoma post tika pennawa
    public List<Blog> getAllPost(){

        return blogRepository.findAll();
    }

    // update
    @PutMapping("/UpdateData")
    public Blog updateData(@RequestBody Blog blog){

        return blogRepository.save(blog);
    }

    // delete
    @DeleteMapping("/DeleteData/{id}")
    public void deleteData(@PathVariable int id) {

        blogRepository.deleteById(id); // methana id eka anivaren integer eka oone
    }


    @GetMapping("GetOnePost/{id}") // methana namai
    public String getOnePost(@PathVariable String id){ // methana namai samana venna one.  @PathVariable -> spring boot vala parameters pass karana annotation eka

        System.out.println(id);
        return id;
    }

    @GetMapping("/OBJECT")
    public Object getObject(){
        Blog blog = new Blog();
        return blog;
    }

    @PostMapping("/getMapping")
    public String getMapping(){//methna namai samana wenna one

        System.out.println("hellowww.......");
        return null;
    }


}
