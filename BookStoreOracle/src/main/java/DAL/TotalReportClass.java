/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.io.InputStream;
import java.util.List;

/**
 *
 * @author DELL
 */
public class TotalReportClass {

    public String getMAHD() {
        return MAHD;
    }

    public void setMAHD(String MAHD) {
        this.MAHD = MAHD;
    }

    public String getKH() {
        return KH;
    }

    public void setKH(String KH) {
        this.KH = KH;
    }

    public String getTOTAL() {
        return TOTAL;
    }

    public void setTOTAL(String TOTAL) {
        this.TOTAL = TOTAL;
    }

    public InputStream getQRKH() {
        return QRKH;
    }

    public void setQRKH(InputStream QRKH) {
        this.QRKH = QRKH;
    }

    public List<FieldReportClass> getFields() {
        return fields;
    }

    public void setFields(List<FieldReportClass> fields) {
        this.fields = fields;
    }
    String MAHD;
    String KH;
    String TOTAL;
    InputStream QRKH;
    List<FieldReportClass> fields;

    public TotalReportClass(String MAHD, String KH, String TOTAL, InputStream QRKH, List<FieldReportClass> fields) {
        this.MAHD = MAHD;
        this.KH = KH;
        this.TOTAL = TOTAL;
        this.QRKH = QRKH;
        this.fields = fields;
    }
    
}
