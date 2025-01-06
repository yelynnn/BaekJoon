package 약수배수소수;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B9506 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int n=Integer.parseInt(bf.readLine());
            int sum=0;
            int num=0;
            int count=0;

            if(n==-1){
                break;
            }

            for(int i=1;i<n;i++){
                if(n%i==0){
                    sum+=i;
                    count++;
                }
            }
            if(sum!=n){
                System.out.print(n+" is NOT perfect.");
            }else {
                System.out.print(n+" = ");
                for(int i=1;i<n;i++){
                    if(n%i==0){
                        num++;
                        System.out.print(i);
                        if(num<count){
                            System.out.print(" + ");
                        }
                    }
                }
            }
            System.out.println();
        }
    }
}
