package lukasKliseviciusZP204;

import java.util.Scanner;

public class U04 {

	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		System.out.println("įveskite intervalo pradžią: ");
		int pradzia = rd.nextInt();
		System.out.println("įveskite intervalo pabaigą: ");
		int pabaiga = rd.nextInt();
		
		int kiekis = 0;
		
		for(int i = pradzia; i<=pabaiga;i++) {
			if(i % 6 == 0) {
				kiekis++;
			}
		}
		
		System.out.println("Reikalingų marškinėlių skaičius: " + kiekis);

		rd.close();

	}

}
