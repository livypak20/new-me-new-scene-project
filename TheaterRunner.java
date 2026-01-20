import org.code.theater.*;

public class TheaterRunner {
  public static void main(String[] args) {

    //creates scene objects for ThisYear and LastYear
    LastYear lastYear = new LastYear();
    ThisYear thisYear = new ThisYear();

    //calls function to make pictures for lastYear, including memorable trips and friends
    lastYear.drawLastYearPics();

    //calls function to create my goals for 2026, along with corresponding images
    thisYear.drawThisYearGoals();

    //actually puts draws the function's code onto the screen
    Theater.playScenes(lastYear, thisYear);    
  }
}