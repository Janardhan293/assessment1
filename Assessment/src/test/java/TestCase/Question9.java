package TestCase;
import org.testng.annotations.*;

public class Question9 {
    @BeforeClass
    public void beforeClass() {
        System.out.println("2 before class");
    }
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("3 before method");
    }
    @BeforeTest
    public void beforeTest() {
        System.out.println("1 before test");
    }
    @Test
    public void test() {
        System.out.println("4 test");
    }
    @AfterTest
    public void afterTest() {
        System.out.println("7 after test");
    }
    @AfterMethod
    public void afterMethod() {
        System.out.println("5 after method");
    }
    @AfterClass
    public void afterClass() {
        System.out.println("6 after class");
    }
}
