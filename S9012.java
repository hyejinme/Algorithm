import java.util.*;

public class S9012 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            String vps = sc.next();
            String[] vpsC = new String[vps.length()];
            for(int j=0; j<vps.length(); j++){
                vpsC[j]  = String.valueOf(vps.charAt(j));
            }
            for(int j=0; j<vps.length(); j++){
                    if(vpsC[j].equals("(")){
                        stack.push(vpsC[j]);
                    }else {
                        if(stack.isEmpty()){
                            stack.push(vpsC[j]); //밑에서 빈 스택 처리되는 것 방지용!!!!!이중처리
                            break;
                        }else{
                            stack.pop();
                        }
                    }
                }
            if(stack.isEmpty()) System.out.println("YES");
            else  System.out.println("NO");
            stack.clear();
            }
        }
    }

