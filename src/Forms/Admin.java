package Forms;
import java.awt.BorderLayout;


public class Admin extends javax.swing.JFrame {
    private ProfesoresVen profesoresVen;
    
    
    public Admin() {
        super("Administrador");
        initComponents();
        profesoresVen = new ProfesoresVen();
        ProfesoresVen prof = new ProfesoresVen();
        
        prof.setSize(690, 385);
        prof.setLocation(0, 0);
        
        
        
        content.removeAll();
        content.add(prof, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        dispose();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonProf = new javax.swing.JButton();
        BotonCursos = new javax.swing.JButton();
        BotonAlum = new javax.swing.JButton();
        content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(690, 420));

        BotonProf.setText("Profesores");
        BotonProf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonProfActionPerformed(evt);
            }
        });

        BotonCursos.setText("Cursos");
        BotonCursos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCursosActionPerformed(evt);
            }
        });

        BotonAlum.setText("Alumnos");
        BotonAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAlumActionPerformed(evt);
            }
        });

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 385, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BotonProf)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonCursos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonAlum)
                .addContainerGap(377, Short.MAX_VALUE))
            .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonProf)
                    .addComponent(BotonCursos)
                    .addComponent(BotonAlum))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonCursosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCursosActionPerformed
        CursosVen cursos = new CursosVen();
        cursos.setSize(690, 385);
        cursos.setLocation(0, 0);
        
        
        content.removeAll();
        content.add(cursos, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        //dispose();
    }//GEN-LAST:event_BotonCursosActionPerformed

    private void BotonAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAlumActionPerformed
        AlumnosVen alum = new AlumnosVen();
        alum.setSize(690, 385);
        alum.setLocation(0, 0);
        
        content.removeAll();
        content.add(alum, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        //dispose();
    }//GEN-LAST:event_BotonAlumActionPerformed

    private void BotonProfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonProfActionPerformed
        ProfesoresVen prof = new ProfesoresVen();
        prof.setSize(690, 385);
        prof.setLocation(0, 0);
        
        content.removeAll();
        content.add(prof, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        //dispose();
    }//GEN-LAST:event_BotonProfActionPerformed

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
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Admin ad = new Admin();
                new Admin().setVisible(true);
                ad.setTitle("Administrador");
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAlum;
    private javax.swing.JButton BotonCursos;
    private javax.swing.JButton BotonProf;
    private javax.swing.JPanel content;
    // End of variables declaration//GEN-END:variables
}


