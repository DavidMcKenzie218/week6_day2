import static org.junit.Assert.assertEquals;
import org.junit.*;

public class ArnieTest {

  Arnie arnie;
  Predator predator;
  Terminator2 terminator2; 

  @Before
  public void before(){
    arnie = new Arnie("Arnold Schwarzenegger");
    predator = new Predator();
    terminator2 = new Terminator2();
  }

  //ARNIE TESTS

  // 1

  @Test
  public void hasName(){
    assertEquals("Arnold Schwarzenegger", arnie.getName());
  }

  //2

  @Test
  public void hasNoQuotes(){
    assertEquals(0, arnie.quoteCount());
  }

  //3

  @Test 
  public void hasPredatorQuotes(){
    predator.quotes();
    arnie.addPredatorQuotes(predator);
    assertEquals(3, arnie.quoteCount());
  }

  //4

  @Test
  public void hasTerminator2Quotes(){
    terminator2.quotes();
    arnie.addTerminator2Quotes(terminator2);
    assertEquals(3, arnie.quoteCount());
  }

  //5

  @Test
  public void hasAllQuotes(){
    terminator2.quotes();
    predator.quotes();
    arnie.addTerminator2Quotes(terminator2);
    arnie.addPredatorQuotes(predator);
    assertEquals(6, arnie.quoteCount());
  }

  // PREDATOR TESTS

  //6

  @Test 
  public void predatorHasQuotes(){
    predator.quotes();
    assertEquals(3, predator.quoteCount());
  }

  //7

  @Test
  public void predatorFirstQuote(){
    predator.quotes();
    assertEquals("Get to tha Choppa!", predator.outputQuote(0));
  }

  //TERMINATOR 2 TESTS

  //8

  @Test
  public void terminator2Quotes(){
    terminator2.quotes();
    assertEquals(3, terminator2.quoteCount());
  }

  //9

  @Test
  public void terminator2FirstQuote(){
    terminator2.quotes();
    assertEquals("Hasta la vista, baby.", terminator2.outputQuote(0));
  }

}