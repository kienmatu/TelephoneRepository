/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainForm;

import Entity.Employee;
import java.awt.Color;
//import antlr.collections.List;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.ListIterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;

/**
 *
 * @author KIENDINH
 */
public class EmployeeFrm extends javax.swing.JFrame {
    private String luaChon = "ADD";
    private final static String unitName = "SaleManagerProjectPU";
    private static final EntityManager entityManager = Persistence.createEntityManagerFactory(unitName).createEntityManager();
    /**
     * Creates new form Manage
     */
    public EmployeeFrm() {
        initComponents();
        this.setLocationRelativeTo(null);
        setDataforTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFullname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbbLuaChon = new javax.swing.JComboBox<>();
        pnlDongY = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        txtDate = new com.toedter.calendar.JDateChooser();
        lbCheck = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(45, 118, 232));

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Employee Manager");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel14)
                .addGap(112, 112, 112)
                .addComponent(jLabel13)
                .addGap(308, 308, 308))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        txtUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUser.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 118, 232)));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("USER NAME");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setText("PASS WORD");

        txtFullname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFullname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 118, 232)));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setText("EMPLOYEE FULL NAME");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setText("EMPLOYEE START DATE");

        txtPhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPhoneNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 118, 232)));
        txtPhoneNumber.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPhoneNumberFocusLost(evt);
            }
        });
        txtPhoneNumber.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                txtPhoneNumberInputMethodTextChanged(evt);
            }
        });
        txtPhoneNumber.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtPhoneNumberPropertyChange(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 153, 255));
        jLabel5.setText("EMPLOYEE PHONE NUMER");

        cbbLuaChon.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        cbbLuaChon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADD", "EDIT", "DELETE", "EMPTY" }));
        cbbLuaChon.setBorder(null);
        cbbLuaChon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbbLuaChon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbLuaChonItemStateChanged(evt);
            }
        });

        pnlDongY.setBackground(new java.awt.Color(45, 118, 232));
        pnlDongY.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDongYMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlDongYMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlDongYMouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("OK");

        javax.swing.GroupLayout pnlDongYLayout = new javax.swing.GroupLayout(pnlDongY);
        pnlDongY.setLayout(pnlDongYLayout);
        pnlDongYLayout.setHorizontalGroup(
            pnlDongYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDongYLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel8)
                .addContainerGap(34, Short.MAX_VALUE))
        );
        pnlDongYLayout.setVerticalGroup(
            pnlDongYLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDongYLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 153, 255));
        jLabel9.setText("ENTER INFORMATION");

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        lbCheck.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCheck.setForeground(new java.awt.Color(255, 0, 51));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(cbbLuaChon, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(pnlDongY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFullname, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 262, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(8, 8, 8))
                                    .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel9)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtPassword)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(0, 0, 0)
                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, 0)
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(80, 80, 80)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(pnlDongY, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbLuaChon)))
                    .addComponent(lbCheck))
                .addGap(35, 35, 35))
        );

        txtPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 118, 232)));
        txtDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(45, 118, 232)));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        tblEmployee.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        tblEmployee.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblEmployee.setGridColor(new java.awt.Color(255, 255, 255));
        tblEmployee.setOpaque(false);
        tblEmployee.setRowHeight(30);
        tblEmployee.setRowMargin(5);
        tblEmployee.setShowHorizontalLines(false);
        tblEmployee.setShowVerticalLines(false);
        tblEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblEmployeeMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblEmployee);
        tblEmployee.getTableHeader().setReorderingAllowed(false);
        tblEmployee.getTableHeader().setOpaque(false);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void cbbLuaChonItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbLuaChonItemStateChanged
        if (evt.getItem() == "ADD" && evt.getStateChange() == ItemEvent.SELECTED) {
            luaChon = "ADD";
        } else if (evt.getItem() == "EDIT" && evt.getStateChange() == ItemEvent.SELECTED) {
            luaChon = "EDIT";
        } else if (evt.getItem() == "DELETE" && evt.getStateChange() == ItemEvent.SELECTED) {
            luaChon = "DELETE";
        } else if (evt.getItem() == "EMPTY" && evt.getStateChange() == ItemEvent.SELECTED) {
            luaChon = "EMPTY";
        }
    }//GEN-LAST:event_cbbLuaChonItemStateChanged
    private void pnlDongYMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDongYMouseClicked
        if (null != luaChon) {
            switch (luaChon) {
                case "ADD":
                    if (addEmployee()) {
                        JOptionPane.showMessageDialog(null, "ADD USER " + txtUser.getText() + " Successfully");
                        resetField();

                    } else {
                        JOptionPane.showMessageDialog(null, "An error occured!");
                    }
                    setDataforTable();
                    break;
                case "EDIT":
                     if (EditEmp()) {
                        JOptionPane.showMessageDialog(null, "EDIT USER " + txtUser.getText() + " Successfully");
                        resetField();

                    } else {
                        JOptionPane.showMessageDialog(null, "An error occured!");
                    }
                    setDataforTable();
                    break;
                case "DELETE":
                    if (DeleteEmp()) {
                        JOptionPane.showMessageDialog(null, "DELETE USER " + txtUser.getText() + " Successfully");
                        resetField();

                    } else {
                        JOptionPane.showMessageDialog(null, "An error occured!");
                    }
                    setDataforTable();
                    break;
                case "EMPTY":
                    resetField();
                    break;
                default:
                    break;
            }
        }
    }//GEN-LAST:event_pnlDongYMouseClicked
     private boolean EditEmp() {
        EntityTransaction tran = null;
        try {
            String username = txtUser.getText();
            
            tran = entityManager.getTransaction();
            Employee employee = entityManager.find(Employee.class, username);
            tran.begin();
            employee.setEmpname(txtFullname.getText());
            employee.setPass(txtPassword.getText());
            employee.setEmpphone(txtPhoneNumber.getText());
            employee.setEmpstartdate(txtDate.getDate());
            tran.commit();

            return true;
        } catch (Exception e) {
            if (tran != null && tran.isActive()) {
                tran.rollback();
                //JOptionPane.showMessageDialog(null, e);

            }
            //JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }
    private boolean DeleteEmp() {
        EntityTransaction tran = null;
        try {
            String username = txtUser.getText();
            if ("admin".equals(username)) {
                return false;
            }
            EntityManager entityManager = Persistence.createEntityManagerFactory(unitName).createEntityManager();
            tran = entityManager.getTransaction();
            Employee employee = entityManager.find(Employee.class, username);
            tran.begin();
            entityManager.remove(employee);
            tran.commit();

            return true;
        } catch (Exception e) {
            if (tran != null && tran.isActive()) {
                tran.rollback();
                //JOptionPane.showMessageDialog(null, e);

            }
            //JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    private void setColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(0, 51, 255));
    }

    private void resetColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(45, 118, 232));
    }
    private void pnlDongYMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDongYMouseEntered
        // TODO add your handling code here:
        setColor(pnlDongY);
    }//GEN-LAST:event_pnlDongYMouseEntered

    private void pnlDongYMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDongYMouseExited
        // TODO add your handling code here:
        resetColor(pnlDongY);
    }//GEN-LAST:event_pnlDongYMouseExited

    private void tblEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblEmployeeMouseClicked
        int r = tblEmployee.getSelectedRow();
//        tableHeaders.add("User Name");
//        tableHeaders.add("Is Admin");
//        tableHeaders.add("Emp Phone");
//        tableHeaders.add("Emp Name");
//        tableHeaders.add("Start Date");
        TableModel model = tblEmployee.getModel();
        if (r != -1) {
            Date date = new Date();
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Object a = model.getValueAt(r, 4) != "" ? model.getValueAt(r, 4) : new Date();
            String today = formatter.format(a!= "" ? a : new Date().toString());
            txtUser.setText(model.getValueAt(r, 0) != null ? model.getValueAt(r, 0).toString() : "");
            txtUser.enable(false);
            txtFullname.setText(model.getValueAt(r, 3) != null ? model.getValueAt(r, 3).toString() : "");
            txtDate.setDate(new Date(today));
            txtPhoneNumber.setText(model.getValueAt(r, 2) != null ? model.getValueAt(r, 2).toString() : "");
        }
        cbbLuaChon.setSelectedIndex(1);

    }//GEN-LAST:event_tblEmployeeMouseClicked
    private void resetField() {
        txtUser.setText("");
        txtUser.enable(true);
        txtPassword.setText("");
        txtFullname.setText("");
        txtDate.setDate(new Date());
        txtPhoneNumber.setText("");
    }

    private boolean addEmployee() {
        EntityTransaction tran = null;
        try {
            String user = txtUser.getText();
            String pass = txtPassword.getText();
            String name = txtFullname.getText();
            String phone = this.txtPhoneNumber.getText();
            Date date = txtDate.getDate() != null ? txtDate.getDate() : new Date();//new SimpleDateFormat("dd/MM/yyyy").parse(txtDate.getText());
            //JOptionPane.showMessageDialog(null, date);
            //EntityManager entityManager = Persistence.createEntityManagerFactory(unitName).createEntityManager();
            tran = entityManager.getTransaction();
            Employee employee = new Employee(user, pass, name, phone, date);
            tran.begin();
            entityManager.persist(employee);
            tran.commit();

            return true;
        } catch (Exception e) {
            if (tran != null && tran.isActive()) {
                tran.rollback();
//                JOptionPane.showMessageDialog(null, e);

            }
            //JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }
    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtPhoneNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhoneNumberFocusLost
        // TODO add your handling code here:
        if(validatePhoneNumber(txtPhoneNumber.getText()))
        {
            lbCheck.setText("Valid");
            lbCheck.setForeground(Color.BLUE);
        }
        else{
            lbCheck.setText("Invalid");
            lbCheck.setForeground(Color.red);
        }
    }//GEN-LAST:event_txtPhoneNumberFocusLost

    private void txtPhoneNumberPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtPhoneNumberPropertyChange
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtPhoneNumberPropertyChange

    private void txtPhoneNumberInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtPhoneNumberInputMethodTextChanged
        // TODO add your handling code here:
        if(validatePhoneNumber(txtPhoneNumber.getText()))
        {
            lbCheck.setText("Valid");
            lbCheck.setForeground(Color.BLUE);
        }
        else{
            lbCheck.setText("Invalid");
            lbCheck.setForeground(Color.red);
        }
    }//GEN-LAST:event_txtPhoneNumberInputMethodTextChanged
    private static boolean validatePhoneNumber(String phoneNo) {
        if(phoneNo.matches("\\+\\d{11}"))
        {
            return true;
        }
        //validate phone numbers of format "1234567890"
        if (phoneNo.matches("\\d{10}")) {
            return true;
        } //validating phone number with -, . or spaces
        else if (phoneNo.matches("\\d{3}[-\\.\\s]\\d{3}[-\\.\\s]\\d{4}")) {
            return true;
        } //validating phone number with extension length from 3 to 5
        else if (phoneNo.matches("\\d{3}-\\d{3}-\\d{4}\\s(x|(ext))\\d{3,5}")) {
            return true;
        } //validating phone number where area code is in braces ()
        else if (phoneNo.matches("\\(\\d{3}\\)-\\d{3}-\\d{4}")) {
            return true;
        } //return false if nothing matches the input
        else 
        {
            return false;
        }

    }

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
            java.util.logging.Logger.getLogger(EmployeeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeFrm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeFrm().setVisible(true);
//                 JOptionPane.showMessageDialog(null, passvar);
            }
        });
    }

    private void setDataforTable() {
        try {
            tblEmployee.setModel(new DefaultTableModel());
            //EntityManager entityManager = Persistence.createEntityManagerFactory(unitName).createEntityManager();
            Query query = entityManager.createNamedQuery("Employee.findAll");
            List<Employee> resultList = query.getResultList();

            Vector<String> tableHeaders = new Vector<String>();
            Vector tableData = new Vector();

            tableHeaders.add("User Name");
            tableHeaders.add("Is Admin");
            // tableHeaders.add("Password");
            tableHeaders.add("Emp Phone");
            tableHeaders.add("Emp Name");
            tableHeaders.add("Start Date");

            for (Employee e : resultList) {
                // Employee e = (Employee) o;
                Vector<Object> oneRow = new Vector<Object>();
                //String strDate = new SimpleDateFormat("MM/dd/yyyy").format((Date));
                oneRow.add(e.getUsername());
                oneRow.add((e.getIsadmin() == 1 ? " YES " : " NO "));
                //oneRow.add(e.getPass());
                oneRow.add(e.getEmpphone());
                oneRow.add(e.getEmpname());

                oneRow.add(e.getEmpstartdate() != null ? e.getEmpstartdate() : "");
                tableData.add(oneRow);
            }
            DefaultTableModel aModel = new DefaultTableModel(tableData, tableHeaders) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

            };
            this.tblEmployee.setModel(aModel);
            //       tblEmployee.setEnabled(false);
//        JTableHeader header = tblEmployee.getTableHeader();
//         tblEmployee.getTableHeader().setOpaque(false);
//         header.setBackground(Color.WHITE);
//         header.setForeground(Color.BLACK);

        } catch (Exception he) {
            he.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JComboBox<String> cbbLuaChon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCheck;
    private javax.swing.JPanel pnlDongY;
    private javax.swing.JTable tblEmployee;
    private com.toedter.calendar.JDateChooser txtDate;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
