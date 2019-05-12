
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyClient extends JFrame {
   public MyClient(){
       // Создание самого главного окна
       setTitle("My Client"); // Название окна
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       setBounds(400,100,450,330); // границы, где x & y - положение левой верхней точки на экране

       setLayout(new BorderLayout()); // менеджер расположения элементов

       // Создание 1й панели
       JPanel chat = new JPanel();
       chat.setPreferredSize(new Dimension(450,300)); // размер окна
//       chat.setBounds(0,00,500,400); // местоположение
//       chat.setBackground(new Color(200,200,255));
       add(chat);
       chat.setLayout(new BorderLayout());
       JTextArea jTextArea = new JTextArea();
       jTextArea.setLineWrap(true);

       JScrollPane jsp1 = new JScrollPane(jTextArea);
       chat.add(jsp1);

       //Создание 2й панели
       JPanel area = new JPanel();
       add(area, BorderLayout.PAGE_END);
       area.setPreferredSize(new Dimension(450,35));
       area.setLayout(new BorderLayout());
       JTextField jta = new JTextField();
       JScrollPane jsp = new JScrollPane(jta);
       area.add(jsp);
       JButton jButton = new JButton("Send");
       jButton.addMouseListener(new MouseAdapter() {
           @Override
           public void mouseReleased(MouseEvent e) {
               jTextArea.append(jta.getText() + "\n");
           }
       });
       area.add(jButton, BorderLayout.LINE_END);
       jta.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {

               jTextArea.append(jta.getText() + "\n");
           }
       });

//       area.setBounds(0,400, 500,200);
//       area.setBackground(new Color(100,100,100));



       setVisible(true);
   }
}

class Main{
    public static void main(String[] args) {
        new MyClient();
    }
}
