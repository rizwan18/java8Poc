package com.riz.poc.java8;

import java.util.Arrays;
import java.util.List;

public class Java8StreamForEach {

    public void java8ForEach(String[] argv) {
        System.out.println("Java 8 stream foreach");
        List<String> strings = Arrays.asList("1", "2", "3");
        strings.forEach(s -> System.out.println(s));
    }

}
