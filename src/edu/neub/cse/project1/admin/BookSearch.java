package edu.neub.cse.project1.admin;

import edu.neub.cse.project1.bean.AuthorsInformationBean;
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

/**
 *
 * @author Team_DoodleArmy
 */

public class BookSearch extends javax.swing.JFrame implements ActionListener{

    public int bookId;
    public BookSearch(int bookId) {
        try {
            initComponents();
            
            this.setResizable(false);
            this.setLocationRelativeTo(null);
            this.setVisible(true);
            this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            this.setTitle("Book Search");
            this.bookId = bookId;
            
            PrintToTable();
            
            backjButton.addActionListener(this);
            
        } catch (SQLException ex) {
            Logger.getLogger(BookSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        searchResultjTable = new javax.swing.JTable();
        backjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));
        setPreferredSize(new java.awt.Dimension(700, 500));

        searchResultjTable.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        searchResultjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title", "Information"
            }
        ));
        searchResultjTable.setRowHeight(25);
        jScrollPane1.setViewportView(searchResultjTable);
        if (searchResultjTable.getColumnModel().getColumnCount() > 0) {
            searchResultjTable.getColumnModel().getColumn(0).setMinWidth(150);
            searchResultjTable.getColumnModel().getColumn(0).setPreferredWidth(150);
            searchResultjTable.getColumnModel().getColumn(0).setMaxWidth(150);
        }

        backjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backjButton.setText("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 610, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(115, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookSearch(1).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable searchResultjTable;
    // End of variables declaration//GEN-END:variables

    public void PrintToTable() throws SQLException {
        
        DefaultTableModel model = (DefaultTableModel) searchResultjTable.getModel();
        ArrayList<BookInformationBean> ReciveList = dataRetriveFromDatabase();
        
        if(ReciveList.size() == 0)
        {
            JOptionPane.showMessageDialog(null, "No Result Found...!!!");
            this.dispose();
            return;
        }
        
        Object rawData[] = new Object[2];

        for (int i = 0; i < ReciveList.size(); i++) {
            rawData[0] = "ID ";
            rawData[1] = ReciveList.get(i).getBook_id();
            model.addRow(rawData);
            
            rawData[0] = "Title ";
            rawData[1] = ReciveList.get(i).getTitle();
            model.addRow(rawData);
            
            rawData[0] = "Gener ";
            rawData[1] = ReciveList.get(i).getGener();
            model.addRow(rawData);
            
            rawData[0] = "Quentity ";
            rawData[1] = ReciveList.get(i).getQuentity();
            model.addRow(rawData);
            
            rawData[0] = "Author(s) ";
            rawData[1] = ReciveList.get(i).getAuthor();
            model.addRow(rawData);
            
            rawData[0] = "Publisher ";
            rawData[1] = ReciveList.get(i).getPublisher();
            model.addRow(rawData);
            
            rawData[0] = "Publisher Address ";
            rawData[1] = ReciveList.get(i).getPub_address();
            model.addRow(rawData);
            
            rawData[0] = "Publisher Description";
            rawData[1] = ReciveList.get(i).getPub_description();
            model.addRow(rawData);
        }
    }
    
    
    public ArrayList dataRetriveFromDatabase() throws SQLException {
        
        DbConnector connector = new DbConnector();
        // select query
        String selectStudentQuery;
        selectStudentQuery = "SELECT * FROM "
                + "((book INNER JOIN publishers ON book.pub_id = publishers.pub_id) "
                + "INNER JOIN geners ON book.gener_id = geners.gener_id)"
                + "WHERE book.book_id = '" + bookId +"'";

        connector.resultset = connector.statement.executeQuery(selectStudentQuery);
        ArrayList list;
        list = new ArrayList<BookInformationBean>();
        while (connector.resultset.next()) {
            int book_id = connector.resultset.getInt("book_id");
            String title = connector.resultset.getString("book_title");
            int quentity = connector.resultset.getInt("quentity");
            String cetagory = connector.resultset.getString("gener_name");
            //System.out.println(book_id);
            String author = findAuthor(book_id);
            String publisher = connector.resultset.getString("pub_name");
            String pub_address =  connector.resultset.getString("pub_address");
            String pub_description =  connector.resultset.getString("description");
            
            //System.out.println(book_id + "\n" + title + "\n" + quentity + "\n" 
             //       + cetagory + "\n" + author + "\n" + publisher + "\n" + pub_address + "\n" + pub_description);
            
            BookInformationBean info = new BookInformationBean(book_id, title, cetagory,
                    quentity, author, publisher, pub_address, pub_description);
            list.add(info);
        }
        connector.connection.close();
        return list;
    }

    public String findAuthor(int bookId) throws SQLException {
        ArrayList<AuthorsInformationBean> ReciveList = dataRetriveFromDatabase1(bookId);
        String temp = "";
        for (int i = 0; i < ReciveList.size(); i++) {
            temp = temp + ", " + ReciveList.get(i).getAuthor_name()+ "(" + ReciveList.get(i).getContact() + ")";
        }
        //System.out.println(temp);
        temp = temp.substring(1);
        return temp.trim();
    }
    
   public ArrayList dataRetriveFromDatabase1(int bookId) throws SQLException {
        DbConnector connector = new DbConnector();
        // select query
        String selectStudentQuery;
        selectStudentQuery = "SELECT * FROM book_writter "
                + "INNER JOIN authors ON book_writter.au_id = authors.au_id "
                + " AND book_writter.book_id = '" + bookId + "'";

        connector.resultset = connector.statement.executeQuery(selectStudentQuery);
        ArrayList list;
        list = new ArrayList<BookInformationBean>();
        while (connector.resultset.next()) {
            String author = connector.resultset.getString("au_name");
            String contact = connector.resultset.getString("contact");
            AuthorsInformationBean info = new AuthorsInformationBean(0, author, contact, null);
            list.add(info);
        }
        connector.connection.close();
        return list;
    }

    @Override
    public void actionPerformed(ActionEvent button) {
        if(button.getSource() == backjButton)
        {
            this.dispose();
        }
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
