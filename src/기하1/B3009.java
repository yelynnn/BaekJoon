package 기하1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B3009 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st=new StringTokenizer(bf.readLine());
        int x1=Integer.parseInt(st.nextToken());
        int y1=Integer.parseInt(st.nextToken());

        st=new StringTokenizer(bf.readLine());
        int x2=Integer.parseInt(st.nextToken());
        int y2=Integer.parseInt(st.nextToken());

        st=new StringTokenizer(bf.readLine());
        int x3=Integer.parseInt(st.nextToken());
        int y3=Integer.parseInt(st.nextToken());

        int x=compare(x1,x2,x3);
        int y=compare(y1,y2,y3);

        System.out.println(x+" "+y);

    }

    public static int compare(int a,int b, int c) {
        if(a==b){
            return c;
        } else if (a==c) {
            return b;
        }else {
            return a;
        }
    }
}
