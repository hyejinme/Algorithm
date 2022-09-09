import java.util.Scanner;

public class S2525 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt(); // 시
        int B = scanner.nextInt(); // 분
        int C = scanner.nextInt(); // 요리하는데 필요한 시간

        if(B + C >= 60){
            if((B + C) / 60 >= 1){
                A += (B + C) / 60;
                B = (B + C) % 60;
            }else {
                A += 1;
                B = (B+C) - 60;
            }
        }else{
            B += C;
        }

        if(A >= 24){
            A %= 24;
        }

        System.out.println(A+" "+B);

    }
}
