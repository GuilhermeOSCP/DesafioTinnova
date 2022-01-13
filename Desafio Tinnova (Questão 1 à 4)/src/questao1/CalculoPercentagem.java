package questao1;

public class CalculoPercentagem {

	int totalDeEleitores = 1000;
	int votosValidos = 800;	
	int votosBrancos = 150;
	int votosNulos = 50;
	
	public int calcularPercentualValidos() {	
		int percentualValidos = (votosValidos * 100/totalDeEleitores);
		return percentualValidos;
	}
	
	public int calcularPercentualBrancos() {
		int percentualBrancos = (votosBrancos * 100/totalDeEleitores);
		return percentualBrancos;
	}
	
	public int calcularPercentualNulos() {
		int percentualNulos = (votosNulos * 100/totalDeEleitores);
		return percentualNulos;
	}
}
