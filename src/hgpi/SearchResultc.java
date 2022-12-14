
package hgpi;


import java.sql.*;
public class SearchResultc extends java.awt.Frame {

    /** Creates new form SearchResultc */
    static int crsid,facid,bid,start,end,maxc;
    static String crsname,facnm,frq,ctop,mer;
    //start,end,mer,frq,ctop,maxc
    //cid,cnm,faid,fnme,bi,start,end,mer,frq,ctop,maxc
    public SearchResultc(String cnm) {
        initComponents();
        crsname=cnm;
   /*     cid=crsid;
        cnm=crsname;
        fid=facid;
        fnm=facnm;
        bid=bi;
        start=strt;
        end=endtym;
        mer=meridian;
        frq=frqn;
        ctop=ctopic;
        maxc=maxcap;*/
        try{
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hgpi_batches?zeroDateTimeBehavior=convertToNull","root","");
          //  PreparedStatement p=c.prepareStatement("select rtrim(bid),rtrim(bname),rtrim(crsname),rtrim(fname),rtrim(totstu),rtrim(starttime),rtrim(meridian),rtrim(endtime),rtrim(meridian_to),rtrim(frqncy),rtrim(ctopic),rtrim(maxcap) from batches b,courses c,faculty f where b.crsid= c.crsid and crsname=? and f.fid=b.facid");
            PreparedStatement p=c.prepareStatement("select rtrim(bid),rtrim(bname),rtrim(crsname),rtrim(fname),rtrim(totstu),rtrim(starttime),rtrim(meridian),rtrim(endtime),rtrim(meridian_to),rtrim(frqncy),rtrim(ctopic),rtrim(maxcap) from batches b,courses c,faculty f where b.crsid= c.crsid and crsname=? and f.fid=b.facid");
            p.setString(1,crsname);
            ResultSet rs=p.executeQuery();

            while(rs.next())
            {
               int bid=rs.getInt(1);
               String bnm=rs.getString(2);
               String cnm2=rs.getString(3);
               String fnme=rs.getString(4);
               int totstu=rs.getInt(5);
               int start=rs.getInt(6);
               String mer=rs.getString(7);
               int end=rs.getInt(8);
               String mert=rs.getString(9);
               String frq=rs.getString(10);
               String ctop=rs.getString(11);
               String maxc=rs.getString(12);
               lstcrs.add(bid+"           "+bnm+"            "+cnm2+"            "+fnme+"            "+totstu+"             "+start+"             "+mer+"               "+end+"             "+mert+"            "+frq+"             "+ctop+"             "+maxc);
        
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        lstcrs = new java.awt.List();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        label9 = new java.awt.Label();
        label10 = new java.awt.Label();
        label11 = new java.awt.Label();
        label12 = new java.awt.Label();
        label13 = new java.awt.Label();
        label14 = new java.awt.Label();
        label15 = new java.awt.Label();
        label16 = new java.awt.Label();
        label17 = new java.awt.Label();
        button2 = new java.awt.Button();
        label18 = new java.awt.Label();

        setBackground(java.awt.Color.orange);
        setUndecorated(true);
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(null);

        label1.setAlignment(java.awt.Label.CENTER);
        label1.setBackground(java.awt.Color.red);
        label1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        label1.setForeground(java.awt.Color.white);
        label1.setText("SEARCH RESULT FOR COURSE");
        add(label1);
        label1.setBounds(0, 40, 600, 60);

        lstcrs.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lstcrs.setForeground(java.awt.Color.red);
        add(lstcrs);
        lstcrs.setBounds(70, 200, 450, 100);

        label5.setAlignment(java.awt.Label.CENTER);
        label5.setBackground(java.awt.Color.blue);
        label5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label5.setForeground(java.awt.Color.white);
        label5.setText("4) FACULTY NAME"); // NOI18N
        add(label5);
        label5.setBounds(70, 380, 450, 25);

        label6.setAlignment(java.awt.Label.CENTER);
        label6.setBackground(java.awt.Color.blue);
        label6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label6.setForeground(java.awt.Color.white);
        label6.setText("COURSE DETAILS"); // NOI18N
        add(label6);
        label6.setBounds(70, 180, 450, 25);

        label7.setAlignment(java.awt.Label.CENTER);
        label7.setBackground(java.awt.Color.blue);
        label7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label7.setForeground(java.awt.Color.white);
        label7.setText("COURSE DETAIL INDEX"); // NOI18N
        add(label7);
        label7.setBounds(70, 300, 450, 25);

        label8.setAlignment(java.awt.Label.CENTER);
        label8.setBackground(java.awt.Color.blue);
        label8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label8.setForeground(java.awt.Color.white);
        label8.setText("1) BATCH ID"); // NOI18N
        add(label8);
        label8.setBounds(70, 320, 450, 25);

        label9.setAlignment(java.awt.Label.CENTER);
        label9.setBackground(java.awt.Color.blue);
        label9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label9.setForeground(java.awt.Color.white);
        label9.setText("2) BATCH NAME"); // NOI18N
        add(label9);
        label9.setBounds(70, 340, 450, 25);

        label10.setAlignment(java.awt.Label.CENTER);
        label10.setBackground(java.awt.Color.blue);
        label10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label10.setForeground(java.awt.Color.white);
        label10.setText("11) MAXIMUM CAPACITY"); // NOI18N
        add(label10);
        label10.setBounds(70, 540, 450, 25);

        label11.setAlignment(java.awt.Label.CENTER);
        label11.setBackground(java.awt.Color.blue);
        label11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label11.setForeground(java.awt.Color.white);
        label11.setText("3) COURSE NAME"); // NOI18N
        add(label11);
        label11.setBounds(70, 360, 450, 25);

        label12.setAlignment(java.awt.Label.CENTER);
        label12.setBackground(java.awt.Color.blue);
        label12.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label12.setForeground(java.awt.Color.white);
        label12.setText("5) TOTAL STUDENTS"); // NOI18N
        add(label12);
        label12.setBounds(70, 400, 450, 25);

        label13.setAlignment(java.awt.Label.CENTER);
        label13.setBackground(java.awt.Color.blue);
        label13.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label13.setForeground(java.awt.Color.white);
        label13.setText("6) START TIME"); // NOI18N
        add(label13);
        label13.setBounds(70, 420, 450, 25);

        label14.setAlignment(java.awt.Label.CENTER);
        label14.setBackground(java.awt.Color.blue);
        label14.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label14.setForeground(java.awt.Color.white);
        label14.setText("8) MERIDIEM (AM/PM)"); // NOI18N
        add(label14);
        label14.setBounds(70, 480, 450, 25);

        label15.setAlignment(java.awt.Label.CENTER);
        label15.setBackground(java.awt.Color.blue);
        label15.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label15.setForeground(java.awt.Color.white);
        label15.setText("8) MERIDIEM (AM/PM)"); // NOI18N
        add(label15);
        label15.setBounds(70, 440, 450, 25);

        label16.setAlignment(java.awt.Label.CENTER);
        label16.setBackground(java.awt.Color.blue);
        label16.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label16.setForeground(java.awt.Color.white);
        label16.setText("9) FREQUECY"); // NOI18N
        add(label16);
        label16.setBounds(70, 500, 450, 25);

        label17.setAlignment(java.awt.Label.CENTER);
        label17.setBackground(java.awt.Color.blue);
        label17.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label17.setForeground(java.awt.Color.white);
        label17.setText("10) CURRENT TOPIC"); // NOI18N
        add(label17);
        label17.setBounds(70, 520, 450, 25);

        button2.setBackground(java.awt.Color.red);
        button2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        button2.setForeground(java.awt.Color.blue);
        button2.setLabel("OK");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        add(button2);
        button2.setBounds(290, 580, 120, 29);

        label18.setAlignment(java.awt.Label.CENTER);
        label18.setBackground(java.awt.Color.blue);
        label18.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label18.setForeground(java.awt.Color.white);
        label18.setText("7) END TIME"); // NOI18N
        add(label18);
        label18.setBounds(70, 460, 450, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_formWindowLostFocus

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
}//GEN-LAST:event_button2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SearchResultc(crsname).setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button2;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label11;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label14;
    private java.awt.Label label15;
    private java.awt.Label label16;
    private java.awt.Label label17;
    private java.awt.Label label18;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private java.awt.List lstcrs;
    // End of variables declaration//GEN-END:variables

}
