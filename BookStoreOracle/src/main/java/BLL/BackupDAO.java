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
    public static void backup(String tench){
        String command = "expdp system/system123@"+tench+" schemas=system directory=EXPDP_FULL dumpfile=export.dmp logfile=export.log";
        try{
            ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", command);
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();
            process.waitFor(2, TimeUnit.MINUTES);        
        }
        catch(Exception e){ 
             System.out.print(e);
        }
    }
    public static void restore(String tench){
        String command = "impdp system/system123@"+tench+" directory=EXPDP_FULL dumpfile=export.dmp logfile=import.log TABLE_EXISTS_ACTION=REPLACE";
        try{
            ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", command);
            processBuilder.redirectErrorStream(true);
            Process process = processBuilder.start();
            process.waitFor(2, TimeUnit.MINUTES);        
        }
        catch(Exception e){ 
             System.out.print(e);
        }
    }
}
