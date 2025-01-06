package 입출력과사칙연산;

import java.util.Scanner;

public class B2588 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int a=scanner.nextInt();
        int b=scanner.nextInt();

        int[] num=new int[3];
        num[2]=b/100;  //백의 자리
        num[1]=(b/10)%10;  //십의 자리
        num[0]=b%10;  //일의 자리

        for (int i=0;i<num.length;i++){
            System.out.println(a*num[i]);

        }
        System.out.println(a*b);

    }
}
