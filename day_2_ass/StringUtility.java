package wipro;
public class StringUtility {
			

	    public int countVowels(String str){
	        int count = 0;
	        String lowerStr = str.toLowerCase();
	        for (char ch : lowerStr.toCharArray()) {
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                count++;
	            }
	        }
	        return count;
	    }


	    public int countConsonants(String str){
	        int count = 0;
	        String lowerStr = str.toLowerCase();
	        for (char ch : lowerStr.toCharArray()) {
	            if (ch >= 'a' && ch <= 'z' && !(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')) {
	                count++;
	            }
	        }return count;
	        
	    }


	    public boolean isPalindrome(String str){
	        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
	        int left = 0;
	        int right = cleanedStr.length() - 1;
	        while (left < right) {
	            if (cleanedStr.charAt(left) != cleanedStr.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }return true;
	        
	    }

	    public String reverseString(String str) {
	        return new StringBuilder(str).reverse().toString();
	    }

	    public String toUpperCase(String str) {
	        return str.toUpperCase();
	    }


	    public String toLowerCase(String str) {
	        return str.toLowerCase();
	    }


	    public String replaceWord(String str, String oldWord, String newWord) {
	        return str.replace(oldWord, newWord);
	    }
	}

