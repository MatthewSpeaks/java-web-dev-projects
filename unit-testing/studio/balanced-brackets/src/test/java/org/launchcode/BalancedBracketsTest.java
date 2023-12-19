package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BalancedBracketsTest {
    //TODO: add tests here
    @Test
    public void balancedReturnsTrue() {
        String str = "[]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(str));
    }

    @Test
    public void notBalanceReturnsFalse() {
        String str = "[][";
        assertFalse(BalancedBrackets.hasBalancedBrackets(str));
    }

    @Test
    public void balanceGoesNegative() {
        String str = "][";
        assertFalse(BalancedBrackets.hasBalancedBrackets(str));
    }

    @Test
    public void stringIsEmpty() {
        String str = "";
        assertFalse(BalancedBrackets.hasBalancedBrackets(str));
    }

    @Test
    public void stringContainsNoBrackets() {
        String str = "Hello";
        assertFalse(BalancedBrackets.hasBalancedBrackets(str));
    }

    @Test
    public void stringCOntainsLettersAndBrackets() {
        String str = "Hello[]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(str));
    }

    @Test
    public void stringContainsBracketsAndWordBetween() {
        String str = "[Hello]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(str));
    }

    @Test
    public void stringContainsMultipleBrackets() {
        String str = "[[Hello]]";
        assertTrue(BalancedBrackets.hasBalancedBrackets(str));
    }

    @Test
    public void stringContainsUnbalancedBrackets() {
        String str = "[[Hello][";
        assertFalse(BalancedBrackets.hasBalancedBrackets(str));
    }

    @Test
    public void stringOneRightBracket() {
        String str = "[";
        assertFalse(BalancedBrackets.hasBalancedBrackets(str));
    }

    @Test
    public void stringOneLeftBracket() {
        String str = "]";
        assertFalse(BalancedBrackets.hasBalancedBrackets(str));
    }

    @Test
    public void stringContainsBalancedButNonOrdered(){
        String str = "[]][]][[";
        assertFalse(BalancedBrackets.hasBalancedBrackets(str));
    }
}