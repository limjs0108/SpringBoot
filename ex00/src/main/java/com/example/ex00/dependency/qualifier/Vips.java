package com.example.ex00.dependency.qualifier;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("vips")
@Primary
@Slf4j
public class Vips implements Restaurant{
    @Override
    public boolean useSidebar() {
        return true;
    }
}
