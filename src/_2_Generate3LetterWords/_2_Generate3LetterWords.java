package _2_Generate3LetterWords;

import java.time.LocalTime;
import java.util.Scanner;

public class _2_Generate3LetterWords {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();
		char[] chars = input.toCharArray();
		for (int i1 = 0; i1 < chars.length; i1++) {
			for (int i2 = 0; i2 < chars.length; i2++) {
				for (int i3 = 0; i3 < chars.length; i3++) {
					System.out.println(Character.toString(chars[i1])
							+ Character.toString(chars[i2])
							+ Character.toString(chars[i3]));
				}
			}
		}
	}

}
