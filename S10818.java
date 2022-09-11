import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class S10818 {
    public static void main(String[] args) throws IOException {
        /*------------1번 풀이----------*/
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] result = new int[N];

        //비교를 위해 문제에 제시된 조건대로 값 설정
        int max = -1000000;
        int min = 1000000;

        //N개 입력 받기
        for(int i=0; i<N; i++) {
            result[i] = sc.nextInt();
        }

        //최대값 찾기
        for(int i=0; i<N; i++) {
            if(result[i]>max){
                max = result[i];
            }
        }

        //최소값 찾기
        for(int i=0; i<N; i++) {
            if(result[i]<min){
                min = result[i];
            }
        }

        System.out.println(min+" "+max);

        /*
         ------------2번 풀이----------
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        //비교를 위해 문제에 제시된 조건대로 값 설정
        int max = -1000001;
        int min = 1000001;

        while (st.hasMoreTokens()) {
            int result = Integer.parseInt(st.nextToken()); // N개 받은 만큼 입력
            if(result > max){
                max = result;
            }
            if(result < min){
                min = result;
            }
        }
        bw.write(min + " " + max);
        bw.flush();
        br.close();
        bw.close();*/
    }
}


