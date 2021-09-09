package test.calculadora;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import calculadora.Calculadora;

public class CalculadoraTest {

	// métodos de teste do método somar da classe calculadora
	@Test
	public void testeSomaNumerosComuns() {
		// 1. definindo o cenário de teste
		Calculadora calc = new Calculadora();
		// entradas
		double numero1 = 10;
		double numero2 = 20;
		// saída
		double resultadoEsperado = 30;

		// 2. executar a ação a ser testada
		double resultadoObtido;
		resultadoObtido = calc.somar(numero1, numero2);

		// 3. Verificar o resultado obtido
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);
	}

	@Test
	public void testeSomaNumerosNegativos() {
		// 1. definindo o cenário de teste
		Calculadora calc = new Calculadora();
		// entradas
		double numero1 = -10;
		double numero2 = -2;
		// saída
		double resultadoEsperado = -12;

		// 2. executar a ação a ser testada
		double resultadoObtido;
		resultadoObtido = calc.somar(numero1, numero2);

		// 3. Verificar o resultado obtido
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);
	}

	@Test
	public void testeSomaNumerosGrandes() {
		// 1. definindo o cenário de teste
		Calculadora calc = new Calculadora();
		// entradas
		double numero1 = 1000000000;
		double numero2 = 1000000000;
		// saída
		double resultadoEsperado = 2000000000;

		// 2. executar a ação a ser testada
		double resultadoObtido;
		resultadoObtido = calc.somar(numero1, numero2);

		// 3. Verificar o resultado obtido
		Assertions.assertEquals(resultadoEsperado, resultadoObtido);
	}
	
	// métodos de teste do método subtrair da classe calculadora
	// métodos de teste do método dividir da classe calculadora
	// métodos de teste do método multiplicar da classe calculadora

}
