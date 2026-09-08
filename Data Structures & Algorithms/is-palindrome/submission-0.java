class Solution {
    public boolean isPalindrome(String s) {
        String reversedString = "";
        String newString = normalizeString(s);
        for(int i = newString.length() - 1; i>=0; i--){
            reversedString += newString.charAt(i);
        }
        if(newString.equals(reversedString)){
            return true;
        }
        return false;
    }
    private String normalizeString(String s){
        String newString = "";
        for(int i=0; i<s.length(); i++){
            if(Character.isLetterOrDigit(s.charAt(i))){
                newString += s.charAt(i);
            }
        }
        return newString.toLowerCase();
    }
}
