package Day;

public class P1_9 {
    public static void main(String[] args) {
        String s = "1234";
        int answer = 0;
        if (s.charAt(0) == '-') {
            for (int i = 1; i < s.length(); i++) {
                answer += s.charAt(i) - '0';
                if(i<s.length()-1) answer *= 10;
            }
            System.out.println(answer * -1);
        } else if (s.charAt(0) == '+') {
            for (int i = 1; i < s.length(); i++) {
                answer += s.charAt(i) - '0';
                if(i<s.length()-1) answer *= 10;
            }
            System.out.println(answer);
        } else{
            for (int i = 0; i < s.length(); i++) {
                answer += s.charAt(i) - '0';
                if(i<s.length()-1) answer *= 10;
            }
            System.out.println(answer);
        }
    }
}
