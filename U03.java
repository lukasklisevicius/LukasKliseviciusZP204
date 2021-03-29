package lukasKliseviciusZP204;

public class U03 {

	public static void main(String[] args) {
		int pradzia = -100;
		int pabaiga = -200;

		System.out.println("Ciklas for: ");
		for (int i = pradzia; i > pabaiga; i = i - 3) {
			System.out.print(i);
		}
		System.out.println("Ciklas while: ");
		while (pradzia > pabaiga) {
			System.out.print(pradzia);
			pradzia = pradzia - 3;
		}

	}

}
