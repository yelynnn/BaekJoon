package 조건문;

import java.util.Scanner;

public class B2480 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();

        if(a==b&&b==c){
            System.out.println(10000+(a*1000));
        }else if(a!=b&&b!=c&&a!=c){
            int max=Math.max(Math.max(a,b),c);
            System.out.println(max*100);
        }else{
            if(a==b){
                System.out.println(1000+(a*100));
            } else if (a==c) {
                System.out.println(1000+(a*100));
            }else{
                System.out.println(1000+(b*100));
            }
        }
    }
}
