package gaCode;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GenerateIndividualTest {
	@Test
	public void test() {
		long t = System.currentTimeMillis();
		GenerateIndividual.geneIndi(t);
		assertEquals(1000, GenerateIndividual.getGenomap().size());
		assertEquals(1000, GenerateIndividual.getPhenomap().size());
	}
}
