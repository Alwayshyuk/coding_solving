package Day;

public class P1_8 {
    public static void main(String[] args) {
        boolean answer = true;
        int x = 11;
        int a = 0;
        int b = x;
        while(x>0){
            a+=x%10;
            x/=10;
        }
        if(b%a!=0){
            answer = false;
        }
        System.out.println(answer);
    }
}
