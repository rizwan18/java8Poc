package com.riz.poc.java8;

import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component
public class Java8StreamForEach {

    public void java8ForEach() {
        System.out.println("Java 8 stream foreach");
        List<String> strings = Arrays.asList("1", "2", "3");
        strings.forEach(s -> System.out.println(s));
    }

}
