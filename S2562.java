import java.util.Scanner;


public class S2562 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[9];

        for(int i=0; i<num.length; i++) {
            num[i] = scanner.nextInt();
        }
        int max = 0;
        int count = 0;

        for(int i=0; i<num.length; i++) {
            if(max < num[i]){
                max = num[i];
            }

            if(max == num[i] ){
                count = i;
            }
        }

        System.out.println(max);
        System.out.println(count+1);
    }
}
