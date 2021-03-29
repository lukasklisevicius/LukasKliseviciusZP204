package lukasKliseviciusZP204;

import java.util.Arrays;

public class algoritmaiLukas {

	public static void main(String[] args) {

	}

	public static void print(int[] array) {
		System.out.println(Arrays.toString(array));
	}

	public static boolean equals(int[] array1, int[] array2) {
		Boolean ats = null;
		if (array1.length == array2.length) {
			for (int i = 0; i < array1.length; i++) {
				if (array1[i] != array2[i]) {
					ats = false;
				} else {
					ats = true;
				}
			}

		} else {
			ats = false;
		}
		return ats;
	}

}
