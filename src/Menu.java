import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {


    private JMenuBar jMenuBar;
    private JMenu jMenu;
    public Menu(){
        jMenuBar = new JMenuBar();
        jMenu = new JMenu("Menu");
        JMenuItem item = new JMenuItem("Start");
        jMenu.add(item);
        jMenu.addSeparator();
        item.addActionListener(this);
        item = new JMenuItem("Pause");
        jMenu.add(item);
        jMenu.addSeparator();
        item.addActionListener(this);
        item = new JMenuItem("New Game");
        jMenu.add(item);
        item.addActionListener(this);
        jMenuBar.add(jMenu);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        //System.out.println(e.getActionCommand());
        if (e.getActionCommand()=="Pause"){

        }
    }
    public JMenuBar getjMenuBar() {
        return jMenuBar;
    }
    public JMenu getjMenu() {
        return jMenu;
    }
}
