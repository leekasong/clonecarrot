package com.example.clonecarrot.web;

import org.springframework.data.jpa.repository.JpaRepository;

//repository
public interface TestRepository extends JpaRepository<Test, Integer> {
    Test findByName(String name);
}
