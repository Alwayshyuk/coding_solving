package Day;

import java.util.ArrayList;
import java.util.Collections;

public class P1_34 {
    public static void main(String[] args) {
        String[] strings = {"ab", "ac","ad","cef","af","fea"};
        int n =1;
        String[] answer = new String[strings.length];
        ArrayList<String> list = new ArrayList<>();
        for(int i =0; i< strings.length; i++){
            list.add(strings[i]);
        }
        Collections.sort(list);
        System.out.println(list);
        for(int i =0; i< strings.length-1; i++){
            for(int j =i; j< strings.length; j++){
                    if(list.get(i).charAt(n)>list.get(j).charAt(n)){
                        String a = list.get(j);
                        list.remove(j);
                        list.add(i,a);
                    }
            }
        }
        for(int i =0; i<list.size(); i++){
            answer[i] = list.get(i);
        }
        System.out.println(list);
    }
}
