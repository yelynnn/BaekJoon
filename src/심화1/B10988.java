package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        String  s= bf.readLine();
        String inverse="";

        for(int i=s.length()-1;i>=0;i--){
            inverse+=s.charAt(i);
        }

        if(s.equals(inverse)){
            System.out.println("1");
        }else{
            System.out.println("0");
        }
    }
}
