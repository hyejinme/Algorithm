import java.util.Scanner;

public class S5622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int result = 0;
        String[] wordC = new String[word.length()];
        for(int i=0; i<wordC.length; i++){
            wordC[i]  = String.valueOf(word.charAt(i));
        }

        for(int i=0; i<wordC.length; i++){
            int second = 2;
            if(wordC[i].equals("A") || wordC[i].equals("B") || wordC[i].equals("C")){
                result += second + 1;
            }
            if(wordC[i].equals("D") || wordC[i].equals("E") || wordC[i].equals("F")) {
                result += second +  2;
            }
            if(wordC[i].equals("G") || wordC[i].equals("H") || wordC[i].equals("I")) {
                result += second + 3;
            }
            if(wordC[i].equals("J") || wordC[i].equals("K") || wordC[i].equals("L")){
                result += second + 4;
            }
            if(wordC[i].equals("M") || wordC[i].equals("N") || wordC[i].equals("O")){
                result += second + 5;
            }
            if(wordC[i].equals("P") || wordC[i].equals("Q") || wordC[i].equals("R") || wordC[i].equals("S")){
                result += second + 6;
            }
            if(wordC[i].equals("T") || wordC[i].equals("U") || wordC[i].equals("V")){
                result += second + 7;
            }
            if(wordC[i].equals("W") || wordC[i].equals("X") || wordC[i].equals("Y") || wordC[i].equals("Z")) {
                result += second + 8;
            }
        }
        System.out.println(result);
    }
    }

