package 약수배수소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B5086 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true){
            st=new StringTokenizer(bf.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());

            if(a==0&&b==0){
                break;
            }else{
                if(b%a==0){
                    System.out.println("factor");
                } else if (a%b==0) {
                    System.out.println("multiple");
                }else {
                    System.out.println("neither");
                }
            }
        }
    }
}
