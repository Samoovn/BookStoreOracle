/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.SessionClass;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author DELL
 */
public class SessionBLL {
    public static ArrayList<SessionClass> xuatSession(){
        ArrayList<SessionClass> ds = new ArrayList<SessionClass>();
        OracleProvider op = new OracleProvider();
        String sql= "{CALL SYSTEM.P_HIEN_SESSION(?)}";
        try{
            CallableStatement cs = op.getConnection().prepareCall(sql);
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.execute();
            ResultSet rs = ((OracleCallableStatement)cs).getCursor(1);
            while (rs.next()) {
                    SessionClass ssl = new SessionClass();
                    ssl.setSID(rs.getString("SID"));
                    ssl.setSCHEMANAME(rs.getString("SCHEMANAME"));
                    ssl.setMACHINE(rs.getString("MACHINE"));
                    ssl.setPROCESS(rs.getString("PROCESS"));
                    ssl.setPROGRAM(rs.getString("PROGRAM"));
                    ssl.setSQL_EXEC_START(rs.getString("SQL_EXEC_START"));
                    ssl.setEVENT(rs.getString("EVENT"));
                    ssl.setSERVICE_NAME(rs.getString("SERVICE_NAME"));
                    ds.add(ssl);
            }
            rs.close();
            cs.close();
        }
        catch(Exception e){ 
             System.out.print(e);
        }
        return ds;
    }
    public static DefaultTableModel xuatGioiHanTaiNguyen(){
        DefaultTableModel tableModel = new DefaultTableModel();
        
        OracleProvider op = new OracleProvider();
        String sql= "{CALL SYSTEM.P_XEM_GIOI_HAN_TAI_NGUYEN(?)}";
        try{
            CallableStatement cs = op.getConnection().prepareCall(sql);
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.execute();
            ResultSet rs = ((OracleCallableStatement)cs).getCursor(1);
            int columnCount = rs.getMetaData().getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                tableModel.addColumn(rs.getMetaData().getColumnName(i));
            }
            while (rs.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i - 1] = rs.getObject(i);
                }
                tableModel.addRow(rowData);
            }
            rs.close();
            cs.close();
        }
        catch(Exception e){ 
             System.out.print(e);
        }
        return tableModel;
    }
    public static DefaultTableModel xuatTaiNguyenControl(){
        DefaultTableModel tableModel = new DefaultTableModel();
        
        OracleProvider op = new OracleProvider();
        String sql= "{CALL SYSTEM.P_XEM_TAI_NGUYEN_CONTROLFILE(?)}";
        try{
            CallableStatement cs = op.getConnection().prepareCall(sql);
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.execute();
            ResultSet rs = ((OracleCallableStatement)cs).getCursor(1);
            int columnCount = rs.getMetaData().getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                tableModel.addColumn(rs.getMetaData().getColumnName(i));
            }
            while (rs.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i - 1] = rs.getObject(i);
                }
                tableModel.addRow(rowData);
            }
            rs.close();
            cs.close();
        }
        catch(Exception e){ 
             System.out.print(e);
        }
        return tableModel;
    }
    public static DefaultTableModel xuatTaiNguyenDataFile(){
        DefaultTableModel tableModel = new DefaultTableModel();
        
        OracleProvider op = new OracleProvider();
        String sql= "{CALL SYSTEM.P_XEM_TAI_NGUYEN_DATAFILE(?)}";
        try{
            CallableStatement cs = op.getConnection().prepareCall(sql);
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.execute();
            ResultSet rs = ((OracleCallableStatement)cs).getCursor(1);
            int columnCount = rs.getMetaData().getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                tableModel.addColumn(rs.getMetaData().getColumnName(i));
            }
            while (rs.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i - 1] = rs.getObject(i);
                }
                tableModel.addRow(rowData);
            }
            rs.close();
            cs.close();
        }
        catch(Exception e){ 
             System.out.print(e);
        }
        return tableModel;
    }
    public static DefaultTableModel xuatTaiNguyenSGA(){
        DefaultTableModel tableModel = new DefaultTableModel();
        
        OracleProvider op = new OracleProvider();
        String sql= "{CALL SYSTEM.P_XEM_TAI_NGUYEN_SGA(?)}";
        try{
            CallableStatement cs = op.getConnection().prepareCall(sql);
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.execute();
            ResultSet rs = ((OracleCallableStatement)cs).getCursor(1);
            int columnCount = rs.getMetaData().getColumnCount();
            for (int i = 1; i <= columnCount; i++) {
                tableModel.addColumn(rs.getMetaData().getColumnName(i));
            }
            while (rs.next()) {
                Object[] rowData = new Object[columnCount];
                for (int i = 1; i <= columnCount; i++) {
                    rowData[i - 1] = rs.getObject(i);
                }
                tableModel.addRow(rowData);
            }
            rs.close();
            cs.close();
        }
        catch(Exception e){ 
             System.out.print(e);
        }
        return tableModel;
    }
}
