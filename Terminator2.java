class Terminator2 implements Quotes {

  private String[] quotes;

  public void quotes(){
    quotes = new String[]{"Hasta la vista, baby.", "I need your clothes, your boots and your motorcycle.", "He'll live."};
  }

  public int quoteCount(){
    int counter = 0;
    for(String quote : quotes){
      if (quote !=null) {
        counter++;
      }
    }
    return counter;
  }

  public String outputQuote(int quoteNumber){
    return quotes[quoteNumber];
  }

}