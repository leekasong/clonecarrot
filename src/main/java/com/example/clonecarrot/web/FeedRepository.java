package com.example.clonecarrot.web;

import org.springframework.data.jpa.repository.JpaRepository;

//repository
public interface FeedRepository extends JpaRepository<Feed, Integer> {
    Feed findByName(String name);
}
