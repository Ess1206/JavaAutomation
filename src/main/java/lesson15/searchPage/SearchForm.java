package lesson15.searchPage;

import core.MethodsFactory;

import java.util.List;

/**
 * Created by Stan on 13.06.2017.
 */
public abstract class SearchForm extends MethodsFactory {

   abstract protected boolean verifyPage(String pageForVerified);
   abstract protected List<String> listOfCelebrities();
}
