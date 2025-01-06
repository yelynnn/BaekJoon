package 일반수학1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class B11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st=new StringTokenizer(bf.readLine());
        int n=Integer.parseInt(st.nextToken());
        int b=Integer.parseInt(st.nextToken());
        
        //StringBuilder를 통해 불변하는 객체인 String을 변경할 수 있는 객체로 만들어 줌 
        StringBuilder sb=new StringBuilder();
        while(n!=0){
            //append는 StringBuilder 객체에 문자열을 추가하는 기능
            if(n%b>=10){
                sb.append((char)((n%b)+55));
            }else {
                sb.append(n%b);
            }
            n=n/b;
        }

        //reverse 메소드를 이용해서 sb 역으로 출력
        System.out.println(sb.reverse());
    }
}
