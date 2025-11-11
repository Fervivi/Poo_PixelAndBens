package cl.fernando.pnb;

// Importa la ventana que queremos iniciar
import cl.fernando.pnb.gui.LoginFrame; 

/**
 * Clase principal que arranca la aplicación.
 * @author ferna
 */
public class PixelAndBeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Configura el Look and Feel (opcional, copia del LoginFrame original)
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        // Inicia la aplicación en el hilo de despacho de eventos de Swing
        java.awt.EventQueue.invokeLater(() -> {
            new LoginFrame().setVisible(true); // ¡Crea y muestra la ventana de login!
        });
    }
}