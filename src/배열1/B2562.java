package 배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int a=0;
        int[] num=new int[9];
        for(int i=0;i<9;i++){
            num[i]=Integer.parseInt(br.readLine());
        }

        int max=num[0];
        for(int i=0;i<9;i++){
            max=Math.max(max,num[i]);
            if(max==num[i]){
                a=i+1;
            }
        }
        System.out.println(max);
        System.out.println(a);
    }
}
