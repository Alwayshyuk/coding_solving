package Day;

public class P1_3 {
    public static void main(String[] args) {
        long n = 121;
        long answer = 0;
        if(n==1) answer = 4;
        for(long i = 2; i<n/2+1; i++){
            if(n/i==i&&n%i==0) {
                answer = (i+1)*(i+1);
                break;
            }
        }
        System.out.println(answer);

    }
}
