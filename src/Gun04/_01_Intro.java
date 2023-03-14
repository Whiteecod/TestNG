package Gun04;

import org.testng.annotations.*;

public class _01_Intro {
    /*
     @BeforeSuite
       @BeforeTest
         @BeforeGroup
           @BeforeClass
             @BeforeMethod
                 @Test1 method
                 @Test2 method
             @AfterMethod
           @AfterClass
         @AfterGroup
       @AfterTest
     @AfterSuit
   */

    @BeforeClass
    void bClass() {
        System.out.println("Before class");
    }
    @BeforeMethod
    void bMethod() {
        System.out.println("Before method");
    }
    @Test
    void Intro1_Test1() {
        System.out.println("Intro_1 -> Test 1 ");
    }
    @Test
    void Intro1_Test2() {
        System.out.println("Intro_1 -> Test 2 ");
    }
    @AfterMethod
    void aMethod() {
        System.out.println("After Method");
    }
    @AfterClass
    void aClass() {
        System.out.println("After Class");
    }
}
