package swingyApp;

import org.junit.Assert;
import org.junit.Test;

public class swingyAppTest {

    private String INPUT = "123456";

    @Test
    public void testHero() {
        Hero her = new Hero("TestCase1", "zombie");
        int expected = her.getLevel();

        Assert.assertEquals(expected, 0);

    }
}

