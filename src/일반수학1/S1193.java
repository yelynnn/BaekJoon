package 일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        int x=Integer.parseInt(bf.readLine());
        int i=1;
        int count,total,sum=0;
        int num=0;


        while(true){
            sum+=i;

            if(x<=sum){
                num=i;
                total=sum-i;
                count=x-total;
                break;
            }
            i++;
        }

        if(num%2==0){
            int under=(num+1)-count;
            System.out.println(count+"/"+under);
        }else{
            int up=(num+1)-count;
            System.out.println(up+"/"+count);
        }
    }
}
