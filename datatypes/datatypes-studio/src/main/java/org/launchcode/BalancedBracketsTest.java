package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void oneOpenBracket(){
        String message = "A single open bracket returns false";
    }

    @Test
    public void testBalancedBrackets1(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]");
    }

    @Test
    public void testBalancedBrackets1(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]");
    }

    @Test
    public void testBalancedBrackets1(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode");
    }

    @Test
    public void testBalancedBrackets1(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("");
    }





}