package 문자열;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        String s=bf.readLine();
        int i=Integer.parseInt(bf.readLine());

        //charAt()를 사용하여 문자열에서 특정 위치의 문자를 가져올 수 있음
        System.out.println(s.charAt(i-1));
    }
}
