/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;
import DAL.CTCH;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;
/**
 *
 * @author DELL
 */
public class CTCHDAO {
    public static boolean capNhatCTCH(String mach, String masach, int sl){
        ArrayList<CTCH> dss = new ArrayList<CTCH>();
        OracleProvider op = new OracleProvider();
        String sql= "{CALL SYSTEM.P_SUA_CTCH(?,?,?)}";
        boolean kq = true;
        try{
            CallableStatement cs = op.getConnection().prepareCall(sql);
            cs.setString( 1, mach);
            cs.setString(2, masach);
            cs.setInt(3, sl);
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
