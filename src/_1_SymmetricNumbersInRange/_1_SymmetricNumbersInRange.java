package _1_SymmetricNumbersInRange;

import java.util.Scanner;

public class _1_SymmetricNumbersInRange {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int firstNum = scan.nextInt();
		int secondNum = scan.nextInt();
		for (int i = 0; i <= secondNum - firstNum; i++) {
			int checks = (int) (Math.log10(firstNum + i) + 1) / 2;
			int symmetricChecks = 0;
			for (int j = 0; j < checks; j++) {
				int leftCheckDigit = (int) ((firstNum + i) / Math.pow(10,
						(int) Math.log10(firstNum + i) - j)) % 10;
				int rightCheckDigit = (int) ((firstNum + i) / Math.pow(10, j)) % 10;
				if (leftCheckDigit == rightCheckDigit) {
					symmetricChecks++;
				}
			}
			if (symmetricChecks == checks) {
				System.out.print((firstNum + i) + " ");
			}
		}
	}
}
