public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
		// String s = args[0];
		// String s = "vowels are fun";
	    // System.out.print(allIndexOf("Hello world",'l'));
		//System.out.print(voweResult);
		
		System.out.println(camelCase("Hello World"));
    }

    public static String capVowelsLowRest (String string) {
		String newString = "";
		
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);

			// lowerCase everything
			if (ch >= 'A' && ch <= 'Z') {
				ch = (char)(ch + 32);
			}

			// upperCase only vowels
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				ch = (char)(ch - 32);
			}
			newString += ch;
		}
		return newString;
	}


    public static String camelCase (String string) {
		String newString = "";
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);

			// replace all to lowerCase
			if (ch >= 'A' && ch <= 'Z') {
				ch = (char)(ch + 32);
			}

			// replace all first word charcter to upperCase
			if (i > 0 && string.charAt(i - 1) == ' ' && ch != ' ') {
				ch = (char)(ch - 32);
			}
			newString += ch;
		}

		// remove all spaces
		String newString2 = "";
		for (int i = 0; i < newString.length(); i++) {
			char ch = newString.charAt(i);
			
			if (ch != ' ') {
				newString2 += ch;
			}
		}

		if (newString2.charAt(0) >= 'A' && newString2.charAt(0) <= 'Z') {
			// lowerCase first word letter
			char c[] = newString2.toCharArray();
			c[0] += 32;
			return new String(c);
		}
		return newString2;
	}


    public static int[] allIndexOf (String string, char chr) {
		int count = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == chr) {
				count++;
			}
		}
		
		int[] indexes = new int[count];
		int index = 0;
		for (int i = 0; i < string.length(); i++) {
			if (string.charAt(i) == chr) {
				indexes[index++] = i;
			}
		}
		return indexes;
    }
}
