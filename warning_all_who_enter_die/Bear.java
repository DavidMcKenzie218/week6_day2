import java.util.*;

public class Bear{
  
  private String name;
  private ArrayList<Edible> belly;
  private HashMap<Integer, Object> diary;
  private Integer day = 0;

  public Bear(String name){
    this.name = name;
    this.belly = new ArrayList<Edible>();
    this.diary = new HashMap<Integer, Object>();
  }

  public String getName(){
    return this.name;
  }

  public int foodCount(){
    return belly.size();
  }

  public void eat(Edible food){
    belly.add(food);
    diary.put(this.day, food);
  }

  public void sleep(){
    belly.clear();
    this.day ++;
  }

  public Edible throwUp(){
    if (foodCount() > 0){
      return belly.remove(0);
    }
    return null;
  }

  public int stomachValue(){
    int stomachValue = 0;
    for (int i = 0; i < belly.size(); i++){
      stomachValue += belly.get(i).nutritionalValue();
    }
    return stomachValue;
  }

  public int diaryEntryCount(){
    return diary.size();
  }

  public Object diaryEntry(int day){
    return diary.get(day);
  }

}
