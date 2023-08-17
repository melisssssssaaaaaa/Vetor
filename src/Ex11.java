import java.util.Arrays;
import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Insira v�rias palavras separadas: ");
		String palavra = input.next();
		String separar[] = palavra.split(";");

		System.out.println(Arrays.toString(separar));

		input.close();
	}

}