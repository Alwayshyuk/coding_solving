package Day;

import java.util.ArrayList;
import java.util.Collections;

public class P1_14 {
    public static void main(String[] args) {
        int[] arr = {5,9,7,10};
        int divisor = 5;
        int[] answer = {};
        ArrayList<Integer> list = new ArrayList<>();
        for(int i =0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                list.add(arr[i]);
            }
        }
        answer = new int[list.size()];
        if(list.size()>1){
            Collections.sort(list);
        }else{
            answer = new int[]{-1};
        }

        for(int i =0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        System.out.println(list);
    }
}
