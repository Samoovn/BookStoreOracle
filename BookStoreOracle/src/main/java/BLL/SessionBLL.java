/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import DAL.SessionClass;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class SessionBLL {
    public static ArrayList<SessionClass> xuatSession(){
        ArrayList<SessionClass> ds = new ArrayList<SessionClass>();
        OracleProvider op = new OracleProvider();
        String sql= "SELECT SID, SCHEMANAME, MACHINE, PROCESS, PROGRAM, SQL_EXEC_START, "
                + "LOGON_TIME, EVENT, SERVICE_NAME FROM V$SESSION WHERE TYPE!='BACKGROUND'";
        try{
            PreparedStatement cs = op.getConnection().prepareStatement(sql);
            ResultSet rs = cs.executeQuery();
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
}
