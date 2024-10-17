package com.javaacademy.calc;


import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Calc {

    public int add(int number1, int number2) {
        log.debug("выполняем сложение");
        log.trace("number1 {}, number2 {}", number1, number2);
        return number1 + number2;
    }

    public int divide(int number1, int number2) {
        log.debug("выполняем деление");
        log.trace("number1 {}, number2 {}", number1, number2);
        if (number2 == 0) {
            log.error("number2 НОЛЬ!");
        }
        return number1 / number2;
    }
}
