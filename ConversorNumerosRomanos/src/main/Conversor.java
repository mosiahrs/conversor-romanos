package main;

import java.util.Scanner;

public class Conversor {

	private static final Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		menu();

	}

	private static void menu() {

		System.out.println("--- CONVERSOR DE ALGARISMOS ROMANOS ----");
		System.out.println("--- Qual conversao deseja realizar? ----");
		System.out.println("1 - Numeros Romanos para Indo-arabicos");
		System.out.println("2 - Indo-arabicos para Romanos");
		System.out.println("----------------------------------------");

		int opcao = input.nextInt();

		switch (opcao) {
		case 1:
			System.out.println("Digite um Algarismo Romano para converter em indo-arabico: ");
			String entradaUser = input.next().toUpperCase();
			System.out.println(entradaUser + " = " + Romanos.romanoParaArabico(entradaUser));
			break;
		case 2:
			System.out.println("Digite um Numero inteiro para converter em Romano: ");
			int entradaUser1 = input.nextInt();
			System.out.println(entradaUser1 + " = " + IndoArabicos.arabicoParaRomano(entradaUser1));
			break;
		default:
			System.out.println("Digite uma opcao valida.");
			menu();
		}

	}
}
