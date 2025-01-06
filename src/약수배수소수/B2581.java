package 약수배수소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class B2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        int m=Integer.parseInt(bf.readLine());
        int n=Integer.parseInt(bf.readLine());
        int sum=0;
        List<Integer> prime=new ArrayList<>();

        for(int i=m;i<=n;i++){
            if(isPrime(i)){
                sum+=i;
                prime.add(i);
                }
        }

        if(sum==0){
            System.out.println("-1");
        }else{
            System.out.println(sum);
            System.out.println(prime.get(0));
        }
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
