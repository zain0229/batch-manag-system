

package hgpi;


public class newBatchnext extends java.awt.Frame {
static int bid;
static String crs;
    /** Creates new form newBatchnext */
    public newBatchnext(int id,String crsnm) {
        initComponents();
        crs=crsnm;
        bid=id;
    }

 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new java.awt.Label();
        button1 = new java.awt.Button();
        button2 = new java.awt.Button();

        setBackground(java.awt.Color.orange);
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

        label1.setBackground(java.awt.Color.orange);
        label1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        label1.setForeground(java.awt.Color.white);
        label1.setText("Do you wish to enter some more students in the batch?");
        add(label1);
        label1.setBounds(100, 100, 490, 50);

        button1.setBackground(java.awt.Color.red);
        button1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        button1.setForeground(java.awt.Color.blue);
        button1.setLabel("yes");
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });
        add(button1);
        button1.setBounds(180, 180, 100, 30);

        button2.setBackground(java.awt.Color.red);
        button2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        button2.setForeground(java.awt.Color.blue);
        button2.setLabel("no");
        button2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2ActionPerformed(evt);
            }
        });
        add(button2);
        button2.setBounds(330, 180, 100, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /** Exit the Application */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        // TODO add your handling code here:
        Register r=new Register(bid,crs);
        r.setVisible(true);
        r.setBounds(365,60,900,700);
        this.dispose();
    }//GEN-LAST:event_button1ActionPerformed

    private void button2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
}//GEN-LAST:event_button2ActionPerformed

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
                new newBatchnext(bid,crs).setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private java.awt.Button button2;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables

}
