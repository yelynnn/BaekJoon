package 반복문;

import java.io.*;

public class B10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));

        int a,b;

        while(true){
            String[] num=bf.readLine().split(" ");
            a=Integer.parseInt(num[0]);
            b=Integer.parseInt(num[1]);

            if(a==0&&b==0){
                break;
            }else {
                bw.write((a + b) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
