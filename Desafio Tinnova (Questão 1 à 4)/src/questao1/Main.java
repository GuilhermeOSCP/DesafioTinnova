package questao1;

public class Main {
	
	public static void main(String[] args) {	
		
		CalculoPercentagem calculo = new CalculoPercentagem();
		
		int validos = (calculo.calcularPercentualValidos());
		int brancos = (calculo.calcularPercentualBrancos());
		int nulos = (calculo.calcularPercentualNulos());
		
		System.out.println("O percentual dos votos v�lidos em rela��o ao total de eleitores foi de "+ validos +"%");
		System.out.println("O percentual dos votos brancos em rela��o ao total de eleitores foi de "+ brancos +"%");
		System.out.println("O percentual dos votos nulos em rela��o ao total de eleitores foi de "+ nulos +"%");
	}
}
