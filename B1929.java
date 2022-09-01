import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1929 {
    /*
    문제
    M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다.
    (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.

    출력
    한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        br.close();

        int min = 0;
        int max = 0;
        while(st.hasMoreTokens()){
            min = Integer.parseInt(st.nextToken());
            max = Integer.parseInt(st.nextToken());
        }

        for(int i = min; i<=max; i++){
            if(isRight(i))
                System.out.println(i);
        }
    }
    static boolean isRight(int n){
        if(n<=1) return false;
        if(n<=3) return true;
        for(int i = 2; i*i<=n; i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
