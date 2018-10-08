
package cl.inacap.tids02.evrecuperativa.gui;

import cl.inacap.tids02.evrecuperativa.dominio.Libreria;
import cl.inacap.tids02.evrecuperativa.dominio.Libro;
import cl.inacap.tids02.evrecuperativa.gui.*;

public class AgregarLibroGui extends javax.swing.JDialog {
    private Libro libro;
    
    public AgregarLibroGui(java.awt.Frame parent, boolean modal, Libro libro) {
        super(parent, modal);
        initComponents();
        this.libro = libro;
        agregarButton.setText("Actualizar");
        isbnTextField.setText(libro.getIsbn());
        tituloTextField.setText(libro.getTitulo());
        autorTextField.setText(libro.getAutor());
    }  


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        agregarLibroPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        isbnTextField = new javax.swing.JTextField();
        tituloTextField = new javax.swing.JTextField();
        autorTextField = new javax.swing.JTextField();
        stockTextField = new javax.swing.JTextField();
        agregarButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        agregarLibroPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Agregar Libro"));

        jLabel1.setText("ISBN:");

        jLabel2.setText("Título:");

        jLabel3.setText("Autor:");

        jLabel4.setText("Stock:");

        agregarButton.setText("Agregar");
        agregarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout agregarLibroPanelLayout = new javax.swing.GroupLayout(agregarLibroPanel);
        agregarLibroPanel.setLayout(agregarLibroPanelLayout);
        agregarLibroPanelLayout.setHorizontalGroup(
            agregarLibroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarLibroPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(agregarLibroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(agregarLibroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(stockTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(autorTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                    .addComponent(tituloTextField)
                    .addComponent(isbnTextField))
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, agregarLibroPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(agregarButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        agregarLibroPanelLayout.setVerticalGroup(
            agregarLibroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(agregarLibroPanelLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(agregarLibroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(isbnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agregarLibroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tituloTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agregarLibroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(autorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(agregarLibroPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(stockTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(agregarButton))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregarLibroPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(agregarLibroPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarButtonMouseClicked
        if(libro != null){
            libro.setIsbn(isbnTextField.getText());
            libro.setTitulo(tituloTextField.getText());
            libro.setAutor(autorTextField.getText());
            libro.setCantidadDisponible(Integer.parseInt(stockTextField.getText()));
        }else {
            Libro libro = new Libro(isbnTextField.getText(), tituloTextField.getText(), autorTextField.getText());
            ((PrincipalGui)getParent()).agregarLibro(libro);
        }
        dispose();
    }//GEN-LAST:event_agregarButtonMouseClicked

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregarButton;
    private javax.swing.JPanel agregarLibroPanel;
    private javax.swing.JTextField autorTextField;
    private javax.swing.JTextField isbnTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField stockTextField;
    private javax.swing.JTextField tituloTextField;
    // End of variables declaration//GEN-END:variables
}
