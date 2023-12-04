/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.hibernate.bookstoreoracle;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import BLL.OracleProvider;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
/**
 *
 * @author DELL
 */
public class Home extends javax.swing.JFrame {
    private String mach;
    private String tenuser;
    public Home(String mach, String tenuser) {
        initComponents();
        this.mach = mach;
        this.tenuser = tenuser;
        resizeImg();
        if(tenuser.equals("system"))
        {
            jMenu6.setVisible(true);
            jMenu8.setVisible(true);
            jMenu9.setVisible(true);
        }else
        {
            jMenu6.setVisible(false);
            jMenu8.setVisible(false);
            jMenu9.setVisible(false);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jMenuItem4.setText("jMenuItem4");

        jMenu7.setText("jMenu7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentResized(java.awt.event.ComponentEvent evt) {
                formComponentResized(evt);
            }
        });

        jDesktopPane1.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
        );

        jMenu4.setText("Sách");

        jMenuItem1.setText("Tìm sách");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem1);

        jMenuItem2.setText("Tạo hóa đơn");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem2);

        jMenuBar1.add(jMenu4);

        jMenu3.setText("Tìm KH");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu5.setText("Tìm hóa đơn");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu1.setText("Thông tin");

        jMenuItem3.setText("Cửa hàng");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu6.setText("Phân quyền");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        jMenu8.setText("Tạo user");
        jMenu8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu8MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu8);

        jMenu9.setText("Sao lưu & phục hồi");
        jMenu9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu9MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu9);

        jMenu2.setText("Đăng xuất");
        jMenu2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void resizeImg()
    {
        ImageIcon i = new ImageIcon(getClass().getResource("/img/background2.jpeg"));
        Image image = (i).getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_SMOOTH);
        i = new ImageIcon(image);
        jLabel1.setIcon(i);
    }    
    public JDesktopPane getDesktopPane() {
        return jDesktopPane1;
    }
    
    FindCustomer findcus;
    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        // TODO add your handling code here:
        if(findcus == null || findcus.isClosed()==true)
        {
            findcus = new FindCustomer(false, null, mach);
            jDesktopPane1.add(findcus, JLayeredPane.PALETTE_LAYER);
            findcus.setVisible(true);
        }else
        {
            findcus.setVisible(true);
        }
    }//GEN-LAST:event_jMenu3MouseClicked
    FindOrder findor;
    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        // TODO add your handling code here:
         if(findor == null || findor.isClosed()==true)
        {
            findor = new FindOrder();
            jDesktopPane1.add(findor, JLayeredPane.PALETTE_LAYER);
            findor.setVisible(true);
        }else
        {
            findor.setVisible(true);
        }
    }//GEN-LAST:event_jMenu5MouseClicked
    MakeOrder MakeB; 
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        if(MakeB == null || MakeB.isClosed()==true)
        {
            MakeB = new MakeOrder(mach);
            jDesktopPane1.add(MakeB, JLayeredPane.PALETTE_LAYER);
            MakeB.setVisible(true);
        }else
        {
            MakeB.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    
    private void formComponentResized(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentResized
        // TODO add your handling code here:
        resizeImg();
    }//GEN-LAST:event_formComponentResized
    Login login;
    private static OracleProvider op = new OracleProvider();
    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
        op.connect = null;
        login = new Login(null,null,null);
        login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenu2MouseClicked
    ShopInfo FindS;
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        if(FindS == null || FindS.isClosed()==true)
        {
            FindS = new ShopInfo();
            jDesktopPane1.add(FindS, JLayeredPane.PALETTE_LAYER);
            FindS.setVisible(true);
        }else
        {
            FindS.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed
    GrantUser grant;
    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        // TODO add your handling code here:
        if(grant == null || grant.isClosed()==true)
        {
            grant = new GrantUser(tenuser);
            jDesktopPane1.add(grant, JLayeredPane.PALETTE_LAYER);
            grant.setVisible(true);
        }else
        {
            grant.setVisible(true);
        }
    }//GEN-LAST:event_jMenu6MouseClicked
    FindBook findB; 
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        if(findB == null || findB.isClosed()==true)
        {
            findB = new FindBook(mach);
            jDesktopPane1.add(findB, JLayeredPane.PALETTE_LAYER);
            findB.setVisible(true);
        }else
        {
            findB.setVisible(true);
        }
    }//GEN-LAST:event_jMenuItem1ActionPerformed
    CreateUser createuser; 
    private void jMenu8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu8MouseClicked
        // TODO add your handling code here:
        if(grant == null || grant.isClosed()==true)
        {
            grant = new GrantUser(tenuser);
            jDesktopPane1.add(grant, JLayeredPane.PALETTE_LAYER);
            grant.setVisible(true);
        }else
        {
            grant.setVisible(true);
        }
        if(createuser == null || createuser.isClosed()==true)
        {
            createuser = new CreateUser(mach,grant);
            jDesktopPane1.add(createuser, JLayeredPane.PALETTE_LAYER);
            createuser.setVisible(true);
        }else
        {
            createuser.setVisible(true);
        }
    }//GEN-LAST:event_jMenu8MouseClicked
    Backup db;
    private void jMenu9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu9MouseClicked
        // TODO add your handling code here:
        if(db == null || db.isClosed()==true)
        {
            db = new Backup();
            jDesktopPane1.add(db, JLayeredPane.PALETTE_LAYER);
            db.setVisible(true);
        }else
        {
            db.setVisible(true);
        }
    }//GEN-LAST:event_jMenu9MouseClicked
                       
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home(null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables

}
