package 배열2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class S2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int size=0;
        int[][] square=new int[100][100];

        int n=Integer.parseInt(bf.readLine());

        for(int i=0;i<n;i++){
            st=new StringTokenizer(bf.readLine());
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());

            for(int j=0;j<10;j++){
                for(int k=0;k<10;k++){
                    square[a+j][b+k]=1;
                }
            }
        }

        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                if(square[i][j]==1){
                    size++;
                }
            }
        }
        System.out.println(size);
    }
}
