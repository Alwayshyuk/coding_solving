package Day;

public class P1_22 {
    public static void main(String[] args) {
        int left = 13, right = 17;
        int answer = 0;
        for(int i = left; i<=right; i++){
            int a = 0;
            for(int j = 1; j<=i; j++){
                if(i%j==0){
                    a++;
                }
            }
            if(a%2==0) answer+=i;
            else answer-=i;
        }
        System.out.println(answer);
    }
}
