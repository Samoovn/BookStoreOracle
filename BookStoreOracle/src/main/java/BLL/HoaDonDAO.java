/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;
import DAL.HoaDon;
import java.util.ArrayList;
import com.beust.jcommander.internal.Console;
import com.sun.jdi.connect.spi.Connection;
import java.sql.CallableStatement;
import java.sql.Date;
import oracle.jdbc.OracleTypes;
import oracle.jdbc.OracleCallableStatement;
import java.sql.ResultSet;
import java.sql.Types;
import java.text.SimpleDateFormat;
/**
 *
 * @author DELL
 */
public class HoaDonDAO {
    public static ArrayList<HoaDon> timThongTinHoaDon(String mahd, String makh){
        ArrayList<HoaDon> dshd = new ArrayList<HoaDon>();
        OracleProvider op = new OracleProvider();
        String sql= "{CALL SYSTEM.P_TIM_HD(?,?,?)}";
        try{
            CallableStatement cs = op.getConnection().prepareCall(sql);
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.setString(2, mahd);
             cs.setString(3, makh);
            cs.execute();
            ResultSet rs = ((OracleCallableStatement)cs).getCursor(1);
            while(rs.next()){
                HoaDon kh = new HoaDon();
                kh.setMahd(rs.getString("MAHD"));
                kh.setMakh(rs.getString("MAKH"));
                kh.setNgaylap(rs.getString("NGAYLAP"));
                kh.setTongtien(Integer.parseInt(rs.getString("TONGTIEN")));
                kh.setMacuahang(rs.getString("MACH"));
                dshd.add(kh);
            }
            rs.close();
            cs.close();
            
        }
        catch(Exception e){ 
             System.out.print(e);
        }
        return dshd;
    }
    public static ArrayList<HoaDon> hienThongTinHoaDon(){
        ArrayList<HoaDon> dshd = new ArrayList<HoaDon>();
        OracleProvider op = new OracleProvider();
        String sql= "{CALL SYSTEM.P_HIEN_HD(?)}";
        try{
            CallableStatement cs = op.getConnection().prepareCall(sql);
            cs.registerOutParameter(1, OracleTypes.CURSOR);
            cs.execute();
            ResultSet rs = ((OracleCallableStatement)cs).getCursor(1);
            while(rs.next()){
                HoaDon kh = new HoaDon();
                kh.setMahd(rs.getString("MAHD"));
                kh.setMakh(rs.getString("MAKH"));
                kh.setNgaylap(rs.getString("NGAYLAP"));
                kh.setTongtien(Integer.parseInt(rs.getString("TONGTIEN")));
                kh.setMacuahang(rs.getString("MACH"));
                dshd.add(kh);
            }
            rs.close();
            cs.close();
            
        }
        catch(Exception e){ 
             System.out.print(e);
        }
        return dshd;
    }
    public static String taoMaHoaDon(){
        ArrayList<HoaDon> dshd = new ArrayList<HoaDon>();
        OracleProvider op = new OracleProvider();
        String sql= "{? = call f_tao_ma_hd}";
        String mahd = "";
        try{
            CallableStatement cs = op.getConnection().prepareCall(sql);
            cs.registerOutParameter(1, Types.VARCHAR);
            cs.execute();
            mahd = cs.getString(1);
            cs.close();
        }
        catch(Exception e){ 
             System.out.print(e);
        }
        return mahd;
    }
     public static void taoHoaDon(String mahd, String makh, String ngaylap,String mach, double thanhtien){
        ArrayList<HoaDon> dshd = new ArrayList<HoaDon>();
        OracleProvider op = new OracleProvider();
        String sql= "{CALL SYSTEM.P_TAO_HD(?,?,?,?,?)}";
        try{
            CallableStatement cs = op.getConnection().prepareCall(sql);
            cs.setString(1, mahd);
            cs.setString(2, makh);
            cs.setString(3, ngaylap);
            cs.setString(4, mach);
            cs.setDouble(5, thanhtien);
            cs.executeUpdate();
            cs.close();
        }
        catch(Exception e){ 
             System.out.print(e);
        }
    }
}
