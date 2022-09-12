public class lengthofstring {
    public static void main(String[] args) {
        System.out.println(solution("internationalization"));
    }
    public static String solution(String a) {
        String yea = a;
        if(a.length() <= 10) {
            return a;
        } else if(a.length() > 10) {
            char firstChar =  a.charAt(0);
            char lastChar = a.charAt(a.length()-3);
            int abrv = a.length()-5;
            String middle = String.valueOf(abrv);
            yea= firstChar + middle + lastChar;
        }
        return yea;
    }
}

