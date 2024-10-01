package Testngbasic;

import org.testng.annotations.Test;
//number
//negative number
//Alphabet
//we wont define in float
public class PriorityExample {

    @Test(priority = 4)
    public void testcaseA(){
        System.out.println("This is 1");
    }
    @Test(priority = 2)
    public void testcaseE(){
        System.out.println("This is the 5");
    }

    @Test(priority = 3)
    public void testcaseC(){
        System.out.println("This is the 3");
    }
    @Test(priority = 4)
    public void testcaseD(){
        System.out.println("This is the 4");

    }
}
