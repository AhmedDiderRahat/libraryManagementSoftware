package edu.neub.cse.project1.admin;

import edu.neub.cse.project1.bean.MemberPaymentBean;
import edu.neub.cse.project1.connection.DbConnector;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Team_DoodleArmy
 */
public class MemberPayment extends javax.swing.JFrame implements ActionListener {

    public int pay_id;
    public String current_member, pay_date;

    public MemberPayment() {
        try {
            initComponents();
            pay_id = -1;
            //amount = -1;
            current_member = "";
            pay_date = "";

            this.setResizable(false);
            this.setLocationRelativeTo(null);
            this.setVisible(true);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setTitle("Payment Management");

            addjButton.addActionListener(this);
            updatejButton.addActionListener(this);
            deletejButton.addActionListener(this);
            backjButton.addActionListener(this);
            addInitialization();
            PrintToTable();
            
        //Manue Item
        homejMenuItem.addActionListener(this);
        logoutjMenuItem.addActionListener(this);
        memberListjMenuItem.addActionListener(this);
        paymentjMenuItem.addActionListener(this);
        bookManagementjMenuItem.addActionListener(this);
        bookListjMenuItem.addActionListener(this);
        authorListjMenuItem.addActionListener(this);
        publisherListjMenuItem.addActionListener(this);
        generListjMenuItem.addActionListener(this);
        issueListjMenuItem.addActionListener(this);
        developerjMenuItem.addActionListener(this);
        } catch (SQLException ex) {
            Logger.getLogger(MemberPayment.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        memberjComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        issueDatejDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel2 = new javax.swing.JLabel();
        amountjTextField = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        addjButton = new javax.swing.JButton();
        updatejButton = new javax.swing.JButton();
        deletejButton = new javax.swing.JButton();
        backjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        memberfeeListjTable = new javax.swing.JTable();
        jMenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        homejMenuItem = new javax.swing.JMenuItem();
        logoutjMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        memberListjMenuItem = new javax.swing.JMenuItem();
        paymentjMenuItem = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        bookManagementjMenuItem = new javax.swing.JMenuItem();
        bookListjMenuItem = new javax.swing.JMenuItem();
        authorListjMenuItem = new javax.swing.JMenuItem();
        publisherListjMenuItem = new javax.swing.JMenuItem();
        generListjMenuItem = new javax.swing.JMenuItem();
        issueListjMenuItem = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        developerjMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(850, 600));
        setMinimumSize(new java.awt.Dimension(850, 600));
        setPreferredSize(new java.awt.Dimension(850, 600));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Member :");

        memberjComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        memberjComboBox.setForeground(new java.awt.Color(51, 0, 153));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Date :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Amount :");

        amountjTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(memberjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(issueDatejDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(amountjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memberjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(issueDatejDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(amountjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        addjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addjButton.setForeground(new java.awt.Color(0, 153, 51));
        addjButton.setText("ADD");

        updatejButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updatejButton.setForeground(new java.awt.Color(0, 153, 51));
        updatejButton.setText("Update");

        deletejButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deletejButton.setForeground(new java.awt.Color(0, 153, 51));
        deletejButton.setText("Delete");

        backjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backjButton.setForeground(new java.awt.Color(0, 153, 51));
        backjButton.setText("Back");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deletejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(addjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updatejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(deletejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        memberfeeListjTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        memberfeeListjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Member", "Amount", "Payment Date"
            }
        ));
        memberfeeListjTable.setRowHeight(25);
        memberfeeListjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                memberfeeListjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(memberfeeListjTable);
        if (memberfeeListjTable.getColumnModel().getColumnCount() > 0) {
            memberfeeListjTable.getColumnModel().getColumn(0).setMinWidth(80);
            memberfeeListjTable.getColumnModel().getColumn(0).setPreferredWidth(80);
            memberfeeListjTable.getColumnModel().getColumn(0).setMaxWidth(80);
            memberfeeListjTable.getColumnModel().getColumn(2).setMinWidth(120);
            memberfeeListjTable.getColumnModel().getColumn(2).setPreferredWidth(120);
            memberfeeListjTable.getColumnModel().getColumn(2).setMaxWidth(120);
            memberfeeListjTable.getColumnModel().getColumn(3).setMinWidth(150);
            memberfeeListjTable.getColumnModel().getColumn(3).setPreferredWidth(150);
            memberfeeListjTable.getColumnModel().getColumn(3).setMaxWidth(150);
        }

        jMenuBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        jMenuBar.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuBar.setMargin(new java.awt.Insets(0, 0, 0, 40));

        jMenu1.setText("|  Main  |");

        homejMenuItem.setText("Home");
        jMenu1.add(homejMenuItem);

        logoutjMenuItem.setText("LogOut");
        jMenu1.add(logoutjMenuItem);

        jMenuBar.add(jMenu1);

        jMenu2.setForeground(new java.awt.Color(51, 0, 204));
        jMenu2.setText("|  Member Management  |");

        memberListjMenuItem.setText("Member List");
        jMenu2.add(memberListjMenuItem);

        paymentjMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        paymentjMenuItem.setForeground(new java.awt.Color(0, 153, 51));
        paymentjMenuItem.setText("Payment History");
        jMenu2.add(paymentjMenuItem);

        jMenuBar.add(jMenu2);

        jMenu3.setText("|  Book Management  |");

        bookManagementjMenuItem.setText("Book Management");
        jMenu3.add(bookManagementjMenuItem);

        bookListjMenuItem.setText("Book List");
        jMenu3.add(bookListjMenuItem);

        authorListjMenuItem.setText("Author List");
        jMenu3.add(authorListjMenuItem);

        publisherListjMenuItem.setText("Publisher List");
        jMenu3.add(publisherListjMenuItem);

        generListjMenuItem.setText("Gener List");
        jMenu3.add(generListjMenuItem);

        issueListjMenuItem.setText("Book Issue List");
        jMenu3.add(issueListjMenuItem);

        jMenuBar.add(jMenu3);

        jMenu4.setText("|  Help  |");

        developerjMenuItem.setText("Developer");
        jMenu4.add(developerjMenuItem);

        jMenuBar.add(jMenu4);

        setJMenuBar(jMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(19, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void memberfeeListjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberfeeListjTableMouseClicked
        try {
            // TODO add your handling code here:
            int rowNumber = memberfeeListjTable.getSelectedRow();
            TableModel model = memberfeeListjTable.getModel();
            pay_id = Integer.parseInt(model.getValueAt(rowNumber, 0).toString());
            current_member = model.getValueAt(rowNumber, 1).toString();
            amountjTextField.setText(model.getValueAt(rowNumber, 2).toString());
            pay_date = model.getValueAt(rowNumber, 3).toString();
            updateInitialization(pay_date);
        } catch (Exception ex) {
            Logger.getLogger(BookIssueManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_memberfeeListjTableMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MemberPayment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addjButton;
    private javax.swing.JTextField amountjTextField;
    private javax.swing.JMenuItem authorListjMenuItem;
    private javax.swing.JButton backjButton;
    private javax.swing.JMenuItem bookListjMenuItem;
    private javax.swing.JMenuItem bookManagementjMenuItem;
    private javax.swing.JButton deletejButton;
    private javax.swing.JMenuItem developerjMenuItem;
    private javax.swing.JMenuItem generListjMenuItem;
    private javax.swing.JMenuItem homejMenuItem;
    private com.toedter.calendar.JDateChooser issueDatejDateChooser;
    private javax.swing.JMenuItem issueListjMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem logoutjMenuItem;
    private javax.swing.JMenuItem memberListjMenuItem;
    private javax.swing.JTable memberfeeListjTable;
    private javax.swing.JComboBox memberjComboBox;
    private javax.swing.JMenuItem paymentjMenuItem;
    private javax.swing.JMenuItem publisherListjMenuItem;
    private javax.swing.JButton updatejButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent button) {
        
        if(button.getSource() == homejMenuItem){
            LandingPage lp = new LandingPage();
            this.dispose();
        }
        
        if(button.getSource() == logoutjMenuItem){
            LogIn in = new LogIn();
            this.dispose();
        }
        
        if(button.getSource() == memberListjMenuItem){
            try {
                MemberInformation mi = new MemberInformation();
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(LandingPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(button.getSource() == paymentjMenuItem){
            //do nothing
        }
        
        if(button.getSource() == bookManagementjMenuItem){
            BookManagement bm = new BookManagement();
            this.dispose();
        }
        
        if(button.getSource() == bookListjMenuItem){
            try {
                BookInformation bi = new BookInformation();
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(LandingPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(button.getSource() == authorListjMenuItem){
            try {
                AuthorsInformation ai = new AuthorsInformation();
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(LandingPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(button.getSource() == publisherListjMenuItem){
            try {
                PublishersInformation pi = new PublishersInformation();
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(LandingPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        if(button.getSource() == generListjMenuItem){
            GenersInformation gi = new GenersInformation();
            this.dispose();
        }
        
        if(button.getSource() == issueListjMenuItem){
            BookIssueManagement bim = new BookIssueManagement();
            this.dispose();
        }
        
        if(button.getSource() == developerjMenuItem){
            DeveloperOption do1 = new DeveloperOption();
            this.dispose();
        }
        

        if (button.getSource() == addjButton) {
            try {
                MemberPaymentBean bean = new MemberPaymentBean(-1,
                        findMemberId(memberjComboBox.getSelectedItem().toString()),
                        stringToint(amountjTextField.getText().toString().trim()), null,
                        dateCalculation());

                if (bean.getMember_id() == -1 || bean.getAmount() == -1 || bean.getPayment_date().equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill Every Raw Perfectly...!!!");
                } else {
                    DbConnector connector = new DbConnector();
                    String insertQuery = "INSERT INTO payment (pay_date, amount, member_id) "
                            + "VALUES ('" + bean.getPayment_date() + "', '" + bean.getAmount()
                            + "', '" + bean.getMember_id() + "')";

                    connector.statement.executeUpdate(insertQuery);
                    connector.connection.close();
                    JOptionPane.showMessageDialog(null, "Successfully Added...!!!");

                    DefaultTableModel model = (DefaultTableModel) memberfeeListjTable.getModel();
                    model.setRowCount(0);
                    PrintToTable();
                    addInitialization();
                }
            } catch (SQLException ex) {
                Logger.getLogger(MemberPayment.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (button.getSource() == updatejButton) {
            try {
                MemberPaymentBean bean = new MemberPaymentBean(pay_id,
                        findMemberId(memberjComboBox.getSelectedItem().toString()),
                        stringToint(amountjTextField.getText().toString().trim()), null,
                        dateCalculation());
                if (bean.getPayment_id() == -1 || bean.getMember_id() == -1 || bean.getAmount() == -1 || bean.getPayment_date().equals("")) {
                    JOptionPane.showMessageDialog(null, "Select an Item...!!!");
                } else {
                    DbConnector dbConnector = new DbConnector();
                    String UpdateQuery = "UPDATE payment SET member_id = '" + bean.getMember_id()
                            + "', amount = '" + bean.getAmount() + "', pay_date = '" + bean.getPayment_date()
                            + "' WHERE payment_id = " + "'" + bean.getPayment_id() + "'";
                    dbConnector.statement.executeUpdate(UpdateQuery);
                    dbConnector.connection.close();

                    JOptionPane.showMessageDialog(null, "Successfully Updated...!!!");

                    DefaultTableModel model = (DefaultTableModel) memberfeeListjTable.getModel();
                    model.setRowCount(0);
                    pay_id = -1;
                    PrintToTable();
                    addInitialization();
                }
            } catch (SQLException ex) {
                Logger.getLogger(MemberPayment.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (button.getSource() == deletejButton) {

            MemberPaymentBean bean = new MemberPaymentBean(pay_id, -1, -1, null, null);

            if (bean.getPayment_id() == -1) {
                JOptionPane.showMessageDialog(null, "Select an Item...!!!");
            } else {
                try {
                    DbConnector dbConnector = new DbConnector();
                    String deleteQuery = "DELETE FROM payment " + " WHERE payment_id = " + "'" + bean.getPayment_id() + "'";
                    dbConnector.statement.executeUpdate(deleteQuery);
                    dbConnector.connection.close();
                    JOptionPane.showMessageDialog(null, "Data Successfully Deleted...!!!");

                    DefaultTableModel model = (DefaultTableModel) memberfeeListjTable.getModel();
                    model.setRowCount(0);
                    pay_id = -1;
                    PrintToTable();
                    addInitialization();
                } catch (SQLException ex) {
                    Logger.getLogger(GenersInformation.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        if (button.getSource() == backjButton) {
            LandingPage lp = new LandingPage();
            this.dispose();
        }
    }

    public String dateCalculation() {
        java.util.Date indate;
        indate = issueDatejDateChooser.getDate();
        if (indate == null) {
            return "";
        }
        String dateString = null;
        SimpleDateFormat sdfr = new SimpleDateFormat("dd/MMM/yyyy");
        dateString = sdfr.format(indate);
        return dateString;
    }

    public int stringToint(String s) {
        if (s.trim().equals("")) {
            return -1;
        }
        return Integer.parseInt(s.trim());
    }

    public int findMemberId(String member) throws SQLException {
        String selectQuery = "SELECT * FROM member WHERE member_name = '" + member + "'";
        DbConnector connector = new DbConnector();
        connector.resultset = connector.statement.executeQuery(selectQuery);
        int idx = 0;
        while (connector.resultset.next()) {
            return connector.resultset.getInt("member_id");
        }
        return -1;
    }

    public void showComboBoxMember(JComboBox object) throws SQLException {
        String[] temp = new String[1000];
        String selectQuery = "SELECT * FROM member";

        DbConnector connector = new DbConnector();
        connector.resultset = connector.statement.executeQuery(selectQuery);
        int idx = 0;
        while (connector.resultset.next()) {
            temp[idx] = connector.resultset.getString("member_name").toString();
            idx += 1;
        }

        String[] generList = new String[idx + 5];
        int i = 0;
        while (i < idx) {
            generList[i] = temp[i];
            i++;
        }
        object.setModel(new DefaultComboBoxModel(generList));
        if (pay_id != -1) {
            object.insertItemAt(current_member, 0);
        } else {
            object.insertItemAt("Slecet Member", 0);
        }

        object.setSelectedIndex(0);
        object.toString();
    }

    public void addInitialization() {
        try {
            this.showComboBoxMember(memberjComboBox);
            issueDatejDateChooser.setDate(null);
            amountjTextField.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(BookAddUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateInitialization(String issue_date) throws Exception {
        try {
            this.showComboBoxMember(memberjComboBox);
            issueDatejDateChooser.setDate(findDate(issue_date));
        } catch (SQLException ex) {
            Logger.getLogger(BookAddUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Date findDate(String date) throws Exception {
        String sDate1 = date;
        Date date1 = new SimpleDateFormat("dd/MMM/yyyy").parse(sDate1);
        return date1;
    }

    public void PrintToTable() throws SQLException {
        DefaultTableModel model = (DefaultTableModel) memberfeeListjTable.getModel();
        ArrayList<MemberPaymentBean> ReciveList = dataRetriveFromDatabase();
        Object rawData[] = new Object[4];

        for (int i = 0; i < ReciveList.size(); i++) {
            rawData[0] = ReciveList.get(i).getPayment_id();
            rawData[1] = ReciveList.get(i).getMember_name();
            rawData[2] = ReciveList.get(i).getAmount();
            rawData[3] = ReciveList.get(i).getPayment_date();
            model.addRow(rawData);
        }
    }

    public ArrayList dataRetriveFromDatabase() throws SQLException {
        DbConnector connector = new DbConnector();
        // select query
        String selectStudentQuery;
        selectStudentQuery = "SELECT payment.payment_id, member.member_name, "
                + "payment.amount, " + "payment.pay_date FROM "
                + "payment INNER JOIN member ON payment.member_id = member.member_id "
                + "ORDER BY payment.payment_id";

        connector.resultset = connector.statement.executeQuery(selectStudentQuery);
        ArrayList list;
        list = new ArrayList<MemberPaymentBean>();
        while (connector.resultset.next()) {
            int pay_id = connector.resultset.getInt("payment_id");
            int amount = connector.resultset.getInt("amount");
            String member_name = connector.resultset.getString("member_name");
            String pay_date = connector.resultset.getString("pay_date");
            MemberPaymentBean info = new MemberPaymentBean(pay_id, 0, amount, member_name, pay_date);
            list.add(info);
        }
        connector.connection.close();
        return list;
    }
}
