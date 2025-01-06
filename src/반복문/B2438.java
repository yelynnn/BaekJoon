package 반복문;

import java.io.*;

public class B2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter br=new BufferedWriter(new OutputStreamWriter(System.out));

        int n=Integer.parseInt(bf.readLine());

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                br.write("*");
                }
            br.write("\n");
        }
        br.close();
    }
}
