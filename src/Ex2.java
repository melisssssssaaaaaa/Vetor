
public class Ex2 {

	public static void main(String[] args) {
		
		float[] vetor = { (float) 3.44, (float) 4.3232, (float) 21.32, (float) 123.2, (float) 2.3, (float) 21.21,
				(float) 323.2, (float) 5.97, (float) 123.1, (float) 99.99 };

		inverter(vetor);
		mostrar(vetor);

	}

	
	private static void mostrar(float[] vetor) {
		for (float j : vetor) {
			System.out.println(j);
		}
	}
	private static void inverter(float[] vetor) {
		float i, z;
		i = 0;
		z = vetor.length - 1;

		while (i < z) {
			trocar(vetor, i, z);
			i++;
			z--;
		}
	}

	private static void trocar(float[] vetor, float i, float z) {
		float aux = vetor[(int) i];
		vetor[(int) i] = vetor[(int) z];
		vetor[(int) z] = aux;
	}
}
