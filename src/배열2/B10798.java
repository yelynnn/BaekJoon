package 배열2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class B10798 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        char[][] matrix=new char[5][15];

        for(int i=0;i<5;i++){
            String s=bf.readLine();
            for(int j=0;j<s.length();j++){
                matrix[i][j]=s.charAt(j);
            }
        }

        for(int j=0;j<15;j++){
            for(int i=0;i<5;i++){
                //공백 문자가 아닌 경우에만 출력
               if(matrix[i][j]!='\0'){
                    System.out.print(matrix[i][j]);
                }
            }
        }
    }
}
