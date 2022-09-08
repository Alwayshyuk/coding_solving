package Day;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        String s = "KAKAO";
        List<Character> list = new ArrayList<>();
        for(int i =0; i<s.length(); i++){
            list.add(s.charAt(i));
        }
        Map<String, Integer> map = new HashMap<>();
        List<Integer> list2 = new ArrayList();
        for(int i =0; i<list.size(); i++){
            int v = 27;
//            if(i<list.size()-1) {
//                String a = list.get(i) + "" + list.get(i + 1);
//                if (!map.containsKey(a)) {
//                    map.put(a, v);
//                    v++;
//                    char c = list.get(i);
//                    int num = c-'A'+1;
//                    list2.add(num);
//                } else {
//                    list2.add(map.get(a));
//                }
//            }
            if(!map.containsKey(list.get(i)+""+list.get(i+1))){
                char c = list.get(i);
                int num = c-'A'+1;
                list2.add(num);
                if(i<list.size()-1){
                    map.put(list.get(i)+""+list.get(i+1), v);
                    v++;
                }
            }else{
                list2.add(map.get(list.get(i)+""+list.get(i+1)));
                if(i<list.size()-2){
                    map.put(list.get(i)+""+list.get(i+1), v);
                    v++;
                }
            }
        }
        System.out.println(list2);
    }
}
