/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proodosjava;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Kwstas
 */
public class UpologismosMisthodosiasTest extends javax.swing.JFrame {
    private static String USERNAME = "root";
    private static String PASSWORD = "Helloimgosu1!";
    private static String CONN_STRING = "jdbc:mysql://localhost:3306/proodos";
    private MisthodosiaForm misthodosiaForm ;
    public static ArrayList<ErgazomenosObject> newErgazomenos = new ArrayList();
    public static ArrayList<ErgazomenosObject> newErgazomenoi = new ArrayList();
    

    public UpologismosMisthodosiasTest() {
        initComponents();
        this.getContentPane().setBackground(new Color(247,252,252));
        
        

    }
        public void setMisthodosiaForm(MisthodosiaForm form) {
        this.misthodosiaForm = form;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        EpilogiTable2 = new javax.swing.JTable();
        search = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        selectionBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        minasSelectionBox = new javax.swing.JComboBox<>();
        etosSelectionBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        emfanisiMisthodosias = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        EpilogiTable2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        EpilogiTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "AFM", "Onoma", "Eponimo"
            }
        ));
        EpilogiTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        EpilogiTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        EpilogiTable2.setGridColor(new java.awt.Color(247, 252, 252));
        jScrollPane2.setViewportView(EpilogiTable2);

        search.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        search.setText("ΑΝΑΖΗΤΗΣΗ");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(35, 150, 32));
        jLabel1.setText("Epilogi Ergazomenou");

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setText("ΑΦΜ ΕΡΓΑΖΟΜΕΝΟΥ");

        jLabel3.setText("ΜΗΝΑΣ");

        selectionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AFM", "Onoma", "Eponimo" }));
        selectionBox.setToolTipText("");
        selectionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionBoxActionPerformed(evt);
            }
        });

        jLabel4.setText("ΕΤΟΣ");

        minasSelectionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "%" }));
        minasSelectionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minasSelectionBoxActionPerformed(evt);
            }
        });

        etosSelectionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2024", "2023" }));
        etosSelectionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etosSelectionBoxActionPerformed(evt);
            }
        });

        jLabel5.setText("ΑΝΑΖΗΤΗΣΗ ΜΕ :");

        emfanisiMisthodosias.setBackground(new java.awt.Color(36, 241, 151));
        emfanisiMisthodosias.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        emfanisiMisthodosias.setText("ΕΜΦΑΝΗΣΗ ΜΙΣΘΟΔΟΣΙΑΣ");
        emfanisiMisthodosias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emfanisiMisthodosiasActionPerformed(evt);
            }
        });

        jButton6.setText("Fast PDF");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(selectionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(146, 146, 146)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(minasSelectionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(etosSelectionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(77, 77, 77))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(131, 131, 131)
                                .addComponent(jLabel1)
                                .addGap(101, 342, Short.MAX_VALUE))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(emfanisiMisthodosias, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(6, 6, 6)
                        .addComponent(minasSelectionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etosSelectionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(11, 11, 11)
                                .addComponent(selectionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(46, 46, 46)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emfanisiMisthodosias, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
               Connection conn = null;
               Object selectedOption=selectionBox.getSelectedItem();
        DefaultTableModel model = (DefaultTableModel)EpilogiTable2.getModel();
        model.setRowCount(0);
        try{
              
              conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
              Statement stmt = (Statement) conn.createStatement();
                            String st = "SELECT ifnull(`stoixeia`.`AFM`, 0), " +
                                            "ifnull(`stoixeia`.`Onoma`, 0), " +
                                            "ifnull(`stoixeia`.`Eponimo`, 0) " +
                                            "FROM `proodos`.`stoixeia` " +
                                            "WHERE `" + selectedOption + "` LIKE '" + searchField.getText() + "%' and EnergosErgazomenosID like '1'";

                            
  
              ResultSet rs = stmt.executeQuery(st); 
              while (rs.next())
              {
                  model.insertRow(model.getRowCount(),
                        new Object[] {rs.getObject(1).toString(),
                                      rs.getObject(2).toString(),
                                      rs.getObject(3).toString()});
                  
              }
              conn.close();
           }
           catch(SQLException e)
           {
               JOptionPane.showMessageDialog(null,e);
           }
    }//GEN-LAST:event_searchActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        
    }//GEN-LAST:event_searchFieldActionPerformed

    private void selectionBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionBoxActionPerformed
        Object selectedOption=selectionBox.getSelectedItem();
        jLabel2.setText((String) selectedOption);
    }//GEN-LAST:event_selectionBoxActionPerformed

    private void minasSelectionBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_minasSelectionBoxActionPerformed
        
    }//GEN-LAST:event_minasSelectionBoxActionPerformed

    private void etosSelectionBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etosSelectionBoxActionPerformed
       
    }//GEN-LAST:event_etosSelectionBoxActionPerformed

    private void emfanisiMisthodosiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emfanisiMisthodosiasActionPerformed
        Connection conn = null;
        DefaultTableModel model = (DefaultTableModel) EpilogiTable2.getModel();
        int selectedRow = EpilogiTable2.getSelectedRow();
        String st;
        String query;
        
        Object minas = minasSelectionBox.getSelectedItem();
        Object etos = etosSelectionBox.getSelectedItem();
        
        try{
        conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
        Statement stmt = conn.createStatement();
        
        for (int i =0;i<EpilogiTable2.getRowCount();i++) {
        ErgazomenosObject ergazomenos = new ErgazomenosObject();
        
        ergazomenos.setId(model.getValueAt(i, 0).toString());
        ergazomenos.setOnoma(model.getValueAt(i, 1).toString());
        ergazomenos.setEponimo(model.getValueAt(i, 2).toString());
        try{
            
            query = "call getErgazomenosMisthos ("+ergazomenos.getId()+")";
            try(ResultSet rs = stmt.executeQuery(query)){
                if (rs.next())
                {
                    ergazomenos.setMisthos(rs.getDouble("Misthos"));
                    
                }
            }
            
            //Call kai Set Meres Pou Doulepse O Ergazomenos
            query = "call getErgazomenosMeres ('"+etos+"','"+minas+"',"+ergazomenos.getId()+")";
            try(ResultSet rs = stmt.executeQuery(query)){    
                if (rs.next())
                {
                    ergazomenos.setMeresErgasiasMina(rs.getInt("MeresMhna"));
                    
                }
            }
            //Call kai Set Meres Adeias Ergazomenou
            query = "call getErgazomenosAdeia ('"+etos+"','"+minas+"',"+ergazomenos.getId()+")";
            try(ResultSet rs = stmt.executeQuery(query)){    
                if (rs.next())
                {
                    ergazomenos.setAdeia(rs.getInt("SinoloAdeion"));
                    
                }
            }
            //Call kai Set Meres Adeias Ergazomenou
            query = "call getErgazomenosAneu ('"+etos+"','"+minas+"',"+ergazomenos.getId()+")";
            try(ResultSet rs = stmt.executeQuery(query)){    
                if (rs.next())
                {
                    ergazomenos.setAneuApodoxon(rs.getInt("SinoloAdeion"));
                    
                }
            }
            //Call kai Set Meres Adeias Ergazomenou
            query = "call getErgazomenosAsthenia ('"+etos+"','"+minas+"',"+ergazomenos.getId()+")";
            try(ResultSet rs = stmt.executeQuery(query)){    
                if (rs.next())
                {
                    ergazomenos.setAsthenia(rs.getInt("SinoloAdeion"));
                    
                }
            }
            //Call kai Set Wres
            query = "call getErgazomenosWres ("+ergazomenos.getId()+")";
            try(ResultSet rs = stmt.executeQuery(query)){    
                if (rs.next())
                {
                    ergazomenos.setWresErgasias(rs.getInt("Wres_Ergasias"));
                    
                }
            }
            query = "call getErgazomenosTiposMisthou ("+ergazomenos.getId()+")";
            try(ResultSet rs = stmt.executeQuery(query)){    
                if (rs.next())
                {
                    ergazomenos.setTiposMisthou(rs.getInt("TiposMisthou"));
                    
                }
            }
            query = "call getErgazomenosDieuthinsi ("+ergazomenos.getId()+")";
            try(ResultSet rs = stmt.executeQuery(query)){    
                if (rs.next())
                {
                    ergazomenos.setAddress(rs.getString("Diefthinsi"));
                    
                }
            }
            query = "call getErgazomenosAmka ("+ergazomenos.getId()+")";
            try(ResultSet rs = stmt.executeQuery(query)){    
                if (rs.next())
                {
                    ergazomenos.setAmka(rs.getInt("AMKA"));
                    
                }
            }
            
            int intMinas = Integer.parseInt(minasSelectionBox.getSelectedItem().toString()); 
            int intEtos= Integer.parseInt(etosSelectionBox.getSelectedItem().toString()); 
            intMinas+=1;
            if(intMinas>12)
            {
                intEtos++;
                intMinas=01;
            }
            ergazomenos.setImerominiaMisthodosias("'"+Integer.toString(intEtos) + "-" + "0"+Integer.toString(intMinas) + "-01'");       
            
            ergazomenos.misthosErgazomenou();
            
                newErgazomenos.add(ergazomenos);

                query ="call insertMisthodosia('"+ergazomenos.getId()+"',"+ergazomenos.getImerominiaMisthodosias()+",'"+ergazomenos.misthosErgazomenou()+"','"+ergazomenos.getAdeia()+"','"+ergazomenos.getAsthenia()+"','"+ergazomenos.getAneuApodoxon()+"')";
               
                try
                {
                    stmt.executeQuery(query);
                    
                }
                catch(SQLException e)
                {
                    JOptionPane.showMessageDialog(null,e);
                }
        }
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
        
        }
        
        
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null,e);
        }      
             misthodosiaForm.search1.doClick();
    }//GEN-LAST:event_emfanisiMisthodosiasActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed

    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Επιλέξτε αρχείο για αποθήκευση");
    
    int userSelection = fileChooser.showSaveDialog(null);
    
    if (userSelection == JFileChooser.APPROVE_OPTION) {
        for (ErgazomenosObject ergazomenos : newErgazomenos) {
            String selectedFileName = ergazomenos.getOnoma() + " " + ergazomenos.getEponimo() + " Αποδειξη Μισθοδοσιας " + ergazomenos.getImerominiaMisthodosias() + ".pdf";
            File fileToSave = new File(fileChooser.getSelectedFile().getParentFile(), selectedFileName);

            
            String filePath = fileToSave.getAbsolutePath();
            if (!filePath.endsWith(".pdf")) {
                filePath += ".pdf";
                fileToSave = new File(filePath); 
            }

           
            try {
                Document doc = new Document();
                PdfWriter.getInstance(doc, new FileOutputStream(fileToSave));
                doc.open();
                PdfPTable tbl = new PdfPTable(1);
                tbl.addCell(ergazomenos.pdfToString());
                doc.add(tbl);
                doc.close();
                JOptionPane.showMessageDialog(null, "Το αρχειο δημιουργηθηκε επιτυχως!");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Προβλημα κατα τη δημιουργια του αρχειου: ");
            }
        
        
        }
        }
    }//GEN-LAST:event_jButton6ActionPerformed
        
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
            java.util.logging.Logger.getLogger(UpologismosMisthodosiasTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpologismosMisthodosiasTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpologismosMisthodosiasTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpologismosMisthodosiasTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpologismosMisthodosiasTest().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable EpilogiTable2;
    private javax.swing.JButton emfanisiMisthodosias;
    private javax.swing.JComboBox<String> etosSelectionBox;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> minasSelectionBox;
    private javax.swing.JButton search;
    private javax.swing.JTextField searchField;
    private javax.swing.JComboBox<String> selectionBox;
    // End of variables declaration//GEN-END:variables
}