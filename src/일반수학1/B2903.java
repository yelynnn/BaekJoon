package 일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2903 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());

        int dot=0;
        dot=(int)Math.pow(((int)Math.pow(2,n))+1,2);

        System.out.println(dot);
    }
}
