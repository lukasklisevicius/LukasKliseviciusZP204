package lukasKliseviciusZP204;

import java.util.Scanner;

public class U05 {

	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		System.out.println("įveskite pirmajį rezultata: ");
		int a = rd.nextInt();
		System.out.println("įveskite antrajį rezultata: ");
		int b = rd.nextInt();
		System.out.println("įveskite antrajį rezultata: ");
		int c = rd.nextInt();

		System.out.println("Rezultatas: " + gautiGeriausiaIvertinima(a, b, c));
		rd.close();
	}

	private static int gautiGeriausiaIvertinima(int i, int j, int k) {
		return Math.max(i, Math.max(j, k));
	}

}
