/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

/**
 *
 * @author DELL
 */
public class FieldReportClass {

    public String getTEN() {
        return TEN;
    }

    public void setTEN(String TEN) {
        this.TEN = TEN;
    }

    public int getSL() {
        return SL;
    }

    public void setSL(int SL) {
        this.SL = SL;
    }

    public String getGIA() {
        return GIA;
    }

    public void setGIA(String GIA) {
        this.GIA = GIA;
    }

    public String getTHANHTIEN() {
        return THANHTIEN;
    }

    public void setTHANHTIEN(String THANHTIEN) {
        this.THANHTIEN = THANHTIEN;
    }

    String TEN;
    int SL;
    String GIA;
    String THANHTIEN;

    public FieldReportClass(String TEN, int SL, String GIA, String THANHTIEN) {
        this.TEN = TEN;
        this.SL = SL;
        this.GIA = GIA;
        this.THANHTIEN = THANHTIEN;
    }
    
}
