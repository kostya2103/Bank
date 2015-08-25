/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Bankomat extends javax.swing.JFrame {
Connection con = null;
Statement stmt = null;
ResultSet rs = null;
String Login;
String Password;
String Request;
String Balance;
public Bankomat(String UserName,String Password) throws SQLException, Exception {
 
initComponents();
Balance = null;
Login=UserName;
this.Password=Password;
Request="select * from password where login='"+Login+"'";
Connection(Request);  
  
    }
private void Connection(String n)throws ClassNotFoundException, SQLException, Exception{
Class.forName("org.postgresql.Driver");
String url ="jdbc:postgresql://localhost:5432/AddresBook";       
con = DriverManager.getConnection(url, "postgres", "1");

stmt=con.createStatement();
rs= stmt.executeQuery(n); 
while (rs.next()){
Balance=rs.getString(3);
jLabel1.setText(Login);
jLabel2.setText(Balance);

  } 
}
private void SQLRequest(String n) throws ClassNotFoundException, SQLException, Exception{
 Class.forName("org.postgresql.Driver");
String url ="jdbc:postgresql://localhost:5432/AddresBook";       
con = DriverManager.getConnection(url, "postgres", "1");
stmt=con.createStatement();
stmt.executeUpdate(n);    
    
}

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPane1 = new javax.swing.JOptionPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("jLabel2");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("ЛОГИН");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("БАЛАНС");

        jButton1.setText("Снять");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField1.setText("Введите сумму");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton2.setText("Пополнить");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGap(164, 164, 164))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addGap(158, 158, 158))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 
        
    try {
        Draw();
    } catch (Exception ex) {
        Logger.getLogger(Bankomat.class.getName()).log(Level.SEVERE, null, ex);
    }

    }//GEN-LAST:event_jButton1ActionPerformed
 
//снятие
private void Draw()throws SQLException, Exception{
    if (isValiDraw()){
int money=Integer.parseInt(jTextField1.getText());
int balance=Integer.parseInt(Balance);
money=balance-money;
String n="Update password set balance="+money
        + " where login='"+Login+"'"+"and passwords='"+this.Password+"'";
SQLRequest(n);
displayBalance();    
        }
}

//пополнение
private void Deposit() throws SQLException, Exception {
if (isValidDeposoit()){
int money=Integer.parseInt(jTextField1.getText());
int balance=Integer.parseInt(Balance);
money=balance+money;
String n="Update password set balance="+money
        + " where login='"+Login+"'"+"and passwords='"+this.Password+"'";
SQLRequest(n);
displayBalance();   
        }
}
       
    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    try {
        Deposit();
    } catch (Exception ex) {
        Logger.getLogger(Bankomat.class.getName()).log(Level.SEVERE, null, ex);
    }
         
    }//GEN-LAST:event_jButton2ActionPerformed
//показать баланс
public  void displayBalance() throws SQLException, Exception {
  Connection(Request);  
}
//проверка на сумму поплнения
private boolean isValidDeposoit() {
String message = "";

        //если не число
if (!NumberChek(jTextField1.getText())) {
   message = "Введите число";

            //если < 100
} else if (Double.parseDouble(jTextField1.getText()) < 100.0) {
            message = "Минимум для пополнения: 100";

            //если > 500
} else if (Double.parseDouble(jTextField1.getText()) > 500.0) {
            message = "Максимум для пополнения: 5000";

            // если все ок
} else {
            return true;
        }
 JOptionPane.showMessageDialog(null, message, "Ошибка", JOptionPane.WARNING_MESSAGE);
        jTextField1.requestFocus();
        jTextField1.selectAll();
        return false;
    }
//проверка на сумму снятия 
private boolean isValiDraw() {
String message = "";

        //если не число
if (!NumberChek(jTextField1.getText())) {
            message = "Введите число";

            //если < 10
} else if (Integer.parseInt(jTextField1.getText()) < 10) {
            message = "Минимум для снятия: 10";

            //если > 250
} else if (Integer.parseInt(jTextField1.getText()) > 250) {
            message = "Максимум для снятия: 250";

            // если не кратно 10
} else if (Integer.parseInt(jTextField1.getText()) % 10 != 0) {
            message = "Сумма должна быть кратной 10";

            // недостаточно средств
} else if (Integer.parseInt(Balance) - Integer.parseInt(jTextField1.getText()) < 0) {
            message = "Недостаточно средств";

            //если все ок
} else {
            return true;
        }

        //сообщение пользователю
        JOptionPane.showMessageDialog(null, message, "Ошибка", JOptionPane.WARNING_MESSAGE);
        jTextField1.requestFocus();
        jTextField1.selectAll();
        return false;
    }
///проверка строки на Integer
private boolean NumberChek(String num) {
        try {
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


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
            java.util.logging.Logger.getLogger(Bankomat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bankomat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bankomat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bankomat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
