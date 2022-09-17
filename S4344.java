import java.util.Scanner;

public class S4344 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int C = sc.nextInt();

        for(int i=0; i<C; i++){
            int N = sc.nextInt();
            int[] score = new int[N];
            double sum = 0;
            for(int j=0; j<N; j++){
                score[j] = sc.nextInt();
                sum += score[j];
            }
            double count = 0;
            //평균 넘는지 체크?
            for(int k=0; k<N; k++){
                if(score[k] > sum/score.length){
                    count++;
                }
            }
            System.out.println(String.format("%.3f", (count/N)*100)+"%");
        }


    }
}
