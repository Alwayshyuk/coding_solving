package Day;

public class P1_21 {
    public static void main(String[] args) {
        String s = "a1234";
        boolean answer = true;
        if(s.length()!=4&&s.length()!=6) answer = false;
        for(int i=0; i<s.length(); i++){
            char a = s.charAt(i);
            if(!(a>='0'&&a<='9')){
                answer = false;
            }
        }
        System.out.println(answer);
    }
}
