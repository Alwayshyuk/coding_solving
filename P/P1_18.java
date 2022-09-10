package Day;

public class P1_18 {
    public static void main(String[] args) {
        int[] numbers = {5,8,4,0,6,7,9};
        int answer = 0;
        int[] a = new int[10];
        for(int i =0; i<numbers.length; i++){
            a[numbers[i]]++;
        }
        for(int i =0; i<a.length; i++){
            if(a[i]==0) answer+=i;
        }
        System.out.println(answer);

    }
}
