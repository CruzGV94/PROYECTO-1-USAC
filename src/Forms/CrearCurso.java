package Forms;

import Proyecto1.Cursos;
import Proyecto1.Profesores;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class CrearCurso extends javax.swing.JFrame {

    private Crear crear;
    private CursosVen cursosVen;
    public static ArrayList<Cursos> listaCursos = new ArrayList<Cursos>();

    public CrearCurso() {
        initComponents();
        cargarProfesor();
        cursosVen = new CursosVen();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        BotonAgregar = new javax.swing.JButton();
        Txtcodigo = new javax.swing.JTextField();
        Txtnombre = new javax.swing.JTextField();
        Txtcredito = new javax.swing.JTextField();
        ComboBoxProfesores = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Agregar nuevo Curso");

        jLabel2.setText("Codigo");

        jLabel3.setText("Nombre");

        jLabel4.setText("Creditos");

        jLabel5.setText("Profesor");

        BotonAgregar.setText("Agregar");
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });

        ComboBoxProfesores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ComboBoxProfesores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxProfesoresActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addComponent(BotonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Txtcredito)
                            .addComponent(Txtnombre)
                            .addComponent(Txtcodigo)
                            .addComponent(ComboBoxProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(49, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Txtcodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(Txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(Txtcredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(ComboBoxProfesores, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(BotonAgregar)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed
        // TODO add your handling code here:
        crearCursos();
        mostrarCursos();
        dispose();
        cursosVen.llenarTablaCursos();
    }//GEN-LAST:event_BotonAgregarActionPerformed

    public void cargarProfesor() {
        int cantidad = Crear.listaProfesores.size();
        ComboBoxProfesores.removeAllItems();
        DefaultComboBoxModel modelo = (DefaultComboBoxModel) ComboBoxProfesores.getModel();
        ComboBoxProfesores.setModel(modelo);
        for (Profesores profesor : Crear.listaProfesores) {
            modelo.addElement(profesor.getNombre() + " " + profesor.getApellido());
        }
        ComboBoxProfesores.setModel(modelo);
    }


    private void ComboBoxProfesoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxProfesoresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxProfesoresActionPerformed

    // funcion para validar que el codigo ingresado es unico 
    public boolean CodigoUnico(int codigo) {
        for (Cursos cursos : listaCursos) {
            if (cursos.getCodigo() == codigo) {
                return false; // El código ya está en uso
            }
        }
        return true; // El código es único
    }

    //Funcion para crear cursos
    public void crearCursos() {
        if (!Txtcodigo.getText().isEmpty() && !Txtnombre.getText().isEmpty() && !Txtcredito.getText().isEmpty()) {

            String codigo = Txtcodigo.getText();
            String nombre = Txtnombre.getText();
            int credString = Integer.parseInt(Txtcredito.getText());
            //Profesores profesor = (Profesores) ComboBoxProfesores.getSelectedItem();
            Profesores profesor = (Profesores) ComboBoxProfesores.getSelectedItem();
//            if (profesor == null) {
//                JOptionPane.showMessageDialog(this, "Por favor, seleccione un profesor.", "Profesor no seleccionado", JOptionPane.WARNING_MESSAGE);
//                return;
//            }

            try {
                int c = Integer.parseInt(codigo);
                if (!CodigoUnico(c)) {
                    JOptionPane.showMessageDialog(this, "El código ingresado ya está en uso.", "Código Duplicado", JOptionPane.WARNING_MESSAGE);
                    return; // No crea el profesor si el código no es único
                }
                JOptionPane.showMessageDialog(this, "El curso se agrego Correctamente.", "Éxito", JOptionPane.WARNING_MESSAGE);

                // Resto del código para crear el profesor
                Cursos cC = new Cursos();
                Profesores cc = new Profesores();
                cC.setCodigo(c);
                cC.setNombre(nombre);
                cC.setCredito(credString);
                //cC.setProfe(String.valueOf(profesor));
                for(Profesores profe : Crear.listaProfesores){
                    cC.setProfe(profe.getNombre() + " " + profe.getApellido());
                }   

                listaCursos.add(cC);
                // Actualiza la tabla en ProfesoresVen
                if (cursosVen != null) {
                    cursosVen.llenarTablaCursos();
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Ingrese un valor numérico válido en el campo de Código.", "Valor Inválido", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(null, "Faltan Datos, Revisar.....");
        }
    } // fin bloque crear cursos

    public void mostrarCursos() {
        for (int i = 0; i < listaCursos.size(); i++) {
            Cursos temp = new Cursos();
            temp = listaCursos.get(i);
            System.out.println(temp.getCodigo() + "," + temp.getNombre() + "," + temp.getCredito() + "," + temp.getProfe());
            //}
        }
    }

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
            java.util.logging.Logger.getLogger(CrearCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearCurso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearCurso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregar;
    public static javax.swing.JComboBox<String> ComboBoxProfesores;
    private javax.swing.JTextField Txtcodigo;
    private javax.swing.JTextField Txtcredito;
    private javax.swing.JTextField Txtnombre;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
