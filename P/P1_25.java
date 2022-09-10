package Day;

public class P1_25 {
    public static void main(String[] args) {
        int price=3, money=20, count=4;
        int p = price;
        long answer = 0;
        long right = 0;
        if(count==0) right= 0;
        for(int i =0; i<count; i++){
            answer+=price;
            price+=p;
        }
        if(answer-money>0){
            right = answer-money;
        }else{
            right= 0;
        }
    }
}
