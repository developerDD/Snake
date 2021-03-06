import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame implements ActionListener {


    private JMenuBar jMenuBar;
    private JMenu jMenu;
    public Menu(){
        jMenuBar = new JMenuBar();
        jMenu = new JMenu("Menu");
        JMenuItem item = new JMenuItem("Sart");
        jMenu.add(item);
        jMenu.addSeparator();
        item.addActionListener(this);
        item = new JMenuItem("Psuse");
        jMenu.add(item);
        jMenu.addSeparator();
        item.addActionListener(this);
        item = new JMenuItem("Anew");
        jMenu.add(item);
        item.addActionListener(this);
        jMenuBar.add(jMenu);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }
    public JMenuBar getjMenuBar() {
        return jMenuBar;
    }
    public JMenu getjMenu() {
        return jMenu;
    }
}
