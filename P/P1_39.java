package Day;

import java.util.Set;
import java.util.TreeSet;

public class P1_39 {
    public static void main(String[] args) {
        int[] nums = {3,3,3,2,2,4};
        int answer = 0;
        Set<Integer> set = new TreeSet<>();
        for(int i =0; i<nums.length; i++){
            set.add(nums[i]);
        }
        int a = nums.length/2;
        if(set.size()<=a) answer = set.size();
        else answer = a;

        System.out.println(answer);
    }
}
