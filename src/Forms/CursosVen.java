package Forms;
//imports para pdf
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import static Forms.CrearCurso.listaCursos;
import Proyecto1.Cursos;
import Proyecto1.Profesores;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JComboBox;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class CursosVen extends javax.swing.JPanel {

    public CursosVen() {
        initComponents();
        CrearCurso.ComboBoxProfesores = new JComboBox();
        llenarTablaCursos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaCursos = new javax.swing.JTable();
        BotonCrear = new javax.swing.JButton();
        BotonCargaMasiva = new javax.swing.JButton();
        BotonActualizar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BotonExportar = new javax.swing.JButton();
        BotonRegresar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(690, 385));

        jLabel2.setText("Listado Oficial");

        TablaCursos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaCursos);

        BotonCrear.setText("Crear");
        BotonCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearActionPerformed(evt);
            }
        });

        BotonCargaMasiva.setText("Carga Masiva");
        BotonCargaMasiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCargaMasivaActionPerformed(evt);
            }
        });

        BotonActualizar.setText("Actualizar");
        BotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarActionPerformed(evt);
            }
        });

        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        BotonExportar.setText("Exportar Listado en PDF");
        BotonExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonExportarActionPerformed(evt);
            }
        });

        BotonRegresar.setText("Cerrar");
        BotonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonCrear)
                            .addComponent(BotonActualizar)
                            .addComponent(BotonExportar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonCargaMasiva)
                            .addComponent(BotonEliminar)
                            .addComponent(BotonRegresar))
                        .addGap(85, 85, 85))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonCrear)
                            .addComponent(BotonCargaMasiva))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonActualizar)
                            .addComponent(BotonEliminar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonExportar)
                            .addComponent(BotonRegresar))))
                .addContainerGap(63, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BotonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegresarActionPerformed
        InicioSesion ventanaInicio = new InicioSesion();

        ventanaInicio.setVisible(true);
        ventanaInicio.setLocationRelativeTo(null);
        ventanaInicio.setTitle("Incio");
        // Cierra la ventana actual
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_BotonRegresarActionPerformed

    private void BotonCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearActionPerformed
        // TODO add your handling code here:
        CrearCurso crear = new CrearCurso();
        crear.setVisible(true);
        crear.setLocationRelativeTo(null);
    }//GEN-LAST:event_BotonCrearActionPerformed

    //metodo para eliminar cursos
    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        int filaSeleccionada = TablaCursos.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un curso de la tabla para eliminar.", "Selección Requerida", JOptionPane.WARNING_MESSAGE);
            return;
        }

        CrearCurso.listaCursos.remove(filaSeleccionada);
        llenarTablaCursos(); // Actualiza la tabla después de eliminar el profesor
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarActionPerformed
        // TODO add your handling code here:
        actualizarCursos();
    }//GEN-LAST:event_BotonActualizarActionPerformed

    private void BotonCargaMasivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCargaMasivaActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            String rutaArchivo = fileChooser.getSelectedFile().getAbsolutePath();
            cargarProfesoresDesdeCSV(rutaArchivo);
            llenarTablaCursos(); // Actualiza la tabla con los nuevos datos cargados
            //mostrarGraficaPastel();
            //actualizarGraficaPastel();
        }
    }//GEN-LAST:event_BotonCargaMasivaActionPerformed

    private void BotonExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonExportarActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar PDF");
        int seleccion = fileChooser.showSaveDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            exportarListadoCursosAPDF(fileToSave);
        }
    }//GEN-LAST:event_BotonExportarActionPerformed

    
    //Metodo para la exportacion 
    private void exportarListadoCursosAPDF(File file) {
        try (PDDocument documento = new PDDocument()) {
            PDPage pagina = new PDPage(PDRectangle.A4);
            documento.addPage(pagina);

            try (PDPageContentStream contentStream = new PDPageContentStream(documento, pagina)) {
                contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
                contentStream.beginText();
                contentStream.newLineAtOffset(50, pagina.getMediaBox().getHeight() - 50);

                TableModel tablaLlenar = TablaCursos.getModel();
                for (int fila = 0; fila < tablaLlenar.getRowCount(); fila++) {
                    StringBuilder rowText = new StringBuilder();
                    for (int col = 0; col < tablaLlenar.getColumnCount(); col++) {
                        Object cellValue = tablaLlenar.getValueAt(fila, col);
                        rowText.append(cellValue).append(" | ");
                    }
                    contentStream.showText(rowText.toString());
                    contentStream.newLineAtOffset(0, -20); // Ajusta el espaciado entre líneas
                }

                contentStream.endText();
            }

            documento.save(file);
            JOptionPane.showMessageDialog(this, "Listado exportado a PDF exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al exportar el listado a PDF.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    
    
    //metodo para actualizar cursos 
    public void actualizarCursos() {
        // Obtiene el índice de la fila seleccionada
        int filaSeleccionada = TablaCursos.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un curso de la tabla para actualizar sus datos.", "Selección Requerida", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Crea un nuevo profesor con los datos de la fila seleccionada
        Cursos cursos = CrearCurso.listaCursos.get(filaSeleccionada);

        // Pide al usuario que ingrese los nuevos datos del profesor
        String nuevoCodigo = JOptionPane.showInputDialog("Ingrese el nuevo código del curso:");
        String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del curso:");
        String nuevoCredito = JOptionPane.showInputDialog("Ingrese el nuevo credito del curso:");
        //String nuevoProfesor = JOptionPane.showInputDialog("Seleccione el nuevo profesor del curso:");
        // Mostrar el JComboBox en un JOptionPane
        int result = JOptionPane.showConfirmDialog(
                null, // Componente padre (se puede ajustar a la ventana principal)
                CrearCurso.ComboBoxProfesores, // Componente que se quiere mostrar (en el JComboBox)
                "Selecciona un profesor", // Título del JOptionPane
                JOptionPane.OK_CANCEL_OPTION // Opciones de botones
        );

        // Verificar la respuesta del usuario (presionó OK o Cancel)
        if (result == JOptionPane.OK_OPTION) {
            // Obtener el profesor seleccionado del JComboBox
            Profesores profesorSeleccionado = (Profesores) CrearCurso.ComboBoxProfesores.getSelectedItem();

            // Ahora se puede trabajar con el profesor seleccionado
            if (profesorSeleccionado != null) {
                // Realiza las acciones necesarias con el profesor seleccionado
                System.out.println("Profesor seleccionado: " + profesorSeleccionado.getNombre());
            } else {
                System.out.println("Ningún profesor seleccionado.");
            }
            cursos.setProfe(String.valueOf(profesorSeleccionado));
        }

        // Actualiza los datos del profesor
        cursos.setCodigo(Integer.parseInt(nuevoCodigo));
        cursos.setNombre(nuevoNombre);
        cursos.setCredito(Integer.parseInt(nuevoCredito));
        //cursos.setProfe();

        // Actualiza la lista de profesores
        CrearCurso.listaCursos.set(filaSeleccionada, cursos);

        // Llena la tabla con los nuevos datos
        llenarTablaCursos();
    }

    public void llenarTablaCursos() {
        DefaultTableModel tablaProf = new DefaultTableModel(new String[]{"Código", "Nombre", "Crédito", "Alumnos", "Profesor"}, CrearCurso.listaCursos.size());
        TablaCursos.setModel(tablaProf);

        TableModel tablaLlenar = TablaCursos.getModel();
        for (int i = 0; i < CrearCurso.listaCursos.size(); i++) {
            Cursos cS = CrearCurso.listaCursos.get(i);
            tablaLlenar.setValueAt(cS.getCodigo(), i, 0);
            tablaLlenar.setValueAt(cS.getNombre(), i, 1);
            tablaLlenar.setValueAt(cS.getCredito(), i, 2);
            //tablaLlenar.setValueAt(CrearCurso.ComboBoxProfesores.getSelectedIndex(), i, 4);
            //tablaLlenar.setValueAt(profesores.getGenero(), i, 4);
            if (i == 0) {
                tablaLlenar.setValueAt(cS.getProfe(), i, 4);
            } else {
                int index = CrearCurso.ComboBoxProfesores.getSelectedIndex();
                if (tablaLlenar.getValueAt(i - 1, 4).equals(index)) {
                    return;
                } else {
                    tablaLlenar.setValueAt(Crear.listaProfesores.get(i).getNombre(), i, 4);
                }
            }
        }
    }

    //metodo para carga masiva 
    public void cargarProfesoresDesdeCSV(String rutaArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                if (campos.length == 4) { // para 4 campos en la tabla
                    try {
                        int codigo = Integer.parseInt(campos[0]);
                        String nombre = campos[1];
                        String credito = campos[2];
                        //String cantidad = campos[3];
                        //Profesores prof : Crear.listaProfesores
                        String profe = campos[3];
                            
                        Cursos cs = new Cursos();
                        cs.setCodigo(codigo);
                        cs.setNombre(nombre);
                        cs.setCredito(Integer.parseInt(credito));
                        cs.setProfe(profe);
                        
                        listaCursos.add(cs);
                    } catch (NumberFormatException e) {
                        System.err.println("Error al parsear el código: " + campos[0]);
                    }
                } else {
                    System.err.println("Línea con formato incorrecto: " + linea);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JButton BotonCargaMasiva;
    private javax.swing.JButton BotonCrear;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonExportar;
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JTable TablaCursos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
