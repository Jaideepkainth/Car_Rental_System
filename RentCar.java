/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package car;

import com.toedter.calendar.JDateChooser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jaideep
 */
public class RentCar extends javax.swing.JFrame {

    /**
     * Creates new form RentCar
     */
    public RentCar() {
        initComponents();
        txtN_Weeks.setVisible(false);
        lblN_Weeks.setVisible(false);
        txtN_Days.setVisible(false);
        lblN_Days.setVisible(false);
        JDateChooser date123=null;
        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        int Current_Rent_ID=0;
        try
        {
          conn=DbConnection.connect();
          pstmt=conn.prepareStatement("Select max(Rent_ID) from rentals;");
          rs=pstmt.executeQuery();
          while(rs.next())
          {
              Current_Rent_ID=rs.getInt("max(Rent_ID)");
          }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }  
        txtRentID.setText(Integer.toString(Current_Rent_ID+1));
        txtRentID.setEditable(false);
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
        txtRentID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rbtnDR = new javax.swing.JRadioButton();
        rbtnWR = new javax.swing.JRadioButton();
        lblN_Days = new javax.swing.JLabel();
        txtN_Days = new javax.swing.JTextField();
        lblN_Weeks = new javax.swing.JLabel();
        txtN_Weeks = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCustID = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        date123 = new org.jdesktop.swingx.JXDatePicker();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("RentID");

        jLabel2.setText("Select car on:");

        buttonGroup1.add(rbtnDR);
        rbtnDR.setText("Daily Rate");
        rbtnDR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnDRActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtnWR);
        rbtnWR.setText("Weekly Rate");
        rbtnWR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnWRActionPerformed(evt);
            }
        });

        lblN_Days.setText("Number of Days");

        lblN_Weeks.setText("Number of Weeks");

        jLabel5.setText("Start Date");

        jButton1.setText("Show Available Cars");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel7.setText("CustomerID");

        jButton2.setText("Book");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "VehicleID", "Model", "Year", "Owner ID", "Car Type", "Daily Rate", "Weekly Rate"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table);

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(lblN_Days)
                            .addComponent(lblN_Weeks)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7))
                        .addGap(77, 77, 77)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtCustID)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                            .addComponent(txtRentID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(rbtnDR)
                                .addGap(18, 18, 18)
                                .addComponent(rbtnWR))
                            .addComponent(txtN_Days, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtN_Weeks, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(date123, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 545, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCustID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRentID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(rbtnDR)
                    .addComponent(rbtnWR))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblN_Days)
                    .addComponent(txtN_Days, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblN_Weeks)
                    .addComponent(txtN_Weeks, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(date123, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnDRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnDRActionPerformed
        txtN_Weeks.setVisible(false);
        lblN_Weeks.setVisible(false);
        txtN_Days.setVisible(true);
        lblN_Days.setVisible(true);
    }//GEN-LAST:event_rbtnDRActionPerformed

    private void rbtnWRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnWRActionPerformed
        txtN_Weeks.setVisible(true);
        lblN_Weeks.setVisible(true);
        txtN_Days.setVisible(false);
        lblN_Days.setVisible(false);
    }//GEN-LAST:event_rbtnWRActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int RentID=Integer.parseInt(txtRentID.getText());
        int Ndays=0,Nweeks=0,Amount=0;
        int DRC =5,WRC=6;
        int row = table.getSelectedRow();
        int DR = Integer.parseInt(table.getModel().getValueAt(row, DRC).toString());
        int WR = Integer.parseInt(table.getModel().getValueAt(row, WRC).toString());
        if(rbtnDR.isSelected())
        {
            Ndays=Integer.parseInt(txtN_Days.getText());
        }
        else
        {
            Nweeks=Integer.parseInt(txtN_Weeks.getText());
        }
        DateFormat df= new SimpleDateFormat("yyyy-MM-dd");
        String SD=df.format(date123.getDate());   
        String rd="";
        try 
        {
            if(rbtnDR.isSelected())
             {
              Calendar c = Calendar.getInstance();
              c.setTime(df.parse(SD));
              c.add(Calendar.DATE, Ndays-1);
              rd= df.format(c.getTime());
              Amount=DR*Ndays;
             }
            else
             {
              Calendar c = Calendar.getInstance();
              c.setTime(df.parse(SD));
              c.add(Calendar.DATE, Nweeks+6);
              rd= df.format(c.getTime()); 
              Amount=WR*Nweeks;
             }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }  
        int CarID=Integer.parseInt(table.getModel().getValueAt(row,0).toString());
        int CustID=Integer.parseInt(txtCustID.getText());
        Connection conn=null;
        int a=0,b=0,c=0;
        PreparedStatement pstmt=null;
        try
        {
            conn=DbConnection.connect();
            pstmt=conn.prepareStatement("insert into Rentals values(?,?,?,?)");
            pstmt.setInt(1,RentID);
            Date myDate = df.parse(SD);
            java.sql.Date sqlDate = new java.sql.Date(myDate.getTime());
            pstmt.setDate(2, sqlDate);
            Date myDate2 = df.parse(rd);
            java.sql.Date sqlDate2 = new java.sql.Date(myDate2.getTime());
            pstmt.setDate(3, sqlDate2);
            pstmt.setInt(4,Amount);
            a=pstmt.executeUpdate();
            if(rbtnDR.isSelected())
             {
              conn=DbConnection.connect();
              pstmt=conn.prepareStatement("insert into daily values(?,?)");
              pstmt.setInt(1,Ndays);
              pstmt.setInt(2,RentID);
              b=pstmt.executeUpdate();
             }
            else
             {
              conn=DbConnection.connect();
              pstmt=conn.prepareStatement("insert into weekly values(?,?)");
              pstmt.setInt(1,Nweeks);
              pstmt.setInt(2,RentID);
              b=pstmt.executeUpdate();
             }
              conn=DbConnection.connect();
              pstmt=conn.prepareStatement("insert into rented values(?,?,?)");
              pstmt.setInt(1,CustID);
              pstmt.setInt(2,CarID);
              pstmt.setInt(3,RentID);
              c=pstmt.executeUpdate();
            if(a>0&&b>0&&c>0)
            {
                JOptionPane.showMessageDialog(null,"Booked");
            }
            else
            {
                 JOptionPane.showMessageDialog(null,"Not Booked");
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
            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DateFormat df= new SimpleDateFormat("yyyy-MM-dd");
        String SD=df.format(date123.getDate());   
        String rd="";
        int Ndays;
        int Nweeks;
        try 
        {
            if(rbtnDR.isSelected())
             {
              Ndays=Integer.parseInt(txtN_Days.getText());   
              Calendar c = Calendar.getInstance();
              c.setTime(df.parse(SD));
              c.add(Calendar.DATE, Ndays-1);
              rd= df.format(c.getTime());
             }
            else
             {
              Nweeks=Integer.parseInt(txtN_Weeks.getText());
              Calendar c = Calendar.getInstance();
              c.setTime(df.parse(SD));
              c.add(Calendar.DATE, Nweeks+6);
              rd= df.format(c.getTime());
             }
        } 
        catch (Exception e) 
        {
            e.printStackTrace();
        }
        System.out.println(SD);
        System.out.println(rd);
        
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        int VehicleID=0,Year=0,OID=0,DR=0,WR=0;
        String Model="",Car_type="";
        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;
        ArrayList al=null;
        try
        {
          conn=DbConnection.connect();
          pstmt=conn.prepareStatement("select Vehicle_ID,Model,Year,OID,car_type,Daily_Rate,Weekly_Rate from cars as c natural join (select mid as Vehicle_ID, mdr as Daily_Rate, mwr as Weekly_rate from medium union all select * from compact union all select * from large union all select * from suv union all select * from van union all select * from truck) as d where Vehicle_ID IN (select Vehicle_ID from rented as rd ,rentals as rs where Start_Date not between ? and ? and Return_Date not between ? and ? and ? not between Start_Date and Return_Date and ? not between Start_Date and Return_Date and rd.Rent_ID=rs.Rent_ID) order by Vehicle_ID;");
          Date startdate = df.parse(SD);
          java.sql.Date SD1 = new java.sql.Date(startdate.getTime());
          Date returndate = df.parse(rd);
          java.sql.Date RD1 = new java.sql.Date(returndate.getTime());
          pstmt.setDate(1, SD1);
          pstmt.setDate(2, RD1);
          pstmt.setDate(3, SD1);
          pstmt.setDate(4, RD1);
          pstmt.setDate(5, SD1);
          pstmt.setDate(6, RD1);
          rs=pstmt.executeQuery();
          while(rs.next())
          {
              VehicleID=rs.getInt("Vehicle_ID");
              Model=rs.getString("Model");
              Year=rs.getInt("Year");
              OID=rs.getInt("OID");
              Car_type=rs.getString("Car_type");
              DR=rs.getInt("Daily_Rate");
              WR=rs.getInt("Weekly_Rate");
              model.addRow(new Object[]{VehicleID,Model,Year,OID,Car_type,DR,WR});
          }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.hide();
        new Customer().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(RentCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RentCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RentCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RentCar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RentCar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private org.jdesktop.swingx.JXDatePicker date123;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblN_Days;
    private javax.swing.JLabel lblN_Weeks;
    private javax.swing.JRadioButton rbtnDR;
    private javax.swing.JRadioButton rbtnWR;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCustID;
    private javax.swing.JTextField txtN_Days;
    private javax.swing.JTextField txtN_Weeks;
    private javax.swing.JTextField txtRentID;
    // End of variables declaration//GEN-END:variables
}
