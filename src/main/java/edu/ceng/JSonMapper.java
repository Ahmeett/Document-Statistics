package edu.ceng;

import com.google.gson.Gson;

/**
 * Created by Kursat on 17.12.2016.
 */
public class JSonMapper implements java.util.function.Function<String, Article> {

   Gson gson = new Gson();

    @Override
    public Article apply(String s) {
        return gson.fromJson(s,Article.class);
    }


}
