import static org.junit.Assert.*;
import java.util.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class TestParametrizadoDeposito {
	private double actual;
	private double consumo;
	private double resultado;

	public TestParametrizadoDeposito(double actual, double consumo, double resultado) {
		this.actual = actual;
		this.consumo = consumo;
		this.resultado = resultado;
	}
	
	@Parameters
	public static Collection<Object[]>numeros() {
		return Arrays.asList(new Object[][]{
			{100,10,90},{400,100,300}, {100,100,0}, {250,240,10}, {100,-50,150}, {100,-200, 300}
		});
	}

	@Test 
	public void testRetirar() {
		DepositoCombustible tank = new DepositoCombustible(500.0,actual);
		DepositoCombustible.consumir(consumo);
		assertEquals(DepositoCombustible.getDepositoNivel(), resultado, 0.001);
	}
	
}
