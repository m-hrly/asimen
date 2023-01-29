import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;

public class StuPerf {

    private JFrame frmStudentManagementSystem;
    private JTextField name1;
    private JTextField stu1;
    private JTextField cls1;
    private JTextField tc1;
    private JTextField mel1;
    private JTextField eng1;
    private JTextField m31;
    private JTextField tot1;
    private JTextField ave1;
    private JTextField sc1;
    private JTextField rank1;
    private JTextField rankbi;
    private JTextField rankmt;
    private JTextField ranksc;
    private JTextField com1;
    
         
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    StuPerf window = new StuPerf();
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
    public StuPerf() {
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
        panel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel.setBounds(10, 11, 356, 489);
        frmStudentManagementSystem.getContentPane().add(panel);
        panel.setLayout(null);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.LIGHT_GRAY);
        panel_1.setBorder(new LineBorder(new Color(0, 0, 0), 2));
        panel_1.setBounds(370, 11, 204, 489);
        frmStudentManagementSystem.getContentPane().add(panel_1);
        panel_1.setLayout(null);
        
        JLabel name = new JLabel("NAME: ");
        name.setFont(new Font("Arial", Font.PLAIN, 13));
        name.setBounds(25, 22, 61, 26);
        panel.add(name);
        
        JLabel stu = new JLabel("STUDENT ID: ");
        stu.setFont(new Font("Arial", Font.PLAIN, 12));
        stu.setBounds(25, 59, 70, 26);
        panel.add(stu);
        
        JLabel cls = new JLabel("CLASS:");
        cls.setFont(new Font("Arial", Font.PLAIN, 13));
        cls.setBounds(25, 96, 61, 26);
        panel.add(cls);
        
        JLabel tc = new JLabel("TEACHER:");
        tc.setFont(new Font("Arial", Font.PLAIN, 12));
        tc.setBounds(25, 133, 61, 26);
        panel.add(tc);
        
        JLabel mel = new JLabel("MELAYU");
        mel.setBounds(25, 170, 61, 26);
        panel.add(mel);
        
        JLabel eng = new JLabel("ENGLISH\r\n");
        eng.setBounds(25, 207, 61, 26);
        panel.add(eng);
        
        JLabel m3 = new JLabel("MATHS");
        m3.setBounds(25, 244, 61, 26);
        panel.add(m3);
        
        JLabel ave = new JLabel("GPA");
        ave.setBounds(204, 207, 61, 26);
        panel.add(ave);
        
        JLabel sc = new JLabel("SCIENCE");
        sc.setBounds(25, 281, 61, 26);
        panel.add(sc);
        
        JLabel rank = new JLabel("BM's GRADE");
        rank.setBounds(204, 244, 61, 26);
        panel.add(rank);
        
        JLabel rank2 = new JLabel("BI's GRADE");
        rank2.setBounds(204, 264, 61, 26);
        panel.add(rank2);
        
        JLabel rank3 = new JLabel("MT's GRADE");
        rank3.setBounds(204, 284, 61, 26);
        panel.add(rank3);
        
        JLabel rank4 = new JLabel("SC's GRADE");
        rank4.setBounds(204, 304, 61, 26);
        panel.add(rank4);

        JLabel total = new JLabel("TOTAL");
        total.setBounds(204, 170, 61, 26);
        panel.add(total);
        
        name1 = new JTextField();
        name1.setBounds(139, 25, 207, 20);
        panel.add(name1);
        name1.setColumns(10);
        
        stu1 = new JTextField();
        stu1.setColumns(10);
        stu1.setBounds(139, 62, 207, 20);
        panel.add(stu1);
        
        cls1 = new JTextField();
        cls1.setColumns(10);
        cls1.setBounds(139, 99, 207, 20);
        panel.add(cls1);
        
        tc1 = new JTextField();
        tc1.setColumns(10);
        tc1.setBounds(139, 136, 207, 20);
        panel.add(tc1);
        
        mel1 = new JTextField();
        mel1.setColumns(10);
        mel1.setBounds(106, 173, 70, 20);
        panel.add(mel1);
        
        eng1 = new JTextField();
        eng1.setColumns(10);
        eng1.setBounds(106, 210, 70, 20);
        panel.add(eng1);
        
        m31 = new JTextField();
        m31.setColumns(10);
        m31.setBounds(106, 247, 70, 20);
        panel.add(m31);
        
        tot1 = new JTextField();
        tot1.setColumns(10);
        tot1.setBounds(264, 173, 70, 20);
        panel.add(tot1);
        
        ave1 = new JTextField();
        ave1.setColumns(10);
        ave1.setBounds(264, 210, 70, 20);
        panel.add(ave1);
        
        sc1 = new JTextField();
        sc1.setColumns(10);
        sc1.setBounds(106, 284, 70, 20);
        panel.add(sc1);
        
        rank1 = new JTextField();
        rank1.setColumns(10);
        rank1.setBounds(264, 247, 70, 20);
        panel.add(rank1);
        
        rankbi = new JTextField();
        rankbi.setColumns(10);
        rankbi.setBounds(264, 267, 70, 20);
        panel.add(rankbi);
        
        rankmt = new JTextField();
        rankmt.setColumns(10);
        rankmt.setBounds(264, 287, 70, 20);
        panel.add(rankmt);
        
        ranksc = new JTextField();
        ranksc.setColumns(10);
        ranksc.setBounds(264, 307, 70, 20);
        panel.add(ranksc);


        
        JLabel com = new JLabel("COMMENT");
        com.setBounds(25, 318, 61, 26);
        panel.add(com);
        
        JTextArea com1 = new JTextArea();
        com1.setBounds(25, 343, 309, 80);
        panel.add(com1);
        
        JButton tot = new JButton("TOTAL");
        tot.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
                double[] r = new double[20];
                r[0] = Double.parseDouble(mel1.getText());
                r[1] = Double.parseDouble(eng1.getText());
                r[2] = Double.parseDouble(m31.getText());
                r[3] = Double.parseDouble(sc1.getText());
                
                //total
                r[4] = (r[0] + r[1] + r[2] + r[3]);
                
                String totalsc=String.format("%.0f",r[4]);
                tot1.setText(totalsc);
                
                //gpa
               /* r[5] = ((r[0] + r[1] + r[2] + r[3])/100);
                String Average=String.format("%.0f",r[5]);
                ave1.setText(Average);*/
                
                
                //grade
                //rank1 is bm score
                if(r[0] >= 80 && r[0] <=100)
                {
                    rank1.setText("A");
                }
                else if(r[0] >= 60&& r[0] <80)
                {
                    rank1.setText("B");
                }
                else if(r[0] >= 40&& r[0] <60)
                {
                    rank1.setText("C");
                }
                else if(r[0] >= 20 && r[0] <40)
                {
                    rank1.setText("D");
                }
                else 
                {
                   rank1.setText("E");
                }
                
                                 
                 
                // rankbi is bi score
                if(r[1] >= 80&& r[1] <=100)
                {
                    rankbi.setText("A");
                }
                else if(r[1] >= 60&& r[1] <80)
                {
                    rankbi.setText("B");
                }
                else if(r[1] >= 40 && r[1] <60)
                {
                    rankbi.setText("C");
                }
                else if(r[1] >= 20&& r[1] <40)
                {
                    rankbi.setText("D");
                }
                else 
                {
                   rankbi.setText("E");
                }
                // rankmt is math's score
                if(r[2] >= 80 && r[2] <=100)
                {
                    rankmt.setText("A");
                }
                else if(r[2] >= 60 &&r[2] <80)
                {
                    rankmt.setText("B");
                }
                else if(r[2] >= 40 &&r[2] <60)
                {
                    rankmt.setText("C");
                }
                else if(r[2] >= 20&&r[2] <40)
                {
                    rankmt.setText("D");
                }
                else 
                {
                    rankmt.setText("E");
                }
                // ranksc is science score 
                if(r[3] >= 80&& r[3] <=100)
                {
                    ranksc.setText("A");
                }
                else if(r[3] >= 60&& r[3] <80)
                {
                    ranksc.setText("B");
                    
                }
                else if(r[3] >= 40&& r[3] <60)
                {
                    ranksc.setText("C");
                    
                }
                else if(r[3] >= 20 && r[3] <40)
                {
                    ranksc.setText("D");
                }
                else 
                {
                   ranksc.setText("E");
                }
                
                
                         
               //trying to convert the grade to score point to calculate gpa
                String rank1Grade = rank1.getText();
                String rankbiGrade = rankbi.getText();
                String rankmtGrade = rankmt.getText();
                String rankscGrade = ranksc.getText();
                int BMSP1;
                int BISP1;
                int MTSP1;
                int SCSP1;

                 if(rank1Grade.equals("A"))
                 {
                    BMSP1 = 4 ;
                 }
                 else if(rank1Grade.equals("B"))
                 {
                    BMSP1 = 3 ;
                 }
                 else if (rank1Grade.equals("C"))               
                 {
                    BMSP1 = 2;
                 }
                 else if(rank1Grade.equals("D"))        
                 {
                    BMSP1 = 1;
                 }
                 else 
                 {
                    BMSP1 = 0;
                 }
                 
                 if(rankbiGrade.equals("A"))
                 {
                    BISP1 = 4 ;
                 }
                 else if(rankbiGrade.equals("B"))
                 {
                    BISP1 = 3 ;
                 }
                 else if (rankbiGrade.equals("C"))               
                 {
                    BISP1 = 2;
                 }
                 else if(rankbiGrade.equals("D"))        
                 {
                    BISP1 = 1;
                 }
                 else 
                 {
                    BISP1 = 0;
                 }
                 
                 if(rankmtGrade.equals("A"))
                 {
                    MTSP1 = 4 ;
                 }
                 else if(rankmtGrade.equals("B"))
                 {
                    MTSP1 = 3 ;
                 }
                 else if (rankmtGrade.equals("C"))               
                 {
                    MTSP1 = 2;
                 }
                 else if(rankmtGrade.equals("D"))        
                 {
                    MTSP1 = 1;
                 }
                 else 
                 {
                    MTSP1 = 0;
                 }

                 if(rankscGrade.equals("A"))
                 {
                    SCSP1 = 4 ;
                 }
                 else if(rankscGrade.equals("B"))
                 {
                    SCSP1 = 3 ;
                 }
                 else if (rankscGrade.equals("C"))               
                 {
                    SCSP1 = 2;
                 }
                 else if(rankscGrade.equals("D"))        
                 {
                    SCSP1 = 1;
                 }
                 else 
                 {
                    SCSP1 = 0;
                 }
                 
                 
               int BMCH = 3;
               int BICH = 4;
               int MTCH = 6;
               int SCCH = 6;
               double totalSP = ((BMSP1*BMCH)+(BISP1*BICH)+(MTSP1*MTCH)+(SCSP1*SCCH));
               double totalCH = (BMCH + BICH + MTCH + SCCH);
               double gpa = totalSP/totalCH;
               String GPA = String.format("%.2f", gpa);
               ave1.setText(GPA);
               

               
               
                 
                

              }  
                
            }
        );
        tot.setBounds(10, 443, 76, 23);
        panel.add(tot);
        
        JTextArea res = new JTextArea();
        res.setBounds(10, 11, 184, 467);
        panel_1.add(res);
        
        JButton submit = new JButton("SUBMIT");
        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
                PrintWriter writer=null;
                res.setText("");
                res.append("SMK MELATI KOTA KINABALU\n"
                          +"*************************************\n"
                          +"NAME:         " + name1.getText()
                          +"\nSTUDENT ID: " + stu1.getText()
                          +"\nCLASS:      " + cls1.getText()
                          +"\nTEACHER:    " + tc1.getText()
                          +"\n*************************************"
                          +"\nRESULTS"
                          +""
                          +"\nMELAYU:     " + mel1.getText()
                          +"\nENGLISH:    " + eng1.getText()
                          +"\nMATHEMATICS:" + m31.getText()
                          +"\nSCIENCE:    " + sc1.getText()
                          +"\n~~~~~~~~~~~~~~~~~~~~~~~~~~"
                          +"\nTOTAL:      " + tot1.getText()
                          +"\nGPA:        " + ave1.getText()
                          +"\nBM's GRADE: " + rank1.getText()
                          +"\nBI's GRADE: " + rankbi.getText() 
                          +"\nMATHEMATICS's GRADE:" + rankmt.getText() 
                          +"\nSCIENCE's GRADE:" + ranksc.getText() 
                          +"\n~~~~~~~~~~~~~~~~~~~~~~~~~~"
                          +"\nCOMMENT:" + com1.getText());
                          
                          
    String name2= name1.getText();
    String stu2= stu1.getText();
    String cls2= cls1.getText();
    String tc2 =tc1.getText();
    String mel2 =mel1.getText();
    String eng2= eng1.getText();
    String m32 =m31.getText();
    String tot2 =tot1.getText();
    String ave2= ave1.getText();
    String sc2= sc1.getText();
    String rank22= rank1.getText();
    String rankbi2= rankbi.getText();
    String rankmt2 =rankmt.getText();
    String ranksc2 =ranksc.getText();
    String com2 =com1.getText();
                          
                          try
                          {
                              writer=new PrintWriter("List.txt");
                              writer.println("SMK MELATI KOTA KINABALU\n");
                              writer.println("*************************************\n");
                              writer.println("NAME:\t" + name2);
                              writer.println("\nSTUDENT ID:\t" + stu2);
                              writer.println("\nCLASS:\t" + cls2);
                              writer.println("\nTEACHER:\t" + tc2);
                              writer.println("\n*************************************");
                              writer.println("\nRESULTS");
                              writer.println("");
                              writer.println("\nMELAYU:\t" + mel2);
                              writer.println("\nENGLISH:\t" + eng2);
                              writer.println("\nMATHEMATICS:\t" + m32);
                              writer.println("\nSCIENCE:\t" + sc2);
                              writer.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~");
                              writer.println("\nTOTAL:\t" + tot2);
                              writer.println("\nGPA:\t" + ave1.getText());
                              writer.println("\nBM's GRADE:\t" + rank22);
                              writer.println("\nBI's GRADE:\t" + rankbi2 );
                              writer.println("\nBI's GRADE:\t" + rankmt2 );
                              writer.println("\nBI's GRADE:\t" + ranksc2 );
                              writer.println("\n~~~~~~~~~~~~~~~~~~~~~~~~~~" );
                              writer.println("\nCOMMENT:\t" + com2 );
                              writer.close();
                          }
                          catch (java.io.FileNotFoundException fnfe)
                          {
                              fnfe.printStackTrace();
                          }
     
                          data a = new data(name2, stu2, cls2, tc2, mel2, eng2, m32, tot2, ave2, sc2, rank22, rankbi2, rankmt2, ranksc2, com2);
                }
        });
        submit.setBounds(96, 443, 76, 23);
        panel.add(submit);
        
        
        
        
        
        
        JButton clear = new JButton("CLEAR");
        clear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            { 
                name1.setText("");
                stu1.setText("");
                cls1.setText("");
                tc1.setText("");
                mel1.setText("");
                eng1.setText("");
                m31.setText("");
                sc1.setText("");
                tot1.setText("");
                ave1.setText("");
                rank1.setText("");
                rank2.setText("");
                com1.setText("");
                res.setText("");
                rankbi.setText("");
                rankmt.setText("");
                ranksc.setText("");
        
            }
        });
        clear.setBounds(182, 443, 76, 23);
        panel.add(clear);
        
        JButton exit = new JButton("EXIT");
        exit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) 
            {
                System.exit(0);
            }
        });
        exit.setBounds(264, 443, 76, 23);
        panel.add(exit);
        
        
        
        
    }
}
