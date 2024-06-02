/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proodosjava;


import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Color;
import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;

import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import javax.swing.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import static proodosjava.AllMonthList.theErgazomenoi;


/**
 *
 * @author Kwstas
 */
public class MisthodosiaForm extends javax.swing.JFrame {
    private static String USERNAME = "root";
    private static String PASSWORD = "Helloimgosu1!";
    private static String CONN_STRING = "jdbc:mysql://localhost:3306/proodos";
    public Object selectedOption;
    

   
    public MisthodosiaForm() {
        this.selectedOption = selectionBox;
        
        initComponents();
        this.getContentPane().setBackground(new Color(247,252,252));
        proodosjava.AllMonthList allMonthList = new proodosjava.AllMonthList();
        allMonthList.newpdfToString();
        hmerominiaPanel.setVisible(false);
        exportPanel2.setVisible(false);
        
        
    }
    public class AllMonthList
    {
            public void AllMonthList() {
                
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        search1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        insert = new javax.swing.JButton();
        searchField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        selectionBox = new javax.swing.JComboBox<>();
        button1 = new java.awt.Button();
        hmerominiaPanel = new java.awt.Panel();
        etosApo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        etosEos = new javax.swing.JTextField();
        meraEos = new javax.swing.JTextField();
        meraApo = new javax.swing.JTextField();
        minasEos = new javax.swing.JTextField();
        minasApo = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        exportPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTable2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "MisthodosiaID", "ErgazomenosID", "Hmerominia_Misthodosias", "Misthos", "Hmeres_Adeias", "Hmeres_Asthenias", "Hmeres_Aneu_Apodoxon"
            }
        ));
        jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        jTable2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable2.setGridColor(new java.awt.Color(247, 252, 252));
        jScrollPane2.setViewportView(jTable2);

        search1.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        search1.setText("ΑΝΑΖΗΤΗΣΗ");
        search1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                search1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 0, 28)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(35, 150, 32));
        jLabel1.setText("MISTHODOSIA");

        insert.setBackground(new java.awt.Color(36, 241, 151));
        insert.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        insert.setText("ΠΡΟΣΘΗΚΗ");
        insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertActionPerformed(evt);
            }
        });

        searchField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 0, 14)); // NOI18N
        jLabel2.setText("ID");

        jButton1.setBackground(new java.awt.Color(209, 212, 220));
        jButton1.setFont(new java.awt.Font("Yu Gothic UI Semibold", 1, 14)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setText("ΑΝΑΖΗΤΗΣΗ ΜΕ :");

        selectionBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "MisthodosiaID", "ErgazomenosID", "Hmerominia_Misthodosias", "Misthos", "Hmeres_Adeias", "Hmeres_Asthenias", "Hmeres_Aneu_Apodoxon" }));
        selectionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionBoxActionPerformed(evt);
            }
        });

        button1.setLabel("button1");
        button1.setVisible(false);
        button1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1ActionPerformed(evt);
            }
        });

        hmerominiaPanel.setBackground(new java.awt.Color(247, 252, 252));

        jLabel4.setText("ΕΩΣ:");

        jLabel5.setText("ΑΠΟ :");

        jButton4.setBackground(new java.awt.Color(255, 66, 66));
        jButton4.setText("X");
        jButton4.setBorder(null);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout hmerominiaPanelLayout = new javax.swing.GroupLayout(hmerominiaPanel);
        hmerominiaPanel.setLayout(hmerominiaPanelLayout);
        hmerominiaPanelLayout.setHorizontalGroup(
            hmerominiaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hmerominiaPanelLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(hmerominiaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hmerominiaPanelLayout.createSequentialGroup()
                        .addGroup(hmerominiaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(hmerominiaPanelLayout.createSequentialGroup()
                                .addComponent(meraEos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minasEos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(etosEos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(hmerominiaPanelLayout.createSequentialGroup()
                                .addGroup(hmerominiaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(meraApo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(minasApo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(etosApo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(44, Short.MAX_VALUE))
                    .addGroup(hmerominiaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15))))
        );
        hmerominiaPanelLayout.setVerticalGroup(
            hmerominiaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(hmerominiaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(hmerominiaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meraApo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minasApo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etosApo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(hmerominiaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(hmerominiaPanelLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, hmerominiaPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)
                        .addGap(20, 20, 20)))
                .addGroup(hmerominiaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(meraEos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minasEos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etosEos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15))
        );

        jPanel1.setBackground(new java.awt.Color(247, 252, 252));

        exportPanel2.setBackground(new java.awt.Color(247, 252, 252));

        jButton2.setText("excel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("pdf");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout exportPanel2Layout = new javax.swing.GroupLayout(exportPanel2);
        exportPanel2.setLayout(exportPanel2Layout);
        exportPanel2Layout.setHorizontalGroup(
            exportPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exportPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(exportPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        exportPanel2Layout.setVerticalGroup(
            exportPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exportPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(jButton3))
        );

        jLabel6.setText("Export:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel6)
                .addContainerGap(69, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(exportPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exportPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(166, 166, 166)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(search1, javax.swing.GroupLayout.DEFAULT_SIZE, 216, Short.MAX_VALUE)
                                        .addGap(158, 158, 158)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3)
                                            .addComponent(selectionBox, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(58, 58, 58))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(hmerominiaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addContainerGap())))))
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(353, 353, 353)
                .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(74, 74, 74)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(selectionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                                .addComponent(search1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(hmerominiaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(insert, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(button1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void search1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_search1ActionPerformed
               Connection conn = null;
               selectedOption = selectionBox.getSelectedItem().toString();
               String st=null;
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        model.setRowCount(0);
        try{
              
              conn = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
              Statement stmt = (Statement) conn.createStatement();
              if(!selectedOption.equals("Hmerominia_Misthodosias"))
              {
                            st = "	SELECT 	ifnull(MisthodosiaID,0) AS MisthodosiaID ," +
                                                "ifnull(ErgazomenosID,0) AS ErgazomenosID ," +
                                                "DATE_FORMAT(Hmerominia_Misthodosias,'%d/%m/%Y') AS Hmerominia_Misthodosias," +
                                                "ifnull(Misthos,0) AS Misthos ," +
                                                "ifnull(Hmeres_Adeias,0) AS Hmeres_Adeias," +
                                                "ifnull(Hmeres_Asthenias,0)AS Hmeres_Asthenias,"+
                                                "ifnull(Hmeres_Aneu_Apodoxon,0) AS Hmeres_Aneu_Apodoxon " +
                                                "FROM misthos_misthodosia "+
                                                "WHERE `"+selectedOption+"` LIKE '"+searchField.getText()+"%'";
              }
              else
              {
                etosApo.setText(etosApo.getText().isEmpty() ? "%" : etosApo.getText());
                
                minasApo.setText(minasApo.getText().isEmpty() ? "%" : minasApo.getText());
                
                meraApo.setText(meraApo.getText().isEmpty() ? "%" : meraApo.getText());
                
                
                String startDate = "%"+etosApo.getText() + "-%" + minasApo.getText() + "-%" + meraApo.getText();
                String endDate = etosEos.getText() + "-" + minasEos.getText() + "-" + meraEos.getText();
                  
                    st = "SELECT ifnull(MisthodosiaID,0) AS MisthodosiaID, " +
                        "ifnull(ErgazomenosID,0) AS ErgazomenosID, " +
                        "DATE_FORMAT(Hmerominia_Misthodosias,'%d/%m/%Y') AS Hmerominia_Misthodosias, " +
                        "ifnull(Misthos,0) AS Misthos, " +
                        "ifnull(Hmeres_Adeias,0) AS Hmeres_Adeias, " +
                        "ifnull(Hmeres_Asthenias,0) AS Hmeres_Asthenias, " +
                        "ifnull(Hmeres_Aneu_Apodoxon,0) AS Hmeres_Aneu_Apodoxon " +
                        "FROM misthos_misthodosia " +
                        "WHERE `Hmerominia_Misthodosias` LIKE '" + startDate + "' AND " +
                        "`Hmerominia_Misthodosias` <= '" + endDate + "'";
                    System.out.println(st);
              }
              ResultSet rs = stmt.executeQuery(st); 
              while (rs.next())
              {
                  model.insertRow(model.getRowCount(),
                        new Object[] {rs.getObject(1).toString(),
                                      rs.getObject(2).toString(),
                                      rs.getObject(3).toString(),
                                      rs.getObject(4).toString(),
                                      rs.getObject(5).toString(),
                                      rs.getObject(6).toString(),
                                      rs.getObject(7).toString()});
                  
              }
              conn.close();
           }
           catch(SQLException e)
           {
               JOptionPane.showMessageDialog(null,e);
           }
        exportPanel2.setVisible(true);
       
    }//GEN-LAST:event_search1ActionPerformed

    private void insertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertActionPerformed

        UpologismosMisthodosiasTest f = new UpologismosMisthodosiasTest();
        f.setMisthodosiaForm(this);
        f.setVisible(true);
    }//GEN-LAST:event_insertActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                HomePageForm f = new HomePageForm();
                Point location = this.getLocation();
                f.setLocation(location);
                f.setVisible(true);
                this.setVisible(false);
                this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void searchFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchFieldActionPerformed

    private void selectionBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionBoxActionPerformed
        Object selectedOption=selectionBox.getSelectedItem();
        jLabel2.setText((String) selectedOption);
        if(selectedOption.equals("Hmerominia_Misthodosias"))
                {
                    hmerominiaPanel.setVisible(true);
                    searchField.setEnabled(false);
                }
        else 
        {
            hmerominiaPanel.setVisible(false);
            searchField.setEnabled(true);
        }
    }//GEN-LAST:event_selectionBoxActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Επιλέξτε αρχείο για αποθήκευση");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Excel Files( '.xlsx' , .'xls' )", "xlsx", "xls");
        fileChooser.setFileFilter(filter);

        int userSelection = fileChooser.showSaveDialog(null);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String filePath = fileToSave.getAbsolutePath();
            filePath+=".xlsx";
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = (Sheet) workbook.createSheet("Data");
            System.out.println(filePath);
            Row row = sheet.createRow(0);
            for (int i=0;i<jTable2.getColumnCount();i++)
            {
                Cell cell = row.createCell(i);
                cell.setCellValue(jTable2.getColumnName(i));
            }
            for(int i=0;i<jTable2.getRowCount();i++)
            {
                Row row1 = sheet.createRow(i+1);
                for (int j=0;j<jTable2.getColumnCount();j++)
                {
                    Cell cell2 = row1.createCell(j);
                    cell2.setCellValue(jTable2.getValueAt(i, j).toString());
                    System.out.println(cell2);
                }
            }
            
            try {
                FileOutputStream outputStream = new FileOutputStream(filePath);
                workbook.write(outputStream);
                outputStream.close();
                workbook.close();
                JOptionPane.showMessageDialog(null, "Το αρχειο δημιουργηθηκε επιτυχως!");
                
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(MisthodosiaForm.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(MisthodosiaForm.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Επιλέξτε αρχείο για αποθήκευση");
        FileNameExtensionFilter filter = new FileNameExtensionFilter("PDF Files( .'pdf' )", "pdf");
        fileChooser.setFileFilter(filter);

        int userSelection = fileChooser.showSaveDialog(null);


        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            String filePath = fileToSave.getAbsolutePath();
            if (!filePath.endsWith(".pdf")) {
                filePath += ".pdf";
            }

       fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
       Document doc = new Document();
       Object idErg=jTable2.getValueAt(jTable2.getSelectedRow(), 1);
       Object hmErg="'"+jTable2.getValueAt(jTable2.getSelectedRow(), 2)+"'";

       
        boolean found = false;
        ErgazomenosObject selectedErgazomenos = null;
        for (ErgazomenosObject ergazomenos : theErgazomenoi) {
            if (ergazomenos.getId().equals(idErg.toString()) && ergazomenos.getImerominiaMisthodosias().equals(hmErg.toString())) {
                selectedErgazomenos = ergazomenos;
                found = true;
                break;
            }
        }
        if (found) {
            try {
                PdfWriter.getInstance(doc, new FileOutputStream(filePath));
                doc.open();
                PdfPTable tbl = new PdfPTable(1);
                tbl.addCell(selectedErgazomenos.pdfToString()); 
                doc.add(tbl);
                JOptionPane.showMessageDialog(null, "Το αρχειο δημιουργηθηκε επιτυχως!");
                doc.close();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        
        
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void button1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1ActionPerformed
        //System.out.println(jTable2.getColumnName(1));
        //System.out.println(jTable2.getColumnCount());
           for ( ErgazomenosObject ergazomenos : theErgazomenoi)
           {
               System.out.println(ergazomenos.pdfToString());
               System.out.println(ergazomenos.getImerominiaMisthodosias());
           }

        //System.out.println(jTable2.getColumnCount());
    }//GEN-LAST:event_button1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     etosApo.setText("");
     etosEos.setText("");
     meraApo.setText("");
     meraEos.setText("");
     minasApo.setText("");
     minasEos.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(MisthodosiaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MisthodosiaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MisthodosiaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MisthodosiaForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new MisthodosiaForm().setVisible(true);
            }

        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button button1;
    private javax.swing.JTextField etosApo;
    private javax.swing.JTextField etosEos;
    private javax.swing.JPanel exportPanel2;
    private java.awt.Panel hmerominiaPanel;
    private javax.swing.JButton insert;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField meraApo;
    private javax.swing.JTextField meraEos;
    private javax.swing.JTextField minasApo;
    private javax.swing.JTextField minasEos;
    public javax.swing.JButton search1;
    private javax.swing.JTextField searchField;
    private javax.swing.JComboBox<String> selectionBox;
    // End of variables declaration//GEN-END:variables
}
