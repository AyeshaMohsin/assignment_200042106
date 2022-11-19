package Assignment2.Content;

public class Store {
    public void sellBook(){
        StorageData.totalBooks--;
    }

    public void sellCopy(){
        StorageData.totalCopies--;
    }

    //the contents of the StorageData are public and can be
    // freely edited by another class, this is content coupling
}
