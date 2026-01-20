import org.code.theater.*;
import org.code.media.*;

public class ThisYear extends Scene{

  //instance variables for images that correspond with my goals for 2026
  private String bookPic;
  private String studyPic;
  private String foodPic;

  private String[] images = {"books.jpg", "study.jpg", "food.jpg"};

  //no-argument constructor for ThisYear
  public ThisYear(){
    bookPic = images[0];
    studyPic = images[1];
    foodPic = images[2];
  }

  //parameterized constructor for ThisYear
  public ThisYear(String images[]){
    this.bookPic = bookPic;
    this.studyPic = studyPic;
    this.foodPic = foodPic;
  }

  /* 
  function that combines both functions 
  - generates the 2026 goal page into one
  - makes it more simple 
  */
  public void drawThisYearGoals() {
    goalsContent();
    drawGoalPics();
  }

  //function that creates background of the goal page and generates each goal
  public void goalsContent() {
    clear("white");
    
    setFillColor("turquoise");
    drawEllipse(50, 50, 110, 110);
    
    setFillColor("turquoise");
    drawEllipse(160, 190, 110, 110);
    
    setFillColor("turquoise");
    drawEllipse(290, 100, 110, 110);
    
    setFillColor("turquoise");
    drawEllipse(30, 300, 110, 110);
    
    setFillColor("turquoise");
    drawEllipse(310, 310, 110, 110);

    drawRectangle(0, 0, 400, 60);
      
    setTextStyle(Font.SERIF, FontStyle.BOLD);
    drawText("My Goals for 2026: ", 115, 40);

    setFillColor("pink");    
    drawRectangle(40, 70, 320, 40);
      
    drawText("Read More", 60, 95);
    setTextStyle(Font.SERIF, FontStyle.BOLD);

    setFillColor("pink");
    drawRectangle(40, 125, 320, 40);

    drawText("Focus on School", 60, 150);
    setTextStyle(Font.SERIF, FontStyle.BOLD);

    setFillColor("pink");
    drawRectangle(40, 185, 320, 40);

    setTextHeight(20);
    drawText("Eat Healthy", 60, 210);
    setTextStyle(Font.SERIF, FontStyle.BOLD); 
  }

  //draws the corresponding images to go along with each goal
   public void drawGoalPics(){
    drawImage(bookPic, 120, 250, 125, 90);
    drawImage(studyPic, 250, 240, 130, 90);
    drawImage(foodPic, 280, 250, 100);
   }

  
}