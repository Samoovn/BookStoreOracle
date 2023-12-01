/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;
import DAL.CuaHang;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;
/**
 *
 * @author DELL
 */
public class CuaHangDAO {
    public static CuaHang xuatThongTinCuaHang(){
        CuaHang ch = new CuaHang();
        OracleProvider op = new OracleProvider();
        String sql= "{CALL SYSTEM.P_XEM_CUAHANG(?)}";
        try{
            CallableStatement cs = op.getConnection().prepareCall(sql);
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.execute();
            ResultSet rs = ((OracleCallableStatement)cs).getCursor(1);
            while(rs.next()){
                ch.setMach(rs.getString("MACH"));
                ch.setTench(rs.getString("TENCH"));
                ch.setDiachi(rs.getString("DIACHI"));
            }
            rs.close();
            cs.close();
            
        }
        catch(Exception e){ 
             System.out.print(e);
        }
        return ch;
    }
}
