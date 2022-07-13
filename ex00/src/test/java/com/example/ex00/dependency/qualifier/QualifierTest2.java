package com.example.ex00.dependency.qualifier;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
public class QualifierTest2 {
    @Autowired
    @Qualifier("outback")
    private Restaurant restaurant1;

    @Autowired
    private Restaurant restaurant2;

    @Test
    public void qualifierTest2() {
        log.info("========outback=========");
        log.info("steak : " + Restaurant.steak);
        log.info("useSidebar : " + restaurant1.useSidebar());
        log.info("==========vips==========");
        log.info("steak : " + Restaurant.steak);
        log.info("useSidebar : " + restaurant2.useSidebar());
        log.info("==============================");
    }
}
