package 문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class B10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));

        String s=bf.readLine();
        char[] alphabet=new char[26];
        int[] num=new int[26];

        //a의 아스키 코드 값은 97
        for(int i=0;i<26;i++){
            alphabet[i]=(char)(97+i);
        }

         for(int a=0;a<26;a++){
             for(int i=0;i<s.length();i++){
                 if(s.charAt(i)==alphabet[a]){
                     num[a]=i;
                     break;
                    }else {
                        num[a]=-1;
                    }
                }
        }
            for(int i=0;i<26;i++){
                System.out.print(num[i]+" ");
            }
    }
}
