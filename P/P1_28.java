package Day;


public class P1_28 {
    public static void main(String[] args) {
        String s = "  Abc  abcd  abcde   ";
        String answer = "";
        String a = "";
        for(int i =0; i<s.length(); i++){
            a += s.charAt(i)+"";
            if(s.charAt(i)==' '||i==s.length()-1){
                for(int j = 0; j<a.length(); j++){
                    String c = String.valueOf(a.charAt(j));
                    if(j%2==0||j==0&&!c.equals(" ")){
                        c=c.toUpperCase();
                    }
                    answer +=c;
                }
                a="";
            }
        }
        char[] h = answer.toCharArray();
        int hh=0;
        for(int i =h.length-1; i>=0; i--){
            if(h[i] != ' '){
                hh=i;
                break;
            }
        }
        answer = "";
        for(int i =0; i<=hh; i++){
            answer +=h[i];
        }
        System.out.println(answer);

    }
}
