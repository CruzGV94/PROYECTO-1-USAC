package Forms;

import java.io.Serializable;
//graficas
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

//imports para pdf
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import static Forms.Crear.listaProfesores;
import Proyecto1.Profesores;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
//para cargar csv
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFileChooser;

public class ProfesoresVen extends javax.swing.JPanel implements Serializable {
    private JFrame graficaFrame;
    private ChartPanel chartPanel;
    //public DefaultTableModel tablaProf = new DefaultTableModel();

    public ProfesoresVen() {
        initComponents();
        llenarTablaProf();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaProfesores = new javax.swing.JTable();
        BotonCrearProf = new javax.swing.JButton();
        BotonCargaMaiva = new javax.swing.JButton();
        BotonActualizar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        BotonExportar = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();

        jLabel2.setText("Liastado Oficial");

        TablaProfesores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "title 1", "Nombre", "Apellido", "Correo", "Genero"
            }
        ));
        jScrollPane1.setViewportView(TablaProfesores);

        BotonCrearProf.setText("Crear");
        BotonCrearProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCrearProfActionPerformed(evt);
            }
        });

        BotonCargaMaiva.setText("Carga Masiva");
        BotonCargaMaiva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCargaMaivaActionPerformed(evt);
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

        BotonExportar.setText("Exportar Listado a PDF");
        BotonExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonExportarActionPerformed(evt);
            }
        });

        BtnRegresar.setText("Regresar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonExportar)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(BotonCrearProf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BotonActualizar, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonCargaMaiva)
                            .addComponent(BtnRegresar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel2)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonCrearProf)
                            .addComponent(BotonCargaMaiva))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonActualizar)
                            .addComponent(BotonEliminar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BotonExportar)
                            .addComponent(BtnRegresar))))
                .addContainerGap(112, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Método para guardar la instancia en un archivo
    public void guardarProfesoresVen() {
        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("profesores.txt"))) {
            outputStream.writeObject(this); // Guarda la instancia actual
            System.out.println("ProfesoresVen guardado correctamente.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    // Método para cargar la instancia desde un archivo
    public static ProfesoresVen cargarProfesoresVen() {
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream("profesores.txt"))) {
            ProfesoresVen loadedProfesoresVen = (ProfesoresVen) inputStream.readObject();
            System.out.println("ProfesoresVen cargado correctamente.");
            return loadedProfesoresVen;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public void llenarTablaProf() {
        DefaultTableModel tablaProf = new DefaultTableModel(new String[]{"Código", "Nombre", "Apellido", "Correo", "Género"}, Crear.listaProfesores.size());
        TablaProfesores.setModel(tablaProf);

        TableModel tablaLlenar = TablaProfesores.getModel();
        for (int i = 0; i < Crear.listaProfesores.size(); i++) {
            Profesores profesores = Crear.listaProfesores.get(i);
            tablaLlenar.setValueAt(profesores.getCodigo(), i, 0);
            tablaLlenar.setValueAt(profesores.getNombre(), i, 1);
            tablaLlenar.setValueAt(profesores.getApellido(), i, 2);
            tablaLlenar.setValueAt(profesores.getCorreo(), i, 3);
            tablaLlenar.setValueAt(profesores.getGenero(), i, 4);
        }
    }

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        InicioSesion ventanaInicio = new InicioSesion();

        ventanaInicio.setVisible(true);
        ventanaInicio.setLocationRelativeTo(null);
        ventanaInicio.setTitle("Inicio");
        // Cierra la ventana actual
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BotonCrearProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCrearProfActionPerformed
        Crear ventanaCrear = new Crear();

        ventanaCrear.setVisible(true);
        ventanaCrear.setLocationRelativeTo(null);
        //llenarTablaProf();

    }//GEN-LAST:event_BotonCrearProfActionPerformed

    //Codigo para eliminar fila seleccionada 
    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed

        int filaSeleccionada = TablaProfesores.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un profesor de la tabla para eliminar.", "Selección Requerida", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        Crear.listaProfesores.remove(filaSeleccionada);
        llenarTablaProf(); // Actualiza la tabla después de eliminar el profesor
    }//GEN-LAST:event_BotonEliminarActionPerformed

    //Codigo para actualizar datos
    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarActionPerformed

        actualizarProfesor();
    
    }//GEN-LAST:event_BotonActualizarActionPerformed

    private void BotonExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonExportarActionPerformed

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar PDF");
        int seleccion = fileChooser.showSaveDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            exportarListadoAPDF(fileToSave);
        }
    }//GEN-LAST:event_BotonExportarActionPerformed

    //Metodo para la exportacion 
    private void exportarListadoAPDF(File file) {
        try (PDDocument documento = new PDDocument()) {
            PDPage pagina = new PDPage(PDRectangle.A4);
            documento.addPage(pagina);

            try (PDPageContentStream contentStream = new PDPageContentStream(documento, pagina)) {
                contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
                contentStream.beginText();
                contentStream.newLineAtOffset(50, pagina.getMediaBox().getHeight() - 50);

                TableModel tablaLlenar = TablaProfesores.getModel();
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

    //boton carga masiva
    private void BotonCargaMaivaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCargaMaivaActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            String rutaArchivo = fileChooser.getSelectedFile().getAbsolutePath();
            cargarProfesoresDesdeCSV(rutaArchivo);
            llenarTablaProf(); // Actualiza la tabla con los nuevos datos cargados
            mostrarGraficaPastel();
            actualizarGraficaPastel();
        }
    }//GEN-LAST:event_BotonCargaMaivaActionPerformed

    //metodo para carga masiva 
    public void cargarProfesoresDesdeCSV(String rutaArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                if (campos.length == 5) { // para 5 campos en la tabla
                    try {
                        int codigo = Integer.parseInt(campos[0]);
                        String nombre = campos[1];
                        String apellido = campos[2];
                        String correo = campos[3];
                        String genero = campos[4];

                        Profesores profesor = new Profesores();
                        profesor.setCodigo(codigo);
                        profesor.setNombre(nombre);
                        profesor.setApellido(apellido);
                        profesor.setCorreo(correo);
                        profesor.setContraseña("1234");
                        profesor.setGenero(genero.charAt(0));

                        listaProfesores.add(profesor);
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

    public void actualizarProfesor() {
        // Obtiene el índice de la fila seleccionada
        int filaSeleccionada = TablaProfesores.getSelectedRow();
        if (filaSeleccionada == -1) {
            JOptionPane.showMessageDialog(this, "Seleccione un profesor de la tabla para actualizar sus datos.", "Selección Requerida", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Crea un nuevo profesor con los datos de la fila seleccionada
        Profesores profesor = Crear.listaProfesores.get(filaSeleccionada);

        // Pide al usuario que ingrese los nuevos datos del profesor
        String nuevoNombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del profesor:");
        String nuevoApellido = JOptionPane.showInputDialog("Ingrese el nuevo apellido del profesor:");
        String nuevoCorreo = JOptionPane.showInputDialog("Ingrese el nuevo correo del profesor:");
        String nuevoGenero = JOptionPane.showInputDialog("Ingrese el nuevo género del profesor:");

        // Actualiza los datos del profesor
        profesor.setNombre(nuevoNombre);
        profesor.setApellido(nuevoApellido);
        profesor.setCorreo(nuevoCorreo);
        profesor.setGenero(nuevoGenero.charAt(0));

        // Actualiza la lista de profesores
        Crear.listaProfesores.set(filaSeleccionada, profesor);

        // Llena la tabla con los nuevos datos
        llenarTablaProf();
    }

    //Metodo para mostrar grafica
    public void mostrarGraficaPastel() {
        if (graficaFrame != null) {
            graficaFrame.dispose(); // Cierra la ventana anterior
        }

        PieDataset dataset = crearDataset();
        JFreeChart chart = crearGrafica(dataset);

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setSectionOutlinesVisible(false);
        //plot.setLabelVisible(false);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(300, 200));
        graficaFrame = new JFrame("Gráfica de Pastel");
        graficaFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        graficaFrame.getContentPane().add(chartPanel);
        graficaFrame.pack();
        graficaFrame.setVisible(true);

    }

    public void actualizarGraficaPastel() {
        // Cierra la ventana anterior
        graficaFrame.dispose();

        // Crea una nueva ventana
        PieDataset dataset = crearDataset();
        JFreeChart chart = crearGrafica(dataset);

        PiePlot plot = (PiePlot) chart.getPlot();
        plot.setSectionOutlinesVisible(false);
        //plot.setLabelVisible(false);

        ChartPanel chartPanel = new ChartPanel(chart);
        chartPanel.setPreferredSize(new java.awt.Dimension(300, 200));
        graficaFrame = new JFrame("Gráfica de Pastel");
        graficaFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        graficaFrame.getContentPane().add(chartPanel);
        graficaFrame.pack();
        graficaFrame.setVisible(true);
    }

    private PieDataset crearDataset() {
        DefaultPieDataset dataset = new DefaultPieDataset();

        int totalGeneros = listaProfesores.size();
        int totalMasculinos = 0;
        int totalFemeninos = 0;

        for (Profesores profesor : listaProfesores) {
            if (profesor.getGenero() == 'M') {
                totalMasculinos++;
            } else if (profesor.getGenero() == 'F') {
                totalFemeninos++;
            }
        }

        dataset.setValue("Masculino", totalMasculinos);
        dataset.setValue("Femenino", totalFemeninos);

        return dataset;
    }

    private JFreeChart crearGrafica(PieDataset dataset) {
        return ChartFactory.createPieChart(
                "Porcentaje de Género",
                dataset,
                true,
                true,
                false
        );
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JButton BotonCargaMaiva;
    private javax.swing.JButton BotonCrearProf;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JButton BotonExportar;
    private javax.swing.JButton BtnRegresar;
    public static javax.swing.JTable TablaProfesores;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
