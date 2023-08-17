import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadePessoas = 5;
        int[] idades = new int[quantidadePessoas];
        double[] alturas = new double[quantidadePessoas];

        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();

            System.out.print("Digite a altura da pessoa " + (i + 1) + " (em metros): ");
            alturas[i] = scanner.nextDouble();
        }

        int maisVelho = idades[0];
        int maisNovo = idades[0];
        double maiorAltura = alturas[0];
        double menorAltura = alturas[0];
        int somaIdades = 0;
        double somaAlturas = 0;

        for (int i = 0; i < quantidadePessoas; i++) {
            if (idades[i] > maisVelho) {
                maisVelho = idades[i];
            }
            if (idades[i] < maisNovo) {
                maisNovo = idades[i];
            }
            if (alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
            if (alturas[i] < menorAltura) {
                menorAltura = alturas[i];
            }

            somaIdades += idades[i];
            somaAlturas += alturas[i];
        }

        double mediaIdades = (double) somaIdades / quantidadePessoas;
        double mediaAlturas = somaAlturas / quantidadePessoas;

        System.out.println("\nIdade e altura na ordem inversa:");
        for (int i = quantidadePessoas - 1; i >= 0; i--) {
            System.out.println("Idade: " + idades[i] + ", Altura: " + alturas[i]);
        }

        System.out.println("\nInformações adicionais:");
        System.out.println("Mais velho: Idade: " + maisVelho);
        System.out.println("Mais novo: Idade: " + maisNovo);
        System.out.println("Mais alto: Altura: " + maiorAltura);
        System.out.println("Mais baixo: Altura: " + menorAltura);

        System.out.println("\nPessoas acima da média de idade e altura:");
        for (int i = 0; i < quantidadePessoas; i++) {
            if (idades[i] > mediaIdades && alturas[i] > mediaAlturas) {
                System.out.println("Idade: " + idades[i] + ", Altura: " + alturas[i]);
            }
        }

        System.out.println("\nPessoas abaixo da média de idade e altura:");
        for (int i = 0; i < quantidadePessoas; i++) {
            if (idades[i] < mediaIdades && alturas[i] < mediaAlturas) {
                System.out.println("Idade: " + idades[i] + ", Altura: " + alturas[i]);
            }
        }

        scanner.close();
    }
}
