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


    @BeforeSuite
    void bSuite() {
        System.out.println("Suite");
    }
    @BeforeTest
    void bTest() {
        System.out.println("Before Test");
    }
    @BeforeGroups
    void bGroups() {
        System.out.println("Before Groups");
    }
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
    @AfterGroups
    void aGroups() {
        System.out.println("After Groups");
    }
    @AfterTest
    void aTest() {
        System.out.println("After Test");
    }
    @AfterSuite
    void aSuite() {
        System.out.println("Suite");
    }
}
