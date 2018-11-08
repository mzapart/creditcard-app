package pl.surowka.creditcard;

import java.util.Map;
import java.util.HashMap;

public class CreditCardPool{
    private Map<String,CreditCard> cards = new HashMap<String,CreditCard>();
    
    public void add (CreditCard card){
        cards.put(card.getNumber(), card);
        
    }
    
    public CreditCard find(String number){
        
        return cards.get(number);
    }
}