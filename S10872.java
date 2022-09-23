import java.util.Scanner;

public class S10872 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(factorial(sc.nextInt()));
    }
    static int factorial(int N){
        if(N <= 1) return 1;
        return N * factorial(N-1);
    }
}
