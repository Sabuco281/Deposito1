import static org.junit.Assert.*;

import org.junit.Test;

public class TestDeposito {

	@Test	
	public void testGetNivel() {
		DepositoCombustible tank = new DepositoCombustible(50.0,5.0);
		double nivel = DepositoCombustible.getDepositoNivel();
		assertEquals(5, nivel, 0.001);
	}
	
	@Test	
	public void testGetMax() {
		DepositoCombustible tank = new DepositoCombustible(50.0,5.0);
		double max = DepositoCombustible.getDepositoMax();
		assertEquals(50, max, 0.001);
	}
	
	@Test	
	public void testVacio() {
		DepositoCombustible tank = new DepositoCombustible(50.0,0.0);
		assertTrue(DepositoCombustible.estaVacio());
	}
	
	@Test	
	public void testMitadNivelMax() {
		DepositoCombustible tank = new DepositoCombustible(50.0,25.0);
		double nivel = DepositoCombustible.getDepositoNivel();
		double max = DepositoCombustible.getDepositoMax();
		assertEquals(max/2, nivel, 0.001);
	}
	
}
