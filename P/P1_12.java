package Day;

public class P1_12 {
    public static void main(String[] args) {
        int a = 3, b=5;
        long answer = 0;
        if(a==b) answer = b;
        if(a>b){
            int c = a;
            a=b;
            b=c;
        }
        for(int i = a; i<=b; i++){
            answer+=i;
        }
        System.out.println(answer);
    }
}
