package Day;

public class P1_11 {
    public static void main(String[] args) {
        long num = 626331;
        int answer = 0;
        while(num!=1){
            if(num%2==0){
                num/=2;
                answer++;
            }else{
                num*=3;
                num++;
                answer++;
            }
            if(answer==500){
                answer=-1;
                break;
            }
        }
        System.out.println(answer);
    }
}
