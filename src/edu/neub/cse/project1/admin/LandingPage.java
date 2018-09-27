package edu.neub.cse.project1.admin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Team_DoodleArmy
 */
public class LandingPage extends javax.swing.JFrame implements ActionListener {

    public LandingPage() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Home");

        membershipManagementjButton.addActionListener(this);
        bookManagementjButton.addActionListener(this);
        bookIssueManagementjButton.addActionListener(this);
        paymentManagementjButton.addActionListener(this);
        develoiperjButton.addActionListener(this);
        logoutjButton.addActionListener(this);

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

        jLabel1 = new javax.swing.JLabel();
        membershipManagementjButton = new javax.swing.JButton();
        bookManagementjButton = new javax.swing.JButton();
        bookIssueManagementjButton = new javax.swing.JButton();
        paymentManagementjButton = new javax.swing.JButton();
        logoutjButton = new javax.swing.JButton();
        develoiperjButton = new javax.swing.JButton();
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 153));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        membershipManagementjButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        membershipManagementjButton.setForeground(new java.awt.Color(0, 153, 51));
        membershipManagementjButton.setText("Membership Management");

        bookManagementjButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        bookManagementjButton.setForeground(new java.awt.Color(0, 153, 51));
        bookManagementjButton.setText("Book Management");

        bookIssueManagementjButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        bookIssueManagementjButton.setForeground(new java.awt.Color(0, 153, 51));
        bookIssueManagementjButton.setText("Book Issue Management");

        paymentManagementjButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        paymentManagementjButton.setForeground(new java.awt.Color(0, 153, 51));
        paymentManagementjButton.setText("Payment Management");

        logoutjButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        logoutjButton.setForeground(new java.awt.Color(0, 153, 51));
        logoutjButton.setText("Logout");

        develoiperjButton.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        develoiperjButton.setForeground(new java.awt.Color(0, 153, 51));
        develoiperjButton.setText("Developer");

        jMenuBar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 153), 2));
        jMenuBar.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jMenuBar.setMargin(new java.awt.Insets(0, 0, 0, 40));

        jMenu1.setForeground(new java.awt.Color(51, 0, 204));
        jMenu1.setText("|  Main  |");

        homejMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        homejMenuItem.setForeground(new java.awt.Color(0, 153, 51));
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(274, 274, 274)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bookManagementjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(membershipManagementjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookIssueManagementjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(paymentManagementjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logoutjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(develoiperjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(276, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addComponent(membershipManagementjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bookManagementjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bookIssueManagementjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(paymentManagementjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(develoiperjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(logoutjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LandingPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem authorListjMenuItem;
    private javax.swing.JButton bookIssueManagementjButton;
    private javax.swing.JMenuItem bookListjMenuItem;
    private javax.swing.JButton bookManagementjButton;
    private javax.swing.JMenuItem bookManagementjMenuItem;
    private javax.swing.JButton develoiperjButton;
    private javax.swing.JMenuItem developerjMenuItem;
    private javax.swing.JMenuItem generListjMenuItem;
    private javax.swing.JMenuItem homejMenuItem;
    private javax.swing.JMenuItem issueListjMenuItem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JButton logoutjButton;
    private javax.swing.JMenuItem logoutjMenuItem;
    private javax.swing.JMenuItem memberListjMenuItem;
    private javax.swing.JButton membershipManagementjButton;
    private javax.swing.JButton paymentManagementjButton;
    private javax.swing.JMenuItem paymentjMenuItem;
    private javax.swing.JMenuItem publisherListjMenuItem;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent button) {

        if (button.getSource() == homejMenuItem) {
            //Nothing to do
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
            BookIssueManagement bim = new BookIssueManagement();
            this.dispose();
        }

        if (button.getSource() == developerjMenuItem) {
            DeveloperOption do1 = new DeveloperOption();
            this.dispose();
        }

        if (button.getSource() == membershipManagementjButton) {
            try {
                MemberInformation mi = new MemberInformation();
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(LandingPage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (button.getSource() == bookManagementjButton) {
            BookManagement bm = new BookManagement();
            this.dispose();
        }

        if (button.getSource() == bookIssueManagementjButton) {
            BookIssueManagement bim = new BookIssueManagement();
            this.dispose();
        }

        if (button.getSource() == paymentManagementjButton) {
            MemberPayment mp = new MemberPayment();
            this.dispose();
        }

        if (button.getSource() == develoiperjButton) {
            DeveloperOption dop = new DeveloperOption();
            this.dispose();
        }

        if (button.getSource() == logoutjButton) {
            LogIn in = new LogIn();
            this.dispose();
        }
    }
}
