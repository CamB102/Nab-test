package algorithmday1;

public class SwapAandB {

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

	
	public static int swap(String s){

	    int move=0;

	    char[] chars = s.toCharArray();

	    for(int i=2;i<s.length();i++){
	        if(chars[i] == chars[i-1] && chars[i] == chars[i-2]){
	            move++;
	            i=i+2;
	        }
	    }

	    return move;
	}

}

