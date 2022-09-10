package Day;

public class P1_10 {
    public static void main(String[] args) {
        int x = 2, n=5;
        long[] answer = new long[n];
        for(int i =0; i<5; i++){
            answer[i] = x;
            x=x+x;
        }
        System.out.println(answer);
    }
}
