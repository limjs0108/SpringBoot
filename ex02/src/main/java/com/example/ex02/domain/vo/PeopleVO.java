package com.example.ex02.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Component
@Data
public class PeopleVO {
    private String name;
    private String time;

    public Date transDate(String time) {
        Date dTime = null;
        SimpleDateFormat format = new SimpleDateFormat("kk:mm");
        try {   // simpledateformat에서 parse를 사용할 때는 try~catch 문 안에 있어야 한다.
                // (SimpleDateFormat.parse(String) 메소드는 예외를 던저기 때문에 그 예외를 잡아줘야 함.)
            dTime = format.parse(time); // 입력 받은 문자열 "kk:mm" 패턴으로 분석
            return dTime;
        } catch (ParseException e) {}
        return dTime;
    }
}
