package Assignment2.Independance;

import java.awt.*;

public class Sky {
    Color color;
    boolean Cloudy;

    Sky(Color color, boolean Cloudy){
        this.color = color;
        this.Cloudy = Cloudy;
    }

    public void Rain(){
        if(Cloudy) {
            System.out.println("It is raining");
            Cloudy = false;
        }
        else
            System.out.println("It is sunny");
    }
}
