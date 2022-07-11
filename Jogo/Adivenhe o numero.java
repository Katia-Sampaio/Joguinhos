package Jogo;

import java.util.Random;
import java.util.Scanner;

public class Jogo {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("*******jogo de adivinhação*******\n");
		Random gerador = new Random();
		int aleatorio = gerador.nextInt(100); // aleatorio guarda o valor que o computador sorteou
		int contador = 0;
		int num;
		do {
			System.out.println("Digite um número:");
			num = entrada.nextInt(); // Num guarda o valor que o usuario digitou

			for (int i = 0; i < 1; i++) {

				if (num != aleatorio) {
					if (aleatorio > num) {
						System.out.println("O valor digitado é menor que o valor sorteado");
					} else
						System.out.println("O valor digitado é maior que o valor sorteado");

				}
				if ((num == aleatorio - 1) && contador < 4 || ((num == aleatorio + 1) && contador < 4)) {
					System.out.println("TA QUENTE !!!!");
				}
			}

			contador++;
		} while (num != aleatorio && contador < 5);

		if (num == aleatorio) {
			System.out.println("Parabéns, você ganhou o jogo!");
		} else
			System.out.println("Tentativas excedidas!\nGAME OVER\n o numero sorteador foi" + aleatorio);

		entrada.close();
	}
}
