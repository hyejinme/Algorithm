import java.util.Scanner;

public class S2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        if(M < 45) {
            H -= 1;
            M = 60 - (45-M);
        }else{
            M -= 45;
        }

        if(H < 0){
            H = 23;
        }
        System.out.println(H+" "+M);
    }
}
