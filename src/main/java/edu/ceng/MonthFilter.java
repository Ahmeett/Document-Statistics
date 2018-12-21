package edu.ceng;

import java.time.Month;
import java.util.function.Predicate;

/**
 * Created by Ahmeett on 20.12.2016.
 */
public class MonthFilter implements Predicate<Article> {

    private Month month;

    public MonthFilter(Month month) {

        this.month=month;
    }



    @Override
    public boolean test(Article article) {

        if(month.equals(article.getMonth())){
            return true;
        }

        return false;
    }
}
