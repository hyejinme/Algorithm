import java.util.Scanner;

//11720번 - 숫자의 합
public class S11720 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        String s = sc.next();
        char[] c = new char[s.length()];
        int result = 0;
        for(int i=0; i<c.length; i++){
            c[i] = s.charAt(i);
            result += Integer.parseInt(String.valueOf(c[i]));
        }

        System.out.println(result);

    }

}
