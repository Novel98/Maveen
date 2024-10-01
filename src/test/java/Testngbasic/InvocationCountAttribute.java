package Testngbasic;

import org.testng.annotations.Test;

public class InvocationCountAttribute {
    @Test(invocationCount = 20,invocationTimeOut = 2)
    public void verifyInvocationcount(){
        System.out.println("Hello selenium Guys");
    }
}
