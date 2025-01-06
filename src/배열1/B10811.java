package 배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10811 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st=new StringTokenizer(bf.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int[] num=new int[n+1];

        for(int a=1;a<=n;a++){
            num[a]=a;
        }

        for(int a=1;a<=m;a++){
            st=new StringTokenizer(bf.readLine());
            int i=Integer.parseInt(st.nextToken());
            int j=Integer.parseInt(st.nextToken());

            while(i<j) {
                int temp = num[i];
                num[i] = num[j];
                num[j] = temp;
                i++;
                j--;
            }
        }
        for(int a=1;a<=n;a++){
            System.out.print(num[a]+" ");
        }
    }
}
