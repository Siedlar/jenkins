package com.example.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoApplicationTest {


    @Test
    void dodaj() {
    assertEquals(103,DemoApplication.dodaj(5,5));
    }
}