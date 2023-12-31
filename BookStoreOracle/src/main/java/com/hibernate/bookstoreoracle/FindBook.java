/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.hibernate.bookstoreoracle;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JPanel;
import BLL.SachDAO;
import BLL.CTCHDAO;
import DAL.Sach;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageConfig;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

/**
 *
 * @author DELL
 */
public class FindBook extends javax.swing.JInternalFrame implements Runnable,ThreadFactory{

    /**
     * Creates new form FindBook2
     */
    String mach;
    public FindBook(String mach) {
        initComponents();
        Color col = new Color(250, 242, 211);
        getContentPane().setBackground(col);
        load();
        this.mach = mach;
    }
    SachDAO sach = new SachDAO();
    CTCHDAO ctch = new CTCHDAO();
    private void load()
    {
        ArrayList<Sach> dsKH = sach.xuatThongTinSach();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã Sách");
        model.addColumn("Tên Sách");
        model.addColumn("Giá Bán");
        model.addColumn("SL Tồn");
         for (Sach kh : dsKH) {
            Object[] rowData = {kh.getMasach(), kh.getTensach(), kh.getGia(), kh.getSl()};
            model.addRow(rowData);
        }
        dgv_DSSACH.setModel(model);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLayeredPane10 = new javax.swing.JLayeredPane();
        panel12 = new java.awt.Panel();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        dgv_DSSACH = new javax.swing.JTable();
        btn_tim1 = new javax.swing.JButton();
        btn_qr = new javax.swing.JButton();
        jLayeredPane11 = new javax.swing.JLayeredPane();
        btn_capnhat = new javax.swing.JButton();
        txt_soluong10 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txt_giasach10 = new javax.swing.JTextField();
        txt_tensach = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        jLabel46 = new javax.swing.JLabel();
        txt_masach = new javax.swing.JTextField();
        btn_Scan1 = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setBorder(null);
        setClosable(true);
        setIconifiable(true);

        panel12.setBackground(new java.awt.Color(204, 236, 248));

        jLabel45.setText("THÔNG TIN SÁCH");

        javax.swing.GroupLayout panel12Layout = new javax.swing.GroupLayout(panel12);
        panel12.setLayout(panel12Layout);
        panel12Layout.setHorizontalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel45)
                .addGap(174, 174, 174))
        );
        panel12Layout.setVerticalGroup(
            panel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel45)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        dgv_DSSACH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        dgv_DSSACH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dgv_DSSACHMouseClicked(evt);
            }
        });
        jScrollPane13.setViewportView(dgv_DSSACH);

        btn_tim1.setText("Tìm");
        btn_tim1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_tim1ActionPerformed(evt);
            }
        });

        btn_qr.setText("Tạo QR");
        btn_qr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_qrActionPerformed(evt);
            }
        });

        jLayeredPane10.setLayer(panel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(jScrollPane13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(btn_tim1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(btn_qr, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane10Layout = new javax.swing.GroupLayout(jLayeredPane10);
        jLayeredPane10.setLayout(jLayeredPane10Layout);
        jLayeredPane10Layout.setHorizontalGroup(
            jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_tim1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                    .addComponent(btn_qr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.DEFAULT_SIZE, 469, Short.MAX_VALUE))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jLayeredPane10Layout.setVerticalGroup(
            jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_qr, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_tim1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );

        btn_capnhat.setText("Cập nhật");
        btn_capnhat.setToolTipText("");
        btn_capnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_capnhatActionPerformed(evt);
            }
        });

        jLabel42.setText("Số lượng");

        jLabel44.setText("Giá  sách");

        jLabel43.setText("Tên sách");

        panel1.setBackground(new java.awt.Color(34, 9, 44));
        panel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jLabel46.setText("Mã sách");

        jLayeredPane11.setLayer(btn_capnhat, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane11.setLayer(txt_soluong10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane11.setLayer(jLabel42, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane11.setLayer(jLabel44, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane11.setLayer(txt_giasach10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane11.setLayer(txt_tensach, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane11.setLayer(jLabel43, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane11.setLayer(panel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane11.setLayer(jLabel46, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane11.setLayer(txt_masach, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane11Layout = new javax.swing.GroupLayout(jLayeredPane11);
        jLayeredPane11.setLayout(jLayeredPane11Layout);
        jLayeredPane11Layout.setHorizontalGroup(
            jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane11Layout.createSequentialGroup()
                .addGroup(jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jLayeredPane11Layout.createSequentialGroup()
                        .addGroup(jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel44)
                            .addComponent(jLabel43))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txt_tensach, javax.swing.GroupLayout.DEFAULT_SIZE, 364, Short.MAX_VALUE)
                            .addComponent(txt_giasach10)))
                    .addGroup(jLayeredPane11Layout.createSequentialGroup()
                        .addComponent(jLabel46)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_masach)))
                .addGap(27, 27, 27)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btn_capnhat, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                    .addComponent(jLabel42)
                    .addComponent(txt_soluong10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane11Layout.setVerticalGroup(
            jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane11Layout.createSequentialGroup()
                .addGroup(jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane11Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_masach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel46))
                        .addGap(24, 24, 24)
                        .addGroup(jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_tensach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel43))
                        .addGap(25, 25, 25)
                        .addGroup(jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_giasach10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel44)))
                    .addGroup(jLayeredPane11Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel42)
                        .addGap(13, 13, 13)
                        .addComponent(txt_soluong10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btn_capnhat, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        btn_Scan1.setText("QR Scan");
        btn_Scan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Scan1MouseClicked(evt);
            }
        });
        btn_Scan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Scan1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLayeredPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLayeredPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_Scan1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btn_Scan1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLayeredPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private JPanel Scanscreen;
    private JButton btn_timSach;
    private WebcamPanel panel = null;
    private Webcam webcam = null;
    private Executor executor = Executors.newSingleThreadExecutor(this);
    private void SetLayoutScan()
    {
        jLayeredPane10.setVisible(false);
        btn_Scan1.setVisible(false);
        btn_timSach = new JButton();
        btn_timSach.setText("Tìm theo nhập liệu");
        btn_timSach.setBounds(530, 10, 190, 30);
        btn_timSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_TimSachClicked(evt);
            }
        });
        Scanscreen = new JPanel();
        Scanscreen.setBounds(200, 45, 350, 250);
        Scanscreen.setBackground(Color.black);
        Scanscreen.add(btn_timSach);
        this.add(btn_timSach);
        this.add(Scanscreen);
        jLayeredPane11.setBounds(10, 350, jLayeredPane11.getWidth(), jLayeredPane11.getHeight());
        this.add(jLayeredPane11);
        initWebcam();
    }
    private void btn_TimSachClicked(java.awt.event.MouseEvent evt) {
        
        btn_timSach.setVisible(false);
        Scanscreen.setVisible(false);
        jLayeredPane10.setVisible(true);
        btn_Scan1.setVisible(true);
         // Đóng webcam khi nút được nhấn
        webcam.close();
    }
    private void btn_Scan1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Scan1MouseClicked
        SetLayoutScan();
    }//GEN-LAST:event_btn_Scan1MouseClicked

    private void btn_tim1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_tim1ActionPerformed
        // TODO add your handling code here:
        ArrayList<Sach> dsKH = sach.timThongTinSach(txt_tensach.getText(),txt_masach.getText());
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Mã Sách");
        model.addColumn("Tên Sách");
        model.addColumn("Giá Bán");
        model.addColumn("SL Tồn");
         for (Sach kh : dsKH) {
            Object[] rowData = {kh.getMasach(), kh.getTensach(), kh.getGia(), kh.getSl()};
            model.addRow(rowData);
        }
        dgv_DSSACH.setModel(model);
    }//GEN-LAST:event_btn_tim1ActionPerformed

    private void dgv_DSSACHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dgv_DSSACHMouseClicked
        // TODO add your handling code here:
        int row = dgv_DSSACH.rowAtPoint(evt.getPoint());

        if (row >= 0 ) {
            Object ma = dgv_DSSACH.getValueAt(row, 0);
            txt_masach.setText(ma.toString());
            Object ten = dgv_DSSACH.getValueAt(row, 1);
            txt_tensach.setText(ten.toString().trim());
            Object gia = dgv_DSSACH.getValueAt(row, 2);
            txt_giasach10.setText(gia.toString());
            Object sl = dgv_DSSACH.getValueAt(row, 3);
            txt_soluong10.setText(sl.toString());
        }
    }//GEN-LAST:event_dgv_DSSACHMouseClicked
    public static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e1) {
            return false;
        }
    }  
    private void btn_capnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_capnhatActionPerformed
        // TODO add your handling code here:
        if(isNumeric(txt_soluong10.getText())==false || Integer.parseInt(txt_soluong10.getText())<0)
        {
            JOptionPane.showMessageDialog(null,"Vui lòng nhập đúng số lượng!");
            return;
        }
        if(ctch.capNhatCTCH(mach, txt_masach.getText(), Integer.parseInt(txt_soluong10.getText()))==false)
        {
            JOptionPane.showMessageDialog(null,"Cập nhật không thành công!");
        }else
        {
            JOptionPane.showMessageDialog(null,"Cập nhật thành công!");
            load();
        }
    }//GEN-LAST:event_btn_capnhatActionPerformed
    
    private void btn_qrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_qrActionPerformed
        // TODO add your handling code here:
        try{
            String QrCode = txt_masach.getText();
            String charset = "UTF-8";
            ByteArrayOutputStream out = QRCode.from(new String (QrCode.getBytes(charset),charset)).to(ImageType.PNG).stream();
            String f_name = txt_masach.getText();
            String path_name = "D:\\";
            FileOutputStream export_img = new FileOutputStream(new File(path_name+(f_name +".png")));
            export_img.write(out.toByteArray());
            export_img.flush(); 
            JOptionPane.showMessageDialog(null,"Tạo mã qr thành công!");
        }catch(Exception e)
        {
            System.out.println("Lỗi");
            JOptionPane.showMessageDialog(null,"Nhập mã sách!");

        }
    }//GEN-LAST:event_btn_qrActionPerformed

    private void btn_Scan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Scan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Scan1ActionPerformed
      
    private void initWebcam()
    {
        Dimension size = WebcamResolution.QVGA.getSize();
        webcam = Webcam.getWebcams().get(0);
        webcam.setViewSize(size);
        panel = new WebcamPanel(webcam);
        panel.setPreferredSize(size);
        panel.setFPSDisplayed(true);
        Scanscreen.add(panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0,0,470, 300));
        executor.execute(this);
    }
    @Override
    public void run(){
        do{
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                Logger.getLogger(FindBook.class.getName()).log(Level.SEVERE, null, ex);
            }
            Result result = null;
            BufferedImage image = null;
            if(webcam.isOpen())
            {
                if((image = webcam.getImage())==null)
                {
                    continue;
                }
            }
            LuminanceSource source = new BufferedImageLuminanceSource(image);
            BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source));
            
            try {
                result = new MultiFormatReader().decode(bitmap);
            } catch (NotFoundException ex) {
                Logger.getLogger(FindBook.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(result != null)
            {
                LoadSachQR(result.getText());
            }
        }while(true);
    }
    private void LoadSachQR(String tensach) {                                         
        // TODO add your handling code here:
        ArrayList<Sach> dsSA = sach.timThongTinSach(tensach,tensach);
        if(dsSA.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Không tìm thấy sách cần tìm!");
            return;
        }
         for (Sach sa : dsSA) {
            txt_masach.setText(sa.getMasach());
            txt_tensach.setText(sa.getTensach());
            txt_giasach10.setText(String.valueOf(sa.getGia()));
            txt_soluong10.setText(String.valueOf(sa.getSl()));
        }
    }  
    @Override
    public Thread newThread(Runnable r)
    {
        Thread t = new Thread(r,"My Thread");
        t.setDaemon(true);
        return t;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Scan1;
    private javax.swing.JButton btn_capnhat;
    private javax.swing.JButton btn_qr;
    private javax.swing.JButton btn_tim1;
    private javax.swing.JTable dgv_DSSACH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLayeredPane jLayeredPane10;
    private javax.swing.JLayeredPane jLayeredPane11;
    private javax.swing.JScrollPane jScrollPane13;
    private java.awt.Panel panel1;
    private java.awt.Panel panel12;
    private javax.swing.JTextField txt_giasach10;
    private javax.swing.JTextField txt_masach;
    private javax.swing.JTextField txt_soluong10;
    private javax.swing.JTextField txt_tensach;
    // End of variables declaration//GEN-END:variables
}
