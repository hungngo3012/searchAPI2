package com.company;

import com.google.gson.Gson;
import org.json.*;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import com.google.gson.Gson;
import com.company.ResponseSearch;


public class TestCaseSearchAPI {
    public static ResponseSearch callAPI(Object token, Object keyword, Object user_id, Object index, Object count) throws Exception {
        URL url = new URL(Contanst.search_API
                + "?token="+ token
                + "&keyword="+ keyword
                + "&user_id="+ user_id
                + "&index="+ index
                + "&count="+ count);
        System.out.println("CALL API: " + url);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        connection.setRequestMethod("POST");
        connection.setDoOutput(true);
        try (DataOutputStream writer = new DataOutputStream(connection.getOutputStream())) {

            StringBuilder content;
            try (BufferedReader in = new BufferedReader(
                    new InputStreamReader(connection.getInputStream()))) {
                String line;
                content = new StringBuilder();
                while ((line = in.readLine()) != null) {
                    content.append(line);
                    content.append(System.lineSeparator());
                }
            }
            Gson g = new Gson();
            System.out.println(content.toString());
            ResponseSearch t =  g.fromJson(content.toString(), ResponseSearch.class);
            return t;
        } finally {
            connection.disconnect();
        }
    }
}