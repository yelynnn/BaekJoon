package 일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2745 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st=new StringTokenizer(bf.readLine());
        String n=st.nextToken();
        int b=Integer.parseInt(st.nextToken());
        int[] num=new int[n.length()];
        int sum=0;

        for(int i=0;i<n.length();i++){
               if(n.charAt(i)>='A'&&n.charAt(i)<='Z'){
                   num[i]=n.charAt(i)-55;
               }else{
                   num[i]=n.charAt(i)-'0';
               }
        }

        for(int i=0;i<n.length();i++){
            //거듭제곱 연산을 위해 Math.pow() 사용. double을 반환.
            sum+=num[i]*(int)Math.pow(b,n.length()-(i+1));

        }
        System.out.println(sum);
    }
}
