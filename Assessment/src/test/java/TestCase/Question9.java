package TestCase;

import org.testng.annotations.*;

public class Question9 {

    @BeforeClass
    public void beforeClass()
    {
        System.out.println("2");
    }

    @BeforeMethod
    public void beforeMethod()
    {
        System.out.println("3");
    }
    @BeforeTest
    public void beforeTest()
    {
        System.out.println("1");
    }
    @Test
    public void test()
    {
        System.out.println("4");
    }
    @AfterTest
    public void afterTest()
    {
        System.out.println("7");
    }
    @AfterMethod
    public void afterMethod()
    {
        System.out.println("5");
    }
    @AfterClass
    public void afterClass()
    {
        System.out.println("6");
    }

}
