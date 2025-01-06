package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2908 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st=new StringTokenizer(bf.readLine());
        int a=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());

        int a1=a/100;
        int b1=b/100;
        int a2=(a%100)/10;
        int b2=(b%100)/10;
        int a3=a%10;
        int b3=b%10;

        String result1=String.valueOf(a3)+String.valueOf(a2)+String.valueOf(a1);
        String result2=String.valueOf(b3)+String.valueOf(b2)+String.valueOf(b1);

        int num1=Integer.parseInt(result1);
        int num2=Integer.parseInt(result2);
       int max= Math.max(num1,num2);
        System.out.println(max);
    }
}
