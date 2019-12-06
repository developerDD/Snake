import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    public MainWindow() {
        setTitle("Snake");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 365);
        setLocation(400, 400);
        Menu menu = new Menu();
        setJMenuBar(menu.getjMenuBar());
        add(new Snake());
        setVisible(true);

   }

    public static void main(String[] args) throws Exception {

        MainWindow mainWindow = new MainWindow();

    }


}
