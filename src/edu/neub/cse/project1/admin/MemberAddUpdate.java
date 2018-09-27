package edu.neub.cse.project1.admin;

import edu.neub.cse.project1.bean.MemberInformationBean;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

import edu.neub.cse.project1.connection.DbConnector;
import java.sql.SQLException;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

import java.text.SimpleDateFormat;

/**
 *
 * @author Team_DoodleArmy
 */
public class MemberAddUpdate extends javax.swing.JFrame implements ActionListener {

    public String component;
    public int memberID;

    public MemberAddUpdate(String receivingComponent, int n) throws SQLException {

        component = receivingComponent;

        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        if (component.equals("add")) {
            this.setTitle("Add Member");
            titlejLabel.setText("Add Member");
        } else {
            titlejLabel.setText("Update Member");
            this.setTitle("Update Member");
            memberID = n;
            System.out.println("its ok " + memberID);
            try {
                initialDataForUpdate();
            } catch (Exception ex) {
                Logger.getLogger(MemberAddUpdate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        okjButton.addActionListener(this);
        backjButton.addActionListener(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        namejTextField = new javax.swing.JTextField();
        idjTextField = new javax.swing.JTextField();
        addressjTextField = new javax.swing.JTextField();
        phonejTextField = new javax.swing.JTextField();
        emailjTextField = new javax.swing.JTextField();
        generaljRadioButton = new javax.swing.JRadioButton();
        premiumjRadioButton = new javax.swing.JRadioButton();
        okjButton = new javax.swing.JButton();
        dobjDateChooser = new com.toedter.calendar.JDateChooser();
        joinDatejDateChooser = new com.toedter.calendar.JDateChooser();
        backjButton = new javax.swing.JButton();
        titlejLabel = new javax.swing.JLabel();

        jFormattedTextField1.setText("jFormattedTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(850, 600));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 204));
        jLabel1.setText("ID :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Name :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 204));
        jLabel4.setText("Join Date :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Address :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 204));
        jLabel6.setText("Phone :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 204));
        jLabel7.setText("Email :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 204));
        jLabel8.setText("Date of Birth:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 204));
        jLabel9.setText("Member Type :");

        namejTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        idjTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        addressjTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        phonejTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        emailjTextField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        generaljRadioButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        generaljRadioButton.setText("General");

        premiumjRadioButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        premiumjRadioButton.setText("Premium");

        okjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        okjButton.setForeground(new java.awt.Color(0, 102, 0));
        okjButton.setText("OK");

        backjButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backjButton.setForeground(new java.awt.Color(0, 102, 0));
        backjButton.setText("Back");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(okjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(phonejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(generaljRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(premiumjRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(idjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dobjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(joinDatejDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(idjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(namejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addressjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(phonejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailjTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dobjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(joinDatejDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(generaljRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(premiumjRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(okjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        titlejLabel.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        titlejLabel.setForeground(new java.awt.Color(0, 153, 51));
        titlejLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlejLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 230, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(218, 218, 218))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(titlejLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(83, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new MemberAddUpdate("", 0).setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(MemberAddUpdate.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressjTextField;
    private javax.swing.JButton backjButton;
    private com.toedter.calendar.JDateChooser dobjDateChooser;
    private javax.swing.JTextField emailjTextField;
    private javax.swing.JRadioButton generaljRadioButton;
    private javax.swing.JTextField idjTextField;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private com.toedter.calendar.JDateChooser joinDatejDateChooser;
    private javax.swing.JTextField namejTextField;
    private javax.swing.JButton okjButton;
    private javax.swing.JTextField phonejTextField;
    private javax.swing.JRadioButton premiumjRadioButton;
    private javax.swing.JLabel titlejLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent button) {

        if (button.getSource() == backjButton) {
            try {
                MemberInformation mi = new MemberInformation();
                this.dispose();
            } catch (SQLException ex) {
                Logger.getLogger(MemberAddUpdate.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        if (button.getSource() == okjButton) {
            MemberInformationBean bean;
            bean = new MemberInformationBean(findId(), namejTextField.getText().trim(),
                    addressjTextField.getText().trim(), phonejTextField.getText().trim(), emailjTextField.getText().trim(),
                    dateCalculation("dob"), dateCalculation("N\\A"), memberType());

            if (bean.getMember_id() == -1 || bean.getMember_name().equals("") || bean.getAddress().equals("")
                    || bean.getPhone().equals("") || bean.getEmail().equals("") || bean.getDob().equals("")
                    || bean.getJoin_date().equals("") || bean.getMember_type().equals("")) {

                JOptionPane.showMessageDialog(null, "Fill Every Raw Perfectly...!!!");

                fieldInitialzation();

            } else {
                if (component.equals("add")) {
                    try {
                        //System.out.println("ok");
                        DbConnector connector = new DbConnector();
                        String insertQuery = "INSERT INTO member ( member_id, "
                                + "member_name, address, phone, email, dob, join_date, member_type) "
                                + "VALUES ('" + bean.getMember_id() + "', '"
                                + bean.getMember_name() + "', '" + bean.getAddress() + "', '"
                                + bean.getPhone() + "', '" + bean.getEmail() + "', '"
                                + bean.getDob() + "', '" + bean.getJoin_date() + "', '"
                                + bean.getMember_type() + "')";

                        connector.statement.executeUpdate(insertQuery);
                        connector.connection.close();
                        JOptionPane.showMessageDialog(null, "Successfully Added...!!!");
                        MemberInformation mi = new MemberInformation();
                        this.dispose();
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(null, "This ID is ALReady Used...!!!");
                        fieldInitialzation();
                        Logger.getLogger(MemberAddUpdate.class.getName()).log(Level.SEVERE, null, ex);
                    }

                } else {
                    try {
                        DbConnector dbConnector = new DbConnector();

                        String UpdateQuery = "UPDATE member SET member_id = '" + bean.getMember_id()
                                + "', member_name = '" + bean.getMember_name() + "', address = '" + bean.getAddress()
                                + "' , phone = '" + bean.getPhone() + "', " + "email = '" + bean.getEmail() + "', "
                                + "dob = '" + bean.getDob() + "', " + "join_date = '" + bean.getJoin_date() + "', "
                                + "member_type = '" + bean.getMember_type() + "' WHERE member_id = " + "'" + bean.getMember_id() + "'";
                        try {
                            dbConnector.statement.executeUpdate(UpdateQuery);
                            dbConnector.connection.close();

                        } catch (SQLException ex) {
                            System.out.println(ex);
                            JOptionPane.showMessageDialog(null, "Data Doesn't Update...!!!");
                        }

                        JOptionPane.showMessageDialog(null, "Successfully Updated...!!!");
                        MemberInformation mi = new MemberInformation();
                        this.dispose();
                    } catch (SQLException ex) {
                        Logger.getLogger(MemberAddUpdate.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }
    }

    public void fieldInitialzation() {
        idjTextField.setText("");
        namejTextField.setText("");
        addressjTextField.setText("");
        phonejTextField.setText("");
        emailjTextField.setText("");
        dobjDateChooser.setDate(null);
        joinDatejDateChooser.setDate(null);
        generaljRadioButton.setSelected(false);
        premiumjRadioButton.setSelected(false);
    }

    public Date findDate(String date) throws Exception {
        String sDate1 = date;
        Date date1 = new SimpleDateFormat("dd/MMM/yyyy").parse(sDate1);
        return date1;
    }

    public void initialDataForUpdate() throws SQLException, Exception {
        DbConnector connector = new DbConnector();
        // select query
        String selectStudentQuery = "SELECT * FROM member WHERE member_id = " + "'" + memberID + "'";
        connector.resultset = connector.statement.executeQuery(selectStudentQuery);

        while (connector.resultset.next()) {
            System.out.println("the data " + connector.resultset.getString("member_name"));
            idjTextField.setText(connector.resultset.getString("member_id"));
            namejTextField.setText(connector.resultset.getString("member_name"));
            addressjTextField.setText(connector.resultset.getString("address"));
            phonejTextField.setText(connector.resultset.getString("phone"));
            emailjTextField.setText(connector.resultset.getString("email"));

            String dob = connector.resultset.getString("dob");
            Date d = findDate(dob);
            dobjDateChooser.setDate(d);

            String join_date = connector.resultset.getString("join_date");
            d = findDate(join_date);
            joinDatejDateChooser.setDate(d);

            String member_type = connector.resultset.getString("member_type");
            if (member_type.equals("General")) {
                generaljRadioButton.setSelected(true);
            } else {
                premiumjRadioButton.setSelected(true);
            }
        }
        connector.connection.close();
    }

    public int findId() {
        String id = idjTextField.getText().trim();
        if (id.equals("")) {
            return -1;
        }
        Integer result = Integer.valueOf(id);
        return result;

    }

    public String memberType() {
        if (generaljRadioButton.isSelected()) {
            return "General";
        } else if (premiumjRadioButton.isSelected()) {
            return "Premium";
        }
        return "N\\A";
    }

    public String dateCalculation(String temp) {
        java.util.Date indate;
        if (temp.equals("dob")) {
            indate = dobjDateChooser.getDate();
        } else {
            indate = joinDatejDateChooser.getDate();
        }

        if (indate == null) {
            return "";
        }

        String dateString = null;
        SimpleDateFormat sdfr = new SimpleDateFormat("dd/MMM/yyyy");
        dateString = sdfr.format(indate);

        return dateString;
    }
}
