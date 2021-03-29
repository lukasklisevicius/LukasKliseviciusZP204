package lukasKliseviciusZP204;

import java.util.Scanner;

public class U02 {

	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);

		System.out.println("Įveskite dėžių skaičių: ");
		int deziuSk = rd.nextInt();
		System.out.println("Įveskite knygų skaičių: ");
		int knyguSk = rd.nextInt();
		System.out.println("Įveskite, kelios knygos telpa į dėžę: ");
		int telpa = rd.nextInt();
		int ats = telpa * deziuSk;
		if (ats < knyguSk) {
			System.out.println("Knygos netelpa į dėžes.");
			System.out.println("Į dėžes netilpo " + (knyguSk - ats) + " knygos/-a/-ų.");
		} else {
			System.out.println("Knygos telpa į dėžes.");
		}
		rd.close();
	}

}
