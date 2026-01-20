import org.code.theater.*;
import org.code.media.*;

public class LastYear extends Scene {

  //creating instance variables that will be used in photo dump
  private String[] lastYearPics;
  private String[] captions = {"Las Vegas", "Hawaii", "Hawaii", "Korea", "Paris", "Friends", "Friends", "Friends", "Friends", "Friends"};

  //no argument constructor for LastYear
   public LastYear(){
     lastYearPics = FileReader.toStringArray("lastYearPics.txt");
   }

  //parameterized constructor for LastYear
  public LastYear(String[] lastYearPics){
    this.lastYearPics = lastYearPics;
  }

  /*
  function that calls all of the other functions  
  - draws everything together for the photo dump
  */
  public void drawLastYearPics() {
    drawTitleScreen();
    photoDump();
    pause(1);
  }

  //function that draws titleScreen for 2025 recap
  public void drawTitleScreen(){
     pause(1);

    setFillColor("white");
    drawRectangle(0, 0, 400, 400);
    drawImage("sky.jpeg", 0, 0, 400);
    drawRectangle(60, 155, 265, 70);
    setTextStyle(Font.SERIF, FontStyle.BOLD);
    setTextHeight(30);
    drawText("My 2025 Recap", 95, 200);
    
    pause(5); 
  }

  /*
  function that loops through 1D array of 
  pictures to 
  - display them on the screen simulatenously with the 1D array
  - with the corresponding captions 
  */
  public void photoDump() {   
    for (int i = 0; i < lastYearPics.length; i++) {
      if(i >= 0){
        clear("white");
        drawImage(lastYearPics[i], 0, 0, 400, 400, 0);
        setFillColor("white");
        drawRectangle(70, 300, 260, 55);
        setTextStyle(Font.SERIF, FontStyle.BOLD);
        drawText(captions[i], 150, 340);
        pause(1);
      }
    }   
  }
  
}