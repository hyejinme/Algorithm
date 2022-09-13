import java.util.*;

public class S3052 {
    public static void main(String[] args) {
        //자연수 10개 입력 받기
        Scanner sc = new Scanner(System.in);
        int[] num = new int[10];
        for(int i=0; i < num.length; i++) {
            num[i] = sc.nextInt();
        }
        int[] result = new int[num.length];
        ArrayList<Integer> list = new ArrayList<>();

        for(int i=0; i < result.length; i++) {
            //42로 나눈 나머지 구하기
            result[i] = num[i] % 42;

            //ArrayList에 넣을 때 이미 리스트에 있는 값이면 add 안함
            if(!list.contains(result[i])){
                list.add(result[i]);
            }
        }

        //리스트 사이즈 출력!
        System.out.println(list.size());

    }
}
