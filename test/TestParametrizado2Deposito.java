import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class TestParametrizado2Deposito {
	private double actual;
	private double llenar;
	private double resultado;

	public TestParametrizado2Deposito(double actual, double consumo, double resultado) {
		this.actual = actual;
		this.llenar = consumo;
		this.resultado = resultado;
	}
	
	@Parameters
	public static Collection<Object[]>numeros() {
		return Arrays.asList(new Object[][]{
			{100,10,110},{400,100,500}, {100,100,200}, {250,240,490}, {100,-50,50}, {400,-200, 200}
		});
	}

	@Test 
	public void testRetirar() {
		DepositoCombustible tank = new DepositoCombustible(500.0,actual);
		DepositoCombustible.fill(llenar);
		assertEquals(DepositoCombustible.getDepositoNivel(), resultado, 0.001);
	}
	
}
