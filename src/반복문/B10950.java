package 반복문;

import java.util.Scanner;

public class B10950 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int t= scanner.nextInt();

        for(int i=0;i<t;i++){
            int a= scanner.nextInt();
            int b= scanner.nextInt();
            System.out.println(a+b);
        }
    }
}
