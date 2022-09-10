package Day;

import java.util.ArrayList;
import java.util.Collections;

public class P1_13 {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1};
        int[] answer = {};
        if(arr.length==1) {
            answer = new int[1];
            answer[0] = -1;
        }else{
            ArrayList<Integer> list = new ArrayList();
            int min = arr[0];
            for(int i =0; i<arr.length; i++){
                list.add(arr[i]);
                if(arr[i]<min) min = arr[i];
            }
            while(list.contains(min)){
                int aa = list.indexOf(min);
                list.remove(aa);
            }
            answer = new int[list.size()];
            for(int i =0; i<list.size(); i++){
                answer[i] = list.get(i);
            }
        }
        for(int i =0; i<answer.length; i++){
            System.out.println(answer[i]);
        }
    }
}
