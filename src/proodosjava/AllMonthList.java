/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proodosjava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Kwstas
 */
public class AllMonthList {
        //public stati ArrayList<ErgazomenosObject> ergazomenoiList;
        private static String USERNAME = "root";
        private static String PASSWORD = "Helloimgosu1!";
        private static String CONN_STRING = "jdbc:mysql://localhost:3306/proodos";
        public static ArrayList<ErgazomenosObject> theErgazomenoi = new ArrayList();
        public AllMonthList()
        
        {
            
        }
    
        public void newpdfToString()
    {
        Connection conn = null;
        String st;
        String query;
        String imerominiaMisthodosias = null;

        try{
        conn = DriverManager.getConnection(CONN_STRING, USERNAME, PASSWORD);
        Statement stmt = conn.createStatement();
        Statement stmt2 = conn.createStatement();
        ArrayList<String> minas = new ArrayList<>(Arrays.asList("01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12"));
        String etos="2024";
        for (int j=0;j<12;j++)
        {
        String query1 = "SELECT afm, onoma, eponimo FROM stoixeia";
        ResultSet rs1 = stmt2.executeQuery(query1);
        while (rs1.next()) 
        {
        String id = rs1.getString("afm");
        String onoma = rs1.getString("onoma");
        String eponimo = rs1.getString("eponimo");
        
        ErgazomenosObject ergazomenoi = new ErgazomenosObject();
        ergazomenoi.setId(id);
        ergazomenoi.setOnoma(onoma);
        ergazomenoi.setEponimo(eponimo);
        
        try{
            
            query = "call getErgazomenosMisthos ("+ergazomenoi.getId()+")";
            try(ResultSet rs = stmt.executeQuery(query)){
                if (rs.next())
                {
                    ergazomenoi.setMisthos(rs.getDouble("Misthos"));
                    
                }
            }
            
            //Call kai Set Meres Pou Doulepse O Ergazomenos
            query = "call getErgazomenosMeres ('"+etos+"','"+minas.get(j)+"',"+ergazomenoi.getId()+")";
            try(ResultSet rs = stmt.executeQuery(query)){    
                if (rs.next())
                {
                    ergazomenoi.setMeresErgasiasMina(rs.getInt("MeresMhna"));
                    
                }
            }
            //Call kai Set Meres Adeias Ergazomenou
            query = "call getErgazomenosAdeia ('"+etos+"','"+minas.get(j)+"',"+ergazomenoi.getId()+")";
            try(ResultSet rs = stmt.executeQuery(query)){    
                if (rs.next())
                {
                    ergazomenoi.setAdeia(rs.getInt("SinoloAdeion"));
                    
                }
            }
            //Call kai Set Meres Adeias Ergazomenou
            query = "call getErgazomenosAneu ('"+etos+"','"+minas.get(j)+"',"+ergazomenoi.getId()+")";
            try(ResultSet rs = stmt.executeQuery(query)){    
                if (rs.next())
                {
                    ergazomenoi.setAneuApodoxon(rs.getInt("SinoloAdeion"));
                    
                }
            }
            //Call kai Set Meres Adeias Ergazomenou
            query = "call getErgazomenosAsthenia ('"+etos+"','"+minas.get(j)+"',"+ergazomenoi.getId()+")";
            try(ResultSet rs = stmt.executeQuery(query)){    
                if (rs.next())
                {
                    ergazomenoi.setAsthenia(rs.getInt("SinoloAdeion"));
                    
                }
            }
            //Call kai Set Wres
            query = "call getErgazomenosWres ("+ergazomenoi.getId()+")";
            try(ResultSet rs = stmt.executeQuery(query)){    
                if (rs.next())
                {
                    ergazomenoi.setWresErgasias(rs.getInt("Wres_Ergasias"));
                    
                }
            }
            query = "call getErgazomenosTiposMisthou ("+ergazomenoi.getId()+")";
            try(ResultSet rs = stmt.executeQuery(query)){    
                if (rs.next())
                {
                    ergazomenoi.setTiposMisthou(rs.getInt("TiposMisthou"));
                    
                }
            }
            query = "call getErgazomenosDieuthinsi ("+ergazomenoi.getId()+")";
            try(ResultSet rs = stmt.executeQuery(query)){    
                if (rs.next())
                {
                    ergazomenoi.setAddress(rs.getString("Diefthinsi"));
                    
                }
            }
            query = "call getErgazomenosAmka ("+ergazomenoi.getId()+")";
            try(ResultSet rs = stmt.executeQuery(query)){    
                if (rs.next())
                {
                    ergazomenoi.setAmka(rs.getInt("AMKA"));
                    
                }
            }
            int intMinas = Integer.parseInt(minas.get(j)); 
            int intEtos= Integer.parseInt(etos); 
            intMinas+=1;
            if(intMinas>12)
            {
                intEtos++;
                intMinas=01;
            }
            ergazomenoi.setImerominiaMisthodosias("'"+Integer.toString(intEtos) + "-" +"0"+intMinas + "-01'");         
            
            ergazomenoi.misthosErgazomenou();
            
            theErgazomenoi.add(ergazomenoi);

        }
               
        catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        } 
        }

        
        }

        
        }
            catch(SQLException e)
        {
            JOptionPane.showMessageDialog(null,e);
        } 
        
    }
        public static void main(String[] args) {
        AllMonthList allMonthList = new AllMonthList();
        allMonthList.newpdfToString();      
        for(ErgazomenosObject ergazomenos:theErgazomenoi)
        {
            System.out.println(ergazomenos.getImerominiaMisthodosias());
            System.out.println(ergazomenos.pdfToString());
            
        }

    }
}   