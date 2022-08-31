/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xuankemis;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrator
 */
public class MainFrm_student extends javax.swing.JFrame {

    /**
     * Creates new form MainFrm_student
     */
    public MainFrm_student() {
       initComponents();
        int windowWidth = this.getWidth(); //获得窗口宽
        int windowHeight = this.getHeight(); //获得窗口高
        Toolkit kit = Toolkit.getDefaultToolkit(); //定义工具包
        Dimension screenSize = kit.getScreenSize(); //获取屏幕的尺寸
        int screenWidth = screenSize.width; //获取屏幕的宽
        int screenHeight = screenSize.height; //获取屏幕的高
        //this.setLocation(screenWidth / 2 - windowWidth / 2, screenHeight / 2 - windowHeight / 2);//设置窗口居中显示
        this.setLocation(screenWidth / 2 - 700 / 2, screenHeight / 2 - 500 / 2);
        this.setExtendedState(JFrame.NORMAL);
        this.setSize(700,500);
        this.setTitle("选课管理信息系统");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        table = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jmiSelectCourse = new javax.swing.JMenuItem();
        jmiSelectedView = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmiPasswordModify = new javax.swing.JMenuItem();
        jmiSelfInfo = new javax.swing.JMenuItem();
        jmiExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        table.setPreferredSize(new java.awt.Dimension(700, 500));

        jMenu1.setText("基本操作");

        jMenu3.setText("选课");

        jmiSelectCourse.setText("选择未选课程");
        jmiSelectCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSelectCourseActionPerformed(evt);
            }
        });
        jMenu3.add(jmiSelectCourse);

        jmiSelectedView.setText("查看已选课程");
        jmiSelectedView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSelectedViewActionPerformed(evt);
            }
        });
        jMenu3.add(jmiSelectedView);

        jMenu1.add(jMenu3);

        jMenu4.setText("个人信息");

        jmiPasswordModify.setText("修改密码");
        jmiPasswordModify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPasswordModifyActionPerformed(evt);
            }
        });
        jMenu4.add(jmiPasswordModify);

        jmiSelfInfo.setText("学籍信息");
        jmiSelfInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSelfInfoActionPerformed(evt);
            }
        });
        jMenu4.add(jmiSelfInfo);

        jMenu1.add(jMenu4);

        jmiExit.setText("退出系统");
        jmiExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiExitActionPerformed(evt);
            }
        });
        jMenu1.add(jmiExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("帮助");

        jMenuItem6.setText("操作指南");
        jMenu2.add(jMenuItem6);

        jMenuItem7.setText("联系管理员");
        jMenu2.add(jMenuItem7);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(table, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 292, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(table, 0, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiSelectCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSelectCourseActionPerformed
        // TODO add your handling code here:
        SelectCourseInterFrm selectCourseInterFrm = new SelectCourseInterFrm();
	selectCourseInterFrm.setVisible(true);
	this.table.add(selectCourseInterFrm);
    }//GEN-LAST:event_jmiSelectCourseActionPerformed

    private void jmiSelectedViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSelectedViewActionPerformed
        // TODO add your handling code here:
        SelectedViewInterFrm selectedViewInterFrm = new SelectedViewInterFrm();
	selectedViewInterFrm.setVisible(true);
	this.table.add(selectedViewInterFrm);
    }//GEN-LAST:event_jmiSelectedViewActionPerformed

    private void jmiPasswordModifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPasswordModifyActionPerformed
        // TODO add your handling code here:
        PasswordModifyInterFrm passwordModifyInterFrm = new PasswordModifyInterFrm();
	passwordModifyInterFrm.setVisible(true);
	this.table.add(passwordModifyInterFrm);
    }//GEN-LAST:event_jmiPasswordModifyActionPerformed

    private void jmiSelfInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSelfInfoActionPerformed
        // TODO add your handling code here:
        SelfInfoInterFrm selfInfoInterFrm = new SelfInfoInterFrm();
	selfInfoInterFrm.setVisible(true);
	this.table.add(selfInfoInterFrm);
    }//GEN-LAST:event_jmiSelfInfoActionPerformed

    private void jmiExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiExitActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(this, "确定要退出系统吗?");
		if (result == 0) {
			this.dispose();
		}
    }//GEN-LAST:event_jmiExitActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrm_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrm_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrm_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrm_student.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrm_student().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jmiExit;
    private javax.swing.JMenuItem jmiPasswordModify;
    private javax.swing.JMenuItem jmiSelectCourse;
    private javax.swing.JMenuItem jmiSelectedView;
    private javax.swing.JMenuItem jmiSelfInfo;
    private javax.swing.JDesktopPane table;
    // End of variables declaration//GEN-END:variables
}
