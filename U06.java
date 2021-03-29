package lukasKliseviciusZP204;

import java.util.Scanner;

public class U06 {

	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		System.out.println("Iveskite kiek kartu mokosi: ");
		int n = rd.nextInt();

		int ats = 0;
		for (int i = 0; i < n; i++) {

			System.out.println("iveskite inervalo pradzia ");
			System.out.println("val: ");
			int Aval = rd.nextInt();
			System.out.println("min: ");
			int Amin = rd.nextInt();

			System.out.println("iveskite intervalo pabaiga ");
			System.out.println("val: ");
			int Bval = rd.nextInt();
			System.out.println("min: ");
			int Bmin = rd.nextInt();
			ats += gautiTrukmeMinutemis(Aval, Amin, Bval, Bmin);
		}

		String rezultatas = gautiLaikoFormata(ats);
		System.out.println(rezultatas);

		rd.close();

	}

	private static String gautiLaikoFormata(int ats) {
		int h = ats / 60;
		int m = ats % 60;
		return h + " val. " + m + " min.";

	}

	private static int gautiTrukmeMinutemis(int aval, int amin, int bval, int bmin) {
		return ((bval * 60) + bmin) - ((aval * 60) + amin);

	}

}
