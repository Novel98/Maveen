//Program3

package Priority;

import net.bytebuddy.build.Plugin;
import org.testng.annotations.Test;

public class Priorty_Number {

    @Test(priority = 1)
    public void testcaseA(){
        System.out.println("this is A");
    }
    @Test(priority = 2)
    public void testcaseC(){
        System.out.println("this is C");

    }
    @Test(priority = 3)
    public void testcaseB(){
        System.out.println("this is B");
    }
    @Test(priority =-3)
    public void testcaseh(){
        System.out.println("this is B");
    }
}

