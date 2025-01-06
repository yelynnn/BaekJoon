package 배열2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2738 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st=new StringTokenizer(bf.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());

        int[][] a=new int[n][m];
        int[][] b=new int[n][m];
        int[][] result=new int[n][m];

        matrix(bf,a,n,m);
        matrix(bf,b,n,m);

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                result[i][j]=a[i][j]+b[i][j];
            }
        }

        printMatrix(result,n,m);

    }

    public static void printMatrix(int[][] result, int n, int m){
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void matrix(BufferedReader bf, int[][] matrixName, int n, int m) throws IOException {
        StringTokenizer st;

        for(int i=0;i<n;i++){
            st=new StringTokenizer(bf.readLine());
            for(int j=0;j<m;j++){
                matrixName[i][j]=Integer.parseInt(st.nextToken());
            }
        }
    }
}
