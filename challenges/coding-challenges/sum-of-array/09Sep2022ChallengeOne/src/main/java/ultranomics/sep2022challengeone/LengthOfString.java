package ultranomics.sep2022challengeone;

public class LengthOfString {
    public static String lengthOfString(String importString){
        
        if(importString.length() <= 10){
            return importString;
        }else{
            char[] charArray = importString.toCharArray();
            
            int length = importString.length();
            
            int shortenLength = length - 2;
            String concat = String.valueOf(shortenLength);
            
            String result = charArray[0] + concat + charArray[length-1];
            return result;
        }
        
        
    }
}
