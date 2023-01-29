import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class res_stu {

    private JFrame frmStudentManagementSystem;
    public JTextField nme1;
    public JTextField stu_id1;
    public JTextField clss1;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    res_stu window = new res_stu();
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
    public res_stu() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frmStudentManagementSystem = new JFrame();
        frmStudentManagementSystem.setTitle("STUDENT MANAGEMENT SYSTEM");
        frmStudentManagementSystem.setBounds(100, 100, 600, 550);
        frmStudentManagementSystem.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmStudentManagementSystem.getContentPane().setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBounds(10, 11, 564, 489);
        frmStudentManagementSystem.getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel welc_ = new JLabel("WELCOME TO STUDENT PERFORMANCE MANAGEMENT SYSTEM ");
        welc_.setFont(new Font("Arial Black", Font.BOLD, 13));
        welc_.setBounds(41, 43, 480, 14);
        panel.add(welc_);
        
        JLabel welc__1 = new JLabel("STUDY SMART NOT STUDY HARD");
        welc__1.setFont(new Font("Arial", Font.ITALIC, 13));
        welc__1.setBounds(156, 129, 235, 14);
        panel.add(welc__1);
        
        JLabel welc__2 = new JLabel("SMK MELATI KOTA KINABALU\r\n");
        welc__2.setFont(new Font("Arial", Font.BOLD, 15));
        welc__2.setBounds(156, 80, 235, 27);
        panel.add(welc__2);
        
        JLabel nme = new JLabel("NAME\r\n");
        nme.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        nme.setBounds(41, 221, 46, 14);
        panel.add(nme);
        
        nme1 = new JTextField();
        nme1.setBounds(156, 218, 255, 20);
        panel.add(nme1);
        nme1.setColumns(10);
        
        JLabel stu_id = new JLabel("STUDENT ID ");
        stu_id.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        stu_id.setBounds(41, 263, 112, 14);
        panel.add(stu_id);
        
        stu_id1 = new JTextField();
        stu_id1.setColumns(10);
        stu_id1.setBounds(156, 260, 255, 20);
        panel.add(stu_id1);
        
        JLabel clss = new JLabel("CLASS");
        clss.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        clss.setBounds(41, 306, 112, 14);
        panel.add(clss);
        
        clss1 = new JTextField();
        clss1.setColumns(10);
        clss1.setBounds(156, 303, 255, 20);
        panel.add(clss1);
        
        JComboBox comboBox = new JComboBox();
        comboBox.setModel(new DefaultComboBoxModel(new String[] {"Session 1 (2021/2021)", "Session 2 (2021/2021)"}));
        comboBox.setBounds(156, 344, 112, 22);
        panel.add(comboBox);
        
        JLabel exam = new JLabel("EXAM SESSION");
        exam.setFont(new Font("Times New Roman", Font.PLAIN, 13));
        exam.setBounds(41, 348, 112, 14);
        panel.add(exam);
        
        JButton Sub = new JButton("CHECK");
        Sub.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
                performance info = new performance();
                performance.main(null);
            }
        });
        Sub.setBounds(79, 415, 89, 23);
        panel.add(Sub);
        
        JButton Res = new JButton("RESET");
        Res.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
                nme1.setText("");
                stu_id1.setText("");
                clss1.setText("");
                comboBox.setSelectedIndex(0);
            }
        });
        Res.setBounds(236, 415, 89, 23);
        panel.add(Res);
        
        JButton out = new JButton("EXIT");
        out.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
                System.exit(0);
            }
        });
        out.setBounds(405, 415, 89, 23);
        panel.add(out);
    }
}
