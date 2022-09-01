import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B2108 {
    /*
    문제
    수를 처리하는 것은 통계학에서 상당히 중요한 일이다.
    통계학에서 N개의 수를 대표하는 기본 통계값에는 다음과 같은 것들이 있다.
    단, N은 홀수라고 가정하자.

    산술평균 : N개의 수들의 합을 N으로 나눈 값
    중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
    최빈값 : N개의 수들 중 가장 많이 나타나는 값
    범위 : N개의 수들 중 최댓값과 최솟값의 차이
    N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.

    입력
    첫째 줄에 수의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 단, N은 홀수이다.
    그 다음 N개의 줄에는 정수들이 주어진다. 입력되는 정수의 절댓값은 4,000을 넘지 않는다.

    출력
    첫째 줄에는 산술평균 을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다. arithmetic

    둘째 줄에는 중앙값을 출력한다. median

    셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다. mode

    넷째 줄에는 범위를 출력한다. range
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        int[] arr = new int[count];

        int arithmetic = 0;
        //산술평균
        int median = 0;
        //중앙값
        int[] modeArr = new int[8001];
        //최빈값 배열 -4000~4000
        int max = 4000, min = -4000;
        //범위

        for(int i =0; i<count; i++){
            arr[i] = Integer.parseInt(br.readLine());

            arithmetic += arr[i];
            modeArr[arr[i]+4000]++;
            if(count == 1){
                max=0;
                min=0;
            }else{
                if(max>arr[i]) max = arr[i];
                if(min<arr[i]) min = arr[i];
            }
        }
        br.close();
        //중앙값
        Arrays.sort(arr);
        median = arr[count/2];

        //최빈값
        int minCnt = 0;
        int result = 0;
        for(int i =0; i<modeArr.length; i++){
            if(minCnt < modeArr[i]){
                minCnt = modeArr[i];
                result = i-4000;
            }
        }
        int cnt = 0;
        for(int i =0; i<modeArr.length;i++){
            if(minCnt == modeArr[i]){
                result = i-4000;
                if(cnt == 1){
                    break;
                }
                cnt++;
            }
        }
        System.out.println((int)Math.round((double)arithmetic/count));
        System.out.println(median);
        System.out.println(result);
        System.out.println(min-max);
    }
}
