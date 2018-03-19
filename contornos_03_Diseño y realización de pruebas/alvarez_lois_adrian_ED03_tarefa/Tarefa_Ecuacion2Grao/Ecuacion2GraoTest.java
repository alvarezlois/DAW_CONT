import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Ecuacion2GraoTest {

	@Test( expected = Ec2GraoException.class )
	public void shouldLaunchEcuacion2GraoException() throws Ec2GraoException {
		Ecuacion2Grao ec=new Ecuacion2Grao(7,5,6);
		ec.soluciona();
	}

	@Test( expected = Ec2GraoException.class )
	public void shouldLaunchDivideByZeroException() throws Ec2GraoException {
		Ecuacion2Grao ec=new Ecuacion2Grao(0,0,8);
		ec.soluciona();
	}

	@Test
	public void testTwoSolutions() throws Ec2GraoException {
		Ecuacion2Grao ec=new Ecuacion2Grao(2,7,3);
		double[] s=ec.soluciona();
		assertEquals("S1 Must be ",15.33,s[0],0.0005);
		assertEquals("S2 Must be ",-8.12,s[1],0.0005);
	}

	@Test
	public void testOneSolution() throws Ec2GraoException {
		Ecuacion2Grao ec=new Ecuacion2Grao(0,2,3);
		double[] s=ec.soluciona();
		assertEquals("Must be -3/2",((double)-3)/2,s[0],0.0005);
	}


	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(Ecuacion2GraoTest.class);
		System.out.println("Realizados "+result.getRunCount()+" tests en "+result.getRunTime()+"ms");
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
	}
}
