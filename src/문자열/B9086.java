package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9086 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        int t=Integer.parseInt(bf.readLine());

        for(int i=0;i<t;i++) {
            String s = bf.readLine();
            int a=s.length();
            System.out.println(s.charAt(0)+""+s.charAt(a-1));
        }
    }
}
