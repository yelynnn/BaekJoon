package 반복문;

import java.io.*;
import java.util.Scanner;

public class B2439 {
    public static void main(String[] args) throws IOException {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=n-i;j>0;j--){
                System.out.print(" ");
                }
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
