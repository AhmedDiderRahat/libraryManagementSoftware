package edu.neub.cse.project1.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.*;
import javax.swing.table.DefaultTableModel;

import edu.neub.cse.project1.bean.MemberInformationBean;
import edu.neub.cse.project1.connection.DbConnector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;

/**
 *
 * @author Team_DoodleArmy
 */
public class MemberInformation extends javax.swing.JFrame implements ActionListener {

    public MemberInformation() throws SQLException {
        initComponents();

        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Member Management");

        PrintToTable();

        searchjButton.addActionListener(this);
        addMemberjButton.addActionListener(this);
        updatejButton.addActionListener(this);
        deletejButton.addActionListener(this);
        backjButton.addActionListener(this);

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
        idjTextField = new javax.swing.JTextField();
        searchjButton = new javax.swing.JButton();
        updatejButton = new javax.swing.JButton();
        deletejButton = new javax.swing.JButton();
        addMemberjButton = new javax.swing.JButton();
        backjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        memberListjTable = new javax.swing.JTable();
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

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 0, 153)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setText("Member id : ");

        idjTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        searchjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchjButton.setForeground(new java.awt.Color(0, 102, 51));
        searchjButton.setText("search");

        updatejButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updatejButton.setForeground(new java.awt.Color(0, 102, 51));
        updatejButton.setText("Update");

        deletejButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        deletejButton.setForeground(new java.awt.Color(0, 102, 51));
        deletejButton.setText("Delete");

        addMemberjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addMemberjButton.setForeground(new java.awt.Color(0, 102, 51));
        addMemberjButton.setText("Add New Member");

        backjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backjButton.setForeground(new java.awt.Color(0, 102, 51));
        backjButton.setText("back");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addMemberjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updatejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(deletejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(31, 31, 31))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deletejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addMemberjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        memberListjTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        memberListjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Type", "Phone", "Email", "Join Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        memberListjTable.setRowHeight(25);
        memberListjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                memberListjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(memberListjTable);
        if (memberListjTable.getColumnModel().getColumnCount() > 0) {
            memberListjTable.getColumnModel().getColumn(0).setResizable(false);
            memberListjTable.getColumnModel().getColumn(0).setPreferredWidth(20);
            memberListjTable.getColumnModel().getColumn(2).setResizable(false);
            memberListjTable.getColumnModel().getColumn(2).setPreferredWidth(20);
            memberListjTable.getColumnModel().getColumn(3).setResizable(false);
            memberListjTable.getColumnModel().getColumn(3).setPreferredWidth(50);
            memberListjTable.getColumnModel().getColumn(5).setResizable(false);
            memberListjTable.getColumnModel().getColumn(5).setPreferredWidth(20);
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

        memberListjMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        memberListjMenuItem.setForeground(new java.awt.Color(0, 153, 51));
        memberListjMenuItem.setText("Member List");
        jMenu2.add(memberListjMenuItem);

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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 389, Short.MAX_VALUE)
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void memberListjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_memberListjTableMouseClicked
        // TODO add your handling code here:
        int rowNumber = memberListjTable.getSelectedRow();
        TableModel model = memberListjTable.getModel();
        idjTextField.setText(model.getValueAt(rowNumber, 0).toString());
        System.out.println(model.getValueAt(rowNumber, 0).toString());
    }//GEN-LAST:event_memberListjTableMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MemberInformation().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MemberInformation.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addMemberjButton;
    private javax.swing.JMenuItem authorListjMenuItem;
    private javax.swing.JButton backjButton;
    private javax.swing.JMenuItem bookListjMenuItem;
    private javax.swing.JMenuItem bookManagementjMenuItem;
    private javax.swing.JButton deletejButton;
    private javax.swing.JMenuItem developerjMenuItem;
    private javax.swing.JMenuItem generListjMenuItem;
    private javax.swing.JMenuItem homejMenuItem;
    private javax.swing.JTextField idjTextField;
    private javax.swing.JMenuItem issueListjMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem logoutjMenuItem;
    private javax.swing.JMenuItem memberListjMenuItem;
    private javax.swing.JTable memberListjTable;
    private javax.swing.JMenuItem paymentjMenuItem;
    private javax.swing.JMenuItem publisherListjMenuItem;
    private javax.swing.JButton searchjButton;
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
            //do nothing
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
            BookIssueManagement bim = new BookIssueManagement();
            this.dispose();
        }

        if (button.getSource() == developerjMenuItem) {
            DeveloperOption do1 = new DeveloperOption();
            this.dispose();
        }

        if (button.getSource() == searchjButton) {
            try {
                MemberSearch search = new MemberSearch(findId());
                idjTextField.setText("");
            } catch (SQLException ex) {
                Logger.getLogger(MemberInformation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (button.getSource() == addMemberjButton) {
            try {
                MemberAddUpdate ma = new MemberAddUpdate("add", -1);
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(MemberInformation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (button.getSource() == updatejButton) {
            try {
                MemberAddUpdate ma = new MemberAddUpdate("update", findId());
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(MemberInformation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (button.getSource() == deletejButton) {
            try {
                DbConnector dbConnectorDelete = new DbConnector();
                String deleteQuery = "DELETE FROM member " + "WHERE member_id = " + "'" + idjTextField.getText().trim() + "'";
                dbConnectorDelete.statement.executeUpdate(deleteQuery);
                dbConnectorDelete.connection.close();

                JOptionPane.showMessageDialog(null, "Data Successfully Deleted...!!!");

                DefaultTableModel model = (DefaultTableModel) memberListjTable.getModel();
                model.setRowCount(0);
                PrintToTable();
                idjTextField.setText("");

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Select The Data Properly...!!!");
                Logger.getLogger(MemberInformation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (button.getSource() == backjButton) {
            LandingPage lp = new LandingPage();
            this.dispose();
        }
    }

    public int findId() {
        String id = idjTextField.getText().trim();
        if (id.equals("")) {
            return -1;
        }
        Integer result = Integer.valueOf(id);
        return result;
    }

    public void PrintToTable() throws SQLException {
        DefaultTableModel model = (DefaultTableModel) memberListjTable.getModel();
        ArrayList<MemberInformationBean> ReciveList = dataRetriveFromDatabase();
        Object rawData[] = new Object[6];

        for (int i = 0; i < ReciveList.size(); i++) {
            rawData[0] = ReciveList.get(i).getMember_id();
            rawData[1] = ReciveList.get(i).getMember_name();
            rawData[2] = ReciveList.get(i).getMember_type();
            rawData[3] = ReciveList.get(i).getPhone();
            rawData[4] = ReciveList.get(i).getEmail();
            rawData[5] = ReciveList.get(i).getJoin_date();

            model.addRow(rawData);
        }
    }

    public ArrayList dataRetriveFromDatabase() throws SQLException {

        DbConnector connector = new DbConnector();
        // select query
        String selectStudentQuery = "SELECT * FROM member order by member_id";

        connector.resultset = connector.statement.executeQuery(selectStudentQuery);
        ArrayList list;
        list = new ArrayList<MemberInformationBean>();

        while (connector.resultset.next()) {
            int member_id = connector.resultset.getInt("member_id");
            String name = connector.resultset.getString("member_name");
            String address = connector.resultset.getString("address");
            String phone = connector.resultset.getString("phone");
            String email = connector.resultset.getString("email");
            String dob = connector.resultset.getString("dob");
            String join_date = connector.resultset.getString("join_date");
            String member_type = connector.resultset.getString("member_type");
            MemberInformationBean info = new MemberInformationBean(member_id, name, address, phone,
                    email, dob, join_date, member_type);

            list.add(info);
        }
        connector.connection.close();
        return list;
    }
}
