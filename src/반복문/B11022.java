package 반복문;

import java.io.*;

public class B11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));


        int t=Integer.parseInt(bf.readLine());

        for(int i=1;i<=t;i++){
            //입력받은 문자열을 공백 기준으로 나눔. 한 줄에 여러개 입력 가능
            String[] input=bf.readLine().split(" ");
            int a=Integer.parseInt(input[0]);
            int b=Integer.parseInt(input[1]);
            bw.write("Case #"+i+": "+a+" + "+b+" = "+(a+b)+"\n");
        }
        bw.flush();
        bw.close();
    }
}
