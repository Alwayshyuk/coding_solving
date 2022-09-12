package Day;

public class P1_33 {
    public static void main(String[] args) {
        int[][] sizes = {{60,50},{30,70},{60,30},{80,40}};
        int answer = 0;
        for(int i =0; i<sizes.length; i++){
            if(sizes[i][0]>sizes[i][1]){
                int a = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = a;
            }
        }
        int max=0,min=0;
        for(int i =0; i<sizes.length; i++){
            if(max<sizes[i][0]) max=sizes[i][0];
            if(min<sizes[i][1]) min = sizes[i][1];
        }
        System.out.println(max*min);
    }
}
