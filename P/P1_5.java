package Day;

import java.util.ArrayList;
import java.util.List;

public class P1_5 {
    public static void main(String[] args) {
        long n = 12345;
        String ns = Long.toString(n);
        int[] answer = new int[ns.length()];
        for(int i =0; i<ns.length(); i++){
            int a = (int) (n%10);
            answer[i] = a;
            n/=10;
        }


    }
}
