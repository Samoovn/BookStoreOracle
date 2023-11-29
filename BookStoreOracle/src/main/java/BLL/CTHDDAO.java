/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;
import DAL.CTHD;
import java.sql.CallableStatement;
import java.util.ArrayList;
/**
 *
 * @author DELL
 */
public class CTHDDAO {
   public static void taoCTHD(String mahd, String masach, int sl){
        ArrayList<CTHD> dshd = new ArrayList<CTHD>();
        OracleProvider op = new OracleProvider();
        String sql= "{CALL SYSTEM.P_THEM_CTHD(?,?,?)}";
        try{
            CallableStatement cs = op.getConnection().prepareCall(sql);
            cs.setString(1, mahd);
            cs.setString(2, masach);
            cs.setInt(3, sl);
            cs.executeUpdate();
            cs.close();
        }
        catch(Exception e){ 
             System.out.print(e);
        }
    }  
}
