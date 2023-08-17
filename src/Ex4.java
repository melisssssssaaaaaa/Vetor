import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		
Scanner input = new Scanner(System.in);
		
		char v[] = {'a', 'b', 'c','d', 'e', 'f', 'g', 'h', 'i','j'};
		int contador = 0;
		int i;
		
		System.out.print("As consoantes inseridas foram: ");
		for(i = 0; i < 10; i++) {
			if((v[i] != 'a') && (v[i] != 'e') && (v[i] != 'i') && (v[i] != 'o') && (v[i] != 'u'))  {
					contador++; 
					System.out.print( v[i] + " | ");
			}	
		}
		System.out.println();
		System.out.println("Foram lidas um total de : " + contador + " consoantes." );
		
		input.close();
	}

}