package diagramas.de.fujo;

public class trianguloreves {

	public static void main(String[] args) {
		Scanner pr = new Scanner(System.in);
		System.out.println("ingrese un numero numero");
		int N = pr.nextInt();

		for (int i = N; i >= 1; i--) {
			System.out.println("");
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
		}
		System.out.println("");

	}

}
