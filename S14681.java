import java.util.Scanner;

public class S14681 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = scanner.nextInt();
        int y = scanner.nextInt();

        /*if(x > 0 && y > 0) {//제 1사분면 - x 양수 y 양수
            System.out.println(1);
        }else if(x < 0 && y > 0){ //제 2사분면 x 음수 y 양수
            System.out.println(2);
        }else if(x < 0 && y < 0){ //제 3사분면 x 음수 y 음수
            System.out.println(3);
        }else {
            System.out.println(4);
        }*/
        if(x>0){
            if(y>0){
                System.out.println(1);
            }else{
                System.out.println(4);
            }
        }else{
            if(y>0){
                System.out.println(2);
            }else{
                System.out.println(3);
            }
        }
    }
}
