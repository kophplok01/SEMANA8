/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import java.awt.Font;
import java.awt.Dialog.ModalExclusionType;
import java.awt.FlowLayout;


public class Principal_frame extends javax.swing.JFrame {

    /**
     * Creates new form Principal_frame
     */
    public Principal_frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_iniciar_registros = new javax.swing.JButton();
        btn_iniciar_servicio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_iniciar_registros.setFont(new Font("Arial", Font.PLAIN, 14)); // NOI18N
        btn_iniciar_registros.setText("Nuevo registro");
        btn_iniciar_registros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciar_registrosActionPerformed(evt);
            }
        });

        btn_iniciar_servicio.setFont(new Font("Arial", Font.PLAIN, 14)); // NOI18N
        btn_iniciar_servicio.setText("Ver Servicios");
        btn_iniciar_servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciar_servicioActionPerformed(evt);
            }
        });
        getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        getContentPane().add(btn_iniciar_registros);
        getContentPane().add(btn_iniciar_servicio);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_iniciar_registrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciar_registrosActionPerformed

    }//GEN-LAST:event_btn_iniciar_registrosActionPerformed

    private void btn_iniciar_servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciar_servicioActionPerformed
     // TODO add your handling code here:
    }//GEN-LAST:event_btn_iniciar_servicioActionPerformed

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
            java.util.logging.Logger.getLogger(Principal_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btn_iniciar_registros;
    public javax.swing.JButton btn_iniciar_servicio;
    // End of variables declaration//GEN-END:variables
}
