package edu.neub.cse.project1.admin;

import edu.neub.cse.project1.bean.AuthorsInformationBean;
import edu.neub.cse.project1.bean.BookInformationBean;
import edu.neub.cse.project1.connection.DbConnector;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.*;
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

public class BookAddUpdate extends javax.swing.JFrame implements ActionListener {

    public String frameType, current_gener, current_publisher;
    public int bookId;

    public BookAddUpdate(String type, int bkId) {

        initComponents();

        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Book Add or Update");

        clearjButton.addActionListener(this);
        okjButton.addActionListener(this);
        authorsjTextArea.setEditable(false);
        backjButton.addActionListener(this);

        frameType = type;
        bookId = bkId;

        if (frameType.equals("add")) {
            frameTypejLabel.setText("ADD Book");
            this.setTitle("Book Add");
            addInitialization();
        } else {
            bookIdjLabel.setText(bookId + "");
            updateInitialization();
            this.setTitle("Book Update");
            frameTypejLabel.setText("Update Book");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        publisherjComboBox = new javax.swing.JComboBox();
        generjComboBox = new javax.swing.JComboBox();
        bookTitlejTextField = new javax.swing.JTextField();
        quentityjTextField = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        authorsjTextArea = new javax.swing.JTextArea();
        clearjButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        authorjTable = new javax.swing.JTable();
        okjButton = new javax.swing.JButton();
        bookIdjLabel = new javax.swing.JLabel();
        backjButton = new javax.swing.JButton();
        frameTypejLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(850, 600));
        setMinimumSize(new java.awt.Dimension(850, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("Book ID :");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("Book Title :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Quentity :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Gener :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Author(s) :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Publishers:");

        publisherjComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        generjComboBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        generjComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        authorsjTextArea.setColumns(20);
        authorsjTextArea.setRows(5);
        jScrollPane2.setViewportView(authorsjTextArea);

        clearjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearjButton.setForeground(new java.awt.Color(0, 153, 51));
        clearjButton.setText("clear");

        authorjTable.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        authorjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Authors"
            }
        ));
        authorjTable.setRowHeight(25);
        authorjTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                authorjTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(authorjTable);
        if (authorjTable.getColumnModel().getColumnCount() > 0) {
            authorjTable.getColumnModel().getColumn(0).setMinWidth(40);
            authorjTable.getColumnModel().getColumn(0).setPreferredWidth(40);
            authorjTable.getColumnModel().getColumn(0).setMaxWidth(40);
        }

        okjButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        okjButton.setForeground(new java.awt.Color(0, 0, 153));
        okjButton.setText("ok");

        bookIdjLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        bookIdjLabel.setForeground(new java.awt.Color(0, 153, 51));

        backjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backjButton.setText("back");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(okjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bookTitlejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(quentityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bookIdjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(clearjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(generjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(publisherjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(generjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookIdjLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bookTitlejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(quentityjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(clearjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(publisherjComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(okjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        frameTypejLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        frameTypejLabel.setForeground(new java.awt.Color(0, 0, 153));
        frameTypejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(frameTypejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(67, Short.MAX_VALUE)
                .addComponent(frameTypejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void authorjTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authorjTableMouseClicked
        // TODO add your handling code here:
        int rowNumber = authorjTable.getSelectedRow();

        TableModel model = authorjTable.getModel();
        String temp = authorsjTextArea.getText().toString();
        temp = temp + "\n" + (model.getValueAt(rowNumber, 1).toString());
        authorsjTextArea.setText(temp.trim());
    }//GEN-LAST:event_authorjTableMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookAddUpdate("", 0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable authorjTable;
    private javax.swing.JTextArea authorsjTextArea;
    private javax.swing.JButton backjButton;
    private javax.swing.JLabel bookIdjLabel;
    private javax.swing.JTextField bookTitlejTextField;
    private javax.swing.JButton clearjButton;
    private javax.swing.JLabel frameTypejLabel;
    private javax.swing.JComboBox generjComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton okjButton;
    private javax.swing.JComboBox publisherjComboBox;
    private javax.swing.JTextField quentityjTextField;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent button) {

        if (button.getSource() == clearjButton) {
            String temp = authorsjTextArea.getText().toString();
            String[] arr = new String[100];
            arr = temp.split("\n");
            temp = "";
            for (int i = 0; i < arr.length - 1; i++) {
                temp = temp + "\n" + arr[i];
            }
            authorsjTextArea.setText(temp.trim());
        }

        if (button.getSource() == okjButton) {
            try {
                BookInformationBean bean = new BookInformationBean(0, bookTitlejTextField.getText().toString(),
                        generjComboBox.getSelectedItem().toString(), stringToint(quentityjTextField.getText().toString()),
                        authorsjTextArea.getText(), publisherjComboBox.getSelectedItem().toString());

                bean.setGener_id(findGenerId(bean.getCatagory()));
                bean.setPub_id(findPublisherId(bean.getPublisher()));

                if (bean.getTitle().equals("") || bean.getGener_id() == -1 || bean.getQuentity() == -1
                        || bean.getAuthor().equals("") || bean.getPub_id() == -1) {
                    JOptionPane.showMessageDialog(null, "Fill Up Properly...!!!");
                } else {

                    if (frameType.equals("add")) {
                        DbConnector connector = new DbConnector();
                        String insertQuery = "INSERT INTO book (book_title, quentity, gener_id, pub_id) "
                                + "VALUES ('" + bean.getTitle() + "', '" + bean.getQuentity() + "', '"
                                + bean.getGener_id() + "', '" + bean.getPub_id() + "')";

                        connector.statement.executeUpdate(insertQuery);
                        connector.connection.close();

                        //call authorInsertion
                        authorInsertion(bean.getAuthor(), bean.getTitle());
                        JOptionPane.showMessageDialog(null, "Successfully Added...!!!");
                        BookInformation bi = new BookInformation();
                        this.dispose();
                    } else {                     
                        DbConnector dbConnector = new DbConnector();
                        String UpdateQuery = "UPDATE book SET book_title = '" + bean.getTitle()
                                + "', quentity = '" + bean.getQuentity() + "', gener_id = '" + bean.getGener_id()
                                + "' , pub_id = '" + bean.getPub_id() + "' WHERE book_id = "
                                + "'" + bookId + "'";

                        dbConnector.statement.executeUpdate(UpdateQuery);
                        dbConnector.connection.close();
                        authorUpdate(bean.getAuthor());
                        JOptionPane.showMessageDialog(null, "Successfully Updated...!!!");
                        BookInformation bi = new BookInformation();
                        this.dispose();
                    }
                }
            } catch (SQLException ex) {
                Logger.getLogger(BookAddUpdate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (button.getSource() == backjButton) {
            try {
                BookInformation bi = new BookInformation();
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(BookAddUpdate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void authorUpdate(String author_name) throws SQLException {
        
        String[] authorList = new String[100];
        authorList = author_name.split("\n");
   
            DbConnector dbConnectorDelete = new DbConnector();
            String deleteQuery = "DELETE FROM book_writter " + "WHERE book_id = " + "'" + bookId + "'";
            dbConnectorDelete.statement.executeUpdate(deleteQuery);
            dbConnectorDelete.connection.close();        

        
       for (int i = 0; i < authorList.length; i++) {
            String author = authorList[i].trim();
            int au_id = findAuthorId(author);
            DbConnector connector = new DbConnector();
            String insertQuery = "INSERT INTO book_writter (book_id, au_id) "
                    + "VALUES ('" + bookId + "', '" + au_id + "')";
            connector.statement.executeUpdate(insertQuery);
            connector.connection.close();
        }
    }

    public void authorInsertion(String author_name, String book_title) throws SQLException {

        String[] authorList = new String[100];
        authorList = author_name.split("\n");

        String selectQuery = "SELECT book_id FROM book WHERE book_title = '" + book_title + "'";
        DbConnector connector = new DbConnector();
        connector.resultset = connector.statement.executeQuery(selectQuery);
        int book_id = 0;
        while (connector.resultset.next()) {
            book_id = connector.resultset.getInt("book_id"); //.toString();
        }
        connector.connection.close();

        for (int i = 0; i < authorList.length; i++) {
            String author = authorList[i].trim();
            int au_id = findAuthorId(author);
            connector = new DbConnector();
            String insertQuery = "INSERT INTO book_writter (book_id, au_id) "
                    + "VALUES ('" + book_id + "', '" + au_id + "')";
            connector.statement.executeUpdate(insertQuery);
            connector.connection.close();
        }
    }

    public int findAuthorId(String author) throws SQLException {
        String selectQuery = "SELECT * FROM authors WHERE au_name = '" + author + "'";
        DbConnector connector = new DbConnector();
        connector.resultset = connector.statement.executeQuery(selectQuery);
        int idx = 0;
        while (connector.resultset.next()) {
            return connector.resultset.getInt("au_id"); //.toString();
        }
        return -1;
    }

    public int findGenerId(String gener_name) throws SQLException {
        String selectQuery = "SELECT * FROM geners WHERE gener_name = '" + gener_name + "'";
        DbConnector connector = new DbConnector();
        connector.resultset = connector.statement.executeQuery(selectQuery);
        int idx = 0;
        while (connector.resultset.next()) {
            return connector.resultset.getInt("gener_id"); //.toString();
        }
        return -1;
    }

    public int findPublisherId(String publisher_name) throws SQLException {
        String selectQuery = "SELECT * FROM publishers WHERE pub_name = '" + publisher_name + "'";
        DbConnector connector = new DbConnector();
        connector.resultset = connector.statement.executeQuery(selectQuery);
        int idx = 0;
        while (connector.resultset.next()) {
            return connector.resultset.getInt("pub_id"); //.toString();
        }
        return -1;
    }

    public int stringToint(String s) {
        if (s.trim().equals("")) {
            return -1;
        }
        return Integer.parseInt(s.trim());
    }

    public void addInitialization() {
        try {
            this.showComboBoxGener(generjComboBox);
            this.showComboBoxPublishers(publisherjComboBox);

            authorTablePrint();

        } catch (SQLException ex) {
            Logger.getLogger(BookAddUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void updateInitialization() {
        try {
            DbConnector connector = new DbConnector();
            String selectQuery = "SELECT book.book_id, book.book_title, book.quentity, publishers.pub_name, "
                    + "geners.gener_name FROM ((book INNER JOIN publishers ON book.pub_id = publishers.pub_id) "
                    + "INNER JOIN geners ON book.gener_id = geners.gener_id) WHERE book.book_id = '" + bookId + "'";

            connector.resultset = connector.statement.executeQuery(selectQuery);
            String title = null;
            int quentity = -1;
            while (connector.resultset.next()) {
                title = connector.resultset.getString("book_title");
                quentity = connector.resultset.getInt("quentity");
                current_gener = connector.resultset.getString("gener_name");
                current_publisher = connector.resultset.getString("pub_name");
            }
            connector.connection.close();

            this.showComboBoxGener(generjComboBox);
            this.showComboBoxPublishers(publisherjComboBox);
            bookTitlejTextField.setText(title);
            quentityjTextField.setText(quentity + "");
            authorTablePrint();
            authorsjTextArea.setText(findAuthor(bookId));
        } catch (SQLException ex) {
            Logger.getLogger(BookAddUpdate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public String findAuthor(int bookId) throws SQLException {
        ArrayList<BookInformationBean> ReciveList = dataRetriveFromDatabase1(bookId);
        String temp = "";
        for (int i = 0; i < ReciveList.size(); i++) {
            temp = temp + "\n" + ReciveList.get(i).getAuthor();
        }
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

    public void showComboBoxGener(JComboBox object) throws SQLException {
        String[] temp = new String[100];
        String selectQuery = "SELECT * FROM geners";

        DbConnector connector = new DbConnector();
        connector.resultset = connector.statement.executeQuery(selectQuery);
        int idx = 0;
        while (connector.resultset.next()) {
            temp[idx] = connector.resultset.getString("gener_name").toString();
            idx += 1;
        }

        String[] generList = new String[idx + 5];
        int i = 0;
        while (i < idx) {
            generList[i] = temp[i];
            i++;
        }
        object.setModel(new DefaultComboBoxModel(generList));
        if (frameType.equals("update")) {
            object.insertItemAt(current_gener, 0);
        } else {
            object.insertItemAt("Slecet Gener", 0);
        }

        object.setSelectedIndex(0);
        object.toString();
    }

    public void showComboBoxPublishers(JComboBox object) throws SQLException {
        String[] temp = new String[100];
        String selectQuery = "SELECT * FROM publishers";

        DbConnector connector = new DbConnector();
        connector.resultset = connector.statement.executeQuery(selectQuery);
        int idx = 0;
        while (connector.resultset.next()) {
            temp[idx] = connector.resultset.getString("pub_name").toString();
            idx += 1;
        }

        String[] publishersList = new String[idx + 5];
        int i = 0;
        while (i < idx) {
            publishersList[i] = temp[i];
            i++;
        }
        object.setModel(new DefaultComboBoxModel(publishersList));
        if (frameType.equals("update")) {
            object.insertItemAt(current_publisher, 0);
        } else {
            object.insertItemAt("Slecet Publisher", 0);
        }

        object.setSelectedIndex(0);
        object.toString();
    }

    public void authorTablePrint() throws SQLException {
        DefaultTableModel model = (DefaultTableModel) authorjTable.getModel();
        ArrayList<AuthorsInformationBean> ReciveList = dataRetriveFromDatabase();
        Object rawData[] = new Object[2];

        for (int i = 0; i < ReciveList.size(); i++) {
            rawData[0] = ReciveList.get(i).getAuthor_id();
            rawData[1] = ReciveList.get(i).getAuthor_name();
            model.addRow(rawData);
        }
    }

    public ArrayList dataRetriveFromDatabase() throws SQLException {
        DbConnector connector = new DbConnector();
        // select query
        String selectStudentQuery;
        selectStudentQuery = "SELECT * FROM authors";

        connector.resultset = connector.statement.executeQuery(selectStudentQuery);
        ArrayList list;
        list = new ArrayList<AuthorsInformationBean>();
        while (connector.resultset.next()) {
            int author_id = connector.resultset.getInt("au_id");
            String author_name = connector.resultset.getString("au_name");
            AuthorsInformationBean info = new AuthorsInformationBean(author_id, author_name);
            list.add(info);
        }
        connector.connection.close();
        return list;
    }
}
