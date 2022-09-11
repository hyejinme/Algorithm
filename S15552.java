import java.io.*;
import java.util.StringTokenizer;

public class S15552 {
    public static void main(String[] args) throws IOException {
        //BufferedReader는 Scanner에 비해 빠름
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        StringTokenizer st;

        for(int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            bw.write(A+B +"\n");
        }
        bw.flush();
        br.close();
        bw.close();

    }
}
