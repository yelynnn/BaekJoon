package 조건문;

import java.util.Scanner;

public class B2525 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();

        int h=c/60;
        int m=c%60;

        if(b+m<60){
            if(a+h<24){
                System.out.println(a+h);
                System.out.println(b+m);
            }else {
                System.out.println(a+h-24);
                System.out.println(b+m);
            }
        }else{
            if(a+h+1<24){
                System.out.println(a+h+1);
                System.out.println(b+m-60);
            }else {
                System.out.println(a+h-23);
                System.out.println(b+m-60);
            }
        }
    }
}
