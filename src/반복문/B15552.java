package 반복문;

import java.io.*;
import java.util.StringTokenizer;

public class B15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int t=Integer.parseInt(bf.readLine());

        for(int i=0;i<t;i++){
            //StringTokenizer는 입력받은 문자열을 공백을 기준으로 나누어 토큰으로 만들어준다.
            st=new StringTokenizer(bf.readLine());
           bw.write((Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()))+"\n");
        }
        bw.flush();
        bw.close();
    }
}
