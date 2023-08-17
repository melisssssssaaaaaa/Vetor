import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantidadeAlunos = 30;
        int[] idades = new int[quantidadeAlunos];
        double[] alturas = new double[quantidadeAlunos];

        for (int i = 0; i < quantidadeAlunos; i++) {
            System.out.print("Digite a idade do aluno " + (i + 1) + ": ");
            idades[i] = scanner.nextInt();

            System.out.print("Digite a altura do aluno " + (i + 1) + " (em metros): ");
            alturas[i] = scanner.nextDouble();
        }

        int contagem = 0;
        int somaIdades = 0;
        double somaAlturas = 0;

        for (int i = 0; i < quantidadeAlunos; i++) {
            if (idades[i] > 13) {
                somaIdades += idades[i];
                somaAlturas += alturas[i];
                contagem++;
            }
        }

        if (contagem == 0) {
            System.out.println("Não há alunos com mais de 13 anos.");
        } else {
            double mediaAlturas = somaAlturas / contagem;
            int alunosComAlturaAbaixoDaMedia = 0;

            for (int i = 0; i < quantidadeAlunos; i++) {
                if (idades[i] > 13 && alturas[i] < mediaAlturas) {
                    alunosComAlturaAbaixoDaMedia++;
                }
            }

            System.out.println("Número de alunos com mais de 13 anos e altura abaixo da média: " + alunosComAlturaAbaixoDaMedia);
        }

        scanner.close();
    }
}
