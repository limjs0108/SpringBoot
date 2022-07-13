package com.example.ex00.dependency;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
@RequiredArgsConstructor // final 또는 NonNull이 붙은 필드만 초기화 생성자로 선언
public class Coding {
// 필드 주입
// 굉장히 편하다. (장점)
// final을 붙일 수 없기 때문에 다른 곳에서 변형이 가능하다. (단점)
// 순환 참조 시 오류가 발생하지 않기 때문에 StackOverFlow가 발생한다.
//    @Autowired
    private final Computer computer;

//  생성자 주입
//

    /*@Autowired
    public Coding(Computer computer) {
        this.computer = computer;
    }*/
}
