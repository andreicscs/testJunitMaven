package testJunitMaven;
import static org.junit.Assert.*;
import org.junit.Test;

public class test1 {

	@Test
	public void test() {
		double result = Calcolatrice.sum(2, 1);
		assertEquals(2f, result, 0.0f);
	}

}
