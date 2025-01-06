package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B11718 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        for(int i=0;i<100;i++){
            String s=bf.readLine();
            if(s==null||s.equals("")){
                break;
            }
            System.out.println(s);
        }
    }
}
