package com.questsolve.test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

public class PushTestClass{

	public static void main(String[] args) {
		
		
		
        String kakaoRestKey = "KakaoAK 61ac37b7b651475f235157189e22f998";
        
        try {
        
            String apiURL = "https://kapi.kakao.com/v1/push/register";  
            String queryString ="uuid=questsolve@ahanmail.net&device_id=0f365b39-c33d-39be-bdfc-74aaf5534470&push_type=gcm";
            URL url = new URL(apiURL);
            HttpURLConnection con = (HttpURLConnection)url.openConnection();
            con.setRequestMethod("POST");
            con.setRequestProperty("Authorization", kakaoRestKey);
            con.setDoOutput(true);
            OutputStreamWriter osw = new OutputStreamWriter(con.getOutputStream());
            //osw.write(str);
            
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream(),"UTF-8"));
            String value ="";
            while((value= br.readLine() )!= null) {
            	System.out.println(value);
            }
            
	}catch(Exception e) {
		
	}
	}
}
