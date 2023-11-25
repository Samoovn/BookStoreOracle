
package BLL;

import java.sql.Connection;
import java.sql.DriverManager;


public class OracleProvider {
    private static Connection connect=null;
    private static String username;
    private static String password;
    private static String url="jdbc:oracle:thin:@localhost:1521:cuahangsach";
    public OracleProvider(){
        
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
            if(username.equals("SYS")){
                connect = DriverManager.getConnection(url, 
                    username.toUpperCase() + " as sysdba", password);
            }
            else{
                connect = DriverManager.getConnection(url, 
                    username.toUpperCase(), password);
            }
            }catch(Exception e){} 
        }        
    return connect;
    }
}
