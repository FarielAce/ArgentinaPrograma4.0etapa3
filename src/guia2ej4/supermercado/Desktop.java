package guia2ej4.supermercado;

import java.util.TreeSet;

/**
 *
 * @author ferna
 */
public class Desktop extends javax.swing.JFrame {

    public static TreeSet<Producto> listaProductos = new TreeSet<>();

    public Desktop() {
        initComponents();
        setTitle("DeTodo S.A.");
        datosPrueba();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuCarga = new javax.swing.JMenuItem();
        jmConsulta = new javax.swing.JMenu();
        jmPorRubro = new javax.swing.JMenuItem();
        jmPorNombre = new javax.swing.JMenuItem();
        jmPorPrecio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jMenu1.setText("Administracion");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        jMenuCarga.setText("Producto");
        jMenuCarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuCargaActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuCarga);

        jMenuBar1.add(jMenu1);

        jmConsulta.setText("Consultas");
        jmConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmConsultaActionPerformed(evt);
            }
        });

        jmPorRubro.setText("Por Rubro");
        jmPorRubro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPorRubroActionPerformed(evt);
            }
        });
        jmConsulta.add(jmPorRubro);

        jmPorNombre.setText("Por Nombre");
        jmPorNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPorNombreActionPerformed(evt);
            }
        });
        jmConsulta.add(jmPorNombre);

        jmPorPrecio.setText("Por Precio");
        jmPorPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmPorPrecioActionPerformed(evt);
            }
        });
        jmConsulta.add(jmPorPrecio);

        jMenuBar1.add(jmConsulta);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmPorRubroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPorRubroActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        PorRubro XRubro = new PorRubro();
        XRubro.setVisible(true);
        Escritorio.add(XRubro);
        Escritorio.moveToFront(XRubro);
    }//GEN-LAST:event_jmPorRubroActionPerformed

    private void jmPorPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPorPrecioActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        PorPrecio XPrecio = new PorPrecio();
        XPrecio.setVisible(true);
        Escritorio.add(XPrecio);
        Escritorio.moveToFront(XPrecio);
    }//GEN-LAST:event_jmPorPrecioActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed

    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMenuCargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuCargaActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        Carga Carga = new Carga();
        Carga.setVisible(true);
        Escritorio.add(Carga);
        Escritorio.moveToFront(Carga);
    }//GEN-LAST:event_jMenuCargaActionPerformed

    private void jmConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmConsultaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jmConsultaActionPerformed

    private void jmPorNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmPorNombreActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        PorNombre XNombre = new PorNombre();
        XNombre.setVisible(true);
        Escritorio.add(XNombre);
        Escritorio.moveToFront(XNombre);
    }//GEN-LAST:event_jmPorNombreActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Desktop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Desktop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuCarga;
    private javax.swing.JMenu jmConsulta;
    private javax.swing.JMenuItem jmPorNombre;
    private javax.swing.JMenuItem jmPorPrecio;
    private javax.swing.JMenuItem jmPorRubro;
    // End of variables declaration//GEN-END:variables
private void datosPrueba() {
        Desktop.listaProductos.add(new Producto(01, "Jabon", 25000.25, 3, Categoria.Perfumeria));
        Desktop.listaProductos.add(new Producto(02, "Detergente liquido", 600.25, 10, Categoria.Limpieza));
        Desktop.listaProductos.add(new Producto(03, "Yerba", 3, 32, Categoria.Comestibles));
    }
}
