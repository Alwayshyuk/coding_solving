import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2231 {
    /*
    문제
    어떤 자연수 N이 있을 때, 그 자연수 N의 분해합은 N과 N을 이루는 각 자리수의 합을 의미한다.
    어떤 자연수 M의 분해합이 N인 경우, M을 N의 생성자라 한다.
    예를 들어, 245의 분해합은 256(=245+2+4+5)이 된다.
    따라서 245는 256의 생성자가 된다. 물론, 어떤 자연수의 경우에는 생성자가 없을 수도 있다.
    반대로, 생성자가 여러 개인 자연수도 있을 수 있다.

    자연수 N이 주어졌을 때, N의 가장 작은 생성자를 구해내는 프로그램을 작성하시오.

    입력
    첫째 줄에 자연수 N(1 ≤ N ≤ 1,000,000)이 주어진다.

    출력
    첫째 줄에 답을 출력한다. 생성자가 없는 경우에는 0을 출력한다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num = br.readLine();
        br.close();
        int iNum = Integer.parseInt(num);
        int length = num.length();
        int min = iNum-(length*9);

        int result = 0;
        for(int i = min; i<iNum; i++){
            int count = i;
            int sum = 0;
            while(count!=0){
                sum+=count%10;
                count/=10;
            }
            if(sum+i == iNum){
                result = i;
                break;
            }
        }
        System.out.println(result);
    }
}
