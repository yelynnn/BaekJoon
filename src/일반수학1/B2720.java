package 일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2720 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        int n=Integer.parseInt(bf.readLine());

        for(int i=0;i<n;i++){
            int c=Integer.parseInt(bf.readLine());

            int quarter=c/25;
            c=c%25;
            int dime=c/10;
            c=c%10;
            int nickel=c/5;
            c=c%5;
            int penny=c;

            System.out.println(quarter+" "+dime+" "+nickel+" "+penny);
        }
    }
}
