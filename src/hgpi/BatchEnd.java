

package hgpi;
import java.sql.*;

public class BatchEnd extends java.awt.Frame {

    
    public BatchEnd() {
        initComponents();
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        txbid = new java.awt.TextField();
        label16 = new java.awt.Label();
        txdoc = new java.awt.TextField();
        labdat = new java.awt.Label();
        button2 = new java.awt.Button();
        button3 = new java.awt.Button();
        listbd = new java.awt.List();
        fmissing = new java.awt.Label();
        label19 = new java.awt.Label();
        label18 = new java.awt.Label();
        label21 = new java.awt.Label();
        label22 = new java.awt.Label();
        label23 = new java.awt.Label();
        label24 = new java.awt.Label();
        label25 = new java.awt.Label();
        label26 = new java.awt.Label();
        label27 = new java.awt.Label();
        label28 = new java.awt.Label();
        label29 = new java.awt.Label();
        lbid = new java.awt.Label();
        label30 = new java.awt.Label();

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
        label1.setText("BATCH COMPLETITION DETAILS");
        add(label1);
        label1.setBounds(0, 30, 740, 80);

        txbid.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txbid.setForeground(java.awt.Color.red);
        txbid.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txbidFocusGained(evt);
            }
        });
        add(txbid);
        txbid.setBounds(360, 170, 170, 25);

        label16.setAlignment(java.awt.Label.CENTER);
        label16.setBackground(java.awt.Color.blue);
        label16.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label16.setForeground(java.awt.Color.white);
        label16.setText("BATCH DETAILS");
        add(label16);
        label16.setBounds(100, 270, 510, 25);

        txdoc.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txdoc.setForeground(java.awt.Color.red);
        txdoc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txdocFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txdocFocusLost(evt);
            }
        });
        add(txdoc);
        txdoc.setBounds(360, 500, 170, 25);

        labdat.setAlignment(java.awt.Label.CENTER);
        labdat.setBackground(java.awt.Color.blue);
        labdat.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        labdat.setForeground(java.awt.Color.white);
        labdat.setText("mm-dd-yyyy");
        labdat.setVisible(false);
        add(labdat);
        labdat.setBounds(530, 500, 130, 25);

        button2.setBackground(java.awt.Color.red);
        button2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        button2.setForeground(java.awt.Color.blue);
        button2.setLabel("SEARCH");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        add(button2);
        button2.setBounds(360, 220, 90, 29);

        button3.setBackground(java.awt.Color.red);
        button3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        button3.setForeground(java.awt.Color.blue);
        button3.setLabel("OK");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        add(button3);
        button3.setBounds(280, 550, 120, 29);

        listbd.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        listbd.setForeground(java.awt.Color.red);
        add(listbd);
        listbd.setBounds(100, 290, 510, 180);

        fmissing.setAlignment(java.awt.Label.CENTER);
        fmissing.setBackground(java.awt.Color.orange);
        fmissing.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        fmissing.setForeground(java.awt.Color.white);
        fmissing.setText("SOME FIELDS ARE MISSING, PLEASE FILL THEM!");
        fmissing.setVisible(false);
        add(fmissing);
        fmissing.setBounds(130, 580, 430, 25);

        label19.setAlignment(java.awt.Label.CENTER);
        label19.setBackground(java.awt.Color.blue);
        label19.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label19.setForeground(java.awt.Color.white);
        label19.setText("BATCH ID");
        add(label19);
        label19.setBounds(120, 170, 170, 25);

        label18.setAlignment(java.awt.Label.CENTER);
        label18.setBackground(java.awt.Color.blue);
        label18.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label18.setForeground(java.awt.Color.white);
        label18.setText("9) DATE OF START");
        add(label18);
        label18.setBounds(610, 450, 210, 20);

        label21.setAlignment(java.awt.Label.CENTER);
        label21.setBackground(java.awt.Color.blue);
        label21.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label21.setForeground(java.awt.Color.white);
        label21.setText("BATCH DETAILS INDEX");
        add(label21);
        label21.setBounds(610, 270, 210, 20);

        label22.setAlignment(java.awt.Label.CENTER);
        label22.setBackground(java.awt.Color.blue);
        label22.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label22.setForeground(java.awt.Color.white);
        label22.setText("1)  BATCH ID");
        add(label22);
        label22.setBounds(610, 290, 210, 20);

        label23.setAlignment(java.awt.Label.CENTER);
        label23.setBackground(java.awt.Color.blue);
        label23.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label23.setForeground(java.awt.Color.white);
        label23.setText("      2) TOTAL STUDENTS");
        add(label23);
        label23.setBounds(610, 310, 210, 20);

        label24.setAlignment(java.awt.Label.CENTER);
        label24.setBackground(java.awt.Color.blue);
        label24.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label24.setForeground(java.awt.Color.white);
        label24.setText("    3) FACULTY NAME");
        add(label24);
        label24.setBounds(610, 330, 210, 20);

        label25.setAlignment(java.awt.Label.CENTER);
        label25.setBackground(java.awt.Color.blue);
        label25.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label25.setForeground(java.awt.Color.white);
        label25.setText("   4) COURSE NAME");
        add(label25);
        label25.setBounds(610, 350, 210, 20);

        label26.setAlignment(java.awt.Label.CENTER);
        label26.setBackground(java.awt.Color.blue);
        label26.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label26.setForeground(java.awt.Color.white);
        label26.setText("5) START TIME");
        add(label26);
        label26.setBounds(610, 370, 210, 20);

        label27.setAlignment(java.awt.Label.CENTER);
        label27.setBackground(java.awt.Color.blue);
        label27.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label27.setForeground(java.awt.Color.white);
        label27.setText("6) END TIME");
        add(label27);
        label27.setBounds(610, 390, 210, 20);

        label28.setAlignment(java.awt.Label.CENTER);
        label28.setBackground(java.awt.Color.blue);
        label28.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label28.setForeground(java.awt.Color.white);
        label28.setText("7) MERIDIEM");
        add(label28);
        label28.setBounds(610, 410, 210, 20);

        label29.setAlignment(java.awt.Label.CENTER);
        label29.setBackground(java.awt.Color.blue);
        label29.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label29.setForeground(java.awt.Color.white);
        label29.setText("8) CURRENT TOPIC");
        add(label29);
        label29.setBounds(610, 430, 210, 20);

        lbid.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lbid.setForeground(java.awt.Color.white);
        lbid.setText("ENTER A VALID BATCH, LOOK INTO BATCH MASTER LIST FOR SOME ASSISTANCE");
        lbid.setVisible(false);
        add(lbid);
        lbid.setBounds(370, 140, 470, 25);

        label30.setAlignment(java.awt.Label.CENTER);
        label30.setBackground(java.awt.Color.blue);
        label30.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label30.setForeground(java.awt.Color.white);
        label30.setText("DATE OF COMPLETITION");
        add(label30);
        label30.setBounds(80, 500, 210, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        listbd.removeAll();
        if((txbid.getText()).equals(""))
        {
            fmissing.setVisible(true);
        }
        else
        {
            fmissing.setVisible(false);
        try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hgpi_batches?zeroDateTimeBehavior=convertToNull","root","");
            PreparedStatement p=con.prepareStatement("select rtrim(b.bid),rtrim(bname),rtrim(totstu),rtrim(fname),rtrim(crsname),rtrim(starttime),rtrim(meridian),rtrim(endtime),rtrim(meridian_to),rtrim(ctopic),rtrim(dos) from batches b,courses c,faculty f,batch_dates bd  where b.facid=f.fid and c.crsid=b.crsid and b.bid=bd.bid and b.bid=?");
            p.setString(1,txbid.getText());
            ResultSet rs=p.executeQuery();
            rs.next();
            listbd.add(rs.getInt(1)+"      "+rs.getString(2)+"      "+rs.getInt(3)+"      "+rs.getString(4)+"      "+rs.getString(5)+"      "+rs.getInt(6)+"      "+rs.getString(7)+"      "+rs.getInt(8)+"         "+rs.getString(9)+"        "+rs.getString(10)+"          "+rs.getString(11));
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        }
}//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed

        if((txdoc.getText()).equals(""))
        {
            fmissing.setVisible(true);
        }
        else{
         try{
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hgpi_batches?zeroDateTimeBehavior=convertToNull","root","");
            PreparedStatement p=con.prepareStatement("update batch_dates set doac='?'where bid=?");
            p.setString(1,txdoc.getText());
            p.setInt(2,Integer.parseInt(txbid.getText()));
            p.executeUpdate();
         }
         catch(Exception e)
         {
             e.printStackTrace();
         }
        }
    }//GEN-LAST:event_button3ActionPerformed

    private void txdocFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txdocFocusGained
      
        labdat.setVisible(true);

    }//GEN-LAST:event_txdocFocusGained

    private void txdocFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txdocFocusLost
       
        labdat.setVisible(false);
    }//GEN-LAST:event_txdocFocusLost

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_formWindowLostFocus

    private void txbidFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txbidFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_txbidFocusGained

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BatchEnd().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Label fmissing;
    private java.awt.Label labdat;
    private java.awt.Label label1;
    private java.awt.Label label16;
    private java.awt.Label label18;
    private java.awt.Label label19;
    private java.awt.Label label21;
    private java.awt.Label label22;
    private java.awt.Label label23;
    private java.awt.Label label24;
    private java.awt.Label label25;
    private java.awt.Label label26;
    private java.awt.Label label27;
    private java.awt.Label label28;
    private java.awt.Label label29;
    private java.awt.Label label30;
    private java.awt.Label lbid;
    private java.awt.List listbd;
    private java.awt.TextField txbid;
    private java.awt.TextField txdoc;
    // End of variables declaration//GEN-END:variables

}
