
package BLL;

import DAL.KhachHang;
import com.beust.jcommander.internal.Console;
import com.sun.jdi.connect.spi.Connection;
import java.sql.CallableStatement;
import java.util.ArrayList;
import oracle.jdbc.OracleTypes;
import oracle.jdbc.OracleCallableStatement;
import java.sql.ResultSet;



public class KhachHangDAO {
    
    public static ArrayList<KhachHang> xuatThongTinKhachHang(String makh, String tenkh){
        ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
        OracleProvider op = new OracleProvider();
        String sql= "{CALL SYSTEM.P_HIEN_DSKH(?)}";
        try{
            CallableStatement cs = op.getConnection().prepareCall(sql);
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.execute();
            ResultSet rs = ((OracleCallableStatement)cs).getCursor(1);
            while(rs.next()){
                KhachHang kh = new KhachHang();
                kh.setMakh(rs.getString("MAKH"));
                kh.setTenkh(rs.getString("TENKH"));
                kh.setSDT(rs.getString("SDT"));
                kh.setDiachi(rs.getString("DIACHI"));
                dsKH.add(kh);
            }
            rs.close();
            cs.close();
            
        }
        catch(Exception e){ 
             System.out.print(e);
        }
        return dsKH;
    }
    public static ArrayList<KhachHang> timThongTinKhachHang(String makh, String tenkh){
        ArrayList<KhachHang> dsKH = new ArrayList<KhachHang>();
        OracleProvider op = new OracleProvider();
        String sql= "{CALL SYSTEM.P_TIM_KH(?,?,?)}";
        try{
            CallableStatement cs = op.getConnection().prepareCall(sql);
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.setString(2, makh);
            cs.setString(3, tenkh);
            cs.execute();
            ResultSet rs = ((OracleCallableStatement)cs).getCursor(1);
            while(rs.next()){
                KhachHang kh = new KhachHang();
                kh.setMakh(rs.getString("MAKH"));
                kh.setTenkh(rs.getString("TENKH"));
                kh.setSDT(rs.getString("SDT"));
                kh.setDiachi(rs.getString("DIACHI"));
                dsKH.add(kh);
            }
            rs.close();
            cs.close();
            
        }
        catch(Exception e){ 
             System.out.print(e);
        }
        return dsKH;
    }
}
