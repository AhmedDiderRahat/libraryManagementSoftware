package edu.neub.cse.project1.admin;

import edu.neub.cse.project1.bean.AuthorsInformationBean;
import edu.neub.cse.project1.connection.DbConnector;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Team_DoodleArmy
 */
public class AuthorsInformation extends javax.swing.JFrame implements ActionListener {

    public int authors_id = -1;

    public AuthorsInformation() throws SQLException {
        initComponents();

        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setTitle("Authors Management");

        addjButton.addActionListener(this);
        updatejButton.addActionListener(this);
        deletejButton.addActionListener(this);
        backjButton.addActionListener(this);

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
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        authorsListjTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        namejTextField = new javax.swing.JTextField();
        contactjTextField = new javax.swing.JTextField();
        biojTextField = new javax.swing.JTextField();
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

        authorsListjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Contact", "Bio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        authorsListjTable.setRowHeight(25);
        authorsListjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                authorsListjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(authorsListjTable);
        if (authorsListjTable.getColumnModel().getColumnCount() > 0) {
            authorsListjTable.getColumnModel().getColumn(0).setMinWidth(80);
            authorsListjTable.getColumnModel().getColumn(0).setPreferredWidth(80);
            authorsListjTable.getColumnModel().getColumn(0).setMaxWidth(80);
            authorsListjTable.getColumnModel().getColumn(1).setMinWidth(150);
            authorsListjTable.getColumnModel().getColumn(1).setPreferredWidth(150);
            authorsListjTable.getColumnModel().getColumn(1).setMaxWidth(150);
            authorsListjTable.getColumnModel().getColumn(2).setMinWidth(120);
            authorsListjTable.getColumnModel().getColumn(2).setPreferredWidth(120);
            authorsListjTable.getColumnModel().getColumn(2).setMaxWidth(120);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Name :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Contact :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Bio :");

        namejTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        contactjTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        biojTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(biojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(biojTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        addjButton.setBackground(new java.awt.Color(255, 255, 255));
        addjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addjButton.setForeground(new java.awt.Color(0, 153, 51));
        addjButton.setText("Add");

        updatejButton.setBackground(new java.awt.Color(255, 255, 255));
        updatejButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updatejButton.setForeground(new java.awt.Color(0, 153, 51));
        updatejButton.setText("Update");

        deletejButton.setBackground(new java.awt.Color(255, 255, 255));
        deletejButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deletejButton.setForeground(new java.awt.Color(0, 153, 51));
        deletejButton.setText("Delete");

        backjButton.setBackground(new java.awt.Color(255, 255, 255));
        backjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backjButton.setForeground(new java.awt.Color(0, 153, 51));
        backjButton.setText("Back");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(deletejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(addjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
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

        authorListjMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        authorListjMenuItem.setForeground(new java.awt.Color(0, 153, 51));
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void authorsListjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authorsListjTableMouseClicked
        // TODO add your handling code here:

        int rowNumber = authorsListjTable.getSelectedRow();
        TableModel model = authorsListjTable.getModel();
        authors_id = Integer.parseInt(model.getValueAt(rowNumber, 0).toString());
        namejTextField.setText(model.getValueAt(rowNumber, 1).toString());
        contactjTextField.setText(model.getValueAt(rowNumber, 2).toString());
        biojTextField.setText(model.getValueAt(rowNumber, 3).toString());
    }//GEN-LAST:event_authorsListjTableMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new AuthorsInformation().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(AuthorsInformation.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addjButton;
    private javax.swing.JMenuItem authorListjMenuItem;
    private javax.swing.JTable authorsListjTable;
    private javax.swing.JButton backjButton;
    private javax.swing.JTextField biojTextField;
    private javax.swing.JMenuItem bookListjMenuItem;
    private javax.swing.JMenuItem bookManagementjMenuItem;
    private javax.swing.JTextField contactjTextField;
    private javax.swing.JButton deletejButton;
    private javax.swing.JMenuItem developerjMenuItem;
    private javax.swing.JMenuItem generListjMenuItem;
    private javax.swing.JMenuItem homejMenuItem;
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
    private javax.swing.JTextField namejTextField;
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
            MemberPayment mp = new MemberPayment();
            this.dispose();
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
                //do Nothing
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
            AuthorsInformationBean bean = new AuthorsInformationBean(0, namejTextField.getText().trim(),
                    contactjTextField.getText().trim(), biojTextField.getText().trim());

            if (bean.getAuthor_name().equals("") || bean.getContact().equals("") || bean.getBio().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill Up Properly...!!!");
            } else {
                try {
                    DbConnector connector = new DbConnector();
                    String insertQuery = "INSERT INTO authors (au_name, contact, bio) VALUES ('"
                            + bean.getAuthor_name() + "', '" + bean.getContact() + "', '" + bean.getBio() + "')";

                    connector.statement.executeUpdate(insertQuery);
                    connector.connection.close();
                    JOptionPane.showMessageDialog(null, "Successfully Added...!!!");
                    DefaultTableModel model = (DefaultTableModel) authorsListjTable.getModel();
                    model.setRowCount(0);
                    namejTextField.setText("");
                    contactjTextField.setText("");
                    biojTextField.setText("");
                    PrintToTable();
                } catch (SQLException ex) {
                    Logger.getLogger(GenersInformation.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        if (button.getSource() == updatejButton) {
            AuthorsInformationBean bean = new AuthorsInformationBean(authors_id, namejTextField.getText().trim(),
                    contactjTextField.getText().trim(), biojTextField.getText().trim());

            if (bean.getAuthor_name().equals("") || bean.getContact().equals("") || bean.getBio().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill Up Properly...!!!");
            } else {

                try {
                    DbConnector dbConnector = new DbConnector();

                    String UpdateQuery = "UPDATE authors SET au_name = '" + bean.getAuthor_name()
                            + "', contact = '" + bean.getContact() + "' , bio = '"
                            + bean.getBio() + "' WHERE au_id = " + "'" + bean.getAuthor_id() + "'";

                    dbConnector.statement.executeUpdate(UpdateQuery);
                    dbConnector.connection.close();

                    JOptionPane.showMessageDialog(null, "Successfully Updated...!!!");
                    DefaultTableModel model = (DefaultTableModel) authorsListjTable.getModel();
                    model.setRowCount(0);
                    namejTextField.setText("");
                    contactjTextField.setText("");
                    biojTextField.setText("");
                    PrintToTable();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Data Doesn't Update...!!!");
                    Logger.getLogger(MemberAddUpdate.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        if (button.getSource() == deletejButton) {
            AuthorsInformationBean bean = new AuthorsInformationBean(authors_id, namejTextField.getText().trim(),
                    contactjTextField.getText().trim(), biojTextField.getText().trim());

            if (bean.getAuthor_name().equals("") || bean.getContact().equals("") || bean.getBio().equals("")) {
                JOptionPane.showMessageDialog(null, "Select an Item...!!!");
            } else {
                try {
                    DbConnector dbConnector = new DbConnector();
                    String deleteQuery = "DELETE FROM authors " + " WHERE au_id = " + "'" + bean.getAuthor_id() + "'";
                    dbConnector.statement.executeUpdate(deleteQuery);
                    dbConnector.connection.close();
                    JOptionPane.showMessageDialog(null, "Data Successfully Deleted...!!!");

                    DefaultTableModel model = (DefaultTableModel) authorsListjTable.getModel();
                    model.setRowCount(0);
                    PrintToTable();
                    namejTextField.setText("");
                    contactjTextField.setText("");
                    biojTextField.setText("");
                } catch (SQLException ex) {
                    Logger.getLogger(GenersInformation.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        if (button.getSource() == backjButton) {
            BookManagement bi = new BookManagement();
            this.dispose();
        }
    }

    public void PrintToTable() throws SQLException {

        DefaultTableModel model = (DefaultTableModel) authorsListjTable.getModel();
        ArrayList<AuthorsInformationBean> ReciveList = dataRetriveFromDatabase();
        Object rawData[] = new Object[4];

        for (int i = 0; i < ReciveList.size(); i++) {
            rawData[0] = ReciveList.get(i).getAuthor_id();
            rawData[1] = ReciveList.get(i).getAuthor_name();
            rawData[2] = ReciveList.get(i).getContact();
            rawData[3] = ReciveList.get(i).getBio();
            model.addRow(rawData);
        }
    }

    public ArrayList dataRetriveFromDatabase() throws SQLException {

        DbConnector connector = new DbConnector();
        // select query
        String selectStudentQuery = "SELECT * FROM authors order by au_id";

        connector.resultset = connector.statement.executeQuery(selectStudentQuery);
        ArrayList list;
        list = new ArrayList<AuthorsInformationBean>();

        while (connector.resultset.next()) {
            int au_id = connector.resultset.getInt("au_id");
            String au_name = connector.resultset.getString("au_name");
            String contact = connector.resultset.getString("contact");
            String bio = connector.resultset.getString("bio");
            AuthorsInformationBean info = new AuthorsInformationBean(au_id, au_name, contact, bio);
            list.add(info);
        }
        connector.connection.close();
        return list;
    }
}
