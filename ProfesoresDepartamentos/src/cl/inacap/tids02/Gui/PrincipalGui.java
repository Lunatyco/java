package cl.inacap.tids02.Gui;
import cl.inacap.tids02.dominio.Departamento;
import cl.inacap.tids02.dominio.Profesor;
import java.awt.event.ItemEvent;
import javax.swing.UIManager;

public class PrincipalGui extends javax.swing.JFrame {

    public PrincipalGui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        agregarProfesorButton = new javax.swing.JButton();
        eliminarProfesorButton = new javax.swing.JButton();
        modificarProfesorButton = new javax.swing.JButton();
        profesoresComboBox = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        departamentosComboBox = new javax.swing.JComboBox<>();
        agregarDepartamentoButton = new javax.swing.JButton();
        eliminarDepartamentoButton = new javax.swing.JButton();
        modificarDepartamentoButton = new javax.swing.JButton();
        agregarProfDeptoButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Profesor"));

        agregarProfesorButton.setText("Agregar");
        agregarProfesorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarProfesorButtonMouseClicked(evt);
            }
        });

        eliminarProfesorButton.setText("Eliminar");
        eliminarProfesorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarProfesorButtonMouseClicked(evt);
            }
        });

        modificarProfesorButton.setText("Modificar");
        modificarProfesorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarProfesorButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(profesoresComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(agregarProfesorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminarProfesorButton))
                    .addComponent(modificarProfesorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(agregarProfesorButton))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(profesoresComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(eliminarProfesorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificarProfesorButton)
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Departamento"));

        departamentosComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                departamentosComboBoxItemStateChanged(evt);
            }
        });

        agregarDepartamentoButton.setText("Agregar");
        agregarDepartamentoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarDepartamentoButtonMouseClicked(evt);
            }
        });

        eliminarDepartamentoButton.setText("Eliminar");
        eliminarDepartamentoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarDepartamentoButtonMouseClicked(evt);
            }
        });

        modificarDepartamentoButton.setText("Modificar");
        modificarDepartamentoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarDepartamentoButtonMouseClicked(evt);
            }
        });

        agregarProfDeptoButton.setText("Agregar Profesores");
        agregarProfDeptoButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarProfDeptoButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(departamentosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(modificarDepartamentoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(agregarDepartamentoButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(eliminarDepartamentoButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(agregarProfDeptoButton, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agregarDepartamentoButton)
                            .addComponent(eliminarDepartamentoButton)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(departamentosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificarDepartamentoButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(agregarProfDeptoButton)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarProfesorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarProfesorButtonMouseClicked
       ProfesorGui profesorDialog = new ProfesorGui(this, true);
       profesorDialog.setVisible(true);
    }//GEN-LAST:event_agregarProfesorButtonMouseClicked

    private void eliminarProfesorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarProfesorButtonMouseClicked
        if(profesoresComboBox.getSelectedItem() != null){
            profesoresComboBox.removeItem(profesoresComboBox.getSelectedItem());
        }
    }//GEN-LAST:event_eliminarProfesorButtonMouseClicked

    private void modificarProfesorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarProfesorButtonMouseClicked
        if(profesoresComboBox.getSelectedItem() != null){
            ProfesorGui profesorDialog = new ProfesorGui(this, true, (Profesor) profesoresComboBox.getSelectedItem());
            profesorDialog.setVisible(true);
        }
    }//GEN-LAST:event_modificarProfesorButtonMouseClicked

    private void agregarDepartamentoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarDepartamentoButtonMouseClicked
        DepartamentoGui departamentoDialog = new DepartamentoGui(this, true);
        departamentoDialog.setVisible(true);
    }//GEN-LAST:event_agregarDepartamentoButtonMouseClicked

    private void eliminarDepartamentoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarDepartamentoButtonMouseClicked
        if(departamentosComboBox.getSelectedItem() != null){
            departamentosComboBox.removeItem(departamentosComboBox.getSelectedItem());
        }
    }//GEN-LAST:event_eliminarDepartamentoButtonMouseClicked

    private void modificarDepartamentoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarDepartamentoButtonMouseClicked
        if(departamentosComboBox.getSelectedItem() != null){
        DepartamentoGui departamentoDialog = new DepartamentoGui(this, true,
                (Departamento)departamentosComboBox.getSelectedItem());
        departamentoDialog.setVisible(true);
        }
    }//GEN-LAST:event_modificarDepartamentoButtonMouseClicked

    private void agregarProfDeptoButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarProfDeptoButtonMouseClicked
        if(departamentosComboBox.getSelectedItem() != null){
            AgregarProfesoresGui agregarDialog = new AgregarProfesoresGui(this, true,
                    profesoresComboBox.getModel(), (Departamento) departamentosComboBox.getSelectedItem());
            agregarDialog.setVisible(true);
        }
    }//GEN-LAST:event_agregarProfDeptoButtonMouseClicked

    private void departamentosComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_departamentosComboBoxItemStateChanged
        if(evt.getStateChange() == ItemEvent.SELECTED){
            Departamento departamento = (Departamento) departamentosComboBox.getSelectedItem();
            System.out.println("Departamento: ");
            System.out.println("Nombre: " + departamento.getNombre());
            for(Profesor profesor: departamento.getProfesores()){
                System.out.println("Profesor: " + profesor); 
            }
        }
    }//GEN-LAST:event_departamentosComboBoxItemStateChanged

    
    public static void main(String args[]) {
       
            try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception ex) {
            //
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarDepartamentoButton;
    private javax.swing.JButton agregarProfDeptoButton;
    private javax.swing.JButton agregarProfesorButton;
    private javax.swing.JComboBox<Departamento> departamentosComboBox;
    private javax.swing.JButton eliminarDepartamentoButton;
    private javax.swing.JButton eliminarProfesorButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton modificarDepartamentoButton;
    private javax.swing.JButton modificarProfesorButton;
    private javax.swing.JComboBox<Profesor> profesoresComboBox;
    // End of variables declaration//GEN-END:variables

    void actualizarProfesor(Profesor profesor) {
        profesoresComboBox.removeItem(profesor);
        profesoresComboBox.addItem(profesor);
    }

    void agregarProfesor(Profesor profesor) {
        profesoresComboBox.addItem(profesor);
    }

    void actualizarDepartamento(Departamento departamento) {
        departamentosComboBox.removeItem(departamento);
        departamentosComboBox.addItem(departamento);
    }

    void agregarDepartamento(Departamento departamento) {
        departamentosComboBox.addItem(departamento);
    }

}
