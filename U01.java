package lukasKliseviciusZP204;

import java.util.Scanner;

public class U01 {

	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		System.out.println("Kiek pamokų yra pirmadieni? ");
		int a = rd.nextInt();
		System.out.println("Kiek pamokų yra antradieni? ");
		int b = rd.nextInt();
		System.out.println("Kiek pamokų yra trečiadieni? ");
		int c = rd.nextInt();
		System.out.println("Kiek pamokų yra ketvirtadieni? ");
		int d = rd.nextInt();
		System.out.println("Kiek pamokų yra penktadieni? ");
		int e = rd.nextInt();

		int ats = a + b + c + d + e;
		int atsMin = ats * 45;

		System.out.println("Pamokų skaičius: " + ats);
		System.out.println("Tai sudaro minučių: " + atsMin);

		rd.close();

	}

}