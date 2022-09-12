package Day;

public class P1_32 {
    public static void main(String[] args) {
        int n = 5;
        int[] arr1={9,20,28,18,11};
        int[] arr2={30,1,21,17,28};
        String[] answer = new String[n];
        for(int i = 0; i<n; i++){
            String a = Integer.toBinaryString(arr1[i]);
            String b = Integer.toBinaryString(arr2[i]);
            String c = "";
            while(true){
                if(a.length()==n&&b.length()==n){
                    break;
                } else if(a.length()<n){
                    a = "0"+a;
                }else{
                    b = "0"+b;
                }
            }
            for(int j =0; j<n; j++){
                if(a.charAt(j)=='1'||b.charAt(j)=='1'){
                    c+="#";
                }else{
                    c+=" ";
                }
            }
            answer[i] = c;
        }
    }
}
