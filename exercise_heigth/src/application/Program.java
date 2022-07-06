package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	 
		int n, nMenores;
		double alturaMedia, alturaTotal, percentualMenores; 
 		
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		
		String[] nomes = new String[n]; 
		int[] idades = new int[n]; 
		double[] alturas = new double[n]; 
		
		for(int i=0; i<n; i++) {
			System.out.printf("Dados da %da pessoa:\n", i+1);
			System.out.print("Nome: ");
			nomes[i] = sc.next();
			System.out.print("Idade: ");
			idades[i] = sc.nextInt();
			System.out.print("Altura: ");
			alturas[i] = sc.nextDouble();
			
		}
		
		nMenores = 0;
		alturaTotal = 0; 
		
		for(int i=0; i<n; i++) {
			if(idades[i] < 16) {
				 nMenores++;
			}
			alturaTotal += alturas[i]; 
		}

		alturaMedia = alturaTotal/n; 
		percentualMenores = ((double)nMenores/n) * 100.00;
		
		System.out.printf("\nAltura m�dia: %.2f\n", alturaMedia);
		System.out.printf("Pessoas com menos de 16 anos: %.1f%%\n", percentualMenores);
		
		for(int i=0; i<n; i++) {
			if(idades[i] < 16) {
				System.out.printf("%s\n", nomes[i]);
			}
		}
		
		
		sc.close(); 
	}

}
