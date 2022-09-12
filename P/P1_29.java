package Day;

import java.util.ArrayList;

public class P1_29 {
    public static void main(String[] args) {
        int n = 125;
        int answer = 0;
        ArrayList<Integer> list = new ArrayList<>();
        while(true){
            list.add(n%3);
            n/=3;
            if(n<3){
                list.add(n%3);
                break;
            }
        }
        System.out.println(list);
        for(int i =0; i<list.size(); i++){
            int a = 1;
            if(i>0){
                for(int j = 0; j<i; j++){
                    a*=3;
                }
            }
            System.out.println(a);
            answer+=(list.get(list.size()-1-i)*(a));
        }
        System.out.println(answer);
    }
}
