package TestearCosas.TestearCosas;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Tests {

	
	private int numeroUno = 5;
	private int numeroDos = 3;
	
	@Test
	public void testNumeroVerdadero() {
		
		Assert.assertTrue(numeroUno == numeroDos + 2, "El  nro. es verdadero " + String.valueOf(numeroUno));		
		
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
		
		//Assert.assertEquals(numeroUno - 1, numeroDos * 514);		
		
	}
	
	@Test
	public void testDeNulo() {
		
		Personas persona = new Personas("Pepe", "Gonzalez");
		
		Assert.assertNotNull(persona);
	}
	
	@Test
	public void testNulo() {
		
		Personas persona = null;
		Assert.assertNull(persona);
	}
    
	@Test
	public void mismoObjeto() {
		
		Personas persona = new Personas("Pepe", "Gonzalez");
		
		Personas personaDos = persona;
		
		Assert.assertSame(persona, personaDos);  
	}
	
	@Test
	public void noMismoObjeto() {
		
		Personas persona = new Personas("Pepe", "Gonzalez");
		
		Personas personaDos = new Personas("Pepe", "Gonzalez");
		
		Assert.assertNotSame(persona, personaDos);  
	}
}





















