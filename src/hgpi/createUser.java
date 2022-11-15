

package hgpi;
import java.sql.*;
/**
 *
 * @author CIET
 */
public class createUser extends java.awt.Frame {

    /** Creates new form createUser */
    public createUser() {
        initComponents();
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        usr = new java.awt.Label();
        usrc = new java.awt.Label();
        tfunm = new java.awt.TextField();
        tfpw = new java.awt.TextField();
        label4 = new java.awt.Label();
        chtype = new java.awt.Choice();
        submit = new java.awt.Button();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        fmissing = new java.awt.Label();

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
        label1.setText("CREATE USER"); // NOI18N
        add(label1);
        label1.setBounds(0, 10, 740, 60);

        usr.setAlignment(java.awt.Label.CENTER);
        usr.setBackground(java.awt.Color.orange);
        usr.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        usr.setForeground(java.awt.Color.white);
        usr.setText("username already exists"); // NOI18N
        usr.setVisible(false);
        add(usr);
        usr.setBounds(450, 360, 170, 30);

        usrc.setAlignment(java.awt.Label.CENTER);
        usrc.setBackground(java.awt.Color.orange);
        usrc.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        usrc.setForeground(java.awt.Color.white);
        usrc.setText("user created"); // NOI18N
        usrc.setVisible(false);
        add(usrc);
        usrc.setBounds(70, 360, 170, 30);

        tfunm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        tfunm.setForeground(java.awt.Color.red);
        tfunm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfunmActionPerformed(evt);
            }
        });
        add(tfunm);
        tfunm.setBounds(380, 140, 160, 30);

        tfpw.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        tfpw.setForeground(java.awt.Color.red);
        add(tfpw);
        tfpw.setBounds(380, 210, 160, 30);

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setBackground(java.awt.Color.blue);
        label4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label4.setForeground(java.awt.Color.white);
        label4.setText("PASSWORD"); // NOI18N
        add(label4);
        label4.setBounds(140, 210, 170, 30);

        chtype.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        chtype.setForeground(java.awt.Color.red);
        chtype.add("admin");
        chtype.add("staff");
        add(chtype);
        chtype.setBounds(380, 280, 160, 30);

        submit.setBackground(java.awt.Color.red);
        submit.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        submit.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        submit.setForeground(java.awt.Color.blue);
        submit.setLabel("Submit"); // NOI18N
        submit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitActionPerformed(evt);
            }
        });
        add(submit);
        submit.setBounds(300, 360, 110, 30);

        label5.setAlignment(java.awt.Label.CENTER);
        label5.setBackground(java.awt.Color.blue);
        label5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label5.setForeground(java.awt.Color.white);
        label5.setText("USERNAME"); // NOI18N
        add(label5);
        label5.setBounds(140, 140, 170, 30);

        label6.setAlignment(java.awt.Label.CENTER);
        label6.setBackground(java.awt.Color.blue);
        label6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label6.setForeground(java.awt.Color.white);
        label6.setText("TYPE"); // NOI18N
        add(label6);
        label6.setBounds(140, 280, 170, 30);

        fmissing.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        fmissing.setForeground(java.awt.Color.white);
        fmissing.setText("Some fields are missing, please fill them!");
        fmissing.setVisible(false);
        add(fmissing);
        fmissing.setBounds(430, 360, 300, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void tfunmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfunmActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_tfunmActionPerformed

    private void submitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitActionPerformed
       String x= tfunm.getText();
       String y= tfpw.getText();
       if((tfunm.getText()).equals("") || (tfpw.getText()).equals(""))
       {
           fmissing.setVisible(true);
       }
       else{
           fmissing.setVisible(false);
        try{
            Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hgpi_batches?zeroDateTimeBehavior=convertToNull","root","");
            PreparedStatement p=c.prepareStatement("select count(*) from users where uname=?");
             p.setString(1,x);
             ResultSet rs=p.executeQuery();
             rs.next();
             int m=rs.getInt(1);
             if(m==0)
             {
                 PreparedStatement ps=c.prepareStatement("insert into users values(?,?,?)");
             ps.setString(1,x);
             ps.setString(2,y);
             ps.setString(3,chtype.getSelectedItem());
             ps.executeUpdate();
             usrc.setVisible(true);

             }
             else
             {
                 usr.setVisible(true);
             }
            

        } catch(Exception e) {
            e.printStackTrace();
        }
       }
    }//GEN-LAST:event_submitActionPerformed

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_formWindowLostFocus

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new createUser().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Choice chtype;
    private java.awt.Label fmissing;
    private java.awt.Label label1;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Button submit;
    private java.awt.TextField tfpw;
    private java.awt.TextField tfunm;
    private java.awt.Label usr;
    private java.awt.Label usrc;
    // End of variables declaration//GEN-END:variables

}
