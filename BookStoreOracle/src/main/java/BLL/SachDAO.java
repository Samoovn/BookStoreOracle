/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;
import DAL.Sach;
import com.beust.jcommander.internal.Console;
import com.sun.jdi.connect.spi.Connection;
import java.sql.CallableStatement;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;
import oracle.jdbc.OracleCallableStatement;
import java.sql.ResultSet;
/**
 *
 * @author DELL
 */
public class SachDAO {
    public static ArrayList<Sach> xuatThongTinSach(){
        ArrayList<Sach> dss = new ArrayList<Sach>();
        OracleProvider op = new OracleProvider();
        String sql= "{CALL SYSTEM.P_HIEN_DSSACH(?)}";
        try{
            CallableStatement cs = op.getConnection().prepareCall(sql);
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.execute();
            ResultSet rs = ((OracleCallableStatement)cs).getCursor(1);
            while(rs.next()){
                Sach kh = new Sach();
                kh.setMasach(rs.getString("MASACH"));
                kh.setTensach(rs.getString("TENSACH"));
                kh.setGia(Integer.parseInt(rs.getString("GIABAN")));
                kh.setSl(Integer.parseInt(rs.getString("SLG_TON")));
                dss.add(kh);
            }
            rs.close();
            cs.close();
            
        }
        catch(Exception e){ 
             System.out.print(e);
        }
        return dss;
    }
     public static ArrayList<Sach> timThongTinSach(String tensach){
        ArrayList<Sach> dss = new ArrayList<Sach>();
        OracleProvider op = new OracleProvider();
        String sql= "{CALL SYSTEM.P_TIM_SACH(?,?)}";
        try{
            CallableStatement cs = op.getConnection().prepareCall(sql);
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.setString(2, tensach);
            cs.execute();
            ResultSet rs = ((OracleCallableStatement)cs).getCursor(1);
            while(rs.next()){
                Sach kh = new Sach();
                kh.setMasach(rs.getString("MASACH"));
                kh.setTensach(rs.getString("TENSACH"));
                kh.setGia(Integer.parseInt(rs.getString("GIABAN")));
                kh.setSl(Integer.parseInt(rs.getString("SLG_TON")));
                dss.add(kh);
            }
            rs.close();
            cs.close();
            
        }
        catch(Exception e){ 
             System.out.print(e);
        }
        return dss;
    }
}
