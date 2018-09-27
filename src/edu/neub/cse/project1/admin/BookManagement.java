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

public class BookManagement extends javax.swing.JFrame implements ActionListener {

    public BookManagement() {
        initComponents();

        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Book Management");

        bookListjButton.addActionListener(this);
        genersListjButton.addActionListener(this);
        authorListjButton.addActionListener(this);
        publisherListjButton.addActionListener(this);
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
        bookListjButton = new javax.swing.JButton();
        authorListjButton = new javax.swing.JButton();
        publisherListjButton = new javax.swing.JButton();
        genersListjButton = new javax.swing.JButton();
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
        setResizable(false);

        bookListjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        bookListjButton.setForeground(new java.awt.Color(102, 0, 102));
        bookListjButton.setText("Book List");

        authorListjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        authorListjButton.setForeground(new java.awt.Color(102, 0, 102));
        authorListjButton.setText("Author List");

        publisherListjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        publisherListjButton.setForeground(new java.awt.Color(102, 0, 102));
        publisherListjButton.setText("Publisher List");

        genersListjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        genersListjButton.setForeground(new java.awt.Color(102, 0, 102));
        genersListjButton.setText("Geners List");

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
                    .addComponent(bookListjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authorListjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(publisherListjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(genersListjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bookListjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(genersListjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(authorListjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(publisherListjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
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

        bookManagementjMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bookManagementjMenuItem.setForeground(new java.awt.Color(0, 153, 51));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(311, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(309, 309, 309))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(169, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookManagement().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton authorListjButton;
    private javax.swing.JMenuItem authorListjMenuItem;
    private javax.swing.JButton backjButton;
    private javax.swing.JButton bookListjButton;
    private javax.swing.JMenuItem bookListjMenuItem;
    private javax.swing.JMenuItem bookManagementjMenuItem;
    private javax.swing.JMenuItem developerjMenuItem;
    private javax.swing.JMenuItem generListjMenuItem;
    private javax.swing.JButton genersListjButton;
    private javax.swing.JMenuItem homejMenuItem;
    private javax.swing.JMenuItem issueListjMenuItem;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenuItem logoutjMenuItem;
    private javax.swing.JMenuItem memberListjMenuItem;
    private javax.swing.JMenuItem paymentjMenuItem;
    private javax.swing.JButton publisherListjButton;
    private javax.swing.JMenuItem publisherListjMenuItem;
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
            //do nothing
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

        if (button.getSource() == bookListjButton) {
            try {
                BookInformation bi = new BookInformation();
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(BookManagement.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (button.getSource() == genersListjButton) {
            GenersInformation gl = new GenersInformation();
            this.dispose();
        }

        if (button.getSource() == authorListjButton) {
            try {
                AuthorsInformation ai = new AuthorsInformation();
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(BookManagement.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (button.getSource() == publisherListjButton) {
            try {
                PublishersInformation pi = new PublishersInformation();
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(BookManagement.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (button.getSource() == backjButton) {
            LandingPage lp = new LandingPage();
            this.dispose();
        }
    }
}
