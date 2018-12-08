import javax.swing.*;

public class Okno {
    public static void main(String[] args){
        JFrame okno = new JFrame("Окно просмотра");
        okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okno.setSize(800,600);
        JPanel panelka = new JPanel();
        panelka.setLayout(new BoxLayout(panelka,BoxLayout.Y_AXIS));
        final JButton bt = new JButton();
        bt.setText("Кнопка");
        panelka.add(bt);
        okno.add(panelka);
        okno.setVisible(true);
    }
}