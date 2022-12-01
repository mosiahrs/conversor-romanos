package main;

import java.util.HashMap;
import java.util.Map;

public class Romanos {
	public static int romanoParaArabico(String entrada) {

		int convertido = 0;
		int tamanho = entrada.length();

		Map<Character, Integer> romano = obterRomano();
		for (int i = 0; i < tamanho - 1; i++) {
			int valorAtual = romano.get(entrada.charAt(i));
			if (valorAtual < romano.get(entrada.charAt(i + 1))) {

				// Quando escrito a esquerda de maiores, seus valores sao subtraidos.
				convertido -= valorAtual;

			} else {

				// Quando estiver a direita, somam-se.
				convertido += valorAtual;

			}
		}

		return convertido + romano.get(entrada.charAt(tamanho - 1));
	}

	public static Map<Character, Integer> obterRomano() {

		Map<Character, Integer> romanos = new HashMap<Character, Integer>();
		romanos.put('I', 1);
		romanos.put('V', 5);
		romanos.put('X', 10);
		romanos.put('L', 50);
		romanos.put('C', 100);
		romanos.put('D', 500);
		romanos.put('M', 1000);

		return romanos;
	}

}
