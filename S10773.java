import java.util.Scanner;
import java.util.Stack;

public class S10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int K = sc.nextInt();

        for(int i=0; i<K; i++){
            int N = sc.nextInt();
            if(N == 0){
                stack.pop();
            }else {
                stack.add(N);
            }
        }
        int result = 0;
        for(int i=0; i<stack.size(); i++){
            result += stack.get(i);
        }

        System.out.println(result);
    }
}
