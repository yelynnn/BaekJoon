package 배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5597 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        int[] num=new int[30];

        for(int i=0;i<28;i++){
            int student=Integer.parseInt(bf.readLine());
            num[student-1]=1;
        }

        for(int i=0;i<30;i++){
            if(num[i]!=1){
                System.out.println(i+1);
            }
        }
    }
}
