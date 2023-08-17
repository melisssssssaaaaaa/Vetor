import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int vpar = 0;
		int vimpar = 0;
		final int TAM = 20;
		int k;

		int[] num = new int[TAM];

		for (k = 0; k < TAM; k++) {
			System.out.println("Insira 20 n�meros: ");
			num[k] = input.nextInt();
		}

		System.out.print("N�meros armazenados no vetor: ");
		for (k = 0; k < TAM; k++) {
			if (num[k] % 2 == 0) {
				vpar++;

			} else if (num[k] % 2 != 0) {
				vimpar++;
			}
			System.out.print(num[k] + " ");

		}

		int[] par = new int[vpar];
		int[] impar = new int[vimpar];

		int npar = 0;
		int nimpar = 0;

		for (k = 0; k < TAM; k++) {
			if (num[k] % 2 == 0) {
				par[npar] = num[k];
				npar++;
			} else if (num[k] % 2 != 0) {
				impar[nimpar] = num[k];
				nimpar++;
			}
		}
		System.out.println();
		System.out.print("N�meros armazenados no vetor dos pares: ");
		for (int i : par) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.print("N�meros armazenados no vetor dos Impares: ");
		for (int i : impar) {
			System.out.print(i + " ");
		}

		input.close();
	}

}