import java.io.*;
import java.util.*;

public class S18258 {
    public static void main(String[] args) throws IOException {
        //탐색 빠르게 하기 위해 deque 사용
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Deque<Integer> deque = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            String[] m = br.readLine().split(" ");
            if(m[0].equals("push")){
                deque.add(Integer.valueOf(m[1]));
            }else if(m[0].equals("pop")){
                if(deque.isEmpty()) bw.write(-1+"\n");
                else bw.write(deque.removeFirst()+"\n");
            }else if(m[0].equals("size")){
                bw.write(deque.size()+"\n");
            }else if(m[0].equals("empty")){
                if(deque.isEmpty()) bw.write(1+"\n");
                else bw.write(0+"\n");
            }else if(m[0].equals("front")){
                if(deque.isEmpty()) bw.write(-1+"\n");
                else bw.write(deque.getFirst()+"\n");
            }else if(m[0].equals("back")){
                if(deque.isEmpty()) bw.write(-1+"\n");
                else bw.write(deque.getLast()+"\n");
            }
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
