package 심화1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class S1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(bf.readLine());
        int count=0;

        for(int i=0;i<n;i++){
            String s=bf.readLine();
            int[] check=new int[26];
            boolean result=true; //단어마다 초기화
            char c=' ';

            for(int j=0;j<s.length();j++){
                char word=s.charAt(j);

                if(word!=c){
                    if(check[word-'a']==0){
                        check[word-'a']=1;
                        c=word;
                    }else{
                        result=false;
                        break;
                    }
                }
            }
            if(result){
                count++;
            }
        }
        System.out.println(count);
    }
}
