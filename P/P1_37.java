package Day;

import java.util.*;

public class P1_37 {
    public static void main(String[] args) {
        int[] numbers = {2,1,3,4,1};
        Set<Integer> set = new TreeSet<>();
        for(int i =0; i<numbers.length-1;i++){
            for(int j =1; j<numbers.length; j++){
                if(i!=j){
                    int a = numbers[i]+numbers[j];
                    set.add(a);
                }
            }
        }

        int[] answer = new int[set.size()];
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()){
            for(int i =0; i<answer.length; i++){
                answer[i] = it.next();
            }
        }
        System.out.println(answer);
    }
}
