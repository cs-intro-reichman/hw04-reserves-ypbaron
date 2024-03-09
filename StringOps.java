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
	    System.out.print(allIndexOf("Hello world",'l'));
		//System.out.print(voweResult);   
    }

    public static String capVowelsLowRest (String string) {
		String ans = "";
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
				if (ch >= 'A' && ch <= 'Z') { // if uppercase
					ans += ch;
				} else { // if lowercase
					ch = (char) (ch - 32); // returns uppers case vow	els
					ans += ch;
				}
			} else {
				if ((ch >= 'A') && (ch <= 'Z')){
					ch = (char) (ch + 32); // returns lower case
					ans += ch;
				} else {
					ans += ch;
				}
			}
		}	
		return ans;
	}


    public static String camelCase (String string) {
		boolean uppercaseTrigger = false;
		String newCamelString = "";

		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);

			if (ch == ' ') {
				if (newCamelString.length() > 0) { // if new word started
					uppercaseTrigger = true;
				}
			} else {
				if (uppercaseTrigger == true) {
					uppercaseTrigger = false;
					
					if (ch >= 'a' && ch <= 'z') { // if lowercase
						newCamelString += (char) (ch - 32); // convert to uppercase
					} else {
						newCamelString += ch;
					}
				} else {
					if (ch >= 'A' && ch <= 'Z') { // if uppercase
						newCamelString += (char) (ch + 32); // convert to lowercase
					} else {
						newCamelString += ch;
					}
				}
			}
		}
		return newCamelString;
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
