import java.util.Scanner;

public class S10870 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(fibonacci(sc.nextInt()));
    }

    static int fibonacci(int N){
        if(N == 0) return 0;
        if(N == 1) return 1;
        return fibonacci(N-1) + fibonacci(N-2);
    }
}
