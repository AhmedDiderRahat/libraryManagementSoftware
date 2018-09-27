package edu.neub.cse.project1.admin;

import edu.neub.cse.project1.bean.GenersInformationBean;
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
public class GenersInformation extends javax.swing.JFrame implements ActionListener {

    public GenersInformation() {
        initComponents();

        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Gener Information");

        addjButton.addActionListener(this);
        updatejButton.addActionListener(this);
        deletejButton.addActionListener(this);
        backjButton.addActionListener(this);
        try {
            PrintToTable();
        } catch (SQLException ex) {
            Logger.getLogger(GenersInformation.class.getName()).log(Level.SEVERE, null, ex);
        }

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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idjLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addjButton = new javax.swing.JButton();
        updatejButton = new javax.swing.JButton();
        deletejButton = new javax.swing.JButton();
        namejTextField = new javax.swing.JTextField();
        backjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        genersListjTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 153));
        jLabel1.setText("ID :");

        idjLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Name :");

        addjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addjButton.setForeground(new java.awt.Color(0, 153, 51));
        addjButton.setText("ADD");

        updatejButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updatejButton.setForeground(new java.awt.Color(0, 153, 51));
        updatejButton.setText("UpDate");

        deletejButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deletejButton.setForeground(new java.awt.Color(0, 153, 51));
        deletejButton.setText("Delete");

        namejTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        backjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backjButton.setForeground(new java.awt.Color(102, 0, 102));
        backjButton.setText("Back");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(idjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(updatejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                .addComponent(addjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updatejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(deletejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        genersListjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        genersListjTable.setRowHeight(25);
        genersListjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                genersListjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(genersListjTable);
        if (genersListjTable.getColumnModel().getColumnCount() > 0) {
            genersListjTable.getColumnModel().getColumn(0).setMinWidth(100);
            genersListjTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            genersListjTable.getColumnModel().getColumn(0).setMaxWidth(100);
        }

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Book Gener Management");

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

        generListjMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        generListjMenuItem.setForeground(new java.awt.Color(0, 153, 51));
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(jLabel3)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genersListjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_genersListjTableMouseClicked
        // TODO add your handling code here:

        int rowNumber = genersListjTable.getSelectedRow();

        TableModel model = genersListjTable.getModel();
        idjLabel.setText(model.getValueAt(rowNumber, 0).toString());
        namejTextField.setText(model.getValueAt(rowNumber, 1).toString());
    }//GEN-LAST:event_genersListjTableMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GenersInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addjButton;
    private javax.swing.JMenuItem authorListjMenuItem;
    private javax.swing.JButton backjButton;
    private javax.swing.JMenuItem bookListjMenuItem;
    private javax.swing.JMenuItem bookManagementjMenuItem;
    private javax.swing.JButton deletejButton;
    private javax.swing.JMenuItem developerjMenuItem;
    private javax.swing.JMenuItem generListjMenuItem;
    private javax.swing.JTable genersListjTable;
    private javax.swing.JMenuItem homejMenuItem;
    private javax.swing.JLabel idjLabel;
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
            //do nothing
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
            GenersInformationBean bean = new GenersInformationBean();
            bean.setGener_name(namejTextField.getText().trim());

            if (bean.getGener_name().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill Up Properly...!!!");
            } else {
                try {
                    DbConnector connector = new DbConnector();
                    String insertQuery = "INSERT INTO geners ( gener_name) VALUES ('" 
                            + bean.getGener_name() + "')";

                    connector.statement.executeUpdate(insertQuery);
                    connector.connection.close();
                    JOptionPane.showMessageDialog(null, "Successfully Added...!!!");
                    DefaultTableModel model = (DefaultTableModel) genersListjTable.getModel();
                    model.setRowCount(0);
                    namejTextField.setText("");
                    PrintToTable();
                } catch (SQLException ex) {
                    Logger.getLogger(GenersInformation.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        if (button.getSource() == updatejButton) {
            GenersInformationBean bean = new GenersInformationBean(findId(idjLabel.getText()),
                    namejTextField.getText().toString());

            if (bean.getGener_id() == 0 || bean.getGener_name().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill Up Properly...!!!");
            } else {
                DbConnector dbConnector = new DbConnector();

                String UpdateQuery = "UPDATE geners " + " SET " + "gener_name = '"
                        + bean.getGener_name() + "'" + " WHERE gener_id = "
                        + "'" + bean.getGener_id() + "'";
                try {
                    dbConnector.statement.executeUpdate(UpdateQuery);
                    dbConnector.connection.close();
                    JOptionPane.showMessageDialog(null, "Successfullt Updated...!!!");
                    namejTextField.setText("");
                    idjLabel.setText("");
                    DefaultTableModel model = (DefaultTableModel) genersListjTable.getModel();
                    model.setRowCount(0);
                    PrintToTable();
                } catch (SQLException ex) {
                    System.out.println(ex);
                    JOptionPane.showMessageDialog(null, "Data Doesn't Update...!!!");
                }
            }
        }

        if (button.getSource() == deletejButton) {
            GenersInformationBean bean = new GenersInformationBean(findId(idjLabel.getText()), 
                    namejTextField.getText().toString());

            if (bean.getGener_id() == 0 || bean.getGener_name().equals("")) {
                JOptionPane.showMessageDialog(null, "Fill Up Properly...!!!");
            } else {
                try {
                    DbConnector dbConnector = new DbConnector();
                    String deleteQuery = "DELETE FROM geners " + " WHERE gener_id = " + "'" + 
                            bean.getGener_id() + "'";

                    dbConnector.statement.executeUpdate(deleteQuery);
                    dbConnector.connection.close();
                    JOptionPane.showMessageDialog(null, "Data Successfully Deleted...!!!");

                    namejTextField.setText("");
                    idjLabel.setText("");
                    DefaultTableModel model = (DefaultTableModel) genersListjTable.getModel();
                    model.setRowCount(0);
                    PrintToTable();
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

    public Integer findId(String str) {
        if (str.equals("")) {
            return -1;
        }
        return Integer.parseInt(str);
    }

    public void PrintToTable() throws SQLException {
        DefaultTableModel model = (DefaultTableModel) genersListjTable.getModel();
        ArrayList<GenersInformationBean> ReciveList = dataRetriveFromDatabase();
        Object rawData[] = new Object[7];

        for (int i = 0; i < ReciveList.size(); i++) {
            rawData[0] = ReciveList.get(i).getGener_id();
            rawData[1] = ReciveList.get(i).getGener_name();
            model.addRow(rawData);
        }
    }

    public ArrayList dataRetriveFromDatabase() throws SQLException {

        DbConnector connector = new DbConnector();
        // select query
        String selectStudentQuery = "SELECT * FROM geners order by gener_id";
        connector.resultset = connector.statement.executeQuery(selectStudentQuery);
        ArrayList list;
        list = new ArrayList<GenersInformationBean>();

        while (connector.resultset.next()) {
            int gener_id = connector.resultset.getInt("gener_id");
            String gener_name = connector.resultset.getString("gener_name");
            GenersInformationBean info = new GenersInformationBean(gener_id, gener_name);
            list.add(info);
        }
        connector.connection.close();
        return list;
    }
}
