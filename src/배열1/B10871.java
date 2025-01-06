package 배열1;

import java.io.*;
import java.util.StringTokenizer;

public class B10871 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st=new StringTokenizer(bf.readLine());
        int n=Integer.parseInt(st.nextToken());
        int x=Integer.parseInt(st.nextToken());

        int[] a=new int[n];
        st=new StringTokenizer(bf.readLine());
        for(int i=0;i<n;i++){
            a[i]=Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<n;i++){
            if(a[i]<x){
                System.out.print(a[i]+" ");
            }
        }
    }
}
