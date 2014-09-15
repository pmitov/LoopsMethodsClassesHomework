package _5_AngleUnitConverter;

import java.util.Scanner;

public class _5_AngleUnitConverter {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String entry = new String();
		double entryNum;
		int n = scan.nextInt();
		scan.nextLine();
		for (int i = 0; i < n; i++) {
			entry = scan.nextLine();
			entryNum = Double.parseDouble(entry.replaceAll(" rad| deg", ""));
			if (entry.contains(" rad")) {
				double convertedDeg = convertToDeg(entryNum);
				System.out.printf("%.6f deg%n", convertedDeg);
			} else {
				double convertedRad = convertToRad(entryNum);
				System.out.printf("%.6f rad%n", convertedRad);
			}
		}
	}

	private static double convertToRad(double entryDeg) {
		double convertedRad = (entryDeg * Math.PI / 180) % Math.PI;
		return convertedRad;
	}

	private static double convertToDeg(double entryRad) {
		double convertedDeg = (entryRad * 180 / Math.PI) % 360;
		return convertedDeg;
	}

}
