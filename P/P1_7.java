package Day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P1_7 {
    public static void main(String[] args) {
        long n = 118372;
        long answer = 0;
        List<Long> list = new ArrayList<>();
        while(n!=0){
            list.add(n%10);
            n/=10;
        }
//        for(int i =0; i<list.size()-1; i++){
//            for(int j = i; j<list.size(); j++){
//                if(list.get(i)<list.get(j)){
//                    long a = list.get(i);
//                    long b = list.get(j);
//                    list.set(i,b);
//                    list.set(j,a);
//                }
//            }
//        }
        Collections.sort(list);
        for(int i =list.size()-1; i>=0; i--){
            answer +=list.get(i);
            if(i!=0)
            answer*=10;
        }
        System.out.println(answer);
    }
}
