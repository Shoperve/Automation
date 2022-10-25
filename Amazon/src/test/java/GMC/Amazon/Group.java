package GMC.Amazon;

import org.testng.annotations.Test;

public class Group {
  @Test (groups="Smoke")
  public void f1() {
	  System.out.println("This is smoke test Run");
  }
  
  @Test (groups="Regression")
  private void f() {
	  System.out.println("This is Regression test Run");

}
  @Test (groups="Functional")
  private void f5() {
	  System.out.println("This is Functional Test Run");

}
}
