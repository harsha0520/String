package manipulations;
import java.util.*;

public class ToCheckPalindrome{

	public static String getPalindromeIfPresent(String s) {

		
		if (s == null || s.length() < 2 || s.equals("") ) {
		    return null;
		}
		Map<Character, Integer> mapChars = new HashMap<Character, Integer>();

		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
		    if (mapChars.containsKey(chars[i])) {
		        Integer val = mapChars.get(chars[i]);
		        mapChars.put(chars[i], val+1);
		    } else {        
		        mapChars.put(chars[i], 1);    
		    }
		}

		
		int oneCharCount = 0;
		for (Map.Entry<Character, Integer> entry : mapChars.entrySet()) {
		    if (entry.getValue() % 2 != 0) {
		        oneCharCount++;
		        
		        if (oneCharCount > 1) {
		            return null;
		        }
		    }
		}

		int sLen = s.length();
		int middle = sLen/2;   
		Character midChar = null;
		StringBuilder s1 = new StringBuilder();
		for (Map.Entry<Character, Integer> entry : mapChars.entrySet()) {
		    int charCount = entry.getValue();
		    Character c = entry.getKey();
		    
		    if (charCount % 2 != 0) {
		        midChar = c;
		    }
		    
		        int i = charCount / 2;
		        while (i > 0) {
		           s1.append(c);
		           s1.insert(0, c);
		           i--;
		        }                              
		}
		if (midChar != null) 
		{
			s1.insert(middle, midChar);	
		}

		 return s1.toString();
    }
	
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        String test=sc.nextLine();
    	System.out.println(getPalindromeIfPresent(test));

    	
    }
}

	