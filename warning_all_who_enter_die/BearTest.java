import static org.junit.Assert.*;
import org.junit.*;

public class BearTest{
  Bear bear;
  Salmon salmon;
  Human human;
  Chicken chicken;

  @Before 
  public void before() {
    bear = new Bear("Baloo");
    salmon = new Salmon(); 
    human = new Human();
    chicken = new Chicken();
  }

  @Test
  public void hasName(){
    assertEquals( "Baloo", bear.getName() ); 
  }

  @Test
  public void bellyStartsEmpty(){
    assertEquals(0, bear.foodCount());
  }

  @Test
  public void canEatSalmon(){
    bear.eat(salmon);
    assertEquals(1, bear.foodCount());
  }

  @Test
  public void shouldEmptyBellyAfterSleeping(){
    bear.eat(salmon);
    bear.eat(human);
    bear.sleep();
    assertEquals(bear.foodCount(), 0);
  }

  @Test 
  public void canEatHuman(){
    bear.eat(human);
    assertEquals(1, bear.foodCount());
  }

  @Test
  public void canEatChicken(){
    bear.eat(chicken);
    assertEquals(1, bear.foodCount());
  }

  @Test
  public void canThrowUp(){
    bear.eat(salmon);
    Edible food = bear.throwUp();
    // Salmon original = (Salmon)food;
    // assertNotNull(food);
    assertEquals("Swimming.", food.swim());
  }

  @Test
  public void canThrowUpChicken(){
    bear.eat(chicken);
    Edible food = bear.throwUp();
    // assertNotNull(food);
    assertEquals("Drowning in style.", food.swim());
  }

  @Test
  public void bearsNutritionalValue(){
    bear.eat(human);
    bear.eat(chicken);
    bear.eat(salmon);
    assertEquals(10, bear.stomachValue());
  }

  @Test
  public void bearHasEmptyDiary(){
    assertEquals(0, bear.diaryEntryCount());
  }

  @Test
  public void bearCanWriteInDiary(){
    bear.eat(chicken);
    assertEquals(1, bear.diaryEntryCount());
  }

  @Test
  public void bearCanWriteInDiaryOnDifferenetDays(){
    bear.eat(chicken);
    bear.sleep();
    bear.eat(human);
    // assertEquals(2, bear.diaryEntryCount());
    Edible food = (Edible)bear.diaryEntry(1);
    assertEquals("I am Swimming.", food.swim());
  }
  
}
