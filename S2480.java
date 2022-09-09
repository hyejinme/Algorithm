import java.util.Scanner;

public class S2480 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max;

        if(a==b && a==c){
            //같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금
            System.out.println(10000+(a*1000));
        }else if(a==b){
            //같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금
            System.out.println(1000+(a*100));
        }else if(a==c){
            //같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금
            System.out.println(1000+(a*100));
        }else if(b==c){
            //같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금
            System.out.println(1000+(b*100));
        } else{
            //모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금
            if(a > b && a > c){
                max = a;
            }else if(b > a && b > c){
                max = b;
            }else{
                max = c;
            }
            System.out.println(max * 100);
        }
    }
}
