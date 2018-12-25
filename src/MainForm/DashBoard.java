/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainForm;

import ClassData.LoginUser;
import Entity.Product;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.xy.IntervalXYDataset;
import org.jfree.data.xy.XYBarDataset;
import org.jfree.data.xy.XYSeries;
import org.jfree.data.xy.XYSeriesCollection;

/**
 *
 * @author KIENDINH
 */
public class DashBoard extends javax.swing.JFrame {

    /**
     * Creates new form DashBoard
     */
    public DashBoard() {
        initComponents();
        this.setLocationRelativeTo(null);
//
//        if (LoginUser.User.getIsadmin() != 1) {
//            btnEmp.setVisible(false);
//        }
        JFreeChart barChart = ChartFactory.createBarChart("Doanh thu tháng gần nhất", "Category", "Score",
                createDataset(),
                PlotOrientation.HORIZONTAL,
                true, true, false);

        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        dashPanel.setLayout(new java.awt.BorderLayout());
        dashPanel.add(chartPanel, BorderLayout.CENTER);
        dashPanel.validate();
        //setContentPane(chartPanel);
        // chart.setVisible( true ); 
    }

    private CategoryDataset createDataset() {
        final String doanhthu = "REVENUE";
        final String soluong = "AMOUNT";
       
        final String[] Product =  {"IPhone XS","GALAXY S10","GALAXY S9","DELL LATITUDE E6420"};
        //final Product[] data = {}; 
        final double[] data = {1.2,3.5,2,4};
        final String GalaxyS10 = "Galaxy S10";
        final String GalaxyS9 = "Galaxy S9";
        final DefaultCategoryDataset dataset
                = new DefaultCategoryDataset();
        for(int i = 0;i<Product.length;i++)
        {
            dataset.addValue(data[i], doanhthu, Product[i]);
        }
        return dataset;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        lbCheck = new javax.swing.JLabel();
        btnEmp = new javax.swing.JPanel();
        btnEmployee = new javax.swing.JLabel();
        btnCustomer = new javax.swing.JPanel();
        btnEmployee1 = new javax.swing.JLabel();
        btnOrder = new javax.swing.JPanel();
        btnEmployee2 = new javax.swing.JLabel();
        btnChangeProfile = new javax.swing.JButton();
        dashPanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 153, 255));
        jLabel9.setText("MANAGEMENT");

        lbCheck.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCheck.setForeground(new java.awt.Color(255, 0, 51));

        btnEmp.setBackground(new java.awt.Color(45, 118, 232));
        btnEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEmpMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnEmpMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnEmpMouseExited(evt);
            }
        });

        btnEmployee.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnEmployee.setText("Employee manager");

        javax.swing.GroupLayout btnEmpLayout = new javax.swing.GroupLayout(btnEmp);
        btnEmp.setLayout(btnEmpLayout);
        btnEmpLayout.setHorizontalGroup(
            btnEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnEmpLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnEmployee)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnEmpLayout.setVerticalGroup(
            btnEmpLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnEmpLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(btnEmployee)
                .addContainerGap())
        );

        btnCustomer.setBackground(new java.awt.Color(45, 118, 232));
        btnCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCustomerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCustomerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCustomerMouseExited(evt);
            }
        });

        btnEmployee1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEmployee1.setForeground(new java.awt.Color(255, 255, 255));
        btnEmployee1.setText("Customer manager");

        javax.swing.GroupLayout btnCustomerLayout = new javax.swing.GroupLayout(btnCustomer);
        btnCustomer.setLayout(btnCustomerLayout);
        btnCustomerLayout.setHorizontalGroup(
            btnCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnCustomerLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnEmployee1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnCustomerLayout.setVerticalGroup(
            btnCustomerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnCustomerLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(btnEmployee1)
                .addContainerGap())
        );

        btnOrder.setBackground(new java.awt.Color(45, 118, 232));
        btnOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrderMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOrderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOrderMouseExited(evt);
            }
        });

        btnEmployee2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnEmployee2.setForeground(new java.awt.Color(255, 255, 255));
        btnEmployee2.setText("Order manager");

        javax.swing.GroupLayout btnOrderLayout = new javax.swing.GroupLayout(btnOrder);
        btnOrder.setLayout(btnOrderLayout);
        btnOrderLayout.setHorizontalGroup(
            btnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnOrderLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnEmployee2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        btnOrderLayout.setVerticalGroup(
            btnOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, btnOrderLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addComponent(btnEmployee2)
                .addContainerGap())
        );

        btnChangeProfile.setText("Chane profile infomation");
        btnChangeProfile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnChangeProfileMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnOrder, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCustomer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnChangeProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(210, 210, 210)
                                    .addComponent(lbCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addGap(89, 89, 89)
                                    .addComponent(jLabel9))))
                        .addGap(0, 10, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(btnEmp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(49, 49, 49)
                .addComponent(lbCheck)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnChangeProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(156, 156, 156))
        );

        dashPanel.setBackground(new java.awt.Color(153, 153, 255));

        javax.swing.GroupLayout dashPanelLayout = new javax.swing.GroupLayout(dashPanel);
        dashPanel.setLayout(dashPanelLayout);
        dashPanelLayout.setHorizontalGroup(
            dashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 954, Short.MAX_VALUE)
        );
        dashPanelLayout.setVerticalGroup(
            dashPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dashPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(dashPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpMouseClicked

        if (LoginUser.User.getIsadmin() == 1) {
            if (LoginUser.Employee == null) {
                LoginUser.Employee = new EmployeeFrm();
            }
            LoginUser.Employee.setVisible(true);
        }

//        this.setEnabled(false);
////        JDialog dialog = new JDialog(x, true);
////
////        dialog.setVisible(true);
    }//GEN-LAST:event_btnEmpMouseClicked
    private void setColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(0, 51, 255));
    }

    private void resetColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(45, 118, 232));
    }
    private void btnEmpMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpMouseEntered
        // TODO add your handling code here:
        setColor(btnEmp);
    }//GEN-LAST:event_btnEmpMouseEntered

    private void btnEmpMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEmpMouseExited
        // TODO add your handling code here:
        resetColor(btnEmp);
    }//GEN-LAST:event_btnEmpMouseExited

    private void btnCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerMouseClicked
        CustomerFrm x = new CustomerFrm();
        x.setVisible(true);
    }//GEN-LAST:event_btnCustomerMouseClicked

    private void btnCustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerMouseEntered
        // TODO add your handling code here:
        setColor(btnCustomer);
    }//GEN-LAST:event_btnCustomerMouseEntered

    private void btnCustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerMouseExited
        // TODO add your handling code here:
        resetColor(btnCustomer);
    }//GEN-LAST:event_btnCustomerMouseExited

    private void btnOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderMouseClicked
        // TODO add your handling code here:
        if (LoginUser.Order == null) {
            LoginUser.Order = new OrderFrm();

        }
        LoginUser.Order.setVisible(true);
    }//GEN-LAST:event_btnOrderMouseClicked

    private void btnOrderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderMouseEntered
        // TODO add your handling code here:
        setColor(btnOrder);
    }//GEN-LAST:event_btnOrderMouseEntered

    private void btnOrderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderMouseExited
        // TODO add your handling code here:
        resetColor(btnOrder);
    }//GEN-LAST:event_btnOrderMouseExited

    private void btnChangeProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnChangeProfileMouseClicked
        // TODO add your handling code here:
        ProfileInformation p = new  ProfileInformation();
        p.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        p.setVisible(true);
    }//GEN-LAST:event_btnChangeProfileMouseClicked

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
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnChangeProfile;
    private javax.swing.JPanel btnCustomer;
    private javax.swing.JPanel btnEmp;
    private javax.swing.JLabel btnEmployee;
    private javax.swing.JLabel btnEmployee1;
    private javax.swing.JLabel btnEmployee2;
    private javax.swing.JPanel btnOrder;
    private javax.swing.JPanel dashPanel;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbCheck;
    // End of variables declaration//GEN-END:variables

}
