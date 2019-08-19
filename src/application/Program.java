package application;

import java.util.Scanner;

import entities.Loterias;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a Op��o Desejada [1] - MegaSenna [2] - LotoFacil > ");
		
		int opc=sc.nextInt();
		
		while (opc < 1 || opc>2) {
			
			System.out.println("Op��o Inv�lida - Selecione [1] - MegaSenna [2] - LotoFacil > ");
			opc=sc.nextInt();
		}
		
		if (opc == 1) {
			
			System.out.println("Para a MegaSenna s�o permitidos at� 15 n�meros por aposta");
			System.out.println("==========================================================");
			System.out.println("Quantos n�meros deseja - m�nimo 6 e m�ximo 15 > ");
			
			int n=sc.nextInt();
			
			while (n<6 || n>15) {
				
				System.out.println("Op��o inv�lida - S�o no m�nimo 6 n�meros e no m�ximo 15 > ");
				
				n=sc.nextInt();
				
			}
			
			int z = 59;
			
			Loterias.Aposta(n,z);
			
			System.out.println("E aqui est�o os "+ n + " n�meros da Sorte para a Mega Senna: ");
			System.out.println("----------------------------------------------------");
			
			for (int obj: Loterias.getVector()) {
				
				System.out.print("["+obj+"]"+" ");
				
			}
			
			
		}
		else if (opc == 2) {
			
			System.out.println("Para a LotoF�cil s�o permitidos at� 18 n�meros por aposta");
			System.out.println("==========================================================");
			System.out.println("Quantos n�meros deseja - m�nimo 15 e m�ximo 18 > ");
			
			int n=sc.nextInt();
			
			while (n<15 || n>18) {
				
				System.out.println("Op��o inv�lida - S�o no m�nimo 15 n�meros e no m�ximo 18 > ");
				
				n=sc.nextInt();
			}
				int z = 24;
				
				Loterias.Aposta(n,z);
				
				System.out.println("E aqui est�o os "+ n + " n�meros da Sorte para a LotoF�cil: ");
				System.out.println("----------------------------------------------------");
				
				for (int obj: Loterias.getVector()) {
					
					System.out.print("["+obj+"]"+" ");
					
				}
				
			
			
		}
		
		sc.close();

	}

}
