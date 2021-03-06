/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Jaideep
 */
public class AddCar extends javax.swing.JFrame {

    /**
     * Creates new form AddCar
     */
    public AddCar() {
        initComponents();
        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        int Current_Vehicle_ID=0;
        try
        {
          conn=DbConnection.connect();
          pstmt=conn.prepareStatement("Select max(Vehicle_ID) from cars;");
          rs=pstmt.executeQuery();
          while(rs.next())
          {
              Current_Vehicle_ID=rs.getInt("max(Vehicle_ID)");
          }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }  
        txtVehicle_ID.setText(Integer.toString(Current_Vehicle_ID+1));
        txtVehicle_ID.setEditable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtVehicle_ID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtYear = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtOID = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        rbtnCompact = new javax.swing.JRadioButton();
        rbtnMedium = new javax.swing.JRadioButton();
        rbtnLarge = new javax.swing.JRadioButton();
        rbtnSUV = new javax.swing.JRadioButton();
        rbtnTruck = new javax.swing.JRadioButton();
        rbtnVan = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        txtDR = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtWR = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Vehicle ID");

        jLabel2.setText("Model");

        jLabel3.setText("Year");

        jLabel4.setText("Owner ID");

        jLabel5.setText("Car Type");

        buttonGroup1.add(rbtnCompact);
        rbtnCompact.setText("Compact");

        buttonGroup1.add(rbtnMedium);
        rbtnMedium.setText("Medium");

        buttonGroup1.add(rbtnLarge);
        rbtnLarge.setText("Large");

        buttonGroup1.add(rbtnSUV);
        rbtnSUV.setText("SUV");

        buttonGroup1.add(rbtnTruck);
        rbtnTruck.setText("Truck");

        buttonGroup1.add(rbtnVan);
        rbtnVan.setText("Van");

        jLabel6.setText("Daily Rate");

        jLabel7.setText("Weekly Rate");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(txtOID))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtVehicle_ID)
                                    .addComponent(txtModel)
                                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtnCompact)
                                    .addComponent(rbtnSUV))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtnMedium)
                                    .addComponent(rbtnTruck))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(rbtnVan)
                                    .addComponent(rbtnLarge)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtWR)
                                    .addComponent(txtDR)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2)
                                        .addGap(0, 0, Short.MAX_VALUE)))))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtVehicle_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnCompact)
                    .addComponent(jLabel5)
                    .addComponent(rbtnMedium)
                    .addComponent(rbtnLarge))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnSUV)
                    .addComponent(rbtnTruck)
                    .addComponent(rbtnVan))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtWR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int Vehicle_ID= Integer.parseInt(txtVehicle_ID.getText());
        String Car_type="";
        String Model= txtModel.getText();
        int Year=Integer.parseInt(txtYear.getText());
        int OID= Integer.parseInt(txtOID.getText());
        int DR= Integer.parseInt(txtDR.getText());
        int WR= Integer.parseInt(txtWR.getText());
        if(rbtnCompact.isSelected())
            {
                Car_type="Compact";    
            }
            else if(rbtnMedium.isSelected())
            {
                Car_type="Medium";                
            }
            else if(rbtnLarge.isSelected())
            {
                Car_type="Large";               
            }
            else if(rbtnSUV.isSelected())
            {
                Car_type="SUV";                
            }
            else if(rbtnTruck.isSelected())
            {
                Car_type="Truck";                
            }
            else
            {
                Car_type="Van";                
            }  
        Connection conn=null;
        PreparedStatement pstmt=null;
        try
        {
            conn=DbConnection.connect();
            pstmt=conn.prepareStatement("insert into Cars(Vehicle_ID,Model,Year,OID,Car_type) values(?,?,?,?,?)");
            pstmt.setInt(1,Vehicle_ID);
            pstmt.setString(2,Model);
            pstmt.setInt(3,Year);
            pstmt.setInt(4,OID);
            pstmt.setString(5,Car_type);
            int a=pstmt.executeUpdate();
            int b=0;
            if(rbtnCompact.isSelected())
            {               
                conn=DbConnection.connect();
                pstmt=conn.prepareStatement("insert into compact values(?,?,?)");
                pstmt.setInt(1,Vehicle_ID);
                pstmt.setInt(2,DR);
                pstmt.setInt(3,WR);
                b=pstmt.executeUpdate();
            }
            else if(rbtnMedium.isSelected())
            {                
                conn=DbConnection.connect();
                pstmt=conn.prepareStatement("insert into medium values(?,?,?)");
                pstmt.setInt(1,Vehicle_ID);
                pstmt.setInt(2,DR);
                pstmt.setInt(3,WR);
                b=pstmt.executeUpdate();
            }
            else if(rbtnLarge.isSelected())
            {                
                conn=DbConnection.connect();
                pstmt=conn.prepareStatement("insert into large values(?,?,?)");
                pstmt.setInt(1,Vehicle_ID);
                pstmt.setInt(2,DR);
                pstmt.setInt(3,WR);
                b=pstmt.executeUpdate();
            }
            else if(rbtnSUV.isSelected())
            {               
                conn=DbConnection.connect();
                pstmt=conn.prepareStatement("insert into SUV values(?,?,?)");
                pstmt.setInt(1,Vehicle_ID);
                pstmt.setInt(2,DR);
                pstmt.setInt(3,WR);
                b=pstmt.executeUpdate();
            }
            else if(rbtnTruck.isSelected())
            {               
                conn=DbConnection.connect();
                pstmt=conn.prepareStatement("insert into Truck values(?,?,?)");
                pstmt.setInt(1,Vehicle_ID);
                pstmt.setInt(2,DR);
                pstmt.setInt(3,WR);
                b=pstmt.executeUpdate();
            }
            else
            {               
                conn=DbConnection.connect();
                pstmt=conn.prepareStatement("insert into van values(?,?,?)");
                pstmt.setInt(1,Vehicle_ID);
                pstmt.setInt(2,DR);
                pstmt.setInt(3,WR);
                b=pstmt.executeUpdate();
            }
            if(a>0&&b>0)
            {
                JOptionPane.showMessageDialog(null,"Record Added");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Record Not Added");
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            try
            {
                conn.close();
                pstmt.close();
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.hide();
        new Admin().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AddCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton rbtnCompact;
    private javax.swing.JRadioButton rbtnLarge;
    private javax.swing.JRadioButton rbtnMedium;
    private javax.swing.JRadioButton rbtnSUV;
    private javax.swing.JRadioButton rbtnTruck;
    private javax.swing.JRadioButton rbtnVan;
    private javax.swing.JTextField txtDR;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtOID;
    private javax.swing.JTextField txtVehicle_ID;
    private javax.swing.JTextField txtWR;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
