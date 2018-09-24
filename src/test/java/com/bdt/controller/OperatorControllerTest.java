package com.bdt.controller;

import org.junit.Test;
import com.bdt.service.OperatorService;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class OperatorControllerTest {
    @Autowired
    public OperatorService operatorService;
    @Test
    public void operatorLogin() {
        assertEquals(1, operatorService.operatorLogin(22049, 111111));
    }
}