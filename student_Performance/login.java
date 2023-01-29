import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class login {

    private JFrame frmStudentManagementSystem;
    private JTextField un;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    login window = new login();
                    window.frmStudentManagementSystem.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public login() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmStudentManagementSystem = new JFrame();
        frmStudentManagementSystem.getContentPane().setForeground(Color.DARK_GRAY);
        frmStudentManagementSystem.getContentPane().setLayout(null);
        
        JLabel welc = new JLabel("WELCOME TO STUDENT PERFORMANCE MANAGEMENT SYSTEM");
        welc.setFont(new Font("Yu Gothic UI", Font.BOLD, 12));
        welc.setBounds(38, 30, 396, 43);
        frmStudentManagementSystem.getContentPane().add(welc);
        
        JLabel schname = new JLabel("SMK MELATI KOTA KINABALU");
        schname.setFont(new Font("Yu Gothic UI", Font.BOLD, 13));
        schname.setBounds(115, 84, 276, 14);
        frmStudentManagementSystem.getContentPane().add(schname);
        
        JLabel username = new JLabel("USERNAME");
        username.setFont(new Font("Tahoma", Font.BOLD, 12));
        username.setBounds(38, 134, 111, 14);
        frmStudentManagementSystem.getContentPane().add(username);
        
        JLabel lblPassword = new JLabel("PASSWORD");
        lblPassword.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblPassword.setBounds(38, 178, 111, 14);
        frmStudentManagementSystem.getContentPane().add(lblPassword);
        
        un = new JTextField();
        un.setBounds(159, 131, 232, 20);
        frmStudentManagementSystem.getContentPane().add(un);
        un.setColumns(10);
        
        JPasswordField pw = new JPasswordField ();
        pw.setColumns(10);
        pw.setBounds(159, 175, 232, 20);
        frmStudentManagementSystem.getContentPane().add(pw);
        
        JButton logS = new JButton("LOGIN");
        logS.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
                String password = pw.getText();
                String username = un.getText();
                
                if(username.contains("student")&& password.contains("student")) 
                
                {
                    pw.setText(null);
                    un.setText(null);
                    
                    res_stu info = new res_stu();
                    res_stu.main(null);
                }
                else if(username.contains("staff")&& password.contains("staff")) 
                    
                {
                    pw.setText(null);
                    un.setText(null);
                    
                    StuPerf info = new StuPerf();
                    StuPerf.main(null);
                }
                else
                {
                 JOptionPane.showMessageDialog(null,"Check your username or password","Invalid Login Details",JOptionPane.ERROR_MESSAGE);
                     pw.setText(null);
                    un.setText(null);
                }
                }
            });
        logS.setBounds(88, 212, 89, 23);
        frmStudentManagementSystem.getContentPane().add(logS);
        
        JButton ex = new JButton("EXIT");
        ex.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
                System.exit(0);
            }
        });
        ex.setBounds(259, 212, 89, 23);
        frmStudentManagementSystem.getContentPane().add(ex);
        frmStudentManagementSystem.setTitle("STUDENT MANAGEMENT SYSTEM");
        frmStudentManagementSystem.setBounds(100, 100, 450, 300);
        frmStudentManagementSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
