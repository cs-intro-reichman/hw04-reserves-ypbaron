import java.sql.Array;
import java.util.ArrayList;

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
		String s = args[0];
		String voweResult = capVowelsLowRest(s);
		System.out.print(voweResult);   
    }

    public static String capVowelsLowRest (String string) {
		String ans = "";
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				ch = (char) (string.charAt(i) - 32); // returns uppers case vowels
				ans+= ch;
			} else {
				if ((ch >= 65) && (ch <= 90)){
					ch = (char)(string.charAt(i) + 32); // returns lower case
					ans += ch;
				} else {
				ans += ch;
				}
			}
		}	
		return ans; // understand why it doesnt bring back spaces
	}


    public static String camelCase (String string) { // figure this code out
        String strcamelCase = args[0];
		String improved = "" + (char)(str.charAt(0) - 32);
		int j = 1;
		for (int i = 0; i < string.length() && string.charAt(i) != ' '; i++){ // indicates first words 
			char chFirstWord = string.strcamelCase(i);
			firstWord = (char)(string.charAt(i) + 32);	// returns all the letters in first word lower case	- check to add print
			firstWord++;			
		}
		while (j >= indexOf(str.charAt(i)) && j < str.length()) { // brings back uppercase letter for first letter without spaces
			char ch = str.charAt(j);
			if (ch == ' '){
				improved = chFirstWord + (char) (str.charAt(j + 1) - 32); 
				j++;
			} else {
				improved++;
			}
		    return firstWord + improved;
		}
	}


    public static int[] allIndexOf (String string, char chr) {
		ArrayList indexes = new ArrayList<>();
		for (int i = 0; i < string.length(); i++) {
			if (chr == string.charAt(i)){
				indexes.add(i);
			}
		}
        return indexes;
    }
}

