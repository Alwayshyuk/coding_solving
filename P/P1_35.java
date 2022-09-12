package Day;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class P1_35 {
    public static void main(String[] args) {
        int[] array = {1,5,2,6,3,7,4};
        int[][] commands = {{2,5,3},{4,4,1},{1,7,3}};
        int[] answer = new int[commands.length];
        List<Integer> list2 = new ArrayList<>();
        for(int i =0; i<commands.length; i++){
            List<Integer> list = new ArrayList<>();
            for(int j =commands[i][0]-1; j<commands[i][1]; j++){
                list.add(array[j]);
            }
            Collections.sort(list);
            list2.add(list.get(commands[i][2]-1));
        }
        for(int i =0; i<list2.size(); i++){
            answer[i] = list2.get(i);
        }
        System.out.println(list2);
    }
}
