package com.huawei.servicecomb.controller;



import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TestProject8d0c {

        Project8d0cDelegate project8d0cDelegate = new Project8d0cDelegate();


    @Test
    public void testhelloworld(){

        String expactReturnValue = "hello"; // You should put the expect String type value here.

        String returnValue = project8d0cDelegate.helloworld("hello");

        assertEquals(expactReturnValue, returnValue);
    }

}