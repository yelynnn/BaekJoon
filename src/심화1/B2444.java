package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(bf.readLine());

        for(int i=0;i<n;i++){
            for(int j=n-i-2;j>=0;j--){
                System.out.print(" ");
            }
            for(int k=0;k<((2*i)+1);k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for(int i=n-1;i>0;i--){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for (int k=((2*(i-1))+1);k>0;k--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
