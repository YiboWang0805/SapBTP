package com.sapTest.boot.util;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

@Slf4j
@Component
public class RestUtil {

    //get
    public static String getMethod(String url, String APIkey) throws IOException {
        URL restURL = new URL(url);
        StringBuffer response = new StringBuffer();

        HttpURLConnection conn = (HttpURLConnection) restURL.openConnection();

        conn.setRequestProperty("APIKey",APIkey);
        conn.setRequestMethod("GET"); // POST GET PUT DELETE
        conn.setRequestProperty("Accept", "application/json");

        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));

        String inputLine;
        while ((inputLine = br.readLine()) != null) {
            response.append(inputLine);
        }
        log.info(String.valueOf(response));

        br.close();

        return response.toString();
    }
}
