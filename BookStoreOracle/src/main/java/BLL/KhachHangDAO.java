
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
    public static ArrayList<KhachHang> xuatThongTinKhachHang(){
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
            cs.setNString(3, tenkh);
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
    public static boolean createKhachHang(String makh , String tenkh,String sdt , String diachi){
        OracleProvider op = new OracleProvider();
        String sql = "CALL SYSTEM.P_THEM_KH@CHS_DBLINK(?,?,?,?)";
        try{
            CallableStatement cs = op.getConnection().prepareCall(sql);
            cs.setString(1,makh);
            cs.setString(2,tenkh);
            cs.setString(3,sdt);
            cs.setString(4,diachi);
            cs.executeUpdate();
            cs.close();
            return true;
        }
        catch(Exception e){
            System.out.print(e);
            return false;
        }
    }
    public static boolean updateKhachHang(String makh , String tenkh,String sdt , String diachi){
        OracleProvider op = new OracleProvider();
        String sql = "CALL SYSTEM.P_SUA_KH(?,?,?,?)";
        try{
            CallableStatement cs = op.getConnection().prepareCall(sql);
            cs.setString(1,makh);
            cs.setString(2,tenkh);
            cs.setString(3,sdt);
            cs.setString(4,diachi);
            cs.executeUpdate();
            cs.close();
            return true;
        }
        catch(Exception e){
            System.out.print(e);
            return false;
        }
    }
}
