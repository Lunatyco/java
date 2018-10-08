
package cl.inacap.tids02.evrecuperativa.gui;

import cl.inacap.tids02.evrecuperativa.dominio.Libreria;
import cl.inacap.tids02.evrecuperativa.dominio.Libro;
import cl.inacap.tids02.evrecuperativa.dominio.Sucursal;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultListModel;


public class AgregarLibreriaGui extends javax.swing.JDialog {

    private Libreria libreria;
    
    public AgregarLibreriaGui(java.awt.Frame parent, boolean modal, Libreria libreria) {
        super(parent, modal);
        initComponents();
        this.libreria = libreria;
        agregarButton.setText("Actualizar");
        direccionTextField.setText(libreria.getDireccion());
    }

    AgregarLibreriaGui(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        direccionTextField.setText(libreria.getDireccion());
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agregarLibreriaPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        direccionTextField = new javax.swing.JTextField();
        agregarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        agregarLibreriaPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar Libreria"));

        jLabel1.setText("Dirección: ");

        agregarButton.setText("Agregar");
        agregarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout agregarLibreriaPanelLayout = new javax.swing.GroupLayout(agregarLibreriaPanel);
        agregarLibreriaPanel.setLayout(agregarLibreriaPanelLayout);
        agregarLibreriaPanelLayout.setHorizontalGroup(
            agregarLibreriaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarLibreriaPanelLayout.createSequentialGroup()
                .addGap(21, 21, Short.MAX_VALUE)
                .addGroup(agregarLibreriaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(agregarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(agregarLibreriaPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(direccionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        agregarLibreriaPanelLayout.setVerticalGroup(
            agregarLibreriaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarLibreriaPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(agregarLibreriaPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(direccionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(agregarButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregarLibreriaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregarLibreriaPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarButtonActionPerformed
        if(libreria != null){
            libreria.setDireccion(direccionTextField.getText());
        }else {
            Libreria libreria = new Libreria(direccionTextField.getText());
            ((PrincipalGui)getParent()).agregarLibreria(libreria);
        }
        dispose();
        
    }//GEN-LAST:event_agregarButtonActionPerformed

    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarButton;
    private javax.swing.JPanel agregarLibreriaPanel;
    private javax.swing.JTextField direccionTextField;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
