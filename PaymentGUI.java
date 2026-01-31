package restaurantmanagement;

import java.io.File;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class PaymentGUI extends javax.swing.JFrame {
   
    public PaymentGUI() {
        initComponents();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); // Only closes itself
        txtOrderId.setText("");
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtOutput1 = new javax.swing.JTextArea();
        JblCustomerId = new javax.swing.JLabel();
        JblCustomername = new javax.swing.JLabel();
        JblCustomerPhone = new javax.swing.JLabel();
        JblCustomerEmail = new javax.swing.JLabel();
        txtOrderId = new javax.swing.JTextField();
        btnLoadOrder = new javax.swing.JButton();
        txtCustomerId = new javax.swing.JTextField();
        JblCustomerId1 = new javax.swing.JLabel();
        comboMethod = new javax.swing.JComboBox<>();
        btnProcess = new javax.swing.JButton();
        btnViewBill = new javax.swing.JButton();
        btnViewAll = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtOutput = new javax.swing.JTextArea();
        txtAmount = new javax.swing.JTextField();

        txtOutput1.setColumns(20);
        txtOutput1.setLineWrap(true);
        txtOutput1.setRows(5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resturant Payment System");
        setMinimumSize(new java.awt.Dimension(1050, 530));

        JblCustomerId.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        JblCustomerId.setForeground(new java.awt.Color(0, 153, 204));
        JblCustomerId.setText("PAYMENT SYSTEM");
        JblCustomerId.setToolTipText("");

        JblCustomername.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        JblCustomername.setForeground(new java.awt.Color(0, 153, 204));
        JblCustomername.setText("Customer ID");

        JblCustomerPhone.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        JblCustomerPhone.setForeground(new java.awt.Color(0, 153, 204));
        JblCustomerPhone.setText("Payment Method:");

        JblCustomerEmail.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        JblCustomerEmail.setForeground(new java.awt.Color(0, 153, 204));
        JblCustomerEmail.setText("SubTotal $");

        txtOrderId.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtOrderId.addActionListener(this::txtOrderIdActionPerformed);

        btnLoadOrder.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        btnLoadOrder.setText("Load Order");
        btnLoadOrder.addActionListener(this::btnLoadOrderActionPerformed);

        txtCustomerId.setEditable(false);
        txtCustomerId.setBackground(new java.awt.Color(153, 204, 255));
        txtCustomerId.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtCustomerId.addActionListener(this::txtCustomerIdActionPerformed);

        JblCustomerId1.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        JblCustomerId1.setForeground(new java.awt.Color(0, 153, 204));
        JblCustomerId1.setText("Enter Order ID ");
        JblCustomerId1.setToolTipText("");

        comboMethod.setFont(new java.awt.Font("Segoe Print", 1, 18)); // NOI18N
        comboMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Method", "CASH", "VISA" }));

        btnProcess.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnProcess.setText("Process Payment");
        btnProcess.addActionListener(this::btnProcessActionPerformed);

        btnViewBill.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnViewBill.setText("View Bill");
        btnViewBill.addActionListener(this::btnViewBillActionPerformed);

        btnViewAll.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnViewAll.setText("View All Bills");
        btnViewAll.addActionListener(this::btnViewAllActionPerformed);

        btnClear.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnClear.setText("Clear");
        btnClear.addActionListener(this::btnClearActionPerformed);

        txtOutput.setEditable(false);
        txtOutput.setColumns(20);
        txtOutput.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        txtOutput.setForeground(new java.awt.Color(51, 51, 51));
        txtOutput.setLineWrap(true);
        txtOutput.setRows(5);
        txtOutput.setMaximumSize(new java.awt.Dimension(460, 370));
        jScrollPane1.setViewportView(txtOutput);

        txtAmount.setEditable(false);
        txtAmount.setBackground(new java.awt.Color(153, 204, 255));
        txtAmount.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        txtAmount.addActionListener(this::txtAmountActionPerformed);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(55, 55, 55)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(JblCustomername)
                                                .addComponent(JblCustomerId1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addComponent(JblCustomerPhone, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(66, 66, 66)
                                        .addComponent(JblCustomerEmail)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtCustomerId, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                        .addComponent(txtAmount, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
                                        .addComponent(comboMethod, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(txtOrderId, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnProcess)
                                .addGap(18, 18, 18)
                                .addComponent(btnViewBill, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(12, 12, 12)
                                .addComponent(btnViewAll, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(btnLoadOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(353, 353, 353)
                        .addComponent(JblCustomerId)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAmount, txtCustomerId, txtOrderId});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(JblCustomerId)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JblCustomerId1)
                            .addComponent(txtOrderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(btnLoadOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JblCustomername)
                            .addComponent(txtCustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JblCustomerEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JblCustomerPhone))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnProcess, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewAll, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnViewBill, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtOrderIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOrderIdActionPerformed
    }//GEN-LAST:event_txtOrderIdActionPerformed

    private void txtCustomerIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerIdActionPerformed
    }//GEN-LAST:event_txtCustomerIdActionPerformed

    private void btnProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcessActionPerformed
    try {
        int orderId = Integer.parseInt(txtOrderId.getText().trim());
        int customerId = Integer.parseInt(txtCustomerId.getText().trim());
        double amount = Double.parseDouble(txtAmount.getText().trim());
        String method = (String) comboMethod.getSelectedItem();
        
        if (method.equals("Select Method")) {
            JOptionPane.showMessageDialog(this, 
                "Please select CASH or VISA!", 
                "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        Order order = new Order();
        order.setOrderId(orderId);
        order.setCustomerId(customerId);
        order.setTotalAmount(amount);
        
        Payment payment = new Payment(order);
        boolean success = payment.pay(method);
        
        if (success) {
            txtOutput.append("PAYMENT SUCCESSFUL!\n");
            txtOutput.append("Order ID: " + orderId + "\n");
            txtOutput.append("Customer ID: " + customerId + "\n");
            txtOutput.append("SubTotal: $" + String.format("%.2f", amount) + "\n");
            txtOutput.append("Total After Tax: $" + String.format("%.2f", payment.getFinalPrice()) + "\n");
            txtOutput.append("Method: " + method + "\n");
            txtOutput.append("-".repeat(40) + "\n");
            
            JOptionPane.showMessageDialog(this, 
                "Payment completed for Order " + orderId, 
                "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            txtOutput.append("PAYMENT FAILED\n");
            JOptionPane.showMessageDialog(this, 
                "Payment failed!", 
                "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, 
            "Please enter valid numbers!", 
            "Error", JOptionPane.ERROR_MESSAGE);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, 
            "Error: " + e.getMessage(), 
            "System Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnProcessActionPerformed

    private void btnViewBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBillActionPerformed
    try {
        int orderId = Integer.parseInt(txtOrderId.getText().trim());
        int customerId = Integer.parseInt(txtCustomerId.getText().trim());
        double amount = Double.parseDouble(txtAmount.getText().trim());
        String method = (String) comboMethod.getSelectedItem();
        
        Order order = new Order();
        order.setOrderId(orderId);
        order.setCustomerId(customerId);
        order.setTotalAmount(amount);
        
        Payment payment = new Payment(order);
        
        txtOutput.append("\n===== BILL =====\n");
        txtOutput.append("Order ID: " + orderId + "\n");
        txtOutput.append("Customer ID: " + customerId + "\n");
        txtOutput.append("SubTotal: $" + String.format("%.2f", amount) + "\n");
        txtOutput.append("Total After Tax: $" + String.format("%.2f", payment.getFinalPrice()) + "\n");
        txtOutput.append("Method: " + method + "\n");
        txtOutput.append("-".repeat(40) + "\n");
        
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, 
            "Please load an order first!", 
            "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnViewBillActionPerformed

    private void btnViewAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllActionPerformed
        txtOutput.setText("");
        txtOutput.append("===== ALL Bills =====\n");
        txtOutput.append("-".repeat(50) + "\n");
    
        try {
            File file = new File("payments.txt");
        
            if (!file.exists()) {
                txtOutput.append("No payments file found.\n");
                txtOutput.append("Process a payment first to create the file.\n");
                return;
            }
        
            java.util.Scanner scanner = new java.util.Scanner(file);
            int lineCount = 0;
        
            while (scanner.hasNextLine()) {
                txtOutput.append(scanner.nextLine() + "\n");
                lineCount++;
                }
            scanner.close();
              
        } catch (Exception e) {
            txtOutput.append("ERROR reading file: " + e.getMessage() + "\n");
        }
    }//GEN-LAST:event_btnViewAllActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtOrderId.setText("");
        txtCustomerId.setText("");
        txtAmount.setText("");
        comboMethod.setSelectedIndex(0);
        txtOutput.setText("");
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnLoadOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoadOrderActionPerformed
try {
        int orderId = Integer.parseInt(txtOrderId.getText().trim());
        
        String[] orderDetails = Order.findOrderDetails(orderId);
        
        if (orderDetails[0].equals("NOT_FOUND") || orderDetails[0].equals("ERROR")) {
            JOptionPane.showMessageDialog(this, 
                "Order " + orderId + " not found!", 
                "Not Found", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String amountStr = orderDetails[1];
        double amount = Double.parseDouble(amountStr);
        txtCustomerId.setText(orderDetails[0]);  // Customer ID
        txtAmount.setText(orderDetails[1]);      // Amount
        
        // Show message
        txtOutput.append("Order " + orderId + " loaded\n");
        txtOutput.append("Customer: " + orderDetails[0] + "\n");
        txtOutput.append("Subtotal: $" + orderDetails[1] + "\n");
        txtOutput.append("Total After Tax: $" + String.format("%.2f", amount * 1.14) + "\n");
        txtOutput.append("Select payment method and click Process Payment\n");
        txtOutput.append("-".repeat(40) + "\n");
        
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, 
            "Error: " + e.getMessage(), 
            "System Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnLoadOrderActionPerformed

    private void txtAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAmountActionPerformed
    }//GEN-LAST:event_txtAmountActionPerformed
    public static void main(String args[]) {
        //To Make the Nimbus View When Running GUI
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PaymentGUI().setVisible(true);}
        });
    } 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JblCustomerEmail;
    private javax.swing.JLabel JblCustomerId;
    private javax.swing.JLabel JblCustomerId1;
    private javax.swing.JLabel JblCustomerPhone;
    private javax.swing.JLabel JblCustomername;
    private javax.swing.JButton btnClear;
    public javax.swing.JButton btnLoadOrder;
    private javax.swing.JButton btnProcess;
    private javax.swing.JButton btnViewAll;
    private javax.swing.JButton btnViewBill;
    private javax.swing.JComboBox<String> comboMethod;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtCustomerId;
    public javax.swing.JTextField txtOrderId;
    private javax.swing.JTextArea txtOutput;
    private javax.swing.JTextArea txtOutput1;
    // End of variables declaration//GEN-END:variables
}