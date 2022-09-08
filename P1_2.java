package Day;

import javax.lang.model.type.ArrayType;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class P1_2 {
    public static void main(String[] args) {
        int n = 5;
        int answer = 0;
        for(int i =1; i<=n; i++){
            if(n%i==0) answer+=i;
        }
        System.out.println(answer);
    }
}
