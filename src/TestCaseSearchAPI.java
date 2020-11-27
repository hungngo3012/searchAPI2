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

        connection.setRequestMethod("GET");
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
            JSONObject objectJson = new JSONObject(content.toString());
            String id = objectJson.getJSONObject("data").getString("id");
            String image = objectJson.getJSONObject("data").getString("image");
            String video = objectJson.getJSONObject("data").getString("video");
            String like = objectJson.getJSONObject("data").getString("like");
            String comment = objectJson.getJSONObject("data").getString("comment");
            String is_liked = objectJson.getJSONObject("data").getString("is_liked");
            String author = objectJson.getJSONObject("data").getString("author");
            String described = objectJson.getJSONObject("data").getString("describe");
            ResponseSearch t =  g.fromJson(content.toString(), ResponseSearch.class);
            t.data[0] = id;
            t.data[1] = image;
            t.data[2] = video;
            t.data[3] = like;
            t.data[4] = comment;
            t.data[5] = is_liked;
            t.data[6] = author;
            t.data[7] = described;
            return t;
        } finally {
            connection.disconnect();
        }
    }
}