package 조건문;

import java.util.Scanner;

public class B2884 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int h= scanner.nextInt();
        int m= scanner.nextInt();

        if(m>=45){
            System.out.println(h);
            System.out.println(m-45);
        }else {
           if(h>0){
                System.out.println(h-1);
            }else {
               System.out.println("23");
           }
            System.out.println(60-(45-m));
        }
    }
}
