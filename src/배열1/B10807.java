package 배열1;

import java.io.*;
import java.util.StringTokenizer;

public class B10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int count=0;

        int n=Integer.parseInt(br.readLine());
        int[] num= new int[n];

        st=new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){

            num[i]=Integer.parseInt(st.nextToken());
        }
        int v=Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++){
            if(num[i]==v){
                count++;
            }
        }
        bw.write(String.valueOf(count));
        bw.flush();
        bw.close();
    }
}
