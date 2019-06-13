package com.huawei.servicecomb.controller;


import javax.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.apache.servicecomb.provider.rest.common.RestSchema;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.CseSpringDemoCodegen", date = "2019-06-13T14:47:14.527Z")

@RestSchema(schemaId = "project8d0c")
@RequestMapping(path = "/rest", produces = MediaType.APPLICATION_JSON)
public class Project8d0cImpl {

    @Autowired
    private Project8d0cDelegate userProject8d0cDelegate;


    @RequestMapping(value = "/helloworld",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    public String helloworld( @RequestParam(value = "name", required = true) String name){

        return userProject8d0cDelegate.helloworld(name);
    }

}
