package Forms;

import java.io.Serializable;
import Proyecto1.Profesores;
import Proyecto1.SerializarObjeto;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Crear extends javax.swing.JFrame implements Serializable {

    public static Crear crear = null;
    private ProfesoresVen profesoresVen;
    public static ArrayList<Profesores> listaProfesores = new ArrayList<Profesores>(50);
    
//    static {
//        iniciarDatos();
//    }

    public Crear() {
        //cargarProfesores();
        initComponents();
        profesoresVen = new ProfesoresVen();
        InicioSesion inicio = new InicioSesion();

//        inicio.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent e) {
//                //guardarProfesores(); // Llama al método para guardar los datos
//            }
//        });
//
//        SerializarObjeto.serializarObjeto("", ABORT);
    }
    
//    public static void iniciarDatos(){
//        Crear tempCrear = SerializarObjeto.deserializarObjeto("EstadoProfesore.txt", Crear.class);
//        if(tempCrear==null){
//            System.out.println("Iniciando datos");
//            Crear.crear = new Crear();
//        }else{
//            System.out.println("Cargando datos");
//            Crear.crear = tempCrear;
//        }
//    }
//    
//    public void gurdar(){
//        
//        SerializarObjeto.serializarObjeto("EstadoProfesores.txt", this);
//    
//    }

//    // Método para guardar la instancia en un archivo
//    public void guardarProfesores() {
//        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("profesoresCreados.txt"))) {
//            outputStream.writeObject(this); // Guarda la instancia actual
//            System.out.println("Profesores guardado correctamente.");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    // Método para cargar la instancia desde un archivo
//    public static void cargarProfesores() {
//        
//        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("profesoresCreados.txt"))) {
//            listaProfesores = (ArrayList<Profesores>) inputStream.readObject();
//            System.out.println("Profesores cargados correctamente.");
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }
//    public void cargarProfesores() {
//        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("profesoresCreados.txt"))) {
//            Crear loadedProfesores = (Crear) inputStream.readObject();
//            listaProfesores = loadedProfesores.listaProfesores;
//            System.out.println("Profesores cargado correctamente.");
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TxtCodigo = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        TxtApellido = new javax.swing.JTextField();
        TxtCorreo = new javax.swing.JTextField();
        TxtContra = new javax.swing.JTextField();
        BotonAgregar = new javax.swing.JButton();
        jComboBoxGenero = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Agregar Nuevo Profesor");

        jLabel2.setText("Codigo");

        jLabel3.setText("Nombre");

        jLabel4.setText("Apellido");

        jLabel5.setText("Correo");

        jLabel6.setText("Contraseña");

        jLabel7.setText("Genero");

        BotonAgregar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BotonAgregar.setText("Agregar");
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });

        jComboBoxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "M", "F" }));
        jComboBoxGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxGeneroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TxtNombre)
                                    .addComponent(TxtApellido)
                                    .addComponent(TxtCorreo)
                                    .addComponent(TxtContra, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                    .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(BotonAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(112, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(TxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(TxtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel5))
                    .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TxtContra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jComboBoxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addComponent(BotonAgregar)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxGeneroActionPerformed

    }//GEN-LAST:event_jComboBoxGeneroActionPerformed
    // funcion para validar que el codigo ingresado es unico 
    public boolean esCodigoUnico(int codigo) {
        for (Profesores profesor : Crear.listaProfesores) {
            if (profesor.getCodigo() == codigo) {
                return false; // El código ya está en uso
            }
        }
        return true; // El código es único
    }

    //Funcion para crear profesores
    public void crearProfesores() {

        String codigoStr = TxtCodigo.getText();
        String nombre = TxtNombre.getText();
        String apellido = TxtApellido.getText();
        String correo = TxtCorreo.getText();
        String genero = (String) jComboBoxGenero.getSelectedItem();

        if (codigoStr.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || genero.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, complete todos los campos antes de continuar.", "Campos Incompletos", JOptionPane.WARNING_MESSAGE);
            return; // No crea el profesor si hay campos vacíos
        }

        try {
            int codigo = Integer.parseInt(codigoStr);
            if (!esCodigoUnico(codigo)) {
                JOptionPane.showMessageDialog(this, "El código ingresado ya está en uso.", "Código Duplicado", JOptionPane.WARNING_MESSAGE);
                return; // No crea el profesor si el código no es único
            }
            JOptionPane.showMessageDialog(this, "El profesor se agrego Correctamente.", "Éxito", JOptionPane.WARNING_MESSAGE);

            // Resto de tu código para crear el profesor
            Profesores creaProf = new Profesores();
            creaProf.setCodigo(codigo);
            creaProf.setNombre(nombre);
            creaProf.setApellido(apellido);
            creaProf.setCorreo(correo);
            creaProf.setContraseña("1234");
            creaProf.setGenero(genero.charAt(0));

            listaProfesores.add(creaProf);

            // Actualiza la tabla en ProfesoresVen
            if (profesoresVen != null) {
                profesoresVen.llenarTablaProf();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Ingrese un valor numérico válido en el campo de Código.", "Valor Inválido", JOptionPane.ERROR_MESSAGE);
        }
    } // fin bloque crear profesores

    //para mostrar los datos de los profesores ingresados 
    public void mostrarProf() {
        for (int i = 0; i < listaProfesores.size(); i++) {
            Profesores temp = new Profesores();
            temp = listaProfesores.get(i);
            System.out.println(temp.getCodigo() + "," + temp.getNombre() + "," + temp.getApellido() + "," + temp.getCorreo() + "," + temp.getGenero());
        }
    }

    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed
        //Codigo para crear profesores
        //profesoresVen.llenarTablaProf();
        crearProfesores();
        mostrarProf();
        dispose();
        profesoresVen.llenarTablaProf();
        profesoresVen.mostrarGraficaPastel();
    }//GEN-LAST:event_BotonAgregarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
        SerializarObjeto.serializarObjeto("Estado.Dat", listaProfesores); 
    }//GEN-LAST:event_formWindowClosed

    public static void main(String args[]) {
        //cargarProfesores();
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
            java.util.logging.Logger.getLogger(Crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crear().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JTextField TxtApellido;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JTextField TxtContra;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JComboBox<String> jComboBoxGenero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    // End of variables declaration//GEN-END:variables
}
