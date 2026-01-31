package restaurantmanagement;

import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ManageEmployeeJFrame extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(ManageEmployeeJFrame.class.getName());

    public ManageEmployeeJFrame() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Only closes itself
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtPass = new javax.swing.JTextField();
        Btn1 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage employee form");

        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 204));
        jLabel2.setText("Name:");

        jLabel3.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 204));
        jLabel3.setText("Password:");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        txtPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassActionPerformed(evt);
            }
        });

        Btn1.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        Btn1.setForeground(new java.awt.Color(51, 51, 51));
        Btn1.setText("Add");
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });

        Btn2.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        Btn2.setForeground(new java.awt.Color(51, 51, 51));
        Btn2.setText("Delete");
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });

        Btn3.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        Btn3.setForeground(new java.awt.Color(51, 51, 51));
        Btn3.setText("Update");
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });

        Btn4.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        Btn4.setForeground(new java.awt.Color(51, 51, 51));
        Btn4.setText("Search");
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });

        Btn5.setFont(new java.awt.Font("sansserif", 3, 12)); // NOI18N
        Btn5.setForeground(new java.awt.Color(51, 51, 51));
        Btn5.setText("List");
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(Btn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(Btn2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn3)
                .addGap(18, 18, 18)
                .addComponent(Btn5)
                .addGap(31, 31, 31))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(txtID)
                            .addComponent(jLabel1)
                            .addComponent(txtName)
                            .addComponent(txtPass, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(Btn4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(8, 8, 8)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn1)
                    .addComponent(Btn2)
                    .addComponent(Btn3)
                    .addComponent(Btn5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Btn4)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPassActionPerformed
    Admin admin = new Admin(1, "haneen", "adminpass", 1);
    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
        try {
            int id = Integer.parseInt(txtID.getText());

            if ((id + "").isEmpty()) {
                JOptionPane.showMessageDialog(this, "Please, enter employee ID");
            }
            int flag = JOptionPane.showConfirmDialog(this, "Do you want to delete this employee ?", "Confirme delete", JOptionPane.YES_NO_OPTION);
            if (flag == JOptionPane.YES_OPTION) {

                boolean deleted = admin.deleteEmployee(id);
                if (deleted) {
                    JOptionPane.showMessageDialog(this, "Employee deleted successfully");
                } else {
                    JOptionPane.showMessageDialog(this, "Employee not found!");
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_Btn2ActionPerformed
// Add employee
    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
        try {
            int id = Integer.parseInt(txtID.getText());
            String name = txtName.getText();
            String pass = txtPass.getText();

            if (name.isEmpty() || pass.isEmpty() || (id + "").isEmpty() || name.matches(".\\d.")) {
                JOptionPane.showMessageDialog(this, "Please, fill all fields and enter valied information", "Error", JOptionPane.ERROR_MESSAGE);
            } else if (admin.employeeExists(id)) {
                JOptionPane.showMessageDialog(this, "Employee ID already exists! Please use a different ID.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                admin.addEmployee(id, name, pass);
                JOptionPane.showMessageDialog(this, "Employee added successfully");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error" + e.getMessage(),
                    "Error", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_Btn1ActionPerformed
  
    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        try {
            String sid = txtID.getText();
            if (!sid.matches("\\d+")) {
                throw new IllegalArgumentException("ID must be contain only numbers");
            }

            String returnedEmp = admin.searchEmployee(Integer.parseInt(txtID.getText()));
            if (returnedEmp != null) {
                JOptionPane.showMessageDialog(this, returnedEmp);
            } else {
                JOptionPane.showMessageDialog(this, "ID not found");
            }

        } catch (IllegalArgumentException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Input Error", JOptionPane.WARNING_MESSAGE);
        }

    }//GEN-LAST:event_Btn4ActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed
 
    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        try {
            int id = Integer.parseInt(txtID.getText());
            String name = txtName.getText();
            String pass = txtPass.getText();
            if (name.isEmpty() || pass.isEmpty() || (id + "").isEmpty()) {
                JOptionPane.showMessageDialog(this, "Empty field!");
            }
            int flag = JOptionPane.showConfirmDialog(this, "Do you want to update this employee ?", "Confirme delete", JOptionPane.YES_NO_OPTION);
            if (flag == JOptionPane.YES_OPTION) {
                if (admin.updateEmployeeInfo(id, name, pass)) {
                    JOptionPane.showMessageDialog(this, "Employee updated successfully");
                } else {
                    JOptionPane.showMessageDialog(this, "Employee not found!");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_Btn3ActionPerformed
    // list Employee
    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
        ArrayList<String> employees = admin.listEmployees();
        StringBuilder s = new StringBuilder();
        for (String e : employees) {
            s.append(e).append("\n");
        }
        JOptionPane.showMessageDialog(this, s.toString());
    }//GEN-LAST:event_Btn5ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new ManageEmployeeJFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPass;
    // End of variables declaration//GEN-END:variables
}
