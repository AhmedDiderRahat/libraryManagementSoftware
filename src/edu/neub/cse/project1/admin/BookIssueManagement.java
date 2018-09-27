package edu.neub.cse.project1.admin;

import edu.neub.cse.project1.bean.BookIssueManagementBean;
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
public class BookIssueManagement extends javax.swing.JFrame implements ActionListener {

    public int issue_id = -1;
    public String current_member, current_book;

    public BookIssueManagement() {
        try {
            initComponents();

            this.setResizable(false);
            this.setLocationRelativeTo(null);
            this.setVisible(true);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
            this.setTitle("Book Issue Management");

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
            Logger.getLogger(BookIssueManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        bookIssueListjTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        memberjComboBox = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        bookjComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        issueDatejDateChooser = new com.toedter.calendar.JDateChooser();
        returnDatejDateChooser = new com.toedter.calendar.JDateChooser();
        jPanel2 = new javax.swing.JPanel();
        addjButton = new javax.swing.JButton();
        updatejButton = new javax.swing.JButton();
        deletejButton = new javax.swing.JButton();
        backjButton = new javax.swing.JButton();
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

        bookIssueListjTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bookIssueListjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Member", "Book", "Issu Date", "Return Date"
            }
        ));
        bookIssueListjTable.setRowHeight(25);
        bookIssueListjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookIssueListjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bookIssueListjTable);
        if (bookIssueListjTable.getColumnModel().getColumnCount() > 0) {
            bookIssueListjTable.getColumnModel().getColumn(0).setMinWidth(50);
            bookIssueListjTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            bookIssueListjTable.getColumnModel().getColumn(0).setMaxWidth(50);
            bookIssueListjTable.getColumnModel().getColumn(3).setMinWidth(100);
            bookIssueListjTable.getColumnModel().getColumn(3).setPreferredWidth(100);
            bookIssueListjTable.getColumnModel().getColumn(3).setMaxWidth(100);
            bookIssueListjTable.getColumnModel().getColumn(4).setMinWidth(100);
            bookIssueListjTable.getColumnModel().getColumn(4).setPreferredWidth(100);
            bookIssueListjTable.getColumnModel().getColumn(4).setMaxWidth(100);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Member :");

        memberjComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        memberjComboBox.setForeground(new java.awt.Color(51, 0, 153));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Book :");

        bookjComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bookjComboBox.setForeground(new java.awt.Color(51, 0, 153));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Issue Date :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Return Date :");

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
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bookjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(issueDatejDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(returnDatejDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(memberjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(issueDatejDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(returnDatejDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(updatejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deletejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

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

        jMenu2.setText("|  Member Management  |");

        memberListjMenuItem.setText("Member List");
        jMenu2.add(memberListjMenuItem);

        paymentjMenuItem.setText("Payment History");
        jMenu2.add(paymentjMenuItem);

        jMenuBar.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(51, 0, 204));
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

        issueListjMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        issueListjMenuItem.setForeground(new java.awt.Color(0, 153, 51));
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 353, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookIssueListjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookIssueListjTableMouseClicked
        try {
            // TODO add your handling code here:
            int rowNumber = bookIssueListjTable.getSelectedRow();
            TableModel model = bookIssueListjTable.getModel();
            issue_id = Integer.parseInt(model.getValueAt(rowNumber, 0).toString());
            current_member = model.getValueAt(rowNumber, 1).toString();
            current_book = model.getValueAt(rowNumber, 2).toString();
            String issue_date, return_date;
            issue_date = model.getValueAt(rowNumber, 3).toString();
            return_date = model.getValueAt(rowNumber, 4).toString();
            updateInitialization(issue_date, return_date);
        } catch (Exception ex) {
            Logger.getLogger(BookIssueManagement.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_bookIssueListjTableMouseClicked
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookIssueManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addjButton;
    private javax.swing.JMenuItem authorListjMenuItem;
    private javax.swing.JButton backjButton;
    private javax.swing.JTable bookIssueListjTable;
    private javax.swing.JMenuItem bookListjMenuItem;
    private javax.swing.JMenuItem bookManagementjMenuItem;
    private javax.swing.JComboBox bookjComboBox;
    private javax.swing.JButton deletejButton;
    private javax.swing.JMenuItem developerjMenuItem;
    private javax.swing.JMenuItem generListjMenuItem;
    private javax.swing.JMenuItem homejMenuItem;
    private com.toedter.calendar.JDateChooser issueDatejDateChooser;
    private javax.swing.JMenuItem issueListjMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JComboBox memberjComboBox;
    private javax.swing.JMenuItem paymentjMenuItem;
    private javax.swing.JMenuItem publisherListjMenuItem;
    private com.toedter.calendar.JDateChooser returnDatejDateChooser;
    private javax.swing.JButton updatejButton;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent button) {

        if (button.getSource() == homejMenuItem) {
            LandingPage lp = new LandingPage();
            this.dispose();
        }

        if (button.getSource() == logoutjMenuItem) {
            LogIn in = new LogIn();
            this.dispose();
        }

        if (button.getSource() == memberListjMenuItem) {
            try {
                MemberInformation mi = new MemberInformation();
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(LandingPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (button.getSource() == paymentjMenuItem) {
            MemberPayment mp = new MemberPayment();
            this.dispose();
        }

        if (button.getSource() == bookManagementjMenuItem) {
            BookManagement bm = new BookManagement();
            this.dispose();
        }

        if (button.getSource() == bookListjMenuItem) {
            try {
                BookInformation bi = new BookInformation();
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(LandingPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (button.getSource() == authorListjMenuItem) {
            try {
                AuthorsInformation ai = new AuthorsInformation();
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(LandingPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (button.getSource() == publisherListjMenuItem) {
            try {
                PublishersInformation pi = new PublishersInformation();
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(LandingPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (button.getSource() == generListjMenuItem) {
            GenersInformation gi = new GenersInformation();
            this.dispose();
        }

        if (button.getSource() == issueListjMenuItem) {
            //do nothing
        }

        if (button.getSource() == developerjMenuItem) {
            DeveloperOption do1 = new DeveloperOption();
            this.dispose();
        }

        if (button.getSource() == addjButton) {
            try {
                BookIssueManagementBean bean;
                bean = new BookIssueManagementBean(0, findBookId(bookjComboBox.getSelectedItem().toString()),
                        findMemberId(memberjComboBox.getSelectedItem().toString()),
                        null, null, dateCalculation("issue"), dateCalculation("return"));

                if (bean.getBook_id() == -1 || bean.getMember_id() == -1
                        || bean.getIssue_date().equals("") || bean.getReturn_date().equals("")) {
                    JOptionPane.showMessageDialog(null, "Fill Every Raw Perfectly...!!!");
                } else {
                    DbConnector connector = new DbConnector();
                    String insertQuery = "INSERT INTO book_issue (book_id, member_id, issue_date, return_date) "
                            + "VALUES ('" + bean.getBook_id() + "', '" + bean.getMember_id()
                            + "', '" + bean.getIssue_date() + "', '" + bean.getReturn_date() + "')";

                    connector.statement.executeUpdate(insertQuery);
                    connector.connection.close();
                    JOptionPane.showMessageDialog(null, "Successfully Added...!!!");

                    DefaultTableModel model = (DefaultTableModel) bookIssueListjTable.getModel();
                    model.setRowCount(0);

                    PrintToTable();
                    addInitialization();
                }
            } catch (SQLException ex) {
                Logger.getLogger(BookIssueManagement.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

        if (button.getSource() == updatejButton) {
            try {
                BookIssueManagementBean bean;
                bean = new BookIssueManagementBean(issue_id, findBookId(bookjComboBox.getSelectedItem().toString()),
                        findMemberId(memberjComboBox.getSelectedItem().toString()),
                        null, null, dateCalculation("issue"), dateCalculation("return"));

                if (bean.getIssue_id() == -1 || bean.getBook_id() == -1 || bean.getMember_id() == -1
                        || bean.getIssue_date().equals("") || bean.getReturn_date().equals("")) {
                    JOptionPane.showMessageDialog(null, "Select an Item...!!!");
                } else {
                    DbConnector dbConnector = new DbConnector();
                    String UpdateQuery = "UPDATE book_issue SET member_id = '" + bean.getMember_id()
                            + "', book_id = '" + bean.getBook_id() + "', issue_date = '" + bean.getIssue_date()
                            + "' , return_date = '" + bean.getReturn_date()
                            + "' WHERE issue_id = " + "'" + bean.getIssue_id() + "'";
                    dbConnector.statement.executeUpdate(UpdateQuery);
                    dbConnector.connection.close();

                    JOptionPane.showMessageDialog(null, "Successfully Updated...!!!");

                    DefaultTableModel model = (DefaultTableModel) bookIssueListjTable.getModel();
                    model.setRowCount(0);
                    issue_id = -1;
                    PrintToTable();
                    addInitialization();
                }

            } catch (SQLException ex) {
                Logger.getLogger(BookIssueManagement.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (button.getSource() == deletejButton) {

            BookIssueManagementBean bean = new BookIssueManagementBean(issue_id, -1, -1, null, null, null, null);

            if (bean.getIssue_id() == -1) {
                JOptionPane.showMessageDialog(null, "Select an Item...!!!");
            } else {
                try {
                    DbConnector dbConnector = new DbConnector();
                    String deleteQuery = "DELETE FROM book_issue " + " WHERE issue_id = " + "'" + bean.getIssue_id() + "'";
                    dbConnector.statement.executeUpdate(deleteQuery);
                    dbConnector.connection.close();
                    JOptionPane.showMessageDialog(null, "Data Successfully Deleted...!!!");

                    DefaultTableModel model = (DefaultTableModel) bookIssueListjTable.getModel();
                    model.setRowCount(0);
                    PrintToTable();
                    issue_id = -1;
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

    public int findBookId(String book) throws SQLException {
        String selectQuery = "SELECT * FROM book WHERE book_title = '" + book + "'";
        DbConnector connector = new DbConnector();
        connector.resultset = connector.statement.executeQuery(selectQuery);
        int idx = 0;
        while (connector.resultset.next()) {
            return connector.resultset.getInt("book_id");
        }
        return -1;
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

    public String dateCalculation(String temp) {
        java.util.Date indate;
        if (temp.equals("issue")) {
            indate = issueDatejDateChooser.getDate();
        } else {
            indate = returnDatejDateChooser.getDate();
        }

        if (indate == null) {
            return "";
        }

        String dateString = null;
        SimpleDateFormat sdfr = new SimpleDateFormat("dd/MMM/yyyy");

        dateString = sdfr.format(indate);

        return dateString;
    }

    public void PrintToTable() throws SQLException {
        DefaultTableModel model = (DefaultTableModel) bookIssueListjTable.getModel();
        ArrayList<BookIssueManagementBean> ReciveList = dataRetriveFromDatabase();
        Object rawData[] = new Object[5];

        for (int i = 0; i < ReciveList.size(); i++) {
            rawData[0] = ReciveList.get(i).getIssue_id();
            rawData[1] = ReciveList.get(i).getMember_name();
            rawData[2] = ReciveList.get(i).getBook_title();
            rawData[3] = ReciveList.get(i).getIssue_date();
            rawData[4] = ReciveList.get(i).getReturn_date();

            model.addRow(rawData);
        }
    }

    public ArrayList dataRetriveFromDatabase() throws SQLException {
        DbConnector connector = new DbConnector();
        // select query
        String selectStudentQuery;
        selectStudentQuery = "SELECT book_issue.issue_id, book.book_title, member.member_name, "
                + "book_issue.issue_date, " + "book_issue.return_date FROM "
                + "((book_issue INNER JOIN book ON book_issue.book_id = book.book_id) "
                + "INNER JOIN member ON book_issue.member_id = member.member_id) ORDER BY book_issue.issue_id";

        connector.resultset = connector.statement.executeQuery(selectStudentQuery);
        ArrayList list;
        list = new ArrayList<BookIssueManagementBean>();
        while (connector.resultset.next()) {
            int issue_id = connector.resultset.getInt("issue_id");
            String title = connector.resultset.getString("book_title");
            String member_name = connector.resultset.getString("member_name");
            String issue_date = connector.resultset.getString("issue_date");
            String return_date = connector.resultset.getString("return_date");
            BookIssueManagementBean info = new BookIssueManagementBean(issue_id, 0, 0, title,
                    member_name, issue_date, return_date);
            list.add(info);
        }
        connector.connection.close();
        return list;
    }

    public void addInitialization() {
        try {
            this.showComboBoxMember(memberjComboBox);
            this.showComboBoxBook(bookjComboBox);
            issueDatejDateChooser.setDate(null);
            returnDatejDateChooser.setDate(null);
        } catch (SQLException ex) {
            Logger.getLogger(BookAddUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateInitialization(String issue_date, String return_date) throws Exception {
        try {
            this.showComboBoxMember(memberjComboBox);
            this.showComboBoxBook(bookjComboBox);
            issueDatejDateChooser.setDate(findDate(issue_date));
            returnDatejDateChooser.setDate(findDate(return_date));
        } catch (SQLException ex) {
            Logger.getLogger(BookAddUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Date findDate(String date) throws Exception {
        String sDate1 = date;
        Date date1 = new SimpleDateFormat("dd/MMM/yyyy").parse(sDate1);
        return date1;
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
        if (issue_id != -1) {
            object.insertItemAt(current_member, 0);
        } else {
            object.insertItemAt("Slecet Member", 0);
        }

        object.setSelectedIndex(0);
        object.toString();
    }

    public void showComboBoxBook(JComboBox object) throws SQLException {
        String[] temp = new String[1000];
        String selectQuery = "SELECT * FROM book";

        DbConnector connector = new DbConnector();
        connector.resultset = connector.statement.executeQuery(selectQuery);
        int idx = 0;
        while (connector.resultset.next()) {
            temp[idx] = connector.resultset.getString("book_title").toString();
            idx += 1;
        }

        String[] generList = new String[idx + 5];
        int i = 0;
        while (i < idx) {
            generList[i] = temp[i];
            i++;
        }
        object.setModel(new DefaultComboBoxModel(generList));
        if (issue_id != -1) {
            object.insertItemAt(current_book, 0);
        } else {
            object.insertItemAt("Slecet Book", 0);
        }

        object.setSelectedIndex(0);
        object.toString();
    }
}
