import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class S10828 {
    public static void main(String[] args) throws IOException {
        //Scanner로 푸니까 시간 초과가 떠서 버퍼로 써서 해결
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> list = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String[] m = br.readLine().split(" ");
            if(m[0].equals("push")){
                list.add(Integer.valueOf(m[1]));
            }else if(m[0].equals("pop")){
                if(list.isEmpty()) bw.write(-1+"\n");
                else bw.write(list.remove(list.size()-1)+"\n");
            }else if(m[0].equals("size")){
               bw.write(list.size()+"\n");
            }else if(m[0].equals("empty")){
                if(list.isEmpty()) bw.write(1+"\n");
                else bw.write(0+"\n");
            }else if(m[0].equals("top")){
                if(list.isEmpty()) bw.write(-1+"\n");
                else bw.write(list.get(list.size()-1)+"\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
