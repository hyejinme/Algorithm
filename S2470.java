import java.io.*;
import java.util.Arrays;

public class S2470 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int[] arr = Arrays.stream(str.split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);

        int p1 = 0;
        int p2 = N-1;
        int min = Integer.MAX_VALUE;

        int index1 = 0;
        int index2 = 0;

        while (p1<p2){
            if(Math.abs(arr[p1] + arr[p2]) < min){
                min = Math.abs(arr[p1] + arr[p2]);
                index1 = p1;
                index2 = p2;
                if(arr[p1] + arr[p2] == 0) break;
            }

            if(arr[p1] + arr[p2] < 0) p1++;
            else p2--;
        }
        bw.write(arr[index1]+" "+arr[index2]);
        bw.flush();
        bw.close();
        br.close();
    }
}
