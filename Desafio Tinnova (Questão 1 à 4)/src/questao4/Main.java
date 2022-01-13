package questao4;

import java.util.Scanner;

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
        int numeroTres = 3;
        int numeroCinco = 5;
        int soma = 0;

		System.out.print("Digite um numero para calcular a soma de todos os numeros multiplos de 3 ou 5 abaixo do escolhido: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();		
        
        for(int i = 0; i < numero; i++) {
            if((i%numeroTres == 0)||(i%numeroCinco == 0))
            	soma += i;     
        }
        
        System.out.println("A soma dos multiplos de 3 e 5 abaixo de " + numero + " é: " + soma);
    }		

}
