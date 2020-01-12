import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;





public class Main {




    public static void main(String[] args) throws Exception {
        JFrame frame = new JFrame();


        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.BLACK);
        frame.add(panel);

        JButton button = new JButton("koppla ner");
        panel.add(button, BorderLayout.NORTH);
        //frame.add(button, BorderLayout.NORTH);


        JTextArea textArea = new JTextArea(10,20);
        JScrollPane scrollPane = new JScrollPane(textArea);
        panel.add(textArea, BorderLayout.CENTER);
        textArea.setBackground(Color.GRAY);



        JTextField textField = new JTextField("Här skriver man: ");
        panel.add(textField, BorderLayout.SOUTH);









        frame.setSize(new Dimension(500, 400));
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Text Chat");
        frame.setResizable(false);
        frame.setVisible(true);



        textField.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae){
              //  textArea.setText(textField.getText());
                String name = textField.getText();
                textArea.append(name + "\n");
            }
        });

        //class Action implements ActionListener{
         //   public void actionPerformed(ActionEvent e){
         //       String name = textField.getText();
         //       textArea.append(name);
         //   }
        //}

        Client clientobj = new Client();
        clientobj.clientt();

    }




}
