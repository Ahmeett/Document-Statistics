package edu.ceng;

import java.util.function.Predicate;

/**
 * Created by Ahmeett on 20.12.2016.
 */
public class TypeFilter implements Predicate<Article> {

    private TYPE type;

    public TypeFilter(TYPE type) {

        this.type = type;

    }


    @Override
    public boolean test(Article article) {

        if(type.equals(article.type)){
            return true;
        }

        return false;
    }

}
