package Assignment2.Stamp;

public class PaperFolder {

    Paper paper;

    PaperFolder(Paper paper){
        this.paper = paper;

        paper.height = 200;
        paper.width = 200;
        // Since we passed an instance of Paper by reference
        // and we are editing it's attributes inside another class
        // this is Stamp Coupling
    }
}
