package m_I_I_Q;

import java.util.Arrays;
import java.util.List;

import org.apache.commons.lang3.StringUtils;

public class Interview_Questions {

	public static void main(String[] args) {

		String cha = "copper"; // "Give a papa a cup of proper coffee in a coffe
								// cup";
		char target = 'p';
		int count = 0;

// Using for loop

		for (int i = 0; i < cha.length(); i++) {

			if (cha.charAt(i) == target) {
				count++;
			}
		}
		System.out.println(target + " : " + count);

// Using StringUtil from Apache Commons Lang

		String ca = "Abhishek"; // "Give a papa a cup of proper coffee in a coffe cup";
								
		char targ = 'A';

		int coun = StringUtils.countMatches(ca, targ);
		System.out.println(target + " = " + coun);

	}

}
