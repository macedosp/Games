package application;

import java.util.Scanner;

import entities.Loterias;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Qual a Opção Desejada [1] - MegaSenna [2] - LotoFacil > ");
		
		int opc=sc.nextInt();
		
		while (opc < 1 || opc>2) {
			
			System.out.println("Opção Inválida - Selecione [1] - MegaSenna [2] - LotoFacil > ");
			opc=sc.nextInt();
		}
		
		if (opc == 1) {
			
			System.out.println("Para a MegaSenna são permitidos até 15 números por aposta");
			System.out.println("==========================================================");
			System.out.println("Quantos números deseja - mínimo 6 e máximo 15 > ");
			
			int n=sc.nextInt();
			
			while (n<6 || n>15) {
				
				System.out.println("Opção inválida - São no mínimo 6 números e no máximo 15 > ");
				
				n=sc.nextInt();
				
			}
			
			int z = 59;
			
			Loterias.Aposta(n,z);
			
			System.out.println("E aqui estão os "+ n + " números da Sorte para a Mega Senna: ");
			System.out.println("----------------------------------------------------");
			
			for (int obj: Loterias.getVector()) {
				
				System.out.print("["+obj+"]"+" ");
				
			}
			
			
		}
		else if (opc == 2) {
			
			System.out.println("Para a LotoFácil são permitidos até 18 números por aposta");
			System.out.println("==========================================================");
			System.out.println("Quantos números deseja - mínimo 15 e máximo 18 > ");
			
			int n=sc.nextInt();
			
			while (n<15 || n>18) {
				
				System.out.println("Opção inválida - São no mínimo 15 números e no máximo 18 > ");
				
				n=sc.nextInt();
			}
				int z = 24;
				
				Loterias.Aposta(n,z);
				
				System.out.println("E aqui estão os "+ n + " números da Sorte para a LotoFácil: ");
				System.out.println("----------------------------------------------------");
				
				for (int obj: Loterias.getVector()) {
					
					System.out.print("["+obj+"]"+" ");
					
				}
				
			
			
		}
		
		sc.close();

	}

}
