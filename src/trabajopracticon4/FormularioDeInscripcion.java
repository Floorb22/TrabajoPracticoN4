package trabajopracticon4;

import java.util.Set;
import javax.swing.JOptionPane;
import static trabajopracticon4.Colegio.alumnosSet;
import static trabajopracticon4.Colegio.materiasSet;

public class FormularioDeInscripcion extends javax.swing.JInternalFrame {
    
    String n, ap, mat;
    Materia m;
    public FormularioDeInscripcion(Set<Alumno> alumnosSet, Set<Materia> materiasSet) {
        initComponents();
        cargarComboMateria();
        cargarComboAlumnos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jcb_materias = new javax.swing.JComboBox<>();
        jcb_alumnos = new javax.swing.JComboBox<>();
        b_inscribir = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 204, 102));
        setClosable(true);
        setForeground(java.awt.Color.pink);
        setIconifiable(true);
        setMaximizable(true);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 153, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Formulario de Inscripción");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 255));
        jLabel5.setText("ELIJA UN ALUMNO:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 255));
        jLabel6.setText("ELIJA UNA MATERIA:");

        jcb_materias.setBackground(new java.awt.Color(204, 204, 204));
        jcb_materias.setForeground(new java.awt.Color(0, 0, 0));
        jcb_materias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_materiasActionPerformed(evt);
            }
        });

        jcb_alumnos.setBackground(new java.awt.Color(204, 204, 204));
        jcb_alumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcb_alumnosActionPerformed(evt);
            }
        });

        b_inscribir.setBackground(new java.awt.Color(0, 0, 0));
        b_inscribir.setForeground(new java.awt.Color(51, 153, 255));
        b_inscribir.setText("Inscribir");
        b_inscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_inscribirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcb_materias, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcb_alumnos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(112, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(b_inscribir, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_materias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcb_alumnos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                .addComponent(b_inscribir)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Inscribir
    private void b_inscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_inscribirActionPerformed
        try{
        inscribirAlumno();
        JOptionPane.showMessageDialog(this, "Inscripto");
        } catch (Exception e){
            JOptionPane.showMessageDialog(this, "Error al inscribir el alumno");
        }
    }//GEN-LAST:event_b_inscribirActionPerformed

    //Seleccionar materia
    private void jcb_materiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_materiasActionPerformed
        m = (Materia) jcb_materias.getSelectedItem();
    }//GEN-LAST:event_jcb_materiasActionPerformed

    //Selecionar alumno
    private void jcb_alumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcb_alumnosActionPerformed
        Alumno a = (Alumno) jcb_alumnos.getSelectedItem();
        n = a.getNombre();
        ap = a.getApellido();
    }//GEN-LAST:event_jcb_alumnosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b_inscribir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<Alumno> jcb_alumnos;
    private javax.swing.JComboBox<Materia> jcb_materias;
    // End of variables declaration//GEN-END:variables

    
    
     
    //ComboBox Materias
    private void cargarComboMateria() {
        Materia ingles = new Materia("Ingles 1");
        Materia matematicas = new Materia("Matematicas");
        Materia laboratorio = new Materia("Laboratorio");

        materiasSet.add(ingles);
        materiasSet.add(matematicas);
        materiasSet.add(laboratorio);
        
        
        for (Materia materia : materiasSet) {
            jcb_materias.addItem(materia);
        }
    }

    //ComboBox Alumnos
    private void cargarComboAlumnos() {     
        
        Alumno lopezMartin = new Alumno("Lopez", "Martin");
        Alumno martinezBrenda = new Alumno("Martinez", "Brenda");

        alumnosSet.add(lopezMartin);
        alumnosSet.add(martinezBrenda);

        for (Alumno alumno : alumnosSet) {
            jcb_alumnos.addItem(alumno);
        }
    }
    
    private void inscribirAlumno(){
        Alumno nuevo = new Alumno (ap, n);
        nuevo.agregarMateria(m);
    }
}
