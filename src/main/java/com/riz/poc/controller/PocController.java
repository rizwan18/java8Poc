package com.riz.poc.controller;

import com.riz.poc.java8.Java8StreamFilter;
import com.riz.poc.java8.Java8StreamForEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
public class PocController {

    @Autowired
    private Java8StreamFilter streamFilter;

    @Autowired
    private Java8StreamForEach forEach;

    @RequestMapping(value = "/streamFilter", method = GET, produces = APPLICATION_JSON_VALUE)
    public String java8StreamFilter() {
        streamFilter.filterGetValuesAndPrintIt();
        return "Hello World!";
    }

    @RequestMapping(value = "/streamForeach", method = GET, produces = APPLICATION_JSON_VALUE)
    public String streamForeach() {
        forEach.java8ForEach();
        return "Hello World!";
    }
}
