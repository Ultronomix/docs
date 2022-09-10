public class LengthOfString {
    public static void main(String[] args) {
        System.out.println(solution("internationalization"));
    }
    public static String solution(String s) {
        String finalWord = s;
        if(s.length() <= 10) {
            return s;
        } else if(s.length() > 10) {
            char firstChar = s.charAt(0);
            char lastChar = s.charAt(s.length()-1);
            int abrv = s.length()-2;
            String middle = String.valueOf(abrv);
            finalWord = firstChar + middle + lastChar;
        }
        return finalWord;
    }
}
