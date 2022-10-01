import java.util.Scanner;

public class S2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        String result1 = "";
        String result2 = "";
        for(int i=A.length()-1; i>=0; i--){
            result1 += A.charAt(i);
        }

        for(int i=B.length()-1; i>=0; i--){
            result2 += B.charAt(i);
        }

        if(Integer.valueOf(result1)>Integer.valueOf(result2)){
            System.out.println(result1);
        }else if(Integer.valueOf(result1)<Integer.valueOf(result2)){
            System.out.println(result2);
        }

    }
}
