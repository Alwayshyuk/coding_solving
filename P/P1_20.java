package Day;

public class P1_20 {
    public static void main(String[] args) {
        String s = "ZbcdWRWWefag";
        String answer = "";
        char[] a = new char[s.length()];
        for(int i =0; i<s.length(); i++){
            a[i] = s.charAt(i);
        }
        for(int i =0; i<s.length()-1; i++) {
            for (int j = i; j < s.length(); j++) {
                if (a[i] < a[j]) {
                    char b = a[i];
                    a[i] = a[j];
                    a[j] = b;
                }
            }
        }
        for(int i =0; i<a.length; i++){
            answer+=a[i];
        }
        System.out.println(answer);
    }
}
