package 반복문;

import java.util.Scanner;

public class B8393 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n= scanner.nextInt();
        int sum=0;

        for(int i=1;i<=n;i++){
            sum+=i;
        }

        System.out.println(sum);
    }
}
