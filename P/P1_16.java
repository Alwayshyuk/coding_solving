package Day;

public class P1_16 {
    public static void main(String[] args) {
        int n = 3;
        int m = 1;
        String answer = "";
        while(true){
            if(m%2!=0){
                answer+="수";
                m++;
            }else{
                answer+="박";
                m++;
            }
            if(n<m) break;
        }
        System.out.println(answer);
    }
}
