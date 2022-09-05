package Day;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class B11650 {
    /*
    문제
    2차원 평면 위의 점 N개가 주어진다.
    좌표를 x좌표가 증가하는 순으로, x좌표가 같으면 y좌표가 증가하는 순서로 정렬한 다음 출력하는 프로그램을 작성하시오.

    입력
    첫째 줄에 점의 개수 N (1 ≤ N ≤ 100,000)이 주어진다.
    둘째 줄부터 N개의 줄에는 i번점의 위치 xi와 yi가 주어진다. (-100,000 ≤ xi, yi ≤ 100,000)
    좌표는 항상 정수이고, 위치가 같은 두 점은 없다.

    출력
    첫째 줄부터 N개의 줄에 점을 정렬한 결과를 출력한다.
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(br.readLine());

        int[][] square = new int[count][2];

        StringTokenizer st;

        for(int i =0; i<count; i++){
            st = new StringTokenizer(br.readLine()," ");
            square[i][0] = Integer.parseInt(st.nextToken());
            square[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(square, (x,y)->{
            if(x[0] == y[0]) return x[1]-y[1];
            else return x[0]-y[0];
        });

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for(int i=0; i<count; i++){
            bw.write(square[i][0]+" "+square[i][1]+"\n");
        }
        br.close();
        bw.close();
    }
}
