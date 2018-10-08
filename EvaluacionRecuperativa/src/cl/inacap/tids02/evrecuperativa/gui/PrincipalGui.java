
package cl.inacap.tids02.evrecuperativa.gui;
import cl.inacap.tids02.evrecuperativa.dominio.*;
import java.awt.event.ItemEvent;
import javax.swing.UIManager;

public class PrincipalGui extends javax.swing.JFrame {

    
    public PrincipalGui() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        libreriasPanel = new javax.swing.JPanel();
        libreriasComboBox = new javax.swing.JComboBox<>();
        agregarLibreriaButton = new javax.swing.JButton();
        modificarLibreriaButton = new javax.swing.JButton();
        eliminarLibreriaButton = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        librosPanel = new javax.swing.JPanel();
        librosComboBox = new javax.swing.JComboBox<>();
        modificarLibroButton = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        eliminarLibroButton = new javax.swing.JButton();
        agregarLibroButton = new javax.swing.JButton();
        blibrosPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        isbnRadioButton = new javax.swing.JRadioButton();
        tituloRadioButton = new javax.swing.JRadioButton();
        autorRadioButton = new javax.swing.JRadioButton();
        parametroTextField = new javax.swing.JTextField();
        resultadoComboBox = new javax.swing.JComboBox<>();
        buscarLibroButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        libreriasPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Librerias"));

        libreriasComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                libreriasComboBoxItemStateChanged(evt);
            }
        });

        agregarLibreriaButton.setText("Agregar");
        agregarLibreriaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarLibreriaButtonMouseClicked(evt);
            }
        });

        modificarLibreriaButton.setText("Modificar");
        modificarLibreriaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarLibreriaButtonMouseClicked(evt);
            }
        });

        eliminarLibreriaButton.setText("Eliminar");
        eliminarLibreriaButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarLibreriaButtonMouseClicked(evt);
            }
        });

        jButton4.setText("Modificar");

        javax.swing.GroupLayout libreriasPanelLayout = new javax.swing.GroupLayout(libreriasPanel);
        libreriasPanel.setLayout(libreriasPanelLayout);
        libreriasPanelLayout.setHorizontalGroup(
            libreriasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(libreriasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(libreriasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eliminarLibreriaButton)
                    .addGroup(libreriasPanelLayout.createSequentialGroup()
                        .addComponent(libreriasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(agregarLibreriaButton)))
                .addGap(18, 18, 18)
                .addGroup(libreriasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modificarLibreriaButton)
                    .addComponent(jButton4))
                .addContainerGap(79, Short.MAX_VALUE))
        );
        libreriasPanelLayout.setVerticalGroup(
            libreriasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(libreriasPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(libreriasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(libreriasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(agregarLibreriaButton)
                    .addComponent(modificarLibreriaButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(libreriasPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminarLibreriaButton)
                    .addComponent(jButton4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        librosPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Libros"));

        modificarLibroButton.setText("Modificar");
        modificarLibroButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                modificarLibroButtonMouseClicked(evt);
            }
        });

        jButton6.setText("Modificar");

        eliminarLibroButton.setText("Eliminar");
        eliminarLibroButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarLibroButtonMouseClicked(evt);
            }
        });

        agregarLibroButton.setText("Agregar");
        agregarLibroButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agregarLibroButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout librosPanelLayout = new javax.swing.GroupLayout(librosPanel);
        librosPanel.setLayout(librosPanelLayout);
        librosPanelLayout.setHorizontalGroup(
            librosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(librosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(librosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(librosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(eliminarLibroButton)
                    .addComponent(agregarLibroButton))
                .addGap(18, 18, 18)
                .addGroup(librosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(modificarLibroButton)
                    .addComponent(jButton6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        librosPanelLayout.setVerticalGroup(
            librosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(librosPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(librosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(librosPanelLayout.createSequentialGroup()
                        .addGroup(librosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(agregarLibroButton)
                            .addComponent(modificarLibroButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(librosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(eliminarLibroButton)
                            .addComponent(jButton6)))
                    .addComponent(librosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        blibrosPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Búsqueda de Libros"));

        jLabel1.setText("Parámetro de Busqueda");

        jLabel5.setText("Resultados");

        isbnRadioButton.setText("ISBN");

        tituloRadioButton.setText("Título");

        autorRadioButton.setText("Autor");

        buscarLibroButton.setText("Buscar");

        javax.swing.GroupLayout blibrosPanelLayout = new javax.swing.GroupLayout(blibrosPanel);
        blibrosPanel.setLayout(blibrosPanelLayout);
        blibrosPanelLayout.setHorizontalGroup(
            blibrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blibrosPanelLayout.createSequentialGroup()
                .addGroup(blibrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(blibrosPanelLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(resultadoComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(blibrosPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGroup(blibrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(blibrosPanelLayout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(isbnRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(tituloRadioButton)
                                .addGap(18, 18, 18)
                                .addComponent(autorRadioButton))
                            .addGroup(blibrosPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(parametroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buscarLibroButton)))))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        blibrosPanelLayout.setVerticalGroup(
            blibrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(blibrosPanelLayout.createSequentialGroup()
                .addGroup(blibrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(parametroTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buscarLibroButton))
                .addGap(1, 1, 1)
                .addGroup(blibrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isbnRadioButton)
                    .addComponent(tituloRadioButton)
                    .addComponent(autorRadioButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(blibrosPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(resultadoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(libreriasPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(librosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(blibrosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(libreriasPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(librosPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(blibrosPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregarLibreriaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarLibreriaButtonMouseClicked
        AgregarLibreriaGui agregarDialog = new AgregarLibreriaGui(this, true);
        agregarDialog.setVisible(true);
    }//GEN-LAST:event_agregarLibreriaButtonMouseClicked

    
    private void modificarLibreriaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarLibreriaButtonMouseClicked
        if (libreriasComboBox.getSelectedItem() != null) {
            AgregarLibreriaGui modificarDialog = new AgregarLibreriaGui(this, true, (Libreria) libreriasComboBox.getSelectedItem());
            modificarDialog.setVisible(true);
        }
    }//GEN-LAST:event_modificarLibreriaButtonMouseClicked

    private void eliminarLibreriaButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarLibreriaButtonMouseClicked
        if (libreriasComboBox.getSelectedItem() != null) {
            libreriasComboBox.removeItem(libreriasComboBox.getSelectedItem());
        }
    }//GEN-LAST:event_eliminarLibreriaButtonMouseClicked

    private void libreriasComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_libreriasComboBoxItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {
            Libreria libreria = (Libreria) libreriasComboBox.getSelectedItem();
            System.out.println("Libreria");
            System.out.println("Dirección: " + libreria.getDireccion());
        }
    }//GEN-LAST:event_libreriasComboBoxItemStateChanged

    private void agregarLibroButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agregarLibroButtonMouseClicked
        AgregarLibroGui agregarLibroDialog = new AgregarLibroGui(this, true,  (Libro) librosComboBox.getSelectedItem());
        agregarLibroDialog.setVisible(true);
    }//GEN-LAST:event_agregarLibroButtonMouseClicked

    private void modificarLibroButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_modificarLibroButtonMouseClicked
       if (librosComboBox.getSelectedItem() != null) {
            AgregarLibroGui libroDialog = new AgregarLibroGui(this, true, (Libro) librosComboBox.getSelectedItem());
            libroDialog.setVisible(true);
        }
    }//GEN-LAST:event_modificarLibroButtonMouseClicked

    private void eliminarLibroButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarLibroButtonMouseClicked
        if (librosComboBox.getSelectedItem() != null) {
            librosComboBox.removeItem(librosComboBox.getSelectedItem());
        }
    }//GEN-LAST:event_eliminarLibroButtonMouseClicked

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
    private javax.swing.JButton agregarLibreriaButton;
    private javax.swing.JButton agregarLibroButton;
    private javax.swing.JRadioButton autorRadioButton;
    private javax.swing.JPanel blibrosPanel;
    private javax.swing.JButton buscarLibroButton;
    private javax.swing.JButton eliminarLibreriaButton;
    private javax.swing.JButton eliminarLibroButton;
    private javax.swing.JRadioButton isbnRadioButton;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JComboBox<Libreria> libreriasComboBox;
    private javax.swing.JPanel libreriasPanel;
    private javax.swing.JComboBox<Libro> librosComboBox;
    private javax.swing.JPanel librosPanel;
    private javax.swing.JButton modificarLibreriaButton;
    private javax.swing.JButton modificarLibroButton;
    private javax.swing.JTextField parametroTextField;
    private javax.swing.JComboBox<String> resultadoComboBox;
    private javax.swing.JRadioButton tituloRadioButton;
    // End of variables declaration//GEN-END:variables

    void agregarLibro(Libro libro) {
     librosComboBox.addItem(libro);
    }

    void agregarLibreria(Libreria libreria) {
     libreriasComboBox.addItem(libreria);
    }
}
