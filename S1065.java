import java.util.Scanner;

public class S1065 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(diff(sc.nextInt()));
    }
    static int diff(int N){
        int count = 0;
        for(int i=1; i<=N; i++){
            //N의 일의 자리
            int num1 = i%10;
            //N의 십의 자리
            int num2 = (i%100)/10;
            //N의 백의 자리
            int num3 = i/100;

            if(i < 100){
                count++;
            }else{
                if(num1-num2 == num2-num3){
                    count++;
                }
            }

        }
        return count;
    }
}
