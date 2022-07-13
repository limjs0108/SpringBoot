package com.example.ex02.domain.vo;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class WeaponVO {
    private int percentage10;
    private int percentage60;
    private int percentage100;

    public WeaponVO() {
        this(10,40,80);
    }
    public WeaponVO(int attack10, int attack60, int attack100) {
        percentage10 = attack10;
        percentage60 = attack60;
        percentage100 = attack100;
    }
}
