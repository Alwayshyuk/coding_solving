package Day;


public class P1_36 {
    public static void main(String[] args) {
        String s = "one4seveneight";
        int answer = 0;
        String[] a = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        int[] b = {0,1,2,3,4,5,6,7,8,9};
        for(int i =0; i<a.length; i++){
            s=s.replaceAll(a[i], ""+b[i]);
        }
        answer = Integer.parseInt(s);
        System.out.println(answer);
    }
}
