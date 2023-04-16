// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import ui.App;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        //   Hello object = (Hello) Naming.lookup("//"+hostname+"/HelloServer");

        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception ignored) {

        }

        new App();
    }

}
