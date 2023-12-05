/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bookstoreoracle;

import DAL.TotalReportClass;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author DELL
 */
public class ReportManager {
    private static ReportManager instance;
    private JasperReport reportPay;
    public static ReportManager getinstance(){
        if(instance==null)
        {
            instance = new ReportManager();
        }
        return instance;
    }
    private ReportManager(){}
    //Biên dịch file PrintReport.jrxml
    public void bienDichReport() throws JRException{
        reportPay = JasperCompileManager.compileReport(getClass().getResourceAsStream("/report/PrintReport.jrxml"));
    }
    public void printReport(TotalReportClass data) throws JRException
    {
        Map para = new HashMap();
        para.put("MAHD",data.getMAHD());
        para.put("KH",data.getKH());
        para.put("TOTAL",data.getTOTAL());
        para.put("QR KH", data.getQRKH());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(data.getFields());
        JasperPrint print = JasperFillManager.fillReport(reportPay, para, dataSource);
        view(print);
    }
    private void view(JasperPrint print) throws JRException{
        JasperViewer.viewReport(print,false);
    }
}
