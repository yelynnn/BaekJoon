package 배열1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        int[] num=new int[n+1];


        for(int a=1;a<=m;a++){
            st=new StringTokenizer(br.readLine());
            int i=Integer.parseInt(st.nextToken());
            int j=Integer.parseInt(st.nextToken());
            int k=Integer.parseInt(st.nextToken());

            for(int c=i;c<=j;c++){
                num[c]=k;
            }
        }

        for(int a=1;a<=n;a++) {
            if (num[a] != 0) {
                System.out.print(num[a] + " ");
            }else{
                System.out.print("0 ");
            }
        }
    }
}
