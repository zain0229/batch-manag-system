
package hgpi;
import java.sql.*;

public class Search extends java.awt.Frame {
    

    /** Creates new form Search */
    public Search() {
        initComponents();
       
        try{
        Class.forName("com.mysql.jdbc.Driver");
    }
        catch(Exception e)
        {
            e.printStackTrace();

        }


    }

    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        label3 = new java.awt.Label();
        button1 = new java.awt.Button();
        txfsnm = new java.awt.TextField();
        lstid = new java.awt.List();
        label4 = new java.awt.Label();
        label5 = new java.awt.Label();
        fmissing = new java.awt.Label();
        txt = new java.awt.Label();

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
        label1.setText("SEARCH STUDENT");
        add(label1);
        label1.setBounds(0, 40, 600, 60);

        label2.setAlignment(java.awt.Label.CENTER);
        label2.setBackground(java.awt.Color.gray);
        label2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label2.setForeground(java.awt.Color.white);
        label2.setText("CLICK ON STUDENT ID TO SEARCH");
        add(label2);
        label2.setBounds(490, 340, 280, 30);

        label3.setAlignment(java.awt.Label.CENTER);
        label3.setBackground(java.awt.Color.blue);
        label3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label3.setForeground(java.awt.Color.white);
        label3.setText("Search Student By:-");
        add(label3);
        label3.setBounds(150, 120, 260, 20);

        button1.setBackground(java.awt.Color.red);
        button1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        button1.setForeground(java.awt.Color.blue);
        button1.setLabel("SEARCH");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        add(button1);
        button1.setBounds(370, 250, 100, 29);

        txfsnm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txfsnm.setForeground(java.awt.Color.red);
        txfsnm.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txfsnmFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txfsnmFocusLost(evt);
            }
        });
        add(txfsnm);
        txfsnm.setBounds(270, 200, 200, 30);

        lstid.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lstid.setForeground(java.awt.Color.red);
        lstid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstidActionPerformed(evt);
            }
        });
        add(lstid);
        lstid.setBounds(570, 200, 120, 140);

        label4.setAlignment(java.awt.Label.CENTER);
        label4.setBackground(java.awt.Color.blue);
        label4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label4.setForeground(java.awt.Color.white);
        label4.setText("Student Name");
        add(label4);
        label4.setBounds(60, 200, 180, 30);

        label5.setAlignment(java.awt.Label.CENTER);
        label5.setBackground(java.awt.Color.blue);
        label5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label5.setForeground(java.awt.Color.white);
        label5.setText("Student ID");
        add(label5);
        label5.setBounds(560, 170, 140, 30);

        fmissing.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        fmissing.setForeground(java.awt.Color.white);
        fmissing.setText("Some fields are missing, please fill them!");
        fmissing.setVisible(false);
        add(fmissing);
        fmissing.setBounds(40, 250, 300, 25);

        txt.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txt.setForeground(java.awt.Color.white);
        txt.setText("ENTER A VALID STRING");
        txt.setVisible(false);
        add(txt);
        txt.setBounds(270, 160, 190, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
       if((txfsnm.getText()).equals(""))
       {
           fmissing.setVisible(true);
       }

       else{
           fmissing.setVisible(false);
         try
 {
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hgpi_batches?zeroDateTimeBehavior=convertToNull","root","");
            PreparedStatement p=null;
            ResultSet rs=null;
            
                p=con.prepareStatement("select sid from students where sname=?");
                p.setString(1,txfsnm.getText());
                rs=p.executeQuery();
               
                while(rs.next())
                {
                    lstid.add(rs.getString(1));
                }
              //txf3.setInt(1);
                
            
            
}
        catch(Exception e)
        {
            e.printStackTrace();

        }
       }
    }//GEN-LAST:event_button1ActionPerformed

    private void lstidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstidActionPerformed
        // TODO add your handling code here:
        int x=Integer.parseInt(lstid.getSelectedItem());
        SSearch_result ssr=new SSearch_result(x);
        ssr.setVisible(true);
        ssr.setBounds(370,80,900,650);
    }//GEN-LAST:event_lstidActionPerformed

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_formWindowLostFocus

    private void txfsnmFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfsnmFocusGained
        // TODO add your handling code here:
        txt.setVisible(true);
    }//GEN-LAST:event_txfsnmFocusGained

    private void txfsnmFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txfsnmFocusLost
        // TODO add your handling code here:
        txt.setVisible(false);
    }//GEN-LAST:event_txfsnmFocusLost

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Label fmissing;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.List lstid;
    private java.awt.TextField txfsnm;
    private java.awt.Label txt;
    // End of variables declaration//GEN-END:variables

}
