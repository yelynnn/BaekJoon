package 배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n=Integer.parseInt(bf.readLine());

        int[] num=new int[n];

        st=new StringTokenizer(bf.readLine());
        for(int i=0;i<n;i++){
            num[i] = Integer.parseInt(st.nextToken());
        }

        int min=num[0];
        int max=num[0];

        for(int i=0;i<n;i++) {
            min = Math.min(min,num[i]);
            max = Math.max(max,num[i]);
        }
        System.out.print(min+" "+max);
    }
}
