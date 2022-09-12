package Day;

public class P1_38 {
    public static void main(String[] args) {
        int a = 5, b=24;
        String answer = "";
        String[] dayName = {"FRI","SAT","SUN","MON","TUE","WED","THU"};
        int month[] = {31,29,31,30,31,30,31,31,30,31,30,31};
        int aa = b-1;
        for(int i =1; i<a; i++){
            aa+=month[i-1];
        }
        System.out.println(dayName[aa%7]);
    }
}
