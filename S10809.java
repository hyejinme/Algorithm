import java.util.Scanner;

//10809번 - 알파벳 찾기
public class S10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        //a-z까지 출력하고
        for(char j='a'; j<='z'; j++){
            //그 사이에 문자열 s와 같은 알파벳이 있다면 인덱스 찾아 출력
            if(s.contains(j+"")){
                System.out.print(s.indexOf(j+""));
                System.out.print(" ");
            }else{
                System.out.print(-1+" ");
            }
        }
    }
}
