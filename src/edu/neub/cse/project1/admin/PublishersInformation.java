package edu.neub.cse.project1.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import edu.neub.cse.project1.bean.PublishersInformationBean;
import edu.neub.cse.project1.connection.DbConnector;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Team_DoodleArmy
 */
public class PublishersInformation extends javax.swing.JFrame implements ActionListener {

    public int publisher_id = -1;

    public PublishersInformation() throws SQLException {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        this.setTitle("Publisher Management");

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
        publishersListjTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        namejTextField = new javax.swing.JTextField();
        addressjTextField = new javax.swing.JTextField();
        descriptionjTextField = new javax.swing.JTextField();
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

        publishersListjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Publisher Name", "Address", "Description"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        publishersListjTable.setRowHeight(25);
        publishersListjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                publishersListjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(publishersListjTable);
        if (publishersListjTable.getColumnModel().getColumnCount() > 0) {
            publishersListjTable.getColumnModel().getColumn(0).setMinWidth(80);
            publishersListjTable.getColumnModel().getColumn(0).setPreferredWidth(80);
            publishersListjTable.getColumnModel().getColumn(0).setMaxWidth(80);
            publishersListjTable.getColumnModel().getColumn(1).setMinWidth(200);
            publishersListjTable.getColumnModel().getColumn(1).setPreferredWidth(200);
            publishersListjTable.getColumnModel().getColumn(1).setMaxWidth(200);
            publishersListjTable.getColumnModel().getColumn(2).setMinWidth(250);
            publishersListjTable.getColumnModel().getColumn(2).setPreferredWidth(250);
            publishersListjTable.getColumnModel().getColumn(2).setMaxWidth(250);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("Name :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Address :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 153));
        jLabel3.setText("Description :");

        namejTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        addressjTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        descriptionjTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

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
                    .addComponent(descriptionjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                    .addComponent(addressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(descriptionjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
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
                    .addComponent(updatejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deletejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
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

        publisherListjMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        publisherListjMenuItem.setForeground(new java.awt.Color(0, 153, 51));
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
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void publishersListjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_publishersListjTableMouseClicked
        // TODO add your handling code here:

        int rowNumber = publishersListjTable.getSelectedRow();

        TableModel model = publishersListjTable.getModel();
        publisher_id = Integer.parseInt(model.getValueAt(rowNumber, 0).toString());
        namejTextField.setText(model.getValueAt(rowNumber, 1).toString());
        addressjTextField.setText(model.getValueAt(rowNumber, 2).toString());
        descriptionjTextField.setText(model.getValueAt(rowNumber, 3).toString());
    }//GEN-LAST:event_publishersListjTableMouseClicked

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
            java.util.logging.Logger.getLogger(PublishersInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PublishersInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PublishersInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PublishersInformation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new PublishersInformation().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(PublishersInformation.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addjButton;
    private javax.swing.JTextField addressjTextField;
    private javax.swing.JMenuItem authorListjMenuItem;
    private javax.swing.JButton backjButton;
    private javax.swing.JMenuItem bookListjMenuItem;
    private javax.swing.JMenuItem bookManagementjMenuItem;
    private javax.swing.JButton deletejButton;
    private javax.swing.JTextField descriptionjTextField;
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
    private javax.swing.JTable publishersListjTable;
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
            //do nothing
        }

        if (button.getSource() == generListjMenuItem) {
            GenersInformation gi = new GenersInformation();
            this.dispose();
        }

        if (button.getSource() == issueListjMenuItem) {
            BookIssueManagement bim = new BookIssueManagement();
            this.dispose();
        }

        if (button.getSource() == developerjMenuItem) {
            DeveloperOption do1 = new DeveloperOption();
            this.dispose();
        }

        if (button.getSource() == addjButton) {
            PublishersInformationBean bean = new PublishersInformationBean(0, namejTextField.getText().trim(),
                    addressjTextField.getText().trim(), descriptionjTextField.getText().trim());

            if (bean.getPublisher_name().equals("") || bean.getAddress().equals("")
                    || bean.getDescription().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill Up Properly...!!!");
            } else {
                try {
                    DbConnector connector = new DbConnector();
                    String insertQuery = "INSERT INTO publishers (pub_name, pub_address, description) "
                            + "VALUES ('" + bean.getPublisher_name() + "', '" + bean.getAddress() + "', '"
                            + bean.getDescription() + "')";

                    connector.statement.executeUpdate(insertQuery);
                    connector.connection.close();
                    JOptionPane.showMessageDialog(null, "Successfully Added...!!!");
                    DefaultTableModel model = (DefaultTableModel) publishersListjTable.getModel();
                    model.setRowCount(0);
                    namejTextField.setText("");
                    addressjTextField.setText("");
                    descriptionjTextField.setText("");
                    PrintToTable();
                } catch (SQLException ex) {
                    Logger.getLogger(GenersInformation.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        if (button.getSource() == updatejButton) {

            PublishersInformationBean bean = new PublishersInformationBean(publisher_id,
                    namejTextField.getText().trim(), addressjTextField.getText().trim(),
                    descriptionjTextField.getText().trim());

            if (bean.getPublisher_name().equals("") || bean.getAddress().equals("")
                    || bean.getDescription().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill Up Properly...!!!");
            } else {
                try {
                    DbConnector dbConnector = new DbConnector();

                    String UpdateQuery = "UPDATE publishers SET pub_name = '" + bean.getPublisher_name()
                            + "', pub_address = '" + bean.getAddress() + "' , description = '"
                            + bean.getDescription() + "' WHERE pub_id = " + "'" + bean.getPublisher_id() + "'";

                    dbConnector.statement.executeUpdate(UpdateQuery);
                    dbConnector.connection.close();

                    JOptionPane.showMessageDialog(null, "Successfully Updated...!!!");
                    DefaultTableModel model = (DefaultTableModel) publishersListjTable.getModel();
                    model.setRowCount(0);
                    namejTextField.setText("");
                    addressjTextField.setText("");
                    descriptionjTextField.setText("");
                    PrintToTable();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Data Doesn't Update...!!!");
                    Logger.getLogger(MemberAddUpdate.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        if (button.getSource() == deletejButton) {

            PublishersInformationBean bean = new PublishersInformationBean(publisher_id,
                    namejTextField.getText().trim(), addressjTextField.getText().trim(),
                    descriptionjTextField.getText().trim());

            if (bean.getPublisher_name().equals("") || bean.getAddress().equals("")
                    || bean.getDescription().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill Up Properly...!!!");
            } else {
                try {
                    DbConnector dbConnector = new DbConnector();
                    String deleteQuery = "DELETE FROM publishers " + " WHERE pub_id = " + "'"
                            + bean.getPublisher_id() + "'";
                    dbConnector.statement.executeUpdate(deleteQuery);
                    dbConnector.connection.close();
                    JOptionPane.showMessageDialog(null, "Data Successfully Deleted...!!!");

                    DefaultTableModel model = (DefaultTableModel) publishersListjTable.getModel();
                    model.setRowCount(0);
                    PrintToTable();
                    namejTextField.setText("");
                    addressjTextField.setText("");
                    descriptionjTextField.setText("");
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

        DefaultTableModel model = (DefaultTableModel) publishersListjTable.getModel();
        ArrayList<PublishersInformationBean> ReciveList = dataRetriveFromDatabase();
        Object rawData[] = new Object[4];

        for (int i = 0; i < ReciveList.size(); i++) {
            rawData[0] = ReciveList.get(i).getPublisher_id();
            rawData[1] = ReciveList.get(i).getPublisher_name();
            rawData[2] = ReciveList.get(i).getAddress();
            rawData[3] = ReciveList.get(i).getDescription();
            model.addRow(rawData);
        }
    }

    public ArrayList dataRetriveFromDatabase() throws SQLException {

        DbConnector connector = new DbConnector();
        // select query
        String selectStudentQuery = "SELECT * FROM publishers order by pub_id";

        connector.resultset = connector.statement.executeQuery(selectStudentQuery);
        ArrayList list;
        list = new ArrayList<PublishersInformationBean>();

        while (connector.resultset.next()) {
            int pub_id = connector.resultset.getInt("pub_id");
            String pub_name = connector.resultset.getString("pub_name");
            String address = connector.resultset.getString("pub_address");
            String description = connector.resultset.getString("description");
            PublishersInformationBean info = new PublishersInformationBean(pub_id, pub_name, address,
                    description);
            list.add(info);
        }
        connector.connection.close();
        return list;
    }
}
