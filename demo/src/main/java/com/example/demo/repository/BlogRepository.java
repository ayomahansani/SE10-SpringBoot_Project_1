package com.example.demo.repository;

import com.example.demo.entity.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// JpaRepository interface is provided CRUD operations.
// Spring wada karanne hibernate base karagena. Ethakota specific parameters 2k denna one.
// 1st parameter - what is the type? -> Blog
// 2nd parameter - entity eke haduwa id eke type eka -> Integer

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {

    @Override
    List<Blog> findAll();   // Blogs godak hadana nisa List ekak gannava. findAll() -> api hadana blogs okkoma hoya ganna puluvan.
}
