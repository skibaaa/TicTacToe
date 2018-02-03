import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TicTacToeGui {
    private JPanel mainPanel;
    private JButton button1;
    private JLabel label;

    public TicTacToeGui() {
        button1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                label.setText("Działa!!");
            }
        });
    }

    public static void main(String args[]) {
        TicTacToeGui ticTacToeGui = new TicTacToeGui();
        JFrame frame = new JFrame("TicTacToeGui");
        frame.setContentPane(ticTacToeGui.mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
