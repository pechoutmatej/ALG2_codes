package cz.tul.alg.matpech.oop;

public class Card {
    private String symbol;
    private String value;


    public Card(String symbol, String value){
        this.symbol = symbol;
        this.value = value;
    }

    public String getSymbol(){
        return symbol;
    }

    public String getValue(){
        return value;
    }

    @Override
    public String toString() {
        return (symbol + " - " + value);
    }

}
