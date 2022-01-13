package questao3;

import java.util.Scanner;

public class Main {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
				
		System.out.print("Digite um numero para que seja calculado o fatorial: ");
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		
		System.out.println("");
			
		int fatorial = 1;
		for (int i = 1; i <= numero; i++) {			
			fatorial *= i;				
		}
		
		System.out.println("O fatorial de " + numero +"! é igual a " + fatorial);
	}
}
