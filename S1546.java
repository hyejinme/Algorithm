import java.util.Scanner;

public class S1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] score = new double[N];

        //최대값
        double max = 0;

        //새롭게 성적 계산 한 값
        double[] newScore =  new double[score.length];

        //새로운 점수 합계
        double sum = 0;

        for(int i=0; i<score.length; i++){
            score[i] = sc.nextInt();
            //최대값 구하기
            if(max < score[i]){
                max = score[i];
            }
        }

        for(int i=0; i<newScore.length; i++){
            //새롭게 성적 계산하기
            newScore[i] = score[i] / max * 100;
            //새로운 점수 합계
            sum += newScore[i];
        }

        System.out.println(sum/ newScore.length);

    }
}
