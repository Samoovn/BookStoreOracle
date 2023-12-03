/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;

/**
 *
 * @author DELL
 */
public class UserDAO {
    public static ArrayList<String> xuatThongTinUser(){
        ArrayList<String> dss = new ArrayList<String>();
        OracleProvider op = new OracleProvider();
        String sql= "{CALL SYSTEM.P_CHECK_USER(?)}";
        try{
            CallableStatement cs = op.getConnection().prepareCall(sql);
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.execute();
            ResultSet rs = ((OracleCallableStatement)cs).getCursor(1);
            while(rs.next()){
                String user = rs.getString("USERNAME");
                dss.add(user);
            }
            rs.close();
            cs.close();
            
        }
        catch(Exception e){ 
             System.out.print(e);
        }
        return dss;
    }
     public static ArrayList<String> timThongTinUser(String username){
        ArrayList<String> dss = new ArrayList<String>();
        OracleProvider op = new OracleProvider();
        String sql= "{CALL SYSTEM.P_FIND_USER(?,?)}";
        try{
            CallableStatement cs = op.getConnection().prepareCall(sql);
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.setNString(2, username );
            cs.execute();
            ResultSet rs = ((OracleCallableStatement)cs).getCursor(1);
            while(rs.next()){
                String user = rs.getString("USERNAME");
                dss.add(user);
            }
            rs.close();
            cs.close();
        }
        catch(Exception e){ 
             System.out.print(e);
        }
        return dss;
    }
     public static String kiemTraRoleUser(String username){
        String dss = "";
        OracleProvider op = new OracleProvider();
        String sql= "{CALL SYSTEM.P_CHECK_ROLE(?,?)}";
        try{
            CallableStatement cs = op.getConnection().prepareCall(sql);
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.setNString(2, username );
            cs.execute();
            ResultSet rs = ((OracleCallableStatement)cs).getCursor(1);
            while(rs.next()){
                String user = rs.getString("GRANTED_ROLE");
                dss=user;
            }
            rs.close();
            cs.close();
        }
        catch(Exception e){ 
             System.out.print(e);
        }
        return dss;
    }
    public static Boolean thuHoiRoleUser(String role, String username){
        OracleProvider op = new OracleProvider();
        String sql= "{CALL SYSTEM.P_REVOKE_ROLE(?,?)}";
        boolean kq = true;
        try{
            CallableStatement cs = op.getConnection().prepareCall(sql);
            cs.setString( 1, role);
            cs.setString(2, username);
            cs.executeUpdate();
            cs.close();
        }
        catch(Exception e){ 
            kq=false;
            return kq;
        }
        return kq;
    }
    public static Boolean ganRoleUser(String role, String username){
        OracleProvider op = new OracleProvider();
        String sql= "{CALL SYSTEM.P_GRANT_ROLE(?,?)}";
        boolean kq = true;
        try{
            CallableStatement cs = op.getConnection().prepareCall(sql);
            cs.setString( 1, role);
            cs.setString(2, username);
            cs.executeUpdate();
            cs.close();
        }
        catch(Exception e){ 
            kq=false;
            return kq;
        }
        return kq;
    }
    public static boolean taoUser(String user, String pass){
        OracleProvider op = new OracleProvider();
        String sql= "{CALL SYSTEM.P_CREATE_USER(?,?)}";
        boolean kq = true;
        try{
            CallableStatement cs = op.getConnection().prepareCall(sql);
            cs.setString( 1, user);
            cs.setString(2, pass);
            cs.executeUpdate();
            cs.close();
        }
        catch(Exception e){ 
            kq=false;
            return kq;
        }
        return kq;
    }
    public static boolean xoaUser(String user){
        OracleProvider op = new OracleProvider();
        String sql= "{CALL SYSTEM.P_DROP_USER(?)}";
        boolean kq = true;
        try{
            CallableStatement cs = op.getConnection().prepareCall(sql);
            cs.setString( 1, user);
            cs.executeUpdate();
            cs.close();
        }
        catch(Exception e){ 
            kq=false;
            return kq;
        }
        return kq;
    }
}
