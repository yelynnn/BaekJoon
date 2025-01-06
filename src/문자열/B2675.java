package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int t=Integer.parseInt(bf.readLine());

        for(int i=0;i<t;i++){
            st=new StringTokenizer(bf.readLine());
            int r=Integer.parseInt(st.nextToken());
            String s= st.nextToken();

            char[] sentence=new char[s.length()];

            for(int a=0;a<s.length();a++){
                sentence[a]=s.charAt(a);
                for(int c=0;c<r;c++){
                    System.out.print(sentence[a]);
                }
            }
            System.out.println();
        }
    }
}
