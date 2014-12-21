
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author haydut
 */
public class MainWin extends javax.swing.JFrame {

    /**
     * Creates new form asdfg
     */
    public MainWin() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        ZamanDegeri = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ZamanDegeri.setBackground(new java.awt.Color(0, 0, 0));
        ZamanDegeri.setFont(new java.awt.Font("Baskerville Old Face", 1, 36)); // NOI18N
        ZamanDegeri.setForeground(new java.awt.Color(204, 0, 0));
        ZamanDegeri.setText("Saat");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(ZamanDegeri)
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(ZamanDegeri)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        
    private void formWindowOpened(java.awt.event.WindowEvent evt) {                                  
    Timer Zamanlayici = new Timer();
    Zamanlayici.schedule( new TimerTask() {
    public void run() {
    Date Tarih = new Date();
    int Saat = Tarih.getHours();
    int Dakika = Tarih.getMinutes();
    int Saniye = Tarih.getSeconds();
    ZamanDegeri.setText(""+Saat+":"+Dakika+":"+Saniye);    }
 }, 0, 1000);    }                                 
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel ZamanDegeri;
    // End of variables declaration                   
}
