package guia2ej4.supermercado;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author ferna
 */
public class Carga extends javax.swing.JInternalFrame {

    private JButton botonAnterior = null;

    public Carga() {
        initComponents();
        setTitle("Carga de Datos");
        cargarCombo();
        

        editable(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcbRubro = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jtDescripcion = new javax.swing.JTextField();
        jtPrecio = new javax.swing.JTextField();
        jtStock = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jbNuevo = new javax.swing.JButton();
        jbAgregar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();

        jLabel1.setText("Codigo");

        jLabel2.setText("Descripcion");

        jLabel3.setText("Precio");

        jLabel4.setText("Rubro");

        jLabel5.setText("Stock");

        jtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtDescripcionActionPerformed(evt);
            }
        });

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbAgregar.setText("Agregar");
        jbAgregar.setActionCommand("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");
        jbEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEliminarActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jtPrecio)
                            .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel5))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbBuscar))
                            .addComponent(jcbRubro, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbNuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbAgregar)
                        .addGap(12, 12, 12)
                        .addComponent(jbEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar)
                    .addComponent(jLabel1))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcbRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbNuevo)
                    .addComponent(jbAgregar)
                    .addComponent(jbEliminar)
                    .addComponent(jbSalir))
                .addGap(0, 12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtDescripcionActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
    try{   
        if (jtCodigo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe ingresar un codigo para buscar");
        } else {
            int cod = Integer.parseInt(jtCodigo.getText());
            boolean encontrado = true;

            for (Producto pro : Desktop.listaProductos) {
                if (pro.getCodigo() == cod) {
                    jtDescripcion.setText(pro.getDescripcion());
                    jtPrecio.setText("$ " + pro.getPrecio());
                    jtStock.setText(pro.getStock() + " u");
                    jcbRubro.setSelectedItem(pro.getCategoria());
                    encontrado = false;
                    botonAnterior = jbBuscar;
                    break;
                }
            }
            if (encontrado) {
                JOptionPane.showMessageDialog(this, "El codigo - " + cod + " - no existe");
                limpiarJT();
            }
        }
    }catch(NumberFormatException nf){
        JOptionPane.showMessageDialog(this, "El codigo ingresado es invalido");
    }  
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        try {
            int cod = Integer.parseInt(jtCodigo.getText());
            String Descripcion = jtDescripcion.getText();
            double precio = Double.parseDouble(jtPrecio.getText());
            int stock = Integer.parseInt(jtStock.getText());

            if (repetido(cod)) {
                JOptionPane.showMessageDialog(this, "El codigo ingresado ya esta utilizado");
            } else {
                //JOptionPane.showMessageDialog(this, "El Codigo "+ cod + " se agrego correctamente");
                Object[] options = {"Sí", "No", "Cancelar"};
                int choice = JOptionPane.showOptionDialog(
                        null,
                        "¿Deseas guardar los cambios?",
                        "Confirmación",
                        JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        options,
                        options[0]
                );

                if (choice == JOptionPane.YES_OPTION) {
                    Producto nuevo = new Producto(cod, Descripcion, precio, stock, (Categoria) jcbRubro.getSelectedItem());
                    Desktop.listaProductos.add(nuevo);
                    limpiarJT();
                    editable(false);
                    JOptionPane.showMessageDialog(this, "El Codigo " + cod + " se agrego correctamente");
                } else if (choice == JOptionPane.NO_OPTION) {
                    JOptionPane.showMessageDialog(this, "No se guardaron los cambios");
                } else if (choice == JOptionPane.CANCEL_OPTION || choice == JOptionPane.CLOSED_OPTION) {
                    JOptionPane.showMessageDialog(this, "Operacion Cancelada");
                    limpiarJT();
                }

            }
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Alguno de los datos es incorrecto");
        }

    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        limpiarJT();
        editable(true);
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
         if (botonAnterior.equals(jbBuscar)) {
            int num = Integer.parseInt(jtCodigo.getText());
             for (Producto producto : Desktop.listaProductos) {
                 if(producto.getCodigo()== num){
                     Object[] options = {"YEA", "No"};
                     int choice =JOptionPane.showOptionDialog(this,
                             "esta Seguro que desea eliminar el elemento seleccionado",
                             "Confirmacion",
                             JOptionPane.YES_NO_OPTION,
                             JOptionPane.QUESTION_MESSAGE,
                             frameIcon,
                             options, options[1]);
                     if(choice == JOptionPane.YES_OPTION){
                          Desktop.listaProductos.remove(producto);
                          limpiarJT();
                           JOptionPane.showMessageDialog(this, "El Producto se elimino Correctamente");
                     }else if(choice == JOptionPane.NO_OPTION){
                         JOptionPane.showMessageDialog(this, "no se Ha eliminado el Producto Seleccionado");
                     }
                    
                 }
             }
        }else{
             JOptionPane.showMessageDialog(this, "Debe buscar el producto por el codigo primero");
         }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_jbSalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbSalir;
    private javax.swing.JComboBox<Categoria> jcbRubro;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JTextField jtDescripcion;
    private javax.swing.JTextField jtPrecio;
    private javax.swing.JTextField jtStock;
    // End of variables declaration//GEN-END:variables
/**
     * Metodo que realiza la carga de los items de JComboBox "jcRubro" para esto
     * usa la Clase de tipo Enum Categoria para cargar nuevos item modificar la
     * clase Categoria.
     */
    private void cargarCombo() {
        for (Categoria cat : Categoria.values()) {
            jcbRubro.addItem(cat);
        }
    }

    

    private void cargarDato(Producto producto) {
        Desktop.listaProductos.add(producto);
    }

    private boolean repetido(int num) {
        for (Producto pro : Desktop.listaProductos) {
            if (pro.getCodigo() == num) {
                return true;
            }
        }
        return false;
    }

    private void limpiarJT() {
        jtCodigo.setText("");
        jtDescripcion.setText("");
        jtPrecio.setText("");
        jtStock.setText("");
        jcbRubro.setEditable(false);
    }

    private void editable(boolean op) {
        jtDescripcion.setEditable(op);
        jtPrecio.setEditable(op);
        jtStock.setEditable(op);
        
    }
}