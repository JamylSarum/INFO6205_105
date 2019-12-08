package gaCode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FitnessTest {
	@Test
	public void test1() {
		long t = System.currentTimeMillis();
		GenerateIndividual.geneIndi(t);
		GenerateIndividual.putPheno(0,"0 0, 1 0, 2 0, 2 -1, 1 -2");
		Fitness.selection(10);
		assertEquals("0 0, 1 0, 2 0, 2 -1, 1 -2", GenerateIndividual.getPheno(0));
	}
	
	@Test
	public void test2() {
		long t = System.currentTimeMillis();
		GenerateIndividual.geneIndi(t);
		GenerateIndividual.putPheno(0,"0 0, 1 0, 2 0, 2 -1, 1 -2");
		Fitness.selection(20);
		assertEquals(null, GenerateIndividual.getPheno(0));
	}
}
