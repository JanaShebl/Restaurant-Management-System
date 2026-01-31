package restaurantmanagement;

import java.io.*;
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
public class Order_Manager extends javax.swing.JFrame {
    
  private int idToCancel; 
  private int orderId;
  private int CustId;
  private OrderDetails x;
  private Order y=new Order();
  
  
    public Order_Manager() {
        initComponents();
        loadTableData();
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); 
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        fName = new javax.swing.JTextField();
        mealName = new javax.swing.JLabel();
        fQuantity = new javax.swing.JTextField();
        mealQuantity = new javax.swing.JLabel();
        btnSaveItem = new javax.swing.JButton();
        makeId = new javax.swing.JLabel();
        fMakeId = new javax.swing.JTextField();
        btnCancle = new javax.swing.JButton();
        btnmakrOrder = new javax.swing.JButton();
        CustomerId = new javax.swing.JLabel();
        fCustId = new javax.swing.JTextField();
        fDeleteId = new javax.swing.JTextField();
        btnBille = new javax.swing.JButton();
        makeId1 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Resturant Order System");

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Meal_id", "Meal_Name", "Price"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ORDER SYSTEM");

        fName.addActionListener(this::fNameActionPerformed);

        mealName.setFont(new java.awt.Font("sansserif", 3, 18)); // NOI18N
        mealName.setForeground(new java.awt.Color(0, 153, 204));
        mealName.setText("Meal Name");

        fQuantity.addActionListener(this::fQuantityActionPerformed);

        mealQuantity.setFont(new java.awt.Font("sansserif", 3, 18)); // NOI18N
        mealQuantity.setForeground(new java.awt.Color(0, 153, 204));
        mealQuantity.setText("Quantity");

        btnSaveItem.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnSaveItem.setText("Save Item");
        btnSaveItem.addActionListener(this::btnSaveItemActionPerformed);

        makeId.setFont(new java.awt.Font("sansserif", 3, 18)); // NOI18N
        makeId.setForeground(new java.awt.Color(0, 153, 204));
        makeId.setText("Order Id");

        fMakeId.addActionListener(this::fMakeIdActionPerformed);

        btnCancle.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnCancle.setText("Delete Order");
        btnCancle.addActionListener(this::btnCancleActionPerformed);

        btnmakrOrder.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnmakrOrder.setText("make order");
        btnmakrOrder.addActionListener(this::btnmakrOrderActionPerformed);

        CustomerId.setFont(new java.awt.Font("sansserif", 3, 18)); // NOI18N
        CustomerId.setForeground(new java.awt.Color(0, 153, 204));
        CustomerId.setText("Customer Id");

        fCustId.addActionListener(this::fCustIdActionPerformed);

        fDeleteId.addActionListener(this::fDeleteIdActionPerformed);

        btnBille.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        btnBille.setText("Generate Bill");
        btnBille.addActionListener(this::btnBilleActionPerformed);

        makeId1.setFont(new java.awt.Font("sansserif", 3, 18)); // NOI18N
        makeId1.setForeground(new java.awt.Color(0, 153, 204));
        makeId1.setText("Order Id");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(makeId, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mealQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mealName, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(makeId1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CustomerId, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(fCustId)
                                    .addComponent(fMakeId, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .addComponent(fQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                    .addComponent(fName))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnmakrOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnSaveItem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fDeleteId, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnCancle))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(191, 191, 191)
                        .addComponent(btnBille)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(330, 330, 330)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(fName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(mealName))
                                        .addGap(19, 19, 19)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(mealQuantity)
                                            .addComponent(fQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(fDeleteId, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(makeId1)
                                            .addComponent(btnCancle, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(36, 36, 36))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(fMakeId, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(makeId))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CustomerId)
                                    .addComponent(fCustId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addComponent(btnBille, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(108, 108, 108))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(btnSaveItem, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(btnmakrOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private void loadTableData() {

    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("Meal_id");
    model.addColumn("Meal_Name");
    model.addColumn("Price");
    jTable1.setModel(model);

    try {
        
        File file = new File("meals.txt");
        Scanner sc = new Scanner(file);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] row = line.split(",");
            model.addRow(row);
        }

        sc.close();
    }
    catch (Exception e) {
        e.printStackTrace();
    }
}


    private void btnSaveItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveItemActionPerformed
 
        try {
                    String name = fName.getText();
                    String qtyText = fQuantity.getText();
                 
                    if (name.isEmpty() || qtyText.isEmpty()) {
                        JOptionPane.showMessageDialog(this, "Please, enter all Meal Details");
                    } else {
                        int Quantity = Integer.parseInt(qtyText);
                        if(Quantity>=5){
                            JOptionPane.showMessageDialog(this, "A surprise gift will be waiting for you when you pick up your order 🎉🎁");
                        }
                        else{
                            JOptionPane.showMessageDialog(this, "🎉 Congratulations! You have received a special offer on this order 🎁");
                        }
                        x = new OrderDetails(name, Quantity);
                        y.makeOrder(x);
                        fName.setText("");
                        fQuantity.setText("");
                        addMealIfExists(name, Quantity);
                    }
                } catch (IllegalArgumentException ex) {
                    JOptionPane.showMessageDialog(this, ex.getMessage(), "Input Error", JOptionPane.WARNING_MESSAGE);
                }
    }//GEN-LAST:event_btnSaveItemActionPerformed

    private void fQuantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fQuantityActionPerformed
        
    }//GEN-LAST:event_fQuantityActionPerformed

    private void fMakeIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fMakeIdActionPerformed
      
    }//GEN-LAST:event_fMakeIdActionPerformed

    private void fNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fNameActionPerformed
        
    }//GEN-LAST:event_fNameActionPerformed

    private void fCustIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fCustIdActionPerformed
        
    }//GEN-LAST:event_fCustIdActionPerformed

    private void fDeleteIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fDeleteIdActionPerformed
         
    }//GEN-LAST:event_fDeleteIdActionPerformed

    private void btnBilleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBilleActionPerformed
       try {
        String orderIdText = fMakeId.getText().trim();
        if(!orderIdText.matches("^[0-9]+$")){
                throw new IllegalArgumentException("Order must be contain only letters");
            }
        
        final String orderId = orderIdText; 
        
        java.awt.EventQueue.invokeLater(() -> {
            PaymentGUI paymentGUI = new PaymentGUI();
            paymentGUI.setVisible(true);
            paymentGUI.txtOrderId.setText(orderId);
            paymentGUI.btnLoadOrder.doClick();
        });
        this.dispose();
    } catch(IllegalArgumentException ex){
            JOptionPane.showMessageDialog(this,ex.getMessage(),"Input Error",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnBilleActionPerformed

    private void btnCancleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancleActionPerformed

  String idc=fDeleteId.getText();
        if ((idc+"").isEmpty() ) {
        JOptionPane.showMessageDialog(this, "Please, enter id for cancle");
        
    }
        else{
        idToCancel=Integer.parseInt(idc);
        Order.deleteOrderFromFile(idToCancel);
        fDeleteId.setText("");
        JOptionPane.showMessageDialog(this, "Deleted Successfully");
        }
        
    }//GEN-LAST:event_btnCancleActionPerformed

    private void btnmakrOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmakrOrderActionPerformed

  String i=fMakeId.getText();
        String w=fCustId.getText();
          if ((i+"").isEmpty()||(w+"").isEmpty()  ) {
        JOptionPane.showMessageDialog(this, "Please, enter idS to make order");
        
        }else{
        orderId=Integer.parseInt(i);
        CustId=Integer.parseInt(w);
        y.setCustomerId(CustId);
        y.setOrderId(orderId);
  
        try {
            
            y.saveOrder();
            
        } catch (FileNotFoundException ex) {
            System.getLogger(Order_Manager.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        }
    }//GEN-LAST:event_btnmakrOrderActionPerformed

    public static void main(String args[]) {
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
        java.awt.EventQueue.invokeLater(() -> new Order_Manager().setVisible(true));
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CustomerId;
    private javax.swing.JButton btnBille;
    private javax.swing.JButton btnCancle;
    private javax.swing.JButton btnSaveItem;
    private javax.swing.JButton btnmakrOrder;
    private javax.swing.JTextField fCustId;
    private javax.swing.JTextField fDeleteId;
    private javax.swing.JTextField fMakeId;
    private javax.swing.JTextField fName;
    private javax.swing.JTextField fQuantity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel makeId;
    private javax.swing.JLabel makeId1;
    private javax.swing.JLabel mealName;
    private javax.swing.JLabel mealQuantity;
    // End of variables declaration//GEN-END:variables
public void addMealIfExists(String mealName, int quantity) {
    String fileName = "meals.txt";  

    boolean found = false;

    try (Scanner sc = new Scanner(new File(fileName))) {
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] parts = line.split(",");

            if (parts.length >= 1) {
                String currentMealName = parts[1].trim();

                if (currentMealName.equalsIgnoreCase(mealName)) {
                    found = true;

                    x = new OrderDetails(mealName, quantity);
                    y.makeOrder(x);
                    fName.setText("");
                    fQuantity.setText("");
                    return;
                }
            }
        }

        if (!found) {
            JOptionPane.showMessageDialog(this,
                "Meal not found in the file!",
                "Error",
                JOptionPane.ERROR_MESSAGE);
        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(this,
            "Error reading meal file!",
            "File Error",
            JOptionPane.ERROR_MESSAGE);
    }
}

}
