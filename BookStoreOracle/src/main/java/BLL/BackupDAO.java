/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BLL;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author DELL
 */
public class BackupDAO {
    public static void backup(){
        String command = "expdp system/system123@CUAHANGSACH1 schemas=system directory=EXPDP_FULL "
                + "dumpfile=CH01_export.dmp logfile=export.log REUSE_DUMPFILES=YES";
        try{
            ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", command);
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();
            process.waitFor(2, TimeUnit.MINUTES);        
        }
        catch(Exception e){ 
             System.out.print(e);
        }
         String command3 = "expdp system/system123@CUAHANGSACH2 schemas=system directory=EXPDP_FULL "
                 + "dumpfile=CH02_export.dmp logfile=export.log REUSE_DUMPFILES=YES";
        try{
            ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", command3);
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();
            process.waitFor(2, TimeUnit.MINUTES);        
        }
        catch(Exception e){ 
             System.out.print(e);
        }
        String command2 = "expdp system/system123@CUAHANGSACH schemas=system directory=EXPDP_FULL "
                + "dumpfile=SERVER_export.dmp logfile=export.log REUSE_DUMPFILES=YES";
        try{
            ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", command2);
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();
            process.waitFor(2, TimeUnit.MINUTES);        
        }
        catch(Exception e){ 
             System.out.print(e);
        }
    }
    public static void restore(){
        String command = "impdp system/system123@CUAHANGSACH1 directory=EXPDP_FULL "
                + "dumpfile=CH01_export.dmp logfile=import.log TABLE_EXISTS_ACTION=REPLACE";
        try{
            ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", command);
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();
            process.waitFor(1, TimeUnit.MINUTES);        
        }
        catch(Exception e){ 
             System.out.print(e);
        }
        String command3 = "impdp system/system123@CUAHANGSACH2 directory=EXPDP_FULL "
                + "dumpfile=CH02_export.dmp logfile=import.log TABLE_EXISTS_ACTION=REPLACE";
        try{
            ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", command3);
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();
            process.waitFor(1, TimeUnit.MINUTES);        
        }
        catch(Exception e){ 
             System.out.print(e);
        }
        String command2 = "impdp system/system123@CUAHANGSACH directory=EXPDP_FULL "
                + "dumpfile=SERVER_export.dmp logfile=import.log TABLE_EXISTS_ACTION=REPLACE";
        try{
            ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", command2);
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();
            process.waitFor(1, TimeUnit.MINUTES);        
        }
        catch(Exception e){ 
             System.out.print(e);
        }
    }
}
