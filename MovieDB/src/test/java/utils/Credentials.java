package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Credentials {
    private static Credentials credentials;
    private String apiKey;
    private String userName;
    private String password;
    private String[] splitCredentials;

    private void readCredentials() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("credentials.log"));
        String s;
        while ((s=br.readLine())!=null){
            splitCredentials = s.split(" ");
            apiKey=splitCredentials[0];
            userName=splitCredentials[1];
            password=splitCredentials[2];
        }
        br.close();
    }

    public static Credentials getCredentials() throws IOException {
        if(credentials==null){
            credentials = new Credentials();
            credentials.readCredentials();
        }else {
            System.out.println("Error ");
        }
        return credentials;
    }
    public String getApiKey(){return apiKey;}
    public String getUserName(){return userName;}
    public String getPassword(){return password;}

}
