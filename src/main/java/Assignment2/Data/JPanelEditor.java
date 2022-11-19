package Assignment2.Data;

import javax.swing.*;
import java.awt.*;

public class JPanelEditor {
    public void squareTheJPanel(JPanel jPanel, int size){
        jPanel.setSize(new Dimension(size, size)); // I am passing data to the jpanel using it's functions
                                                    // , thus this is StorageData couping
    }
}
