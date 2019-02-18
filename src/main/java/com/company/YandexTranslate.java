package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONArray;
import org.json.JSONObject;
import org.omg.CORBA.Object;

public class YandexTranslate {

    private String text;
    private String key = "**";


    YandexTranslate(String text) {
        this.text = text;
    }

    void translate() throws IOException {
        String result = null;
        URL url = new URL("https://translate.yandex.net/api/v1.5/tr.json/" +
                "translate?key=" + key + "&text=" + URLEncoder.encode(text, "UTF-8") + "&lang=ru-en");
        BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
        String response = reader.readLine();
        reader.close();


        JSONObject object = new JSONObject(response);
        JSONArray arr = object.getJSONArray("text");
        for (int i = 0;i < arr.length();i++){
             result = arr.getString(i);
        }

        System.out.println("Перевод");
        System.out.println(result);
    }
}
