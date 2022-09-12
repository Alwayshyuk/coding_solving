package Day;

public class P1_31 {
    public static void main(String[] args) {
        String s = "abcdefghijklmnopqrstuvwxyz";
        int n = 1;
        String answer = "";
        char[] a = s.toCharArray();
        for(int i = 0; i<a.length; i++){
            if(a[i]>=65&&a[i]<=90){
                if(a[i]+n >90){
                    a[i]= (char)((int)a[i]+n-26);
                }else{
                    a[i] = (char)((int)a[i]+n);
                }
            }else if(a[i]>=97&&a[i]<=122){
                if(a[i]+n >122){
                    a[i]= (char)((int)a[i]+n-26);
                }else{
                    a[i] = (char)((int)a[i]+n);
                }
            }
        }
        answer = String.valueOf(a);
        System.out.println(answer);
    }
}
