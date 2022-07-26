package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		List <Aluguel> list = new ArrayList<>();
		
		System.out.print("Digite o valor do Aluguel: ");
		double valorAluguel = sc.nextDouble();
		System.out.print("Quantos alugueis estão atrasados? ");
		int a = sc.nextInt();
		if (a == 1) {
			System.out.print("Digite a quantos dias o aluguel esta atrasado: ");
			int diasAtraso = sc.nextInt();
			Aluguel aluguel = new Aluguel(0.1, 0.01, valorAluguel, diasAtraso);
			System.out.println("Valor a ser recebido: R$" + String.format("%.2f", aluguel.valorAtualizado()) + " Juros " + String.format("%.2f", aluguel.valorJuros()));
					
		}
		else if(a >= 2) {
			for (int i=1; i <= a; i++) {
			System.out.print("Digite a quantos dias o " + i + "º Aluguel está em atraso: ");
			int dias = sc.nextInt();
			list.add(new Aluguel(0.1, 0.01, valorAluguel, dias));
			}
			
			double valorAtt = 0;
			double jurosAtt = 0;
			
			for (Aluguel alug: list) {
				System.out.println("Valor a ser recebido : R$" + String.format("%.2f", alug.valorAtualizado()) + " Juros " + String.format("%.2f", alug.valorJuros()));
				valorAtt += alug.valorAtualizado();
				jurosAtt += alug.valorJuros();				
			}
				System.out.println("Valor total a ser recebido: R$" + String.format("%.2f", valorAtt) + " Juros Atualizados: " + String.format("%.2f", jurosAtt));
		}
		
		sc.close();
	}

}
