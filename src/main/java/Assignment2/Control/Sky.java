package Assignment2.Control;

public class Sky {
    int LevelOfClouds;

    public void rain(){
        if(LevelOfClouds <= 0){
            System.out.println("It's sunny out.");
        }
        else if(LevelOfClouds == 1){
            System.out.println("There is a light drizzel.");
        }
        else if(LevelOfClouds == 2){
            System.out.println("It's raining.");
        }
        else if(LevelOfClouds == 3){
            System.out.println("There is a tornado");
        }
        else{
            System.out.println("It's a natural disaster.");
        }

        // Here the LevelOfClouds is a flag that controls the entire flow of the method
        // depending on the flag the method does completely different things
    }
}
