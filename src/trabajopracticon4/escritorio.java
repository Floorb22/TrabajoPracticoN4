package trabajopracticon4;

public class escritorio extends javax.swing.JFrame {
    
    public escritorio() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        alumno = new javax.swing.JMenu();
        mi_agregaralumno = new javax.swing.JMenuItem();
        materia = new javax.swing.JMenu();
        mi_agregarmateria = new javax.swing.JMenuItem();
        registro = new javax.swing.JMenu();
        mi_inscribirse = new javax.swing.JMenuItem();
        salir = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        jMenu3.setText("jMenu3");

        jMenu4.setText("jMenu4");

        jMenu5.setText("jMenu5");

        jMenu6.setText("jMenu6");

        jMenu7.setText("jMenu7");

        jMenuItem4.setText("jMenuItem4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        escritorio.setBackground(new java.awt.Color(0, 0, 153));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 568, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 392, Short.MAX_VALUE)
        );

        jMenuBar2.setBackground(new java.awt.Color(204, 204, 204));

        alumno.setBackground(new java.awt.Color(204, 204, 204));
        alumno.setForeground(new java.awt.Color(0, 0, 0));
        alumno.setText("Alumno");
        alumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alumnoActionPerformed(evt);
            }
        });

        mi_agregaralumno.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mi_agregaralumno.setBackground(new java.awt.Color(204, 204, 204));
        mi_agregaralumno.setForeground(new java.awt.Color(0, 0, 0));
        mi_agregaralumno.setText("Agregar Alumno");
        mi_agregaralumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_agregaralumnoActionPerformed(evt);
            }
        });
        alumno.add(mi_agregaralumno);
        mi_agregaralumno.getAccessibleContext().setAccessibleParent(null);

        jMenuBar2.add(alumno);

        materia.setBackground(new java.awt.Color(204, 204, 204));
        materia.setForeground(new java.awt.Color(0, 0, 0));
        materia.setText("Materia");

        mi_agregarmateria.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.SHIFT_DOWN_MASK | java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mi_agregarmateria.setBackground(new java.awt.Color(204, 204, 204));
        mi_agregarmateria.setForeground(new java.awt.Color(0, 0, 0));
        mi_agregarmateria.setText("Agregar Materia");
        mi_agregarmateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_agregarmateriaActionPerformed(evt);
            }
        });
        materia.add(mi_agregarmateria);

        jMenuBar2.add(materia);

        registro.setBackground(new java.awt.Color(204, 204, 204));
        registro.setForeground(new java.awt.Color(0, 0, 0));
        registro.setText("Registro");

        mi_inscribirse.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        mi_inscribirse.setBackground(new java.awt.Color(204, 204, 204));
        mi_inscribirse.setForeground(new java.awt.Color(0, 0, 0));
        mi_inscribirse.setText("Inscribirse");
        mi_inscribirse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mi_inscribirseActionPerformed(evt);
            }
        });
        registro.add(mi_inscribirse);

        jMenuBar2.add(registro);

        salir.setBackground(new java.awt.Color(204, 204, 204));
        salir.setForeground(new java.awt.Color(0, 0, 0));
        salir.setText("Salir");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });
        jMenuBar2.add(salir);

        setJMenuBar(jMenuBar2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Ir a vista Alta de alumnos
    private void mi_agregaralumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_agregaralumnoActionPerformed
        AltaDeAlumnos altadealumnos = new AltaDeAlumnos(Colegio.alumnosSet);
        altadealumnos.setVisible(true);
        escritorio.add(altadealumnos);
        escritorio.moveToFront(altadealumnos);
    }//GEN-LAST:event_mi_agregaralumnoActionPerformed

    private void alumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_alumnoActionPerformed

    // Ir a vista Alta de materias
    private void mi_agregarmateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_agregarmateriaActionPerformed
        AltaDeMaterias altadematerias = new AltaDeMaterias(Colegio.materiasSet);
        altadematerias.setVisible(true);
        escritorio.add(altadematerias);
        escritorio.moveToFront(altadematerias);
    }//GEN-LAST:event_mi_agregarmateriaActionPerformed

    //Ir a vista Formulario de Inscripción
    private void mi_inscribirseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mi_inscribirseActionPerformed
        FormularioDeInscripcion forminscrip = new FormularioDeInscripcion(Colegio.alumnosSet, Colegio.materiasSet);
        forminscrip.setVisible(true);
        escritorio.add(forminscrip);
        escritorio.moveToFront(forminscrip);
        
    }//GEN-LAST:event_mi_inscribirseActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        escritorio.removeAll();
    }//GEN-LAST:event_salirActionPerformed

    
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
            java.util.logging.Logger.getLogger(escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(escritorio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new escritorio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu alumno;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenu materia;
    private javax.swing.JMenuItem mi_agregaralumno;
    private javax.swing.JMenuItem mi_agregarmateria;
    private javax.swing.JMenuItem mi_inscribirse;
    private javax.swing.JMenu registro;
    private javax.swing.JMenu salir;
    // End of variables declaration//GEN-END:variables
}
