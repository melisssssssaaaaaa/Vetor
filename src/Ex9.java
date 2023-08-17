import java.util.Arrays;
import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Insira um texto: ");
		String text = input.nextLine();

		char letras[] = new char[text.length()];

		for (int k = 0; k < letras.length; k++) {
			letras[k] = text.charAt(k);
		}

		System.out.println(Arrays.toString(letras));
		
		input.close();
	}

}