package Forms;

import Proyecto1.Alumnos;
import Proyecto1.Profesores;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class InicioSesion extends javax.swing.JFrame {
    //public ArrayList<Crear> listaProfesores = new ArrayList<Crear>();
    
        public InicioSesion() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TextoUsuario = new javax.swing.JTextField();
        TextoPass = new javax.swing.JPasswordField();
        BotonIniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("USUARIO");

        jLabel2.setText("CONTRASEÑA");

        TextoPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoPassActionPerformed(evt);
            }
        });

        BotonIniciar.setText("INICIAR");
        BotonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TextoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextoPass, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(BotonIniciar)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TextoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextoPass, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addComponent(BotonIniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Codigo para iniciar sesion
    private void BotonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIniciarActionPerformed

        Login();
    }//GEN-LAST:event_BotonIniciarActionPerformed

    public void Login() {
        String codigoCarnet = TextoUsuario.getText().trim();
        char[] contraseña = TextoPass.getPassword();

        if (codigoCarnet.isEmpty() || contraseña.length == 0) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos.", "Campos Incompletos", JOptionPane.WARNING_MESSAGE);
            return;
        }
        String contraseñaStr = new String(contraseña);
        // Verificar las credenciales del administrador
        if ("ad".equals(codigoCarnet) && "ad".equals(contraseñaStr)) {
            if (codigoCarnet.matches(".*[A-Z]*.")) {
                Admin adminFrame = new Admin();
                adminFrame.setVisible(true);
                adminFrame.setLocationRelativeTo(null);
                this.dispose();
                return;
            }else{JOptionPane.showMessageDialog(this, "La contraseña no debe contener letras mayúsculas.", "Error de Contraseña", JOptionPane.ERROR_MESSAGE);}
        }
        // Verificar las credenciales de los profesores
        for (int i = 0; i < Crear.listaProfesores.size(); i++) {
            Profesores profe = Crear.listaProfesores.get(i);
            if (profe.getCodigo() == Integer.parseInt(codigoCarnet) && "1234".equals(contraseñaStr)) {
                FrameProfesor profesorFrame = new FrameProfesor();
                profesorFrame.setVisible(true);
                profesorFrame.setLocationRelativeTo(null);
                this.dispose();
                return;
            }
            System.out.println(Crear.listaProfesores.get(i) + " " + profe.getCodigo());
            System.out.println(contraseñaStr);
        }

        // Verificar las credenciales de los alumnos
        for (int i = 0; i < AlumnosVen.listaAlumnos.size(); i++) {
            Alumnos alumnos = AlumnosVen.listaAlumnos.get(i);
            if (alumnos.getCarnet() == Integer.parseInt(codigoCarnet) && "1234".equals(contraseñaStr)) {
                FrameAlumnos alumnoFrame = new FrameAlumnos();
                alumnoFrame.setVisible(true);
                alumnoFrame.setLocationRelativeTo(null);
                this.dispose();
                return;
            }
            System.out.println(alumnos.getCarnet());
            System.out.println(contraseñaStr);
        }
        //System.out.println(codigoCarnet + "" + contraseñaStr);
        JOptionPane.showMessageDialog(this, "Código/Carnet o contraseña incorrectos.", "Inicio de Sesión Fallido", JOptionPane.ERROR_MESSAGE);
        TextoUsuario.setText("");
        TextoPass.setText("");
    }

    private void TextoPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoPassActionPerformed

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
            java.util.logging.Logger.getLogger(InicioSesion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                InicioSesion ventanaInicio = new InicioSesion();

                ventanaInicio.setVisible(true);
                ventanaInicio.setLocationRelativeTo(null);
                ventanaInicio.setTitle("Inicio");
                ventanaInicio.setDefaultCloseOperation(EXIT_ON_CLOSE);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonIniciar;
    private javax.swing.JPasswordField TextoPass;
    private javax.swing.JTextField TextoUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
