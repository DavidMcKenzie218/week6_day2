class Predator implements Quotes {

  private String[] quotes;

  public void quotes(){
    quotes = new String[]{"Get to tha Choppa!", "If it bleeds we can kill it", "What's the matter? The CIA got you pushing too many pencils?"};
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