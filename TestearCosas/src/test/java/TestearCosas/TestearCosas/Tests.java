package TestearCosas.TestearCosas;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {

	
	private int numeroUno = 5;
	private int numeroDos = 3;
	
	@Test
	public void testNumeroVerdadero() {
		
		Assert.assertTrue(numeroUno == numeroDos + 1, "El  nro. no es verdadero " + String.valueOf(numeroUno));		
		
	}
	@Test
	public void testNumeroFalso() {
		
		Assert.assertFalse(numeroUno == numeroDos, "Ambos nros. no son iguales"); //Va a dar falso ;-) 
		
	} 
	
	@Test
	public void testNumerosIguales() {
		
		Assert.assertEquals(numeroUno + 10,  numeroDos + 12);
		
	}
	
	@Test
	public void testNumerosNoIguales() {
		
		Assert.assertEquals(numeroUno - 1, numeroDos * 514);
		
		
	}
	
	@Test
	public void testDeNulo() {
		
		Personas persona = new Personas("Pepe", "Gonzalez");
		
		Assert.assertNull(persona);
	}
    
}
