package edu.neub.cse.project1.admin;

import edu.neub.cse.project1.bean.BookInformationBean;
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

public class BookInformation extends javax.swing.JFrame implements ActionListener {

    public int bookId;

    public BookInformation() throws SQLException {
        initComponents();

        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Book Information");

        PrintToTable();

        searchjButton.addActionListener(this);
        addBookjButton.addActionListener(this);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        bookListjTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        idjTextField = new javax.swing.JTextField();
        searchjButton = new javax.swing.JButton();
        updatejButton = new javax.swing.JButton();
        deletejButton = new javax.swing.JButton();
        addBookjButton = new javax.swing.JButton();
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

        bookListjTable.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        bookListjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Book Title", "Quentity", "Catagory", "Author", "Publisher"
            }
        ));
        bookListjTable.setRowHeight(25);
        bookListjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                bookListjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(bookListjTable);
        if (bookListjTable.getColumnModel().getColumnCount() > 0) {
            bookListjTable.getColumnModel().getColumn(0).setMinWidth(50);
            bookListjTable.getColumnModel().getColumn(0).setPreferredWidth(50);
            bookListjTable.getColumnModel().getColumn(0).setMaxWidth(50);
            bookListjTable.getColumnModel().getColumn(1).setMinWidth(200);
            bookListjTable.getColumnModel().getColumn(1).setPreferredWidth(200);
            bookListjTable.getColumnModel().getColumn(1).setMaxWidth(200);
            bookListjTable.getColumnModel().getColumn(2).setMinWidth(80);
            bookListjTable.getColumnModel().getColumn(2).setPreferredWidth(80);
            bookListjTable.getColumnModel().getColumn(2).setMaxWidth(80);
            bookListjTable.getColumnModel().getColumn(3).setMinWidth(80);
            bookListjTable.getColumnModel().getColumn(3).setPreferredWidth(80);
            bookListjTable.getColumnModel().getColumn(3).setMaxWidth(80);
            bookListjTable.getColumnModel().getColumn(5).setMinWidth(150);
            bookListjTable.getColumnModel().getColumn(5).setPreferredWidth(150);
            bookListjTable.getColumnModel().getColumn(5).setMaxWidth(150);
        }

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 0, 153)));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 204));
        jLabel1.setText("Book : ");

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

        addBookjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addBookjButton.setForeground(new java.awt.Color(0, 102, 51));
        addBookjButton.setText("Add New Book");

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
                        .addComponent(addBookjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(idjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(searchjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(updatejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deletejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8))))
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
                    .addComponent(addBookjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

        bookListjMenuItem.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bookListjMenuItem.setForeground(new java.awt.Color(0, 153, 51));
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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 830, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bookListjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bookListjTableMouseClicked
        // TODO add your handling code here:
        int rowNumber = bookListjTable.getSelectedRow();

        TableModel model = bookListjTable.getModel();
        bookId = Integer.parseInt(model.getValueAt(rowNumber, 0).toString());
        idjTextField.setText(model.getValueAt(rowNumber, 1).toString());
    }//GEN-LAST:event_bookListjTableMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new BookInformation().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(BookInformation.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBookjButton;
    private javax.swing.JMenuItem authorListjMenuItem;
    private javax.swing.JButton backjButton;
    private javax.swing.JMenuItem bookListjMenuItem;
    private javax.swing.JTable bookListjTable;
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
    private javax.swing.JMenuItem paymentjMenuItem;
    private javax.swing.JMenuItem publisherListjMenuItem;
    private javax.swing.JButton searchjButton;
    private javax.swing.JButton updatejButton;
    // End of variables declaration//GEN-END:variables

    public void PrintToTable() throws SQLException {
        DefaultTableModel model = (DefaultTableModel) bookListjTable.getModel();
        ArrayList<BookInformationBean> ReciveList = dataRetriveFromDatabase();
        Object rawData[] = new Object[6];

        for (int i = 0; i < ReciveList.size(); i++) {
            rawData[0] = ReciveList.get(i).getBook_id();
            rawData[1] = ReciveList.get(i).getTitle();
            rawData[2] = ReciveList.get(i).getQuentity();
            rawData[3] = ReciveList.get(i).getCatagory();
            rawData[4] = ReciveList.get(i).getAuthor();
            rawData[5] = ReciveList.get(i).getPublisher();

            model.addRow(rawData);
        }
    }

    public ArrayList dataRetriveFromDatabase() throws SQLException {
        DbConnector connector = new DbConnector();
        // select query
        String selectStudentQuery;
        selectStudentQuery = "SELECT book.book_id, book.book_title, book.quentity, "
                + "publishers.pub_name, " + "geners.gener_name FROM "
                + "((book INNER JOIN publishers ON book.pub_id = publishers.pub_id) "
                + "INNER JOIN geners ON book.gener_id = geners.gener_id) ORDER BY book.book_id";

        connector.resultset = connector.statement.executeQuery(selectStudentQuery);
        ArrayList list;
        list = new ArrayList<BookInformationBean>();
        while (connector.resultset.next()) {
            int book_id = connector.resultset.getInt("book_id");
            String title = connector.resultset.getString("book_title");
            int quentity = connector.resultset.getInt("quentity");
            String cetagory = connector.resultset.getString("gener_name");
            String author = findAuthor(book_id);
            String publisher = connector.resultset.getString("pub_name");
            BookInformationBean info = new BookInformationBean(book_id, title, cetagory,
                    quentity, author, publisher);
            list.add(info);
        }
        connector.connection.close();
        return list;
    }

    public String findAuthor(int bookId) throws SQLException {
        ArrayList<BookInformationBean> ReciveList = dataRetriveFromDatabase1(bookId);
        String temp = "";
        for (int i = 0; i < ReciveList.size(); i++) {
            temp = temp + ", " + ReciveList.get(i).getAuthor();
        }
        temp = temp.substring(1);
        return temp.trim();
    }

    public ArrayList dataRetriveFromDatabase1(int bookId) throws SQLException {
        DbConnector connector = new DbConnector();
        // select query
        String selectStudentQuery;
        selectStudentQuery = "SELECT authors.au_name FROM book_writter "
                + "INNER JOIN authors ON book_writter.au_id = authors.au_id "
                + " AND book_writter.book_id = '" + bookId + "'";

        connector.resultset = connector.statement.executeQuery(selectStudentQuery);
        ArrayList list;
        list = new ArrayList<BookInformationBean>();
        while (connector.resultset.next()) {
            String author = connector.resultset.getString("au_name");
            BookInformationBean info = new BookInformationBean(0, null, null, 0, author, null);
            list.add(info);
        }
        connector.connection.close();
        return list;
    }

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
            //Do Nothing
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
        
        if (button.getSource() == addBookjButton) {
            BookAddUpdate bau = new BookAddUpdate("add", 0);
            this.dispose();
        }

        if (button.getSource() == updatejButton) {
            BookAddUpdate bau = new BookAddUpdate("update", bookId);
            this.dispose();
        }

        if (button.getSource() == deletejButton) {
            try {
                String deleteQuery;
                DbConnector dbConnectorDelete = null;

                dbConnectorDelete = new DbConnector();
                deleteQuery = "DELETE FROM book_writter " + "WHERE book_id = " + "'" + bookId + "'";
                dbConnectorDelete.statement.executeUpdate(deleteQuery);
                dbConnectorDelete.connection.close();

                dbConnectorDelete = new DbConnector();
                deleteQuery = "DELETE FROM book " + "WHERE book_id = " + "'" + bookId + "'";
                dbConnectorDelete.statement.executeUpdate(deleteQuery);
                dbConnectorDelete.connection.close();

                JOptionPane.showMessageDialog(null, "Data Successfully Deleted...!!!");

                DefaultTableModel model = (DefaultTableModel) bookListjTable.getModel();
                model.setRowCount(0);
                PrintToTable();
                idjTextField.setText("");

            } catch (SQLException ex) {
                Logger.getLogger(BookInformation.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (button.getSource() == searchjButton) {
            idjTextField.setText("");
            BookSearch bs = new BookSearch(bookId);
        }
        
        if(button.getSource() == backjButton){
            BookManagement bm = new BookManagement();
            this.dispose();
        }
    }
}
