

package hgpi;
import java.sql.*;

public class ChangeBatch extends java.awt.Frame {

    /** Creates new form ChangeBatch */
    public ChangeBatch() {
        initComponents();
        try{
            Class.forName("com.mysql.jdbc.Driver");
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
        label10 = new java.awt.Label();
        label12 = new java.awt.Label();
        label13 = new java.awt.Label();
        button2 = new java.awt.Button();
        label14 = new java.awt.Label();
        txbid = new java.awt.TextField();
        txmr = new java.awt.TextField();
        label19 = new java.awt.Label();
        txto = new java.awt.TextField();
        label20 = new java.awt.Label();
        txfrm = new java.awt.TextField();
        button3 = new java.awt.Button();
        listbd = new java.awt.List();
        label15 = new java.awt.Label();
        fmissing = new java.awt.Label();
        fmissing1 = new java.awt.Label();
        label21 = new java.awt.Label();
        label22 = new java.awt.Label();
        txapt = new java.awt.TextField();

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
        label1.setText("CHANGE BATCH TIMINGS");
        add(label1);
        label1.setBounds(0, 40, 740, 80);

        label10.setAlignment(java.awt.Label.CENTER);
        label10.setBackground(java.awt.Color.blue);
        label10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label10.setForeground(java.awt.Color.white);
        label10.setText("BATCH ID");
        add(label10);
        label10.setBounds(90, 210, 170, 25);

        label12.setAlignment(java.awt.Label.CENTER);
        label12.setBackground(java.awt.Color.blue);
        label12.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label12.setForeground(java.awt.Color.white);
        label12.setText("CURRENT BATCH DETAILS");
        add(label12);
        label12.setBounds(90, 150, 470, 25);

        label13.setAlignment(java.awt.Label.CENTER);
        label13.setBackground(java.awt.Color.blue);
        label13.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label13.setForeground(java.awt.Color.white);
        label13.setText("BATCH DETAILS");
        add(label13);
        label13.setBounds(130, 260, 560, 25);

        button2.setBackground(java.awt.Color.red);
        button2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        button2.setForeground(java.awt.Color.blue);
        button2.setLabel("FIND");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        add(button2);
        button2.setBounds(530, 210, 110, 30);

        label14.setAlignment(java.awt.Label.CENTER);
        label14.setBackground(java.awt.Color.blue);
        label14.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label14.setForeground(java.awt.Color.white);
        label14.setText("REQUIRED TIMINGS");
        add(label14);
        label14.setBounds(90, 440, 270, 25);

        txbid.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txbid.setForeground(java.awt.Color.red);
        add(txbid);
        txbid.setBounds(320, 210, 170, 25);

        txmr.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txmr.setForeground(java.awt.Color.red);
        add(txmr);
        txmr.setBounds(320, 530, 60, 25);

        label19.setAlignment(java.awt.Label.CENTER);
        label19.setBackground(java.awt.Color.blue);
        label19.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label19.setForeground(java.awt.Color.white);
        label19.setText("AM/PM");
        add(label19);
        label19.setBounds(600, 490, 90, 25);

        txto.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txto.setForeground(java.awt.Color.red);
        add(txto);
        txto.setBounds(530, 490, 60, 25);

        label20.setAlignment(java.awt.Label.CENTER);
        label20.setBackground(java.awt.Color.blue);
        label20.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label20.setForeground(java.awt.Color.white);
        label20.setText("TO");
        add(label20);
        label20.setBounds(350, 490, 170, 25);

        txfrm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txfrm.setForeground(java.awt.Color.red);
        add(txfrm);
        txfrm.setBounds(280, 490, 60, 25);

        button3.setBackground(java.awt.Color.red);
        button3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        button3.setForeground(java.awt.Color.blue);
        button3.setLabel("CHANGE");
        button3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3ActionPerformed(evt);
            }
        });
        add(button3);
        button3.setBounds(470, 530, 110, 30);

        listbd.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        listbd.setForeground(java.awt.Color.red);
        add(listbd);
        listbd.setBounds(130, 290, 560, 60);

        label15.setAlignment(java.awt.Label.CENTER);
        label15.setBackground(java.awt.Color.blue);
        label15.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label15.setForeground(java.awt.Color.white);
        label15.setText("REQUIRED BATCH DETAILS");
        add(label15);
        label15.setBounds(90, 400, 480, 25);

        fmissing.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        fmissing.setForeground(java.awt.Color.white);
        fmissing.setText("Some fields are missing, please fill them!");
        fmissing.setVisible(false);
        add(fmissing);
        fmissing.setBounds(260, 360, 300, 25);

        fmissing1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        fmissing1.setForeground(java.awt.Color.white);
        fmissing1.setText("Some fields are missing, please fill them!");
        fmissing1.setVisible(false);
        add(fmissing1);
        fmissing1.setBounds(440, 440, 300, 20);

        label21.setAlignment(java.awt.Label.CENTER);
        label21.setBackground(java.awt.Color.blue);
        label21.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label21.setForeground(java.awt.Color.white);
        label21.setText("FROM");
        add(label21);
        label21.setBounds(90, 490, 170, 25);

        label22.setAlignment(java.awt.Label.CENTER);
        label22.setBackground(java.awt.Color.blue);
        label22.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label22.setForeground(java.awt.Color.white);
        label22.setText("AM/PM");
        add(label22);
        label22.setBounds(170, 530, 90, 25);

        txapt.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txapt.setForeground(java.awt.Color.red);
        txapt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txaptActionPerformed(evt);
            }
        });
        add(txapt);
        txapt.setBounds(700, 490, 60, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
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
            //PreparedStatement p=con.prepareStatement("select b.bid,bname,crsname,c.crsid,fname,fid,dos,doec from batches b,courses c,faculty f,batch_dates bd  where b.facid=f.fid and c.crsid=b.crsid and b.bid=bd.bid and b.bid=?");
            PreparedStatement p=con.prepareStatement("select b.bid,b.bname,fname,fid,c.crsid,c.crsname,bd.dos,bd.doec from batches b,faculty f,courses c,batch_dates bd where f.fid=b.facid and c.crsid=b.crsid and b.bid='"+txbid.getText()+"'");
            //p.setString(1,txbid.getText());
             
            ResultSet rs=p.executeQuery();
            if(rs.next())
            {
            listbd.add(rs.getInt("bid")+"      "+rs.getString("bname")+"      "+rs.getString("crsname")+"      "+rs.getInt("crsid")+"      "+rs.getString("fname")+"      "+rs.getInt("fid")+"      "+rs.getString("dos")+"      "+rs.getString("doec"));//         "+rs.getString(9)+"      "+rs.getString(10)+"       "+rs.getString(11));
        //listbd.add(rs.getInt(1)+" ");
            //listbd.add(rs.getInt("bid")+"      "+rs.getString("bname")+"      "+rs.getString("crsname")+"      "+rs.getInt("crsid")+"      "+rs.getString("fname")+"      "+rs.getInt("fid"));//         "+rs.getString(9)+"      "+rs.getString(10)+"       "+rs.getString(11));
        }}
        catch(Exception e)
        {
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_button2ActionPerformed

    private void button3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3ActionPerformed
        // TODO add your handling code here:

         
if((txfrm.getText()).equals("") || (txto.getText()).equals("") || (txmr.getText()).equals(""))
{
    fmissing1.setVisible(true);
}
else{
     int x=Integer.parseInt(txfrm.getText());
          int y=Integer.parseInt(txto.getText());
          String mer=txmr.getText();
          String mert=txapt.getText();
              fmissing1.setVisible(false);
        try{

            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hgpi_batches?zeroDateTimeBehavior=convertToNull","root","");
           // PreparedStatement p=con.prepareStatement("update batches set starttime=?,meridian=?,endtime=?,meridian_to=? where bid=? and starttime NOT IN (select facid from batches where bid=?) and endtime NOT IN (select facid from batches where bid=?)");
            PreparedStatement p=con.prepareStatement("update batches set starttime=?,meridian=?,endtime=?,meridian_to=? where bid=?");
            
            p.setInt(1,x);
            p.setString(2,mer);
            p.setInt(3,y);
            p.setString(4,mert);
            p.setInt(5,Integer.parseInt(txbid.getText()));
           // p.setInt(6,Integer.parseInt(txbid.getText()));
            //p.setInt(7,Integer.parseInt(txbid.getText()));
            p.executeUpdate();

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
      }
    }//GEN-LAST:event_button3ActionPerformed

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_formWindowLostFocus

    private void txaptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txaptActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txaptActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangeBatch().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button2;
    private java.awt.Button button3;
    private java.awt.Label fmissing;
    private java.awt.Label fmissing1;
    private java.awt.Label label1;
    private java.awt.Label label10;
    private java.awt.Label label12;
    private java.awt.Label label13;
    private java.awt.Label label14;
    private java.awt.Label label15;
    private java.awt.Label label19;
    private java.awt.Label label20;
    private java.awt.Label label21;
    private java.awt.Label label22;
    private java.awt.List listbd;
    private java.awt.TextField txapt;
    private java.awt.TextField txbid;
    private java.awt.TextField txfrm;
    private java.awt.TextField txmr;
    private java.awt.TextField txto;
    // End of variables declaration//GEN-END:variables

}
