package test;



import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }
    //"[LaunchCode]", "Launch[Code]", "[]LaunchCode", "", "[]"
    @Test
    public void WordingBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void SubWordingBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void onlyBracketsWordyReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    //"[LaunchCode", "Launch]Code[", "[", "]["
    //""
    //"[]"
    //"[LaunchCode]"
    //"Launch[Code]"
    //"[]LaunchCode"
    //"[]LaunchCode[]"
    //"[[LaunchCode]]"
    //"]["
    //"[LaunchCode"
    //"Launch]Code["
    //"["
    //"[launch[]"
    //"]launch[]"

    @Test
    public void oneBracketsWordyReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void openBracketsWordyReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void openBracketsOnlyReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void openCloseBracketsOnlyReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }



}
