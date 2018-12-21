package edu.ceng;

import java.util.function.Function;

/**
 * Created by Ahmeett on 20.12.2016.
 */
public class FieldSelector implements Function<Article, String> {

   private FIELD field;
    public FieldSelector(FIELD field) {

        this.field=field;
    }





    @Override
    public String apply(Article article) {

        if(field.equals(FIELD.content)){
              return article.content;
        }
        if(field.equals(FIELD.title)){
            return article.title;

        }

        return null;
    }
}
