package Day;

import java.util.ArrayList;
import java.util.Collections;

public class P1_30 {
    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        int budget = 9;
        int answer =0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 0; i<d.length; i++){
            list.add(d[i]);
        }
        Collections.sort(list);
        for(int i =0; i<list.size(); i++){
            budget-=list.get(i);
            if(budget>=0) answer++;
            else break;
        }
        System.out.println(answer);
    }
}
