package calculadora;

public class TesteManual {

	// realizar testes não automatizados...
	public static void main (String args[]){
		// criando um objeto da classe calculadora que recebe uma nova instância de calculadora
	    
		// 1. definindo o cenário de teste
		Calculadora calc = new Calculadora();
		//entradas
		double numero1 = 10;
		double numero2 = 20;
		//saída
		double resultadoEsperado = 30;
		
		// 2. executar a ação a ser testada
		double resultadoObtido;
		resultadoObtido = calc.somar(numero1, numero2);
		
		// 3. Verificar o resultado obtido
		if (resultadoEsperado == resultadoObtido)
			System.out.println("Resposta correta");
		else
			System.out.println("Resposta incorreta");
		
	}

}
