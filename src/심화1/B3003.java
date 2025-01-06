package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3003 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int[] num=new int[6];
        int[] chess={1,1,2,2,2,8};
        int[] result=new int[6];

        st=new StringTokenizer(bf.readLine());
        for(int i=0;i<6;i++){
            num[i]=Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<6;i++){
            result[i]=chess[i]-num[i];
            System.out.print(result[i]+" ");
        }
    }
}
