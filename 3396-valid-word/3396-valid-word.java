class Solution {
    public boolean isValid(String word) {
        int n=word.length();
        boolean vowel=false;
        boolean consonant=false;
        boolean digit=false;
        if(n<3) return false;
        for(int i=0;i<n;i++)
        {
            char ch=word.charAt(i);
            switch(ch){
         case 'a', 'e', 'i', 'o', 'u','A', 'E', 'I', 'O', 'U' -> vowel = true;
         case '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' -> digit = true;
         case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 
         'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z',
         'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 
         'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z' -> consonant = true;
         default -> { return false; }
            }
           
        } 
        return vowel&&consonant;
    }
}