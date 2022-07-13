package com.example.ex00.dependency.qualifier;

import org.springframework.stereotype.Component;


public interface Restaurant {
    public int steak = 10000;  // 인터페이스라 final static이 생락됨
    public boolean useSidebar();    // 인터페이스라 abstract 생략됨
}
