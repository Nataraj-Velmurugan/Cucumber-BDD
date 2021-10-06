package CustomHooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;

public class AmazonHooks {
	
	@Before("@Smoke")
	public void setup_2() {
		System.out.println(" I am before tag hook ");
	}

	@After("@Smoke")
	public void tearDown_2() {
		System.out.println(" I am after tag hook");
	}

	
	
//	@Before(order=1)
//	public void setup_1(Scenario sc) {
//		System.out.println(" I am setup 1");
//		System.out.println(sc.getName());
//	}
//	
//	@Before(order=2)
//	public void setup_2() {
//		System.out.println(" I am setup 2");
//	}
//
//	@After(order=2)
//	public void tearDown_2() {
//		System.out.println(" I am tearDown 2");
//	}
//
//	@After(order=1)
//	public void tearDown_1() {
//		System.out.println(" I am tearDown 1");
//	}
	
	@BeforeStep()
	public void teaakescreenshot() {
		System.out.println(" I am teaakescreenshot");
	}

	@AfterStep()
	public void refresh() {
		System.out.println(" I am refresh");
	}
	
}
