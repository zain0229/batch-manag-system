

package hgpi;
import java.sql.*;


public class ChangeTime extends java.awt.Frame {

    /** Creates new form ChangeTime */
    public ChangeTime() {
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
        label7 = new java.awt.Label();
        lblb3 = new java.awt.Label();
        txstnm = new java.awt.TextField();
        label9 = new java.awt.Label();
        txbchid = new java.awt.TextField();
        GO = new java.awt.Button();
        find = new java.awt.Button();
        label10 = new java.awt.Label();
        txampm = new java.awt.TextField();
        label11 = new java.awt.Label();
        txtfrom = new java.awt.TextField();
        label12 = new java.awt.Label();
        label13 = new java.awt.Label();
        txtcfac = new java.awt.TextField();
        label14 = new java.awt.Label();
        txtfrom1 = new java.awt.TextField();
        label15 = new java.awt.Label();
        txtto2 = new java.awt.TextField();
        liststdnt = new java.awt.List();
        label16 = new java.awt.Label();
        label17 = new java.awt.Label();
        label18 = new java.awt.Label();
        txbnm = new java.awt.TextField();
        txtto1 = new java.awt.TextField();
        txttopic = new java.awt.TextField();
        label19 = new java.awt.Label();
        lstbdet = new java.awt.List();
        lstbid = new java.awt.List();
        lblbid = new java.awt.Label();
        lblbdet = new java.awt.Label();
        label20 = new java.awt.Label();
        txtcc = new java.awt.TextField();
        label8 = new java.awt.Label();
        txampm1 = new java.awt.TextField();
        label21 = new java.awt.Label();
        fmissing = new java.awt.Label();
        txampmto = new java.awt.TextField();

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
        label1.setText("CHANGE STUDENT TIMINGS");
        add(label1);
        label1.setBounds(0, 40, 740, 80);

        label7.setAlignment(java.awt.Label.CENTER);
        label7.setBackground(java.awt.Color.blue);
        label7.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label7.setForeground(java.awt.Color.white);
        label7.setText("CURRENT COURSE");
        add(label7);
        label7.setBounds(580, 380, 170, 25);

        lblb3.setAlignment(java.awt.Label.CENTER);
        lblb3.setBackground(java.awt.Color.gray);
        lblb3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblb3.setForeground(java.awt.Color.white);
        lblb3.setText("DOUBLE CLICK ON ID TO CHOOSE BATCH");
        lblb3.setVisible(false);
        add(lblb3);
        lblb3.setBounds(490, 690, 350, 25);

        txstnm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txstnm.setForeground(java.awt.Color.red);
        add(txstnm);
        txstnm.setBounds(320, 130, 170, 25);

        label9.setAlignment(java.awt.Label.CENTER);
        label9.setBackground(java.awt.Color.blue);
        label9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label9.setForeground(java.awt.Color.white);
        label9.setText("CURRENT BATCH ID");
        add(label9);
        label9.setBounds(80, 190, 170, 25);

        txbchid.setEditable(false);
        txbchid.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txbchid.setForeground(java.awt.Color.red);
        add(txbchid);
        txbchid.setBounds(320, 190, 170, 25);

        GO.setBackground(java.awt.Color.red);
        GO.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        GO.setForeground(java.awt.Color.blue);
        GO.setLabel("GO");
        GO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GOActionPerformed(evt);
            }
        });
        add(GO);
        GO.setBounds(510, 130, 50, 30);

        find.setBackground(java.awt.Color.red);
        find.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        find.setForeground(java.awt.Color.blue);
        find.setLabel("FIND");
        find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findActionPerformed(evt);
            }
        });
        add(find);
        find.setBounds(390, 640, 80, 30);

        label10.setAlignment(java.awt.Label.CENTER);
        label10.setBackground(java.awt.Color.blue);
        label10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label10.setForeground(java.awt.Color.white);
        label10.setText("CURRENT DETAILS:-"); // NOI18N
        add(label10);
        label10.setBounds(80, 310, 450, 25);

        txampm.setEditable(false);
        txampm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txampm.setForeground(java.awt.Color.red);
        add(txampm);
        txampm.setBounds(440, 370, 60, 25);

        label11.setAlignment(java.awt.Label.CENTER);
        label11.setBackground(java.awt.Color.blue);
        label11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label11.setForeground(java.awt.Color.white);
        label11.setText("TIMING TO"); // NOI18N
        add(label11);
        label11.setBounds(80, 420, 170, 25);

        txtfrom.setEditable(false);
        txtfrom.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtfrom.setForeground(java.awt.Color.red);
        add(txtfrom);
        txtfrom.setBounds(320, 370, 60, 25);

        label12.setAlignment(java.awt.Label.CENTER);
        label12.setBackground(java.awt.Color.blue);
        label12.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label12.setForeground(java.awt.Color.white);
        label12.setText("TIMING FROM"); // NOI18N
        add(label12);
        label12.setBounds(80, 370, 170, 25);

        label13.setAlignment(java.awt.Label.CENTER);
        label13.setBackground(java.awt.Color.blue);
        label13.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label13.setForeground(java.awt.Color.white);
        label13.setText("REQUIRED DETAILS:-"); // NOI18N
        add(label13);
        label13.setBounds(80, 530, 450, 25);

        txtcfac.setEditable(false);
        txtcfac.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtcfac.setForeground(java.awt.Color.red);
        add(txtcfac);
        txtcfac.setBounds(320, 480, 180, 25);

        label14.setAlignment(java.awt.Label.CENTER);
        label14.setBackground(java.awt.Color.blue);
        label14.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label14.setForeground(java.awt.Color.white);
        label14.setText("MERIDIEM(AM/PM)"); // NOI18N
        add(label14);
        label14.setBounds(80, 680, 170, 25);

        txtfrom1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtfrom1.setForeground(java.awt.Color.red);
        add(txtfrom1);
        txtfrom1.setBounds(320, 590, 60, 25);

        label15.setAlignment(java.awt.Label.CENTER);
        label15.setBackground(java.awt.Color.blue);
        label15.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label15.setForeground(java.awt.Color.white);
        label15.setText("TIMING FROM"); // NOI18N
        add(label15);
        label15.setBounds(80, 590, 170, 25);

        txtto2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtto2.setForeground(java.awt.Color.red);
        add(txtto2);
        txtto2.setBounds(320, 640, 60, 25);

        liststdnt.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        liststdnt.setForeground(java.awt.Color.red);
        liststdnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                liststdntActionPerformed(evt);
            }
        });
        add(liststdnt);
        liststdnt.setBounds(680, 170, 110, 130);

        label16.setAlignment(java.awt.Label.CENTER);
        label16.setBackground(java.awt.Color.blue);
        label16.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label16.setForeground(java.awt.Color.white);
        label16.setText("STUDENT NAME");
        add(label16);
        label16.setBounds(80, 130, 170, 25);

        label17.setAlignment(java.awt.Label.CENTER);
        label17.setBackground(java.awt.Color.blue);
        label17.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label17.setForeground(java.awt.Color.white);
        label17.setText("STUDENT ID");
        add(label17);
        label17.setBounds(680, 140, 110, 25);

        label18.setAlignment(java.awt.Label.CENTER);
        label18.setBackground(java.awt.Color.blue);
        label18.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label18.setForeground(java.awt.Color.white);
        label18.setText("CURRENT BATCH NAME");
        add(label18);
        label18.setBounds(80, 250, 180, 25);

        txbnm.setEditable(false);
        txbnm.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txbnm.setForeground(java.awt.Color.red);
        add(txbnm);
        txbnm.setBounds(320, 250, 170, 25);

        txtto1.setEditable(false);
        txtto1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtto1.setForeground(java.awt.Color.red);
        add(txtto1);
        txtto1.setBounds(320, 420, 60, 25);

        txttopic.setEditable(false);
        txttopic.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txttopic.setForeground(java.awt.Color.red);
        add(txttopic);
        txttopic.setBounds(580, 480, 160, 20);

        label19.setAlignment(java.awt.Label.CENTER);
        label19.setBackground(java.awt.Color.blue);
        label19.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label19.setForeground(java.awt.Color.white);
        label19.setText("CURRENT FACULTY");
        add(label19);
        label19.setBounds(80, 480, 170, 25);

        lstbdet.setVisible(false);
        add(lstbdet);
        lstbdet.setBounds(610, 600, 280, 80);

        lstbid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lstbidActionPerformed(evt);
            }
        });
        add(lstbid);
        lstbid.setBounds(500, 600, 80, 80);

        lblbid.setAlignment(java.awt.Label.CENTER);
        lblbid.setBackground(java.awt.Color.blue);
        lblbid.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblbid.setForeground(java.awt.Color.white);
        lblbid.setText("BATCH ID");
        lblbid.setVisible(false);
        add(lblbid);
        lblbid.setBounds(500, 570, 90, 25);

        lblbdet.setAlignment(java.awt.Label.CENTER);
        lblbdet.setBackground(java.awt.Color.blue);
        lblbdet.setEnabled(false);
        lblbdet.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        lblbdet.setForeground(java.awt.Color.white);
        lblbdet.setText("BATCH DETAILS");
        lblbdet.setVisible(false);
        add(lblbdet);
        lblbdet.setBounds(610, 570, 170, 25);

        label20.setAlignment(java.awt.Label.CENTER);
        label20.setBackground(java.awt.Color.gray);
        label20.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label20.setForeground(java.awt.Color.white);
        label20.setText("DOUBLE CLICK ON ID");
        add(label20);
        label20.setBounds(650, 300, 170, 25);

        txtcc.setEditable(false);
        txtcc.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txtcc.setForeground(java.awt.Color.red);
        add(txtcc);
        txtcc.setBounds(580, 410, 160, 25);

        label8.setAlignment(java.awt.Label.CENTER);
        label8.setBackground(java.awt.Color.blue);
        label8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label8.setForeground(java.awt.Color.white);
        label8.setText("CURRENT TOPIC");
        add(label8);
        label8.setBounds(580, 450, 170, 25);

        txampm1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txampm1.setForeground(java.awt.Color.red);
        add(txampm1);
        txampm1.setBounds(320, 680, 60, 25);

        label21.setAlignment(java.awt.Label.CENTER);
        label21.setBackground(java.awt.Color.blue);
        label21.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        label21.setForeground(java.awt.Color.white);
        label21.setText("TIMING TO"); // NOI18N
        add(label21);
        label21.setBounds(80, 640, 170, 25);

        fmissing.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        fmissing.setForeground(java.awt.Color.white);
        fmissing.setText("Some fields are missing, please fill them!");
        fmissing.setVisible(false);
        add(fmissing);
        fmissing.setBounds(590, 530, 300, 25);

        txampmto.setEditable(false);
        txampmto.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        txampmto.setForeground(java.awt.Color.red);
        add(txampmto);
        txampmto.setBounds(440, 420, 60, 25);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void GOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GOActionPerformed
        // TODO add your handling code here:
        liststdnt.removeAll();
        if((txstnm.getText()).equals(""))
        {
            fmissing.setVisible(true);
        }
        else
        {
        try{
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hgpi_batches?zeroDateTimeBehavior=convertToNull","root","");
         PreparedStatement p=con.prepareStatement("select sid from students where sname=?");
         p.setString(1,txstnm.getText());
         ResultSet rs=p.executeQuery();
         while(rs.next())
         {
             liststdnt.add(Integer.toString(rs.getInt(1)));
         }
          }
                   catch(Exception e)
        {
            e.printStackTrace();
        }

        }
    }//GEN-LAST:event_GOActionPerformed

    private void liststdntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_liststdntActionPerformed
        // TODO add your handling code here:

         try{
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hgpi_batches?zeroDateTimeBehavior=convertToNull","root","");
         PreparedStatement p=con.prepareStatement("select b.bid,b.bname,f.fname,starttime,meridian,endtime,meridian_to,ctopic,crsname from students s,faculty f,batches b,courses c where c.crsid=b.crsid and b.bid=s.bid and f.fid=b.facid and sid=?");
         p.setString(1,liststdnt.getSelectedItem());
         ResultSet rs=p.executeQuery();
         rs.next();
         
          txbchid.setText(Integer.toString(rs.getInt(1)));
           txbnm.setText(rs.getString(2));
            txtcfac.setText(rs.getString(3));
             txtfrom.setText(Integer.toString(rs.getInt(4)));
              txampm.setText(rs.getString(5));
             txtto1.setText(Integer.toString(rs.getInt(6)));
            txampmto.setText(rs.getString(7));
             txttopic.setText(rs.getString(8));
         txtcc.setText(rs.getString(9));
          }
                   catch(Exception e)
        {
            e.printStackTrace();
        }


    }//GEN-LAST:event_liststdntActionPerformed
                    
    private void findActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findActionPerformed
        // TODO add your handling code here:
        if((txtfrom1.getText()).equals("") || (txtto2.getText()).equals("") || (txampm1.getText()).equals(""))
        {

            fmissing.setVisible(true);
        }
        else{
        lblb3.setVisible(true);
        lblbdet.setVisible(true);
        lblbid.setVisible(true);
        lstbdet.setVisible(true);
        lstbid.setVisible(true);
        try{
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hgpi_batches?zeroDateTimeBehavior=convertToNull","root","");
         PreparedStatement p=con.prepareStatement("select bid,bname,totstu,fname,crsname,starttime,meridian,endtime,meridian_to,ctopic from batches b,courses c,faculty f   where b.facid=f.fid and c.crsid=b.crsid and c.crsname=? and meridian=? and meridian_to=? and starttime>=? and endtime<=? and ctopic=? and totstu<maxcap");
         /*select bid,bname,totstu,fname,crsname,starttime,
          endtime,meridian,ctopic from batches b,courses c,faculty f
          where b.facid=f.fid and c.crsid=b.crsid and
          c.crsname=? and meridian=? and fname=? and starttime>=?
          and endtime<=? and ctopic=?
          */


         p.setString(1, txtcc.getText());
         p.setString(2, txampm1.getText() );
          p.setString(3, txampmto.getText());
         p.setInt(4, Integer.parseInt(txtfrom1.getText()));
         p.setInt(5, Integer.parseInt(txtto2.getText()));
         p.setString(6, txttopic.getText());
         ResultSet r=p.executeQuery();
         while(r.next())
         {
             //System.out.println("inside");
             lstbid.add(Integer.toString(r.getInt(1)));
             lstbdet.add(r.getString(2)+"  "+r.getInt(3)+"  "+r.getString(4)+"   "+r.getString(5)+"   "+r.getInt(6)+"    "+r.getInt(7)+"    "+r.getString(8)+"   "+r.getString(9));
         }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        }
    }//GEN-LAST:event_findActionPerformed

    private void lstbidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lstbidActionPerformed
        // TODO add your handling code here:
        try{
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hgpi_batches?zeroDateTimeBehavior=convertToNull","root","");
         PreparedStatement p=con.prepareStatement("update batches set totstu=totstu-1 where bid=?");
         p.setString(1,lstbid.getSelectedItem());
         p.executeUpdate();
        }
          catch(Exception e)
        {
            e.printStackTrace();
        }
         try{
              Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hgpi_batches?zeroDateTimeBehavior=convertToNull","root","");
         PreparedStatement p=con.prepareStatement("update students set bid=? where sid=?");
         p.setString(1,lstbid.getSelectedItem());
         p.setString(2,liststdnt.getSelectedItem());
         p.executeUpdate();
        }
          catch(Exception e)
        {
            e.printStackTrace();
        }

    }//GEN-LAST:event_lstbidActionPerformed

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
                new ChangeTime().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button GO;
    private java.awt.Button find;
    private java.awt.Label fmissing;
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
    private java.awt.Label label19;
    private java.awt.Label label20;
    private java.awt.Label label21;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private java.awt.Label label9;
    private java.awt.Label lblb3;
    private java.awt.Label lblbdet;
    private java.awt.Label lblbid;
    private java.awt.List liststdnt;
    private java.awt.List lstbdet;
    private java.awt.List lstbid;
    private java.awt.TextField txampm;
    private java.awt.TextField txampm1;
    private java.awt.TextField txampmto;
    private java.awt.TextField txbchid;
    private java.awt.TextField txbnm;
    private java.awt.TextField txstnm;
    private java.awt.TextField txtcc;
    private java.awt.TextField txtcfac;
    private java.awt.TextField txtfrom;
    private java.awt.TextField txtfrom1;
    private java.awt.TextField txtto1;
    private java.awt.TextField txtto2;
    private java.awt.TextField txttopic;
    // End of variables declaration//GEN-END:variables

}
