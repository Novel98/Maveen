//Program4
//Write a program for invocationCount and i_timeout

package Priority;

import org.testng.annotations.Test;

public class InvocationCountAttribute {
@Test(invocationCount = 10,invocationTimeOut = 1)
    public void verifyInvocationCount(){
    System.out.println("Hello selenium guys");
}

}
