/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainForm;
//import Entity.CustomerFrm;
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
import java.util.regex.Pattern;
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
public class CustomerFrm extends javax.swing.JFrame {
    private String luaChon = "ADD";
    private final static String unitName = "SaleManagerProjectPU";
    private static final EntityManager entityManager = Persistence.createEntityManagerFactory(unitName).createEntityManager();
    /**
     * Creates new form Customer
     */
    public CustomerFrm() {
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
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbbLuaChon = new javax.swing.JComboBox<String>();
        lbCheck = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtCustID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtAddress = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtDate = new com.toedter.calendar.JDateChooser();
        txtDate1 = new com.toedter.calendar.JDateChooser();
        txtName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCustomer = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(102, 153, 255));
        jLabel9.setText("ENTER CUSTOMER INFORMATION");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 153, 255));
        jLabel1.setText("CUSTOMER ID");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 153, 255));
        jLabel2.setText("CUSTOMER NAME");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 153, 255));
        jLabel3.setText("CUSTOMER ADDRESS");

        jLabel5.setForeground(new java.awt.Color(102, 153, 255));
        jLabel5.setText("CUSTOMER PHONE");

        jLabel6.setForeground(new java.awt.Color(102, 153, 255));
        jLabel6.setText("CUSTOMER DATE OF BIRTH");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 153, 255));
        jLabel4.setText("CUSTOMER REGDATE");

        cbbLuaChon.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        cbbLuaChon.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ADD", "EDIT", "DELETE", "EMPTY" }));
        cbbLuaChon.setBorder(null);
        cbbLuaChon.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cbbLuaChon.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbLuaChonItemStateChanged(evt);
            }
        });
        cbbLuaChon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbLuaChonActionPerformed(evt);
            }
        });

        lbCheck.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbCheck.setForeground(new java.awt.Color(255, 0, 51));

        txtCustID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton1.setText("OK");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        txtAddress.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtAddress.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0,Color.WHITE));

        txtPhoneNumber.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPhoneNumber.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0,Color.white));
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

        txtDate.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtDate1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0,Color.WHITE));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDate1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCustID, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPhoneNumber)
                            .addComponent(txtName)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                        .addComponent(cbbLuaChon, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel9)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCustID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(2, 2, 2)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(2, 2, 2)
                .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cbbLuaChon, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
                .addContainerGap())
        );

        txtDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.white));
        txtDate.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        txtDate.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, Color.white));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        tblCustomer.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        tblCustomer.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        tblCustomer.setGridColor(new java.awt.Color(255, 255, 255));
        tblCustomer.setOpaque(false);
        tblCustomer.setRowHeight(30);
        tblCustomer.setRowMargin(5);
        tblCustomer.setShowHorizontalLines(false);
        tblCustomer.setShowVerticalLines(false);
        tblCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCustomerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCustomer);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    private void lockField(){
        //txtCustID.setEditable(false);
        txtName.setEditable(false);
        txtAddress.setEditable(false);
        txtPhoneNumber.setEditable(false);
        txtDate.setDate(new Date());
        txtDate1.setDate(new Date());
    }
    
    private void releaseField(){
        //txtCustID.setEditable(false);
        txtName.setEditable(true);
        txtAddress.setEditable(true);
        txtPhoneNumber.setEditable(true);
        txtDate.setDate(new Date());
        txtDate1.setDate(new Date());
    }
    
    private void resetField() {
        txtCustID.setText("");
        txtName.setText("");
        txtAddress.setText("");
        txtPhoneNumber.setText("");
        txtDate.setDate(new Date());
        txtDate1.setDate(new Date());
    }
    
private boolean addCustomer() {
        EntityTransaction tran = null;
        if(checkName() == true && checkPhone() == true ) //  neu username ma khong co dau, tuc la chi co cac ky tu tu a-z "[A-Za-z0-9_]+"
        {
        try {
            String name = txtName.getText();
            String address = txtAddress.getText();
            String phone = this.txtPhoneNumber.getText();           
            Date date = txtDate.getDate() != null ? txtDate.getDate() : new Date();//new SimpleDateFormat("dd/MM/yyyy").parse(txtDate.getText());
            Date date1 = txtDate1.getDate() != null ? txtDate1.getDate() : new Date();
            //JOptionPane.showMessageDialog(null, date);
            //EntityManager entityManager = Persistence.createEntityManagerFactory(unitName).createEntityManager();
            tran = entityManager.getTransaction();
            Entity.Customer customer = new Entity.Customer();
            customer.setCustname(name);
            customer.setCustaddress(address);
            customer.setCustphone(phone);
            customer.setCustdob(date);
            customer.setCustregdate(date1);
            tran.begin();
            entityManager.persist(customer);
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
        else
        {
            if(checkName() == false)
            {
            JOptionPane.showMessageDialog(null, "PLEASE CHECK NAME !");
            return false;
            }          
            else 
            {
            JOptionPane.showMessageDialog(null, "PLEASE CHECK PHONENUMBER!");
            return false;
            }
           
        }

    }   
    
    private boolean EditCust() {
        EntityTransaction tran = null;
        if(checkName() == true && checkPhone() == true) //  neu username ma khong co dau, tuc la chi co cac ky tu tu a-z "[A-Za-z0-9_]+"
        {
try {
            int ID = Integer.parseInt(txtCustID.getText());   
            tran = entityManager.getTransaction();
            Entity.Customer customer = entityManager.find(Entity.Customer.class, ID);
            tran.begin(); 
            customer.setCustname(txtName.getText());
            customer.setCustaddress(txtAddress.getText());
            customer.setCustphone(txtPhoneNumber.getText());
            customer.setCustdob(txtDate.getDate());
            customer.setCustregdate(txtDate1.getDate());
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
        else
        {
            if(checkName() == false)
            {
            JOptionPane.showMessageDialog(null, "PLEASE CHECK NAME !");
            return false;
            }
     
            else 
            {
            JOptionPane.showMessageDialog(null, "PLEASE CHECK PHONENUMBER!");
            return false;
            }
           
        }

    }  
    
    private boolean DeleteCust() {
        EntityTransaction tran = null;
        try {
            int ID = Integer.parseInt(txtCustID.getText());
          //  String username = txtCustID.getUIClassID();
            EntityManager entityManager = Persistence.createEntityManagerFactory(unitName).createEntityManager();
            tran = entityManager.getTransaction();
            Entity.Customer customer = entityManager.find(Entity.Customer.class, ID); // hàm này lấy theo trường PRIMARY KEY
            tran.begin();
            entityManager.remove(customer);
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
    private void tblCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCustomerMouseClicked
        int r = tblCustomer.getSelectedRow();
        TableModel model = tblCustomer.getModel();
        if (r != -1) {
            Date date = new Date();
            DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            Object a = model.getValueAt(r, 4) != "" ? model.getValueAt(r, 4) : new Date();
            String dob = formatter.format(a!= "" ? a : new Date().toString());
             Object b = model.getValueAt(r, 5) != "" ? model.getValueAt(r, 5) : new Date();
            String reg = formatter.format(a!= "" ? b : new Date().toString());
            txtCustID.setText(model.getValueAt(r, 0) != null ? model.getValueAt(r, 0).toString() : "");
            txtCustID.enable(false);
            txtName.setText(model.getValueAt(r, 1) != null ? model.getValueAt(r, 1).toString() : "");
            txtAddress.setText(model.getValueAt(r, 2) != null ? model.getValueAt(r, 2).toString() : "");
            txtPhoneNumber.setText(model.getValueAt(r, 3) != null ? model.getValueAt(r, 3).toString() : "");
            txtDate.setDate(new Date(dob));
            txtDate1.setDate(new Date(reg));
           
        }
        cbbLuaChon.setSelectedIndex(1);
    }//GEN-LAST:event_tblCustomerMouseClicked

    private void cbbLuaChonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbLuaChonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbLuaChonActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       if (null != luaChon) {
            switch (luaChon) {
                case "ADD":
                lockField();
                if (addCustomer()) {
                    JOptionPane.showMessageDialog(null, "ADD CUSTOMER " + txtName.getText() + " Successfully");
                    resetField();

                } else {
                    JOptionPane.showMessageDialog(null, "An error occured!");
                }
                setDataforTable();
                releaseField();
                break;
                case "EDIT":
                lockField();
                if (EditCust()) {
                    JOptionPane.showMessageDialog(null, "EDIT CUSTOMER " + txtName.getText() + " Successfully");
                    resetField();

                } else {
                    JOptionPane.showMessageDialog(null, "An error occured!");
                }
                setDataforTable();
                releaseField();
                break;
                case "DELETE":
                lockField();
                if (DeleteCust()) {
                    JOptionPane.showMessageDialog(null, "DELETE CUSTOMER " + txtName.getText() + " Successfully");
                    resetField();

                } else {
                    JOptionPane.showMessageDialog(null, "An error occured!");
                }
                setDataforTable();
                releaseField();
                break;
                case "EMPTY":
                resetField();
                break;
                default:
                break;
            }
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void txtPhoneNumberFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPhoneNumberFocusLost
        // TODO add your handling code here:
        if (validatePhoneNumber(txtPhoneNumber.getText())) {
            lbCheck.setText("Valid");
            lbCheck.setForeground(Color.BLUE);
        } else {
            lbCheck.setText("Invalid");
            lbCheck.setForeground(Color.red);
        }
    }//GEN-LAST:event_txtPhoneNumberFocusLost

    private void txtPhoneNumberInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_txtPhoneNumberInputMethodTextChanged
        // TODO add your handling code here:
        if (validatePhoneNumber(txtPhoneNumber.getText())) {
            lbCheck.setText("Valid");
            lbCheck.setForeground(Color.BLUE);
        } else {
            lbCheck.setText("Invalid");
            lbCheck.setForeground(Color.red);
        }
    }//GEN-LAST:event_txtPhoneNumberInputMethodTextChanged

    private void txtPhoneNumberPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtPhoneNumberPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneNumberPropertyChange

    private static boolean validatePhoneNumber(String phoneNo) {
        if(phoneNo.matches("\\+\\d{11}"))
        {
            return true;
        }
        //validate phone numbers of format "1234567890"
        else if (phoneNo.matches("\\d{10}")) {
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
        } 
        else if (phoneNo.matches("^\\+(?:[0-9] ?){6,14}[0-9]$")) {
            return true;
        }
        //return false if nothing matches the input
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
                new CustomerFrm().setVisible(true);
//                 JOptionPane.showMessageDialog(null, passvar);
            }
        });
    }
    private void setDataforTable() {
        try {
            tblCustomer.setModel(new DefaultTableModel());
            //EntityManager entityManager = Persistence.createEntityManagerFactory(unitName).createEntityManager();
            Query query = entityManager.createNamedQuery("Customer.findAll");
            List<Entity.Customer> resultList = query.getResultList();

            Vector<String> tableHeaders = new Vector<String>();
            Vector tableData = new Vector();
            tableHeaders.add("ID");
            tableHeaders.add("Customer Name");
            tableHeaders.add("Customer Address");
            tableHeaders.add("Customer Phone");
            tableHeaders.add("Date OF BIRTH");
            tableHeaders.add("REG DATE");

            for (Entity.Customer e : resultList) {
                // Employee e = (Employee) o;
                Vector<Object> oneRow = new Vector<Object>();
                //String strDate = new SimpleDateFormat("MM/dd/yyyy").format((Date));
                oneRow.add(e.getCustid());
                oneRow.add((e.getCustname()));               
                oneRow.add(e.getCustaddress());
                oneRow.add(e.getCustphone());
                oneRow.add(e.getCustdob() != null ? e.getCustdob() : "");
                oneRow.add(e.getCustregdate() != null ? e.getCustregdate() : "");
                tableData.add(oneRow);
            }
            DefaultTableModel aModel = new DefaultTableModel(tableData, tableHeaders) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    return false;
                }

            };
            this.tblCustomer.setModel(aModel);
        } catch (Exception he) {
            he.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JComboBox<String> cbbLuaChon;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbCheck;
    private javax.swing.JTable tblCustomer;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtCustID;
    private com.toedter.calendar.JDateChooser txtDate;
    private com.toedter.calendar.JDateChooser txtDate1;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhoneNumber;
    // End of variables declaration//GEN-END:variables
   private boolean checkName() {
        String name = this.txtName.getText(); // lay user name
        //boolean valid = (username != null) && username.matches("[A-Za-z0-9_]+");
        Pattern pattern = Pattern.compile("[A-Za-z0-9_]+");
        boolean valid = (name != null) && pattern.matcher(name).matches();
        return valid;
    }
    private boolean checkPhone() {
        String number = this.txtPhoneNumber.getText(); // lay user name
        //boolean valid = (username != null) && username.matches("[A-Za-z0-9_]+");
        Pattern pattern = Pattern.compile("^[0-9\\-\\+]{10,15}$");
        boolean valid = (number != null) && pattern.matcher(number).matches();
        return valid;
    }  
}
