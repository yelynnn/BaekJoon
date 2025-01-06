package 문자열;

import java.io.IOException;
import java.util.Scanner;

public class B11720 {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int sum=0;

        String s=scanner.next();

       for(int i=0;i<n;i++){
           //정수 값으로 변환
           sum+=s.charAt(i)-'0';
       }
        System.out.println(sum);
    }
}
