package com.example.clonecarrot.web;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FeedController {

    private final FeedRepository feedRepository;

    @GetMapping("/hello")
    public String hello(@RequestParam(value="name", defaultValue="world") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/test")
    public String test(@RequestParam(value="name", defaultValue="world") String name) {
        return String.format("name %s , id : %d", name, feedRepository.findByName(name).getId());
    }
}
