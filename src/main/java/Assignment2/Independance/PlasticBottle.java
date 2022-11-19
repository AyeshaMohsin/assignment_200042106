package Assignment2.Independance;

public class PlasticBottle {
    int Max_quantity;
    int containing;
    int height;
    int width;

    PlasticBottle(int width, int height, int Max_quantity){
        this.width = width;
        this.height = height;
        this.Max_quantity = Max_quantity;
    }

    public void Contain(int amount){
        if(amount > Max_quantity)
            containing = Max_quantity;
        else
            containing = amount;
    }
}
