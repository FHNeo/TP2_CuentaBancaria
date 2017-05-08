package ar.edu.unlam.basica2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Test;

public class testCuentasBancarias {

	@Test
	public void testDeCuentaSueldo() {
		System.out.println("testDeCuentaSueldo");
		CuentaSueldo cuenta = new CuentaSueldo();
		cuenta.depositar(4000.0);
		
		Double saldo = cuenta.getSaldo();
		//saldo debe valer 4000.0
		System.out.println(saldo);
		
		cuenta.extraer(500.0);
		saldo = cuenta.getSaldo();
		//saldo debe valer 3500.0
		System.out.println(saldo);
		
		cuenta.extraer(4000.0);
		//la operación no debe poder realizarse
		//y debe lanzar una excepción(RuntimeException)
	}

	@Test
	public void testDeCajaDeAhorro(){
		System.out.println("testDeCajjaDeAhorro");
		CajaDeAhorro cuenta = new CajaDeAhorro();
		cuenta.depositar(4000.0);
		
		Double saldo = cuenta.getSaldo();
		//saldo debe valer 4000.0
		System.out.println(saldo);
		
		cuenta.extraer(500.0);
		saldo = cuenta.getSaldo();
		//saldo debe valer 3500.0
		System.out.println(saldo);
		
		cuenta.extraer(4000.0);
		//la operación no debe poder realizarse
		//y debe lanzar una excepción(RuntimeException)
		cuenta.extraer(500.0);
		cuenta.extraer(500.0);
		cuenta.extraer(500.0);
		cuenta.extraer(500.0);
		saldo = cuenta.getSaldo();
		//saldo debe valer 1494.0
		System.out.println(saldo);
		cuenta.extraer(500.0);
		saldo = cuenta.getSaldo();
		//saldo debe valer 988.0
		System.out.println(saldo);
	}
	@Test
	public void testDeCuentaCorriente(){
		System.out.println("testDeCuentaCorriente");
		CuentaCorriente cuenta = new CuentaCorriente(1000.0);
		cuenta.depositar(4000.0);
		Double saldo = cuenta.getSaldo();
		//saldo debe valer 4000.0
		System.out.println(saldo);
		
		cuenta.extraer(1500.0);
		saldo = cuenta.getSaldo();
		//saldo debe valer 2500.0
		System.out.println(saldo);
		
		cuenta.extraer(2600.0);
		saldo = cuenta.getSaldo();
		//saldo debe valer -105.0
		System.out.println(saldo);
		
		cuenta.extraer(1900.0);
		saldo = cuenta.getSaldo();
		//deberia quedar igual que antes por exceder el limite
		System.out.println(saldo);
		
		cuenta.extraer(190.0);
		saldo = cuenta.getSaldo();
		//saldo debe valer 309.75
		System.out.println(saldo);
		
	}
}
