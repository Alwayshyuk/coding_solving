package Day;

public class P1_26 {
    public static void main(String[] args) {
        int n = 3, m = 12;
        int[] answer = new int[2];
        for(int i=n*m; i>=n;i--){
            if(i%n==0&&i%m==0){
                answer[1] = i;
            }
        }
        for(int i = 1;i<=n; i++){
            if(n%i==0&&m%i==0) answer[0] = i;
        }
    }
}
