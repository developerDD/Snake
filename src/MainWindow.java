import javax.swing.*;

public class MainWindow extends JFrame {

    public MainWindow() {
        setTitle("Snake");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(320, 345);
        setLocation(500, 200);
       Menu menu = new Menu();
       setJMenuBar(menu.getjMenuBar());
        add(new GameField());
        setVisible(true);

   }

    public static void main(String[] args) throws Exception {

        MainWindow mainWindow = new MainWindow();

    }


}
