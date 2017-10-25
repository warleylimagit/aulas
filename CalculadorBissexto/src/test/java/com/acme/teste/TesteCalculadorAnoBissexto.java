package com.acme.teste;


import org.junit.Assert;
import org.junit.Test;

import com.acme.CalculadorAnoBissexto;
public class TesteCalculadorAnoBissexto {


	@Test
	public void testeAnoImpar() {
		boolean resultado = CalculadorAnoBissexto.ehAnoBissexto(1977);
		Assert.assertFalse("Ano Impar",resultado);
	}
	@Test
	public void testeAnoParNaoBissexto() {
		boolean resultado = CalculadorAnoBissexto.ehAnoBissexto(1982);
		Assert.assertFalse("Ano par não bissexto",resultado);
	}
	@Test
	public void testeAnoBissextoTradicional() {
		boolean resultado = CalculadorAnoBissexto.ehAnoBissexto(1984);
		Assert.assertTrue("Ano bissexto tradicional",resultado);
	}
	@Test
	public void testeAnoSeculoNaoBissexto() {
		boolean resultado = CalculadorAnoBissexto.ehAnoBissexto(1900);
		Assert.assertFalse("Ano de seculo nao bissexto",resultado);
	}
	@Test
	public void testeAnoSeculoBissexto() {
		boolean resultado = CalculadorAnoBissexto.ehAnoBissexto(2000);
		Assert.assertTrue("Ano de seculo que eh bissexto",resultado);
	}
	@Test
	public void testeAno2017() {
		boolean resultado = CalculadorAnoBissexto.ehAnoBissexto(2017);
		Assert.assertTrue("Ano 2017 que eh bissexto",resultado);
	}
}
