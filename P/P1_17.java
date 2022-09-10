package Day;

public class P1_17 {
    public static void main(String[] args) {
        String answer ="";
        String s = "qwert";
        if(s.length()%2!=0){
            answer+=s.charAt(s.length()/2);
        }else{
            answer+=s.charAt(s.length()/2-1);
            answer+=s.charAt(s.length()/2);
        }
        System.out.println(answer);
    }
}
