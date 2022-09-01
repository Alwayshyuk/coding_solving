import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1157 {
        /*
        문제
        알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
        단, 대문자와 소문자를 구분하지 않는다.

        입력
        첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다.
        주어지는 단어의 길이는 1,000,000을 넘지 않는다.

        출력
        첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
        단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
         */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String word = br.readLine().toUpperCase();
        br.close();

        int[] count = new int[26];
        //count를 위한 알파벳 개수만큼 배열 생성

        for(int i =0; i<count.length; i++){
            count[i] = 0;
        }
        //모두 0으로 초기화

        char[] alphabet = word.toCharArray();

        for(int i = 0; i<alphabet.length; i++){
            int seq = alphabet[i]-'A';
            count[seq]++;
        }

        int max = 0;
        int maxi = 0;
        int same = 0;

        for(int i = 0; i<count.length;i++){
            if(count[i]>0){
                if(count[i]>max){
                    max = count[i];
                    maxi = i;
                    if(same>0) same=0;
                }else if(count[i]==max){
                    same++;
                }
            }
        }
        if(same>0){
            System.out.println("?");
        }else{
            char e = (char)('A'+maxi);
            System.out.println(e);
        }

    }
}
