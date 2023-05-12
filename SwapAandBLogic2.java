package algorithmday1;

public class SwapAandBLogic2 {

	public static void main(String[] args) {
		String str1 = "baaaaa";
		String str2 = "baaabbaabbba";
		String str3 = "baabab";
		String str4 = "bab";
		String str5 = "aaa";
		String str6 = "bbaaabbaaabbba";

		System.out.println(str4 + ": " + swap(str4));
		System.out.println(str5 + ": " + swap(str5));
		System.out.println(str1 + ": " + swap(str1));
		System.out.println(str2 + ": " + swap(str2));
		System.out.println(str3 + ": " + swap(str3));
		System.out.println(str6 + ": " + swap(str6));

	}

	public static int swap(String s) {
		char[] chars = s.toCharArray();
		int rep = 0;

		if (chars.length < 3) { // less than 3 chars
			return rep;

		} else if (chars.length == 3) { // 3 chars
			if (chars[0] == chars[1]) {
				return rep + 1;
			} else {
				return rep;
			}

		} else { // more than 3 chars
			for (int i = 0; i < chars.length - 3; i++) { // check the 4th char, if not equal, swap value of 2nd char
				if (chars[i] == chars[i + 1] && chars[i] == chars[i + 2] && chars[i + 2] != chars[i + 3]) {
					if (chars[i + 1] == 'a') {
						chars[i + 1] = 'b';
						rep++;
					} else {
						chars[i + 1] = 'a';
						rep++;
					}
				}
				if (i < chars.length - 4 && chars[i] == chars[i + 1] && chars[i] == chars[i + 2]
						&& chars[i + 2] == chars[i + 3]) { // check the 4th char, if equal, swap value of 3rd char
					if (chars[i + 2] == 'a') {
						chars[i + 2] = 'b';
						rep++;
					} else {
						chars[i + 2] = 'a';
						rep++;
					}
				}
			}
			return rep;
		}
	}

}
