package JUnit;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;



class operadorTest {
	

	
	@Test  		//EXITO  Prueba que A + B es el resultado esperado
	public void testSuma() {
		int A=12; 
		int B=14;
		int operacion = operador.suma(A, B);
		int esperado = 26;	
		assertEquals(esperado, operacion);
	}
	
	
	@Test 		//EXITO Prueba que Nombre no esta vacio
	public void ComprobadorNoVacio() {
		String Nombre= "JUAN";
		assertNotNull(Nombre);
	}
	
	
	
	//ERROR  Prueba que Nombre esta vacio
	public void ComprobadorVacio() {
		String Nombre="NULL";
		assertNull(Nombre);
	}
	

	
	@Test		//EXITO			Prueba que A - B es el resultado esperado
	public void testResta() {
		
		int A=12; int B=6;
		int operacion = operador.resta(A, B);
		int esperado = 6;	
		assertEquals(esperado, operacion);
	}
	
	@Test		//EXITO		Prueba que A * B es el resultado esperado
	public void testMultiplicacion() {
		int A=6; int B=3;
		int operacion = operador.multiplicacion(A, B);
		int esperado = 18 ;	
		assertEquals(esperado, operacion);
	}
	
	
	
	@Test		 //Error	Prueba que A / B es el resultado esperado
	public void testDivisionError() {
		
		int A=22; int B=11;
		int operacion = operador.division(A, B);
		int esperado = 4444;	
		assertEquals(esperado, operacion);
	}
	
	

	@Test		 //EXITO	Prueba que A / B es el resultado esperado
	public void testDivision() {
		
		int A=22; int B=11;
		int operacion = operador.division(A, B);
		int esperado = 2;	
		assertEquals(esperado, operacion);
	}

	
	@Test		 //ERROR	Prueba que A + B es el resultado esperado
	public void testSumaError() {
		int A=42; int B=2224;
		int operacion = operador.suma(A, B);
		int esperado = 226;	
		assertEquals(esperado, operacion);
	}

	
	@Test   	 //ERROR	Prueba que A - B es el resultado esperado
	public void testRestaError() {
		int A=42; int B=2224;
		int operacion = operador.resta(A, B);
		int esperado = 226;	
		assertEquals(esperado, operacion);
	}
	
	
	
	
	
}
