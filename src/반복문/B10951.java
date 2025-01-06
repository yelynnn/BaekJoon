package 반복문;

import java.io.*;
import java.util.StringTokenizer;

public class B10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String s;

        //EOF(End Of File) 처리
        while((s= bf.readLine()) != null){
            st=new StringTokenizer(s);
            int a=Integer.parseInt(st.nextToken());
            int b=Integer.parseInt(st.nextToken());
            System.out.println(a+b);
        }
        bf.close();
    }
}
