package com.javaacademy.calc;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Runner {
    public static void main(String[] args) {
        Calc calc = new Calc();
        int result = calc.add(2, 2);
        log.info("результат сложения: {}", result);



        System.out.println(calc.divide(1, 0));
    }
}
