package Forms;

//graficas
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import Proyecto1.Alumnos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class AlumnosVen extends javax.swing.JPanel {

    private JFrame graficaFrame;
    public static ArrayList<Alumnos> listaAlumnos = new ArrayList<Alumnos>(300);

    public AlumnosVen() {
        initComponents();
        llenarTablaAlumnos();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaAlumnos = new javax.swing.JTable();
        BtnCarga = new javax.swing.JButton();
        BtnRegresar = new javax.swing.JButton();
        BtnExportar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(690, 385));

        jLabel2.setText("Listado Oficial");

        TablaAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane1.setViewportView(TablaAlumnos);

        BtnCarga.setText("Carga Masiva");
        BtnCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCargaActionPerformed(evt);
            }
        });

        BtnRegresar.setText("Cerrar");
        BtnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnRegresarActionPerformed(evt);
            }
        });

        BtnExportar.setText("Exportar Listado en PDF");
        BtnExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnExportarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 53, Short.MAX_VALUE)
                        .addComponent(BtnExportar)
                        .addGap(84, 84, 84))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(BtnCarga)
                        .addGap(18, 18, 18)
                        .addComponent(BtnRegresar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BtnCarga)
                            .addComponent(BtnRegresar))
                        .addGap(27, 27, 27)
                        .addComponent(BtnExportar)))
                .addContainerGap(64, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
public void llenarTablaAlumnos() {
        DefaultTableModel tablaProf = new DefaultTableModel(new String[]{"Carnet", "Nombre", "Apellido", "Correo", "Género"}, listaAlumnos.size());
        TablaAlumnos.setModel(tablaProf);

        TableModel tablaLlenar = TablaAlumnos.getModel();
        for (int i = 0; i < listaAlumnos.size(); i++) {
            Alumnos alumnos = listaAlumnos.get(i);
            tablaLlenar.setValueAt(alumnos.getCarnet(), i, 0);
            tablaLlenar.setValueAt(alumnos.getNombre(), i, 1);
            tablaLlenar.setValueAt(alumnos.getApellido(), i, 2);
            tablaLlenar.setValueAt(alumnos.getCorreo(), i, 3);
            tablaLlenar.setValueAt(alumnos.getGenero(), i, 4);
        }
    }

    //metodo para carga masiva de alumnos
    public void cargarAlumnosDesdeCSV(String rutaArchivo) {
        try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                if (campos.length == 5) { // para 5 campos en la tabla
                    try {
                        int carnet = Integer.parseInt(campos[0]);
                        String nombre = campos[1];
                        String apellido = campos[2];
                        String correo = campos[3];
                        String genero = campos[4];

                        Alumnos alumnos = new Alumnos();
                        alumnos.setCarnet(carnet);
                        alumnos.setNombre(nombre);
                        alumnos.setApellido(apellido);
                        alumnos.setCorreo(correo);
                        alumnos.setContra("1234");
                        alumnos.setGenero(genero.charAt(0));

                        listaAlumnos.add(alumnos);
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

    //Metodo para la exportacion 
    private void exportarListadoAPDF(File file) {
        try (PDDocument documento = new PDDocument()) {
            PDPage pagina = new PDPage(PDRectangle.A4);
            documento.addPage(pagina);

            try (PDPageContentStream contentStream = new PDPageContentStream(documento, pagina)) {
                contentStream.setFont(PDType1Font.HELVETICA_BOLD, 12);
                contentStream.beginText();
                contentStream.newLineAtOffset(50, pagina.getMediaBox().getHeight() - 50);

                TableModel tablaLlenar = TablaAlumnos.getModel();
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

        int totalGeneros = listaAlumnos.size();
        int totalMasculinos = 0;
        int totalFemeninos = 0;

        for (Alumnos alumnos : listaAlumnos) {
            if (alumnos.getGenero() == 'M') {
                totalMasculinos++;
            } else if (alumnos.getGenero() == 'F') {
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

    private void BtnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnRegresarActionPerformed
        InicioSesion ventanaInicio = new InicioSesion();

        ventanaInicio.setVisible(true);
        ventanaInicio.setLocationRelativeTo(null);
        ventanaInicio.setTitle("Inicio");
        // Cierra la ventana actual
        JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        currentFrame.dispose();
    }//GEN-LAST:event_BtnRegresarActionPerformed

    private void BtnCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCargaActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        int seleccion = fileChooser.showOpenDialog(this);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            String rutaArchivo = fileChooser.getSelectedFile().getAbsolutePath();
            cargarAlumnosDesdeCSV(rutaArchivo);
            llenarTablaAlumnos();
            mostrarGraficaPastel();
            actualizarGraficaPastel();

        }
    }//GEN-LAST:event_BtnCargaActionPerformed

    private void BtnExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnExportarActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Guardar PDF");
        int seleccion = fileChooser.showSaveDialog(this);

        if (seleccion == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            exportarListadoAPDF(fileToSave);
        }
    }//GEN-LAST:event_BtnExportarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnCarga;
    private javax.swing.JButton BtnExportar;
    private javax.swing.JButton BtnRegresar;
    private javax.swing.JTable TablaAlumnos;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
