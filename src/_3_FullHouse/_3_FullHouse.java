package _3_FullHouse;

import java.util.ArrayList;

public class _3_FullHouse {

	public static void main(String[] args) {
		String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };
		char[] suits = { '\u2660', '\u2665', '\u2666', '\u2663' };
		int ctr = 0;
		
		for (int face1 = 0; face1 < faces.length; face1++) {
			for (int suit1 = 0; suit1 < suits.length; suit1++) {
				for (int suit2 = suit1 + 1; suit2 < suits.length; suit2++) {
					for (int suit3 = suit2 + 1; suit3 < suits.length; suit3++) {
						for (int face2 = 0; face2 < faces.length; face2++) {
							if (face2 != face1) {
								for (int suit4 = 0; suit4 < suits.length; suit4++) {
									for (int suit5 = suit4 + 1; suit5 < suits.length; suit5++) {
										System.out.printf(
												"(%s%c %s%c %s%c %s%c %s%c)%n",
												faces[face1], suits[suit1],
												faces[face1], suits[suit2],
												faces[face1], suits[suit3],
												faces[face2], suits[suit4],
												faces[face2], suits[suit5]);
										ctr++;
									}
								}
							}

						}
					}
				}
			}
		}
		System.out.println(ctr + " full houses");
	}

}
