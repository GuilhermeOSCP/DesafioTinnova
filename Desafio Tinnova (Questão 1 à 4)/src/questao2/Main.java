package questao2;

public class Main {

	public static void main(String[] args) {
		
		int[] v = {5, 3, 2, 4, 7, 1, 0, 6};
		int swp = 0;
		int i = 0;

		System.out.print("Vetor sem Bubble Sort: ");
		for(i = 0; i<8; i++){
			System.out.print(v[i] + " ");
		}
		
		System.out.println(" ");

		for(i = 0; i<8; i++){
			for(int j = 0; j<7; j++){
				if(v[j] > v[j + 1]){
					swp = v[j];
					v[j] = v[j+1];
					v[j+1] = swp;
				}
			}
		}
		
		System.out.print("Vetor com Bubble Sort:");
		for(i = 0; i<8; i++){
			System.out.print(" "+v[i]);
		}

	}

}
