package org.iftm.primeiroSpringBoot.entity;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	@Test
	public void testaSomaCorretaParaDoisInteirosPositivos() {
		//cenário de teste - definir as classes a serem consideradas e os valores de entrada e resultado esperado
		Calculadora calculadora = new Calculadora();		
		int entradaNumero1 = 10;
		int entradaNumero2 = 5;		
		int resultadoEsperado = 15;
		
		//função que está sendo testada
		calculadora.somar(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);		
	}

	@Test
	public void testaSomaCorretaParaDoisInteirosNegativos() {
		Calculadora calculadora = new Calculadora();		
		int entradaNumero1 = -10;
		int entradaNumero2 = 5;		
		int resultadoEsperado = -5;
		
		calculadora.somar(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);		
	}
	
	
	@Test
	public void testaSubtracaoCorretaParaDoisInteirosPositivos() {
		//cenário de teste - definir as classes a serem consideradas e os valores de entrada e resultado esperado
		Calculadora calculadora = new Calculadora();		
		int entradaNumero1 = 10;
		int entradaNumero2 = 5;		
		int resultadoEsperado = 5;
		
		//função que está sendo testada
		calculadora.subtrair(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);		
	}

	@Test
	public void testaMultiplicacaoCorretaParaDoisInteirosPositivos() {
		//cenário de teste - definir as classes a serem consideradas e os valores de entrada e resultado esperado
		Calculadora calculadora = new Calculadora();		
		int entradaNumero1 = 10;
		int entradaNumero2 = 5;		
		int resultadoEsperado = 50;
		
		//função que está sendo testada
		calculadora.multiplicar(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);		
	}

	@Test
	public void testaDivisãoCorretaParaDoisInteirosPositivos() {
		//cenário de teste - definir as classes a serem consideradas e os valores de entrada e resultado esperado
		Calculadora calculadora = new Calculadora();		
		int entradaNumero1 = 10;
		int entradaNumero2 = 5;		
		int resultadoEsperado = 2;
		
		//função que está sendo testada
		calculadora.dividir(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);		
	}

	@Test
	public void testaDivisaoPorZeroretornaValorMenos1() {
		//cenário de teste - definir as classes a serem consideradas e os valores de entrada e resultado esperado
		Calculadora calculadora = new Calculadora();		
		int entradaNumero1 = 10;
		int entradaNumero2 = 0;		
		int resultadoEsperado = -1;
		
		//função que está sendo testada
		calculadora.dividir(entradaNumero1, entradaNumero2);
		int resultadoObtido = calculadora.getResultado();
		
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);		
	}

}
