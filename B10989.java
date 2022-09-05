package Day;

import java.io.*;

public class B10989 {
    /*
    문제
    N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

    입력
    첫째 줄에 수의 개수 N(1 ≤ N ≤ 10,000,000)이 주어진다.
    둘째 줄부터 N개의 줄에는 수가 주어진다.
    이 수는 10,000보다 작거나 같은 자연수이다.

    출력
    첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //시간 제한과 메모리 제한으로  BufferedWriter를 사용한다.

        int count = Integer.parseInt(br.readLine());
        int[] nums = new int[count];

        for(int i =0; i<count; i++){
            nums[Integer.parseInt(br.readLine())] += 1;
        }
        for(int j = 0; j<count; j++){
            while(nums[j] != 0){
                bw.write(j+"\n");
                nums[j]--;
            }
        }
        br.close();
        bw.close();
    }
}
