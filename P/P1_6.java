package Day;

import java.util.StringTokenizer;

public class P1_6 {
    public static void main(String[] args) {
        boolean answer = true;
        String s = "Pyy";
        int p = 0;
        int y = 0;
        s=s.toLowerCase();
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)=='p') p++;
            else if(s.charAt(i)=='y') y++;
        }
        if(y==p) System.out.println("true");
        else System.out.println("false");
    }
}
