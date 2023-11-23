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

/**
 *
 * @author DELL
 */
public class MakeOrder extends javax.swing.JInternalFrame implements Runnable,ThreadFactory{

    /**
     * Creates new form MakeOrder
     */
    public MakeOrder() {
        initComponents();
        Color col = new Color(250, 242, 211);
        getContentPane().setBackground(col);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLayeredPane10 = new javax.swing.JLayeredPane();
        panel12 = new java.awt.Panel();
        jLabel45 = new javax.swing.JLabel();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTable13 = new javax.swing.JTable();
        btn_tim1 = new javax.swing.JButton();
        jLayeredPane11 = new javax.swing.JLayeredPane();
        btn_ok = new javax.swing.JButton();
        txt_soluong10 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        txt_giasach10 = new javax.swing.JTextField();
        txt_tensach = new javax.swing.JTextField();
        jLabel43 = new javax.swing.JLabel();
        panel1 = new java.awt.Panel();
        btn_themgiohang = new javax.swing.JButton();
        pn_giohang = new java.awt.Panel();
        jLabel50 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        tbl_giohang = new javax.swing.JTable();
        btn_Scan1 = new javax.swing.JButton();

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

        jTable13.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane13.setViewportView(jTable13);

        btn_tim1.setText("Tìm");

        jLayeredPane10.setLayer(panel12, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(jScrollPane13, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane10.setLayer(btn_tim1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane10Layout = new javax.swing.GroupLayout(jLayeredPane10);
        jLayeredPane10.setLayout(jLayeredPane10Layout);
        jLayeredPane10Layout.setHorizontalGroup(
            jLayeredPane10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_tim1, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                .addGap(18, 18, 18)
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
                .addContainerGap(12, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jLayeredPane10Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_tim1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        btn_ok.setText("OK");

        jLabel42.setText("Số lượng");

        jLabel44.setText("Giá  sách");

        jLabel43.setText("Tên sách");

        panel1.setBackground(new java.awt.Color(34, 9, 44));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 340, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 8, Short.MAX_VALUE)
        );

        btn_themgiohang.setText("Thêm vào giỏ hàng");
        btn_themgiohang.setToolTipText("");

        pn_giohang.setBackground(new java.awt.Color(204, 236, 248));

        jLabel50.setText("GIỎ HÀNG");

        javax.swing.GroupLayout pn_giohangLayout = new javax.swing.GroupLayout(pn_giohang);
        pn_giohang.setLayout(pn_giohangLayout);
        pn_giohangLayout.setHorizontalGroup(
            pn_giohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pn_giohangLayout.createSequentialGroup()
                .addContainerGap(174, Short.MAX_VALUE)
                .addComponent(jLabel50)
                .addGap(155, 155, 155))
        );
        pn_giohangLayout.setVerticalGroup(
            pn_giohangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pn_giohangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tbl_giohang.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane12.setViewportView(tbl_giohang);

        jLayeredPane11.setLayer(btn_ok, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane11.setLayer(txt_soluong10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane11.setLayer(jLabel42, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane11.setLayer(jLabel44, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane11.setLayer(txt_giasach10, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane11.setLayer(txt_tensach, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane11.setLayer(jLabel43, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane11.setLayer(panel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane11.setLayer(btn_themgiohang, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane11.setLayer(pn_giohang, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane11.setLayer(jScrollPane12, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane11Layout = new javax.swing.GroupLayout(jLayeredPane11);
        jLayeredPane11.setLayout(jLayeredPane11Layout);
        jLayeredPane11Layout.setHorizontalGroup(
            jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane11Layout.createSequentialGroup()
                .addGroup(jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane11Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel43)
                            .addComponent(jLabel44)
                            .addComponent(txt_tensach, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                            .addComponent(txt_giasach10)))
                    .addGroup(jLayeredPane11Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_themgiohang, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jLayeredPane11Layout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addGap(18, 18, 18)
                                .addComponent(txt_soluong10, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jLayeredPane11Layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(btn_ok, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pn_giohang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jLayeredPane11Layout.setVerticalGroup(
            jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jLayeredPane11Layout.createSequentialGroup()
                .addGroup(jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane11Layout.createSequentialGroup()
                        .addComponent(jLabel43)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_tensach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel44)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_giasach10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jLayeredPane11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_soluong10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel42))
                        .addGap(18, 18, 18)
                        .addComponent(btn_themgiohang, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14)
                        .addComponent(btn_ok)
                        .addGap(0, 34, Short.MAX_VALUE))
                    .addGroup(jLayeredPane11Layout.createSequentialGroup()
                        .addComponent(pn_giohang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        btn_Scan1.setText("QR Scan");
        btn_Scan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_Scan1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_Scan1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLayeredPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLayeredPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_Scan1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jLayeredPane10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
//        jLayeredPane11.setBounds(10, 350, jLayeredPane11.getWidth(), jLayeredPane11.getHeight());
//        this.add(jLayeredPane11);
        initWebcam();
    }
    private void btn_TimSachClicked(java.awt.event.MouseEvent evt) {
        
        btn_timSach.setVisible(false);
        Scanscreen.setVisible(false);
        jLayeredPane10.setVisible(true);
        btn_Scan1.setVisible(true);
    }
    private void btn_Scan1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_Scan1MouseClicked
        SetLayoutScan();
    }//GEN-LAST:event_btn_Scan1MouseClicked
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
                txt_tensach.setText(result.getText());
            }
        }while(true);
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
    private javax.swing.JButton btn_ok;
    private javax.swing.JButton btn_themgiohang;
    private javax.swing.JButton btn_tim1;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLayeredPane jLayeredPane10;
    private javax.swing.JLayeredPane jLayeredPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JTable jTable13;
    private java.awt.Panel panel1;
    private java.awt.Panel panel12;
    private java.awt.Panel pn_giohang;
    private javax.swing.JTable tbl_giohang;
    private javax.swing.JTextField txt_giasach10;
    private javax.swing.JTextField txt_soluong10;
    private javax.swing.JTextField txt_tensach;
    // End of variables declaration//GEN-END:variables
}