package _4_FullHouseWithJokers;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class _4_FullHouseWithJokers {

	public static void main(String[] args) {
		String[] faces = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
				"Q", "K", "A" };
		char[] suits = { '\u2660', '\u2665', '\u2666', '\u2663' };
		// int ctr = 0;
		String[] specifierTokens = new String[5];
		String specifier = new String();

		// In the example output there are 119808 full houses with jokers.

		// BUT, this number includes duplicate full houses (i.e. (* * * * *))
		// You can check for duplications by copying the output and check it for
		// duplicates in external program (i.e. excel).

		// OR, You could use a Set for gathering just unique full houses.

		// The solution resulting in 119808 is commented - lines 14, 73-78, 92.
		// You should also uncomment the println of the Set to avoid double
		// printing which would make it impossible to check for duplicates.

		Set<String> fullHousesJockers = new LinkedHashSet<String>();

		for (int face1 = 0; face1 < faces.length; face1++) {
			for (int suit1 = 0; suit1 < suits.length; suit1++) {
				for (int suit2 = suit1 + 1; suit2 < suits.length; suit2++) {
					for (int suit3 = suit2 + 1; suit3 < suits.length; suit3++) {
						for (int face2 = 0; face2 < faces.length; face2++) {
							if (face2 != face1) {
								for (int suit4 = 0; suit4 < suits.length; suit4++) {
									for (int suit5 = suit4 + 1; suit5 < suits.length; suit5++) {
										String[] specifierMasks = new String[32];
										for (int i = 0; i < specifierMasks.length; i++) {
											specifierMasks[i] = String
													.format("%5d",
															Integer.parseInt(Integer
																	.toBinaryString(i)));
										}
										for (int j = 0; j < specifierMasks.length; j++) {
											specifier = "(";
											for (int i = 0; i < specifierTokens.length; i++) {
												if (specifierMasks[j].charAt(i) == '1') {
													specifier += "%"
															+ ((int) (i / 3) + 1)
															+ "$s%" + (i + 3)
															+ "$c ";
												} else {
													specifier += "* ";
												}
											}
											specifier = specifier.substring(0,
													specifier.length() - 1)
													+ ")%n";

											fullHousesJockers.add(String
													.format(specifier,
															faces[face1],
															faces[face2],
															suits[suit1],
															suits[suit2],
															suits[suit3],
															suits[suit4],
															suits[suit5]));

											// System.out.printf(specifier,
											// faces[face1], faces[face2],
											// suits[suit1], suits[suit2],
											// suits[suit3], suits[suit4],
											// suits[suit5]);
											// ctr++;
										}
									}
								}
							}
						}
					}
				}
			}
		}

		System.out.println(fullHousesJockers.toString().replaceAll(", ", "")
				.replaceAll("\\[", "").replaceAll("\n\\]", ""));
		System.out.println(fullHousesJockers.size() + " full houses");
		// System.out.println(ctr + " full houses");
	}

}
