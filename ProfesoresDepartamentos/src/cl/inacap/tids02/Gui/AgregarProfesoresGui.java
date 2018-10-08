
package cl.inacap.tids02.Gui;
import cl.inacap.tids02.dominio.*;
import java.util.List;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;

public class AgregarProfesoresGui extends javax.swing.JDialog {

    private Departamento departamento;
    
    public AgregarProfesoresGui(java.awt.Frame parent, boolean modal, 
            ComboBoxModel<Profesor> profesores,
            Departamento departamento) {
        super(parent, modal);
        initComponents();
        this.departamento = departamento;
        
        DefaultListModel<Profesor> listModel = new DefaultListModel<Profesor>();
        
        for(int i = 0; i < profesores.getSize() ; i++){
            listModel.addElement(profesores.getElementAt(i));
        }
        profesoresList.setModel(listModel);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        agregarButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        profesoresList = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar Profesores"));

        agregarButton.setText("Agregar");
        agregarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarButtonMouseClicked(evt);
            }
        });

        jScrollPane1.setViewportView(profesoresList);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(agregarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(agregarButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
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
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarButtonMouseClicked
       List<Profesor> profesoresSeleccionados = profesoresList.getSelectedValuesList();
        departamento.getProfesores().clear();
        departamento.getProfesores().addAll(profesoresSeleccionados);
        ((PrincipalGui)getParent()).actualizarDepartamento(departamento);
        dispose();
    }//GEN-LAST:event_agregarButtonMouseClicked

  
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<Profesor> profesoresList;
    // End of variables declaration//GEN-END:variables
}
