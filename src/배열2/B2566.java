package 배열2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2566 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int[][] matrix=new int[9][9];
        for(int i=0;i<9;i++){
            st=new StringTokenizer(bf.readLine());
            for(int j=0;j<9;j++){
                matrix[i][j]=Integer.parseInt(st.nextToken());
            }
        }

        int max=matrix[0][0];
        int a=0;
        int b=0;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++) {
                max = Math.max(max, matrix[i][j]);
                if(max==matrix[i][j]){
                    a=i+1;
                    b=j+1;
                }
            }
        }

        System.out.println(max);
        System.out.println(a+" "+b);
    }
}
