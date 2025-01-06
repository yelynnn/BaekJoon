package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        String s=bf.readLine();
        int time=0;
        char[] c=new char[s.length()];

        String[] alpha=new String[8];
        alpha[0]="ABC";
        alpha[1]="DEF";
        alpha[2]="GHI";
        alpha[3]="JKL";
        alpha[4]="MNO";
        alpha[5]="PQRS";
        alpha[6]="TUV";
        alpha[7]="WXYZ";

        for(int i=0;i<s.length();i++){
            c[i]=s.charAt(i);
        }

        //indexof는 특정 문자가 문자열에 포함되어 있는지 확인
        for(int i=0;i<s.length();i++){
            for(int j=0;j<8;j++){
                if(alpha[j].indexOf(c[i])!=-1){
                    time+=j+3;
                }
            }
        }
        System.out.println(time);
    }
}
