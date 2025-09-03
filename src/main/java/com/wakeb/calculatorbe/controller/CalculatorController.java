package com.wakeb.calculatorbe.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class CalculatorController {
    @PostMapping("/add")
    public Integer add(@RequestParam Integer a, @RequestParam Integer b) {
        return a+b;
    }

    @PostMapping("/sub")
    public Integer sub(@RequestParam Integer a, @RequestParam Integer b) {
        return a-b;
    }

    @PostMapping("/div")
    public Integer div(@RequestParam Integer a, @RequestParam Integer b) {
        return a/b;
    }
}
