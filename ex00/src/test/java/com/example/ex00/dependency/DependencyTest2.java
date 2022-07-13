package com.example.ex00.dependency;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class DependencyTest2 {
    @Autowired
    private Chef chef;

    @Test
    public void dependencyTest2() {
        log.info("---------------------");
        log.info("chef = " + chef);
        log.info("restaurant = " + chef.getRestaurant());
        log.info("---------------------");
    }
}
