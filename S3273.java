import java.io.*;
import java.util.*;

public class S3273 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String a = br.readLine();
        int[] result = Arrays.stream(a.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(result);
        int x = Integer.parseInt(br.readLine());
        //5 12 7 10 9 1 2 3 11

        int p1 = 0;
        int p2 = n-1;
        int count = 0;

        while (p1<p2){
            if(result[p1] + result[p2] == x) {
                count++;
                p1++;
            }else if(result[p1] + result[p2] < x) p1++;
            else p2--;
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
        br.close();

    }
}
