package 약수배수소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int count=0;

        int n=Integer.parseInt(bf.readLine());
        st=new StringTokenizer(bf.readLine());
        for(int i=0;i<n;i++){
            int a=Integer.parseInt(st.nextToken());

            if(isPrime(a)){
                count++;
            }

        }
        System.out.println(count);
    }

    public static boolean isPrime(int a){
        if(a<=1){
            return false;
        } else if (a==2) {
            return true;
        } else if (a%2==0) {
            return false;
        }else {
            for(int j=3;j<=Math.sqrt(a);j+=2){
                if(a%j==0){
                    return false;
                }
            }
        }
        return true;
    }
}
