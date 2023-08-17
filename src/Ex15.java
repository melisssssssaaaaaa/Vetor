import java.util.Scanner;

public class Ex15 {
    public static final int TAMANHO_VETOR = 5; // Tamanho do vetor constante

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] valores = new int[TAMANHO_VETOR];

        // Preenchendo o vetor com valores validados entre 0 e 20
        for (int i = 0; i < TAMANHO_VETOR; i++) {
            System.out.print("Digite um valor entre 0 e 20: ");
            int valor = scanner.nextInt();
            valores[i] = validarValor(valor);
        }

        // Gerando o gráfico
        for (int i = 0; i < TAMANHO_VETOR; i++) {
            System.out.print(valores[i] + ": ");
            for (int j = 0; j < valores[i]; j++) {
                System.out.print("#");
            }
            System.out.println();
        }

        scanner.close();
    }

    // Função para validar um valor entre 0 e 20
    public static int validarValor(int valor) {
        if (valor < 0) {
            return 0;
        } else if (valor > 20) {
            return 20;
        } else {
            return valor;
        }
    }
}
