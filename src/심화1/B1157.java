package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        String s=bf.readLine();
        s=s.toUpperCase(); //입력된 문자열을 모두 대문자로 변환
        int[] count=new int[26];

        for(int i=0;i<s.length();i++){
            int a=s.charAt(i); //ASCII 값 저장
            count[a-65]++; //값 65는 A에 해당
        }

        int max=count[0];
        int num=0;
        int idx=0;

        for(int i=1;i<26;i++){
            max=Math.max(max,count[i]);
        }

        for(int i=0;i<26;i++){
            if(max==count[i]){
                num++;
                idx=i;
            }
        }

        if(num>1){
            System.out.println("?");
        }else{
            System.out.println((char)(idx+65));
        }
    }
}
