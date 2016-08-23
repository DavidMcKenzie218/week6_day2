import java.util.*;

public class Arnie{

  private String name;
  private ArrayList<Quotes> quotes;

  public Arnie(String name){
    this.name = name;
    this.quotes = new ArrayList<Quotes>();
  }

  public String getName(){
    return name;
  }

  public int quoteCount(){
    return quotes.size();
  }

  public void addPredatorQuotes(Quotes predator){
    for(int i = 0; i < 3; i++){
      quotes.add(predator);
    }
  }

  public void addTerminator2Quotes(Quotes terminator2){
    for(int i = 0; i < 3; i++){
      quotes.add(terminator2);
    }
  }

}