import java.util.Random;
import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random aleatorio = new Random();

		int tamanhosenha = 0;
		int k;
		char randomSenha;
		String senha = "";

		char[] vetor = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
				'r', 's', 't', 'u', 'v', 'w', 'y', 'x', 'z' };

		do {
			System.out.println(
					"Insira o tamanho da senha que deseja, este tamanho deve ser menor que a quantidade de letras no vetor!");
			tamanhosenha = input.nextInt();
		} while (tamanhosenha > vetor.length);

		for (k = 0; k < tamanhosenha; k++) {
			if (k % 2 == 0) {
				do {
					randomSenha = vetor[aleatorio.nextInt(26)];
				} while (randomSenha == 'a' || randomSenha == 'e' || randomSenha == 'i' || randomSenha == 'o'
						|| randomSenha == 'u');
				senha = senha + randomSenha;
			} else {

				do {
					randomSenha = vetor[aleatorio.nextInt(26)];
				} while (randomSenha != 'a' && randomSenha != 'e' && randomSenha != 'i' && randomSenha != 'o'
						&& randomSenha != 'u');
				senha = senha + randomSenha;
			}
		}

		System.out.println("A senha gerada foi: " + senha);

		input.close();
	}

}