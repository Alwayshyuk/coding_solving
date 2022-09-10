package Day;

import java.util.*;

public class P1_27 {
    public static void main(String[] args) {
        int[] arr = {1,1,3,3,0,1,1};
        ArrayList<Integer> list = new ArrayList<>();
        int a = arr[0];
        list.add(arr[0]);
        for(int i =1; i<arr.length; i++){
            if(arr[i]!=a){
                list.add(arr[i]);
                a=arr[i];
            }
        }
        int[] answer = new int[list.size()];
        for(int i =0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        System.out.println(list);
    }
}
