package main;

public class IndoArabicos {
	public static String arabicoParaRomano(int entrada) {

		int[] arabicos = { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
		String[] romanos = { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };

		int i = 12;
		String algarismoRomano = "";

		while (entrada != 0) {
			if (arabicos[i] <= entrada) {
				algarismoRomano += romanos[i];
				entrada = entrada - arabicos[i];
			} else {
				i -= 1;
			}

		}
		return algarismoRomano;

	}

}
