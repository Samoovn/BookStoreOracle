/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

/**
 *
 * @author DELL
 */
public class SessionClass {

    public String getSID() {
        return SID;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public String getSCHEMANAME() {
        return SCHEMANAME;
    }

    public void setSCHEMANAME(String SCHEMANAME) {
        this.SCHEMANAME = SCHEMANAME;
    }

    public String getMACHINE() {
        return MACHINE;
    }

    public void setMACHINE(String MACHINE) {
        this.MACHINE = MACHINE;
    }

    public String getPROCESS() {
        return PROCESS;
    }

    public void setPROCESS(String PROCESS) {
        this.PROCESS = PROCESS;
    }

    public String getPROGRAM() {
        return PROGRAM;
    }

    public void setPROGRAM(String PROGRAM) {
        this.PROGRAM = PROGRAM;
    }

    public String getSQL_EXEC_START() {
        return SQL_EXEC_START;
    }

    public void setSQL_EXEC_START(String SQL_EXEC_START) {
        this.SQL_EXEC_START = SQL_EXEC_START;
    }

    public String getLOGON_TIME() {
        return LOGON_TIME;
    }

    public void setLOGON_TIME(String LOGON_TIME) {
        this.LOGON_TIME = LOGON_TIME;
    }

    public String getEVENT() {
        return EVENT;
    }

    public void setEVENT(String EVENT) {
        this.EVENT = EVENT;
    }

    public String getSERVICE_NAME() {
        return SERVICE_NAME;
    }

    public void setSERVICE_NAME(String SERVICE_NAME) {
        this.SERVICE_NAME = SERVICE_NAME;
    }
    public String SID;
    public String SCHEMANAME;
    public String MACHINE;
    public String PROCESS;
    public String PROGRAM;
    public String SQL_EXEC_START;
    public String LOGON_TIME;
    public String EVENT;
    public String SERVICE_NAME;

    public SessionClass() {
    }
    
}
