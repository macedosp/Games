package entities;

import java.util.Arrays;
import java.util.Random;

public class Loterias {
	
	private static int[] vector;
	
	public static int[] getVector() {
		return vector;
	}


	public static void setVector(int[] vector) {
		Loterias.vector = vector;
	}


	public static void Aposta(int n, int z) {
		
		int rd = 0;
		Random gerador = new Random();
				
		int [] vect = new int[n];		
		for (int i=0; i<n; i++) {
			
		rd = gerador.nextInt(z)+1;
									
		for (int x=0; x<i; x++) {
			
				while (rd == vect[x]) {
					
					rd = gerador.nextInt(z)+1;
					x=0;
				}
										
			}
																
			vect[i] = rd;
									
		}
		
		Arrays.sort(vect);
		vector=vect;
	}

}
