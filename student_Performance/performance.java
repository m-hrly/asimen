import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;
import javax.swing.*;

public class performance extends data{

    private JFrame fr;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    performance window = new performance();
                    window.fr.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public performance(){
       
            try
            {
                initialize();
            }
            catch (java.io.IOException ioe)
            {
                ioe.printStackTrace();
            }
        
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() throws java.io.IOException {
        fr = new JFrame();
        fr.setTitle("STUDENT PERFORMANCE");
        fr.setBounds(100, 100, 600, 750);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.getContentPane().setLayout(null);
        
        
        
        /*JLabel schh = new JLabel("SMK MELATI KOTA KINABALU");
        schh.setFont(new Font("Arial Black", Font.BOLD, 12));
        schh.setBounds(159, 3, 241, 14);
        fr.getContentPane().add(schh);*/
        
        JLabel congrats = new JLabel("CONGRATULATIONS");
        congrats.setFont(new Font("Berlin Sans FB", Font.BOLD, 13));
        congrats.setBounds(208, 8, 141, 26);
        fr.getContentPane().add(congrats);
        
        JTextArea textArea = new JTextArea();
        textArea.setBounds(34, 15, 526, 707);
        JScrollPane scroll=new JScrollPane(textArea,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        scroll.setVisible(true);
        fr.getContentPane().add(textArea);
        textArea.setLineWrap(true);
        textArea.setText("");
        BufferedReader br=null;
        try
        {
        br=new BufferedReader(new FileReader("List.txt"));
        String line;
        while((line=br.readLine())!= null){
        textArea.append("\n"+line);
        }
        }
      catch (java.io.FileNotFoundException fnfe)
        {
            fnfe.printStackTrace();
        }
        JButton exi = new JButton("EXIT");
        exi.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
                System.exit(0);
            }
        });
        exi.setBounds(265, 477, 89, 23);
        fr.getContentPane().add(exi);
    }
}


        
        