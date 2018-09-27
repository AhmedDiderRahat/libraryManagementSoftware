package edu.neub.cse.project1.admin;

import edu.neub.cse.project1.bean.MemberInformationBean;
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
public class MemberSearch extends javax.swing.JFrame implements ActionListener {

    public int memberId;

    public MemberSearch(int memberId) throws SQLException {
        initComponents();
        this.memberId = memberId;
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setTitle("Member Search");

        PrintToTable();

        backjButton.addActionListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        searchResultjTable = new javax.swing.JTable();
        backjButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 450));

        searchResultjTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchResultjTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "", ""
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        searchResultjTable.setRowHeight(30);
        jScrollPane1.setViewportView(searchResultjTable);
        if (searchResultjTable.getColumnModel().getColumnCount() > 0) {
            searchResultjTable.getColumnModel().getColumn(0).setResizable(false);
            searchResultjTable.getColumnModel().getColumn(0).setPreferredWidth(100);
        }

        backjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backjButton.setForeground(new java.awt.Color(0, 153, 51));
        backjButton.setText("Back");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MemberSearch(1).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MemberSearch.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backjButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable searchResultjTable;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent button) {
        if (button.getSource() == backjButton) {
            this.dispose();
        }
    }

    public void PrintToTable() throws SQLException {

        DefaultTableModel model = (DefaultTableModel) searchResultjTable.getModel();
        ArrayList<MemberInformationBean> ReciveList = dataRetriveFromDatabase();

        if (ReciveList.size() == 0) {
            JOptionPane.showMessageDialog(null, "No Result Found...!!!");
            this.dispose();
            return;
        }

        Object rawData[] = new Object[2];

        for (int i = 0; i < ReciveList.size(); i++) {
            rawData[0] = "ID :";
            rawData[1] = ReciveList.get(i).getMember_id();
            model.addRow(rawData);

            rawData[0] = "Name :";
            rawData[1] = ReciveList.get(i).getMember_name();
            model.addRow(rawData);

            rawData[0] = "Member Type :";
            rawData[1] = ReciveList.get(i).getMember_type();
            model.addRow(rawData);

            rawData[0] = "Address :";
            rawData[1] = ReciveList.get(i).getAddress();
            model.addRow(rawData);

            rawData[0] = "Mobile : ";
            rawData[1] = ReciveList.get(i).getPhone();
            model.addRow(rawData);

            rawData[0] = "Email : ";
            rawData[1] = ReciveList.get(i).getEmail();
            model.addRow(rawData);

            rawData[0] = "Date of Birth : ";
            rawData[1] = ReciveList.get(i).getDob();
            model.addRow(rawData);

            rawData[0] = "Join Date : ";
            rawData[1] = ReciveList.get(i).getJoin_date();
            model.addRow(rawData);
        }
    }

    public ArrayList dataRetriveFromDatabase() throws SQLException {

        DbConnector connector = new DbConnector();
        // select query
        String selectStudentQuery = "SELECT * FROM member WHERE member_id = '" + memberId + "'";

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
