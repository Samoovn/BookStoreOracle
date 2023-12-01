
package BLL;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


public class OracleProvider {
    public static Connection connect=null;
    private static String username;
    private static String password;
    public static String service ;
    public static String port; 
    public static String ip ;
    public static String url="jdbc:oracle:thin:@"+ip+":"+port+":"+service;
    public OracleProvider(){
        
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
    
    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }    
    
    
    public static Connection getConnection(){    
        if (connect==null){
           try{                        
            if(username!=null && username.equals("SYS")){
                connect = DriverManager.getConnection(url, 
                    username.toUpperCase() + " as sysdba", password);
            }
            else{
                connect = DriverManager.getConnection(url, 
                    username.toUpperCase(), password);
            }
            }catch(Exception e){
             System.out.print(e);
            } 
        }        
    return connect;
    }
    
    public boolean TestConnect(String url2){
        this.url= url2;
        boolean ck=false;
        try {
            //Lấy một user test connect được hay không
            connect = DriverManager.getConnection(url, "CH2","CH2");
            ck=true;
            //Connect được thì cho về null nếu không sẽ tự đăng nhập bằng system
            connect = null;
        } catch (Exception e) {
            ck=false;
            return ck;
        }
        return ck;
    }
//    public ArrayList<String> DSProcedure(String tenuser)
//    {
//        ArrayList<String> ds = new ArrayList<>();
//         try{
//            DatabaseMetaData metadata = connect.getMetaData();
//            String schema = tenuser.toUpperCase();
//            ResultSet procedures = metadata.getProcedures(null, schema, null);
//            while (procedures.next()) {
//                if (procedures.getString("PROCEDURE_NAME").startsWith("P")) {
//                    ds.add(procedures.getString("PROCEDURE_NAME"));
//                }
//            }
//        }
//        catch(Exception e){ 
//              e.printStackTrace();
//        }
//        return ds;
//    }
}
