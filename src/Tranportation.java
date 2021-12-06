
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JFrame;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Tranportation extends javax.swing.JFrame {

    /**
     * Creates new form Tranportation
     */
    public Tranportation() {
        initComponents();
        getEntries();
    }
//    public Travel[] list_travel(){ 
//                Travel t1 = new Travel("Daewoo Faisal Movers", "Karachi", "Islamabad",1000);
//		Travel t2 = new Travel("Daewoo Express", "Karachi", "Islamabad",1100);
//                Travel t3 = new Travel("Road Master", "Karachi", "Islamabad",1500);
//                Travel t4 = new Travel("Green Line Express", "Karachi", "Islamabad",2500);
//                Travel t5 = new Travel("Green Line Express (B)", "Karachi", "Islamabad",3500);
//                Travel t6 = new Travel("Air Sial", "Karachi", "Islamabad",30000);
//                Travel t7 = new Travel("PIA", "Karachi", "Islamabad",25000);
//                Travel t8 = new Travel("Air Blue", "Karachi", "Islamabad",26000);
//                Travel t9 = new Travel("Daewoo Faisal", "Karachi", "Lahore",1200);
//
//		//Creating Arrays
//		Travel[] TravelArr = {t1,t2,t3,t4,t5,t6,t7,t8,t9};
//                
//                return TravelArr;
//                System.out.println(TravelArr[2].Medium);
//	
//                for (int i = 0; i < TravelArr.length; i++) {
//                System.out.println(TravelArr[i].Medium);
//                }
    
    
    private void getEntries(){
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)jTable1.getModel();
        int rc = dtm.getRowCount();
        while(rc--!=0){
            dtm.removeRow(0);
        }
        ArrayList<Travel> list = Travel.ListUser();
        Object rowData[] = new Object[4];
        Set<String> scity = new HashSet<>();
        Set<String> dcity  = new HashSet<>(); 
//        Set<String> pkg = new HashSet<>(); 

        for (int i = 0; i < list.size() ; i++) {
            rowData[0] = list.get(i).Medium;
            rowData[1] = list.get(i).SCity;
            scity.add(list.get(i).SCity);
            rowData[2] = list.get(i).DCity;
            dcity.add(list.get(i).DCity);
            rowData[3] = list.get(i).Package;
//            pkg.add(String.valueOf(list.get(i).Package));
            dtm.addRow(rowData);
        }
        for(String sc: scity){
            Cc.addItem(sc);
        }
        for(String dc: dcity){
            Dc.addItem(dc);
        }
        

    }
    
    private void sort(){
        ArrayList<Travel> list = Travel.ListUser();
        ArrayList<Travel> sort = null;
        for(Travel t: list){
            System.out.println(t.Package);
            
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Cc = new javax.swing.JComboBox<>();
        Dc = new javax.swing.JComboBox<>();
        p = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(153, 153, 153,80));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Back");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(240, 240, 240,80));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0,80));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel2.setText("Transport");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Cc.setBackground(new java.awt.Color(240, 240, 240,80));

        Dc.setBackground(new java.awt.Color(240, 240, 240,80));

        p.setBackground(new java.awt.Color(240, 240, 240,80));
        p.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1000-3000", "3000-5000", "5000-7000", "7000-9000", "9000-1100" }));

        jButton1.setBackground(new java.awt.Color(240, 240, 240,80));
        jButton1.setText("jButton1");
        jButton1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButton1FocusGained(evt);
            }
        });
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setBackground(new java.awt.Color(240, 240, 240,80));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Medium", "Starting City", "Destinating City", "Package"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton3.setBackground(new java.awt.Color(240, 240, 240,80));
        jButton3.setText("Sort ");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(240, 240, 240,80));
        jButton4.setText("Reset");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton4MouseExited(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(306, 306, 306)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Cc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(Dc, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(185, 185, 185)
                .addComponent(jButton3)
                .addGap(234, 234, 234))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Cc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dc, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(p, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 770, 430));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\DELL\\Documents\\NetBeansProjects\\DS\\images\\9.jpg")); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 935, 518));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
        jButton2.setBackground(Color.red);
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
        jButton2.setBackground(new java.awt.Color(153, 153, 153,80));
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Home ho = new Home();
        ho.setVisible(true);
        ho.pack();
        ho.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String C = (String)Cc.getSelectedItem();
        String P = (String)p.getSelectedItem();
        String p[] = P.split("-");

        String D = (String)Dc.getSelectedItem();
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)jTable1.getModel();
        int rc = dtm.getRowCount();
        while(rc--!=0){
            dtm.removeRow(0);
        }
        ArrayList<Travel> list = Travel.ListUser();
        Object rowData[] = new Object[4];
//        for (int i = 0; i < list.size() ; i++) {
//            if (list.get(i).SCity == C && list.get(i).DCity == D && String.valueOf(list.get(i).Package) == P) {           
//            rowData[0] = list.get(i).Medium;
//            rowData[1] = list.get(i).SCity;
//            rowData[2] = list.get(i).DCity;
//            rowData[3] = list.get(i).Package;
//            dtm.addRow(rowData);
//            }
//        }
//                  System.out.println(P.getClass().getName());

    for(Travel t: list){
              if (t.SCity == C && t.DCity == D && (t.Package >= Integer.valueOf(p[0]) && t.Package <= Integer.valueOf(p[1]))) {
//                  System.out.println(t.Package == P);
//                  System.out.println(t.Medium.getClass().getName());
//                  System.out.println(t.SCity.getClass().getName());
//                  System.out.println(t.DCity.getClass().getName());
                  
//                  System.out.println(((Object)String.valueOf(t.Package)).getClass().getSimpleName());


            rowData[0] = t.Medium;
            rowData[1] = t.SCity;
            rowData[2] = t.DCity;
            rowData[3] = t.Package;
            dtm.addRow(rowData);
//            }
    }}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButton1FocusGained
            
    }//GEN-LAST:event_jButton1FocusGained

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        getEntries();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        ArrayList<Travel> list1 = Travel.ListUser();
        // Bubble Sort 
        for (int i = 0; i < list1.size() ; i++){ 
            for (int j = 0; j < list1.size()-1-i; j++) {
                if(list1.get(j).Package > list1.get(j+1).Package){
                    ArrayList<Travel> sort = new ArrayList<Travel>();
                    sort.add(list1.get(j));
                    list1.set(j, list1.get(j+1));
                    list1.set(j+1, sort.get(0));
                }
                
            }
        }
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)jTable1.getModel();
        int rc = dtm.getRowCount();
        while(rc--!=0){
            dtm.removeRow(0);
        }
        Object rowData[] = new Object[4];
        for (int i = 0; i < list1.size() ; i++) {
            rowData[0] = list1.get(i).Medium;
            rowData[1] = list1.get(i).SCity;
            rowData[2] = list1.get(i).DCity;
            rowData[3] = list1.get(i).Package;
            dtm.addRow(rowData);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setBackground(new java.awt.Color(153, 153, 153,80));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setBackground(new java.awt.Color(240,240,240,80));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseEntered
        // TODO add your handling code here:
        jButton4.setBackground(new java.awt.Color(153, 153, 153,80));
    }//GEN-LAST:event_jButton4MouseEntered

    private void jButton4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseExited
        // TODO add your handling code here:
        jButton4.setBackground(new java.awt.Color(240,240,240,80));
    }//GEN-LAST:event_jButton4MouseExited

    private void jButton3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseEntered
        // TODO add your handling code here:
         jButton3.setBackground(new java.awt.Color(153, 153, 153,80));
    }//GEN-LAST:event_jButton3MouseEntered

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
        jButton3.setBackground(new java.awt.Color(240,240,240,80));
    }//GEN-LAST:event_jButton3MouseExited

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Tranportation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tranportation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tranportation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tranportation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tranportation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cc;
    private javax.swing.JComboBox<String> Dc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> p;
    // End of variables declaration//GEN-END:variables
}
