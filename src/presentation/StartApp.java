package presentation;

import javax.swing.*;
import java.util.logging.*;

/**
 *
 * @author Philippe-K
 */

public class StartApp extends JFrame
{
    /**
     * Creates new form StartApp
     */
    public StartApp()
    {
        initComponents();
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Loading_num = new javax.swing.JLabel();
        ChargementApp = new javax.swing.JLabel();
        ProgressBarApp = new javax.swing.JProgressBar();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        jPanel1.setPreferredSize(new java.awt.Dimension(700, 350));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Chaparral Pro", 3, 50)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(242, 223, 27));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("SI de gestion d'un hôtel");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 700, 90);

        Loading_num.setBackground(new java.awt.Color(36, 235, 255));
        Loading_num.setFont(new java.awt.Font("Cooper Std Black", 0, 24)); // NOI18N
        Loading_num.setForeground(new java.awt.Color(238, 198, 17));
        Loading_num.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Loading_num.setText("Chargement");
        Loading_num.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(Loading_num);
        Loading_num.setBounds(120, 250, 140, 30);

        ChargementApp.setFont(new java.awt.Font("Cooper Std Black", 0, 24)); // NOI18N
        ChargementApp.setForeground(new java.awt.Color(242, 223, 27));
        ChargementApp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ChargementApp.setText("Chargement...");
        ChargementApp.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(ChargementApp);
        ChargementApp.setBounds(0, 250, 160, 30);

        ProgressBarApp.setBackground(new java.awt.Color(255, 255, 255));
        ProgressBarApp.setForeground(new java.awt.Color(29, 152, 228));
        jPanel1.add(ProgressBarApp);
        ProgressBarApp.setBounds(0, 280, 700, 10);

        jLabel6.setFont(new java.awt.Font("Chaparral Pro Light", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Le système de réservation central aide les hôteliers à gérer toutes leurs ventes marketing en ligne.");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 330, 700, 20);

        jLabel4.setFont(new java.awt.Font("Chaparral Pro Light", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Un système de réservation d'hôtel est également connu sous le nom de système central de réservation (CRS)  ");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(0, 310, 700, 20);

        jLabel5.setFont(new java.awt.Font("Chaparral Pro Light", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Le but du système de réservation d'hôtel est de fournir un endroit pour que les clients dorment. ");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(0, 290, 700, 20);

        jLabel7.setFont(new java.awt.Font("Chaparral Pro Light", 3, 50)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(242, 223, 27));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Welcome To HotelLight");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(0, 80, 700, 80);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pictures/bellagio-hotel-and-casino-las-vegas-lv0116_0.jpg"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-1, -1, 700, 350);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(700, 350));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ChargementApp;
    public javax.swing.JLabel Loading_num;
    public javax.swing.JProgressBar ProgressBarApp;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}