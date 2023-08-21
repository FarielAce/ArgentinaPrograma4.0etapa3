package Principal;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.LinkedList;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 * @author Fernando Ariel Acevedo Ejercicio extra 2 de la guia 2 interface
 * Grafica Gestion de Contactos
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    //Main mainFrame; 
    /**
     * Crea un modelo estandar con el cual se cargan las cabeceras y los datos a
     * la JTable
     */
    public static DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            return false;
        }
        //acomoda el tipo dato que va a tener cada celda. al definirla como boolean
        //se convierte en una casilla de verificacion(CheckBox)
//        Class[] types = new Class[]{
//            java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
//        };
//
//        public Class getColumnClass(int columnIndex) {
//            return types[columnIndex];
//        }
    };
   

    /**
     * Sobreescribe el metodo getIconImage para poder cargar el icono en la
     * barra de titulo despues se selecciona de las propiedades del JFrame.-
     */
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("recursos/IconoPrincipal.png"));

        return retValue;
    }
    //creo un objeto tipo listaContactos para utilizar en todas las ventanas
    
    public static listaContacto Contactos = new listaContacto();

    public Main() {
        
        initComponents();
        setTitle("Contactos");       //coloca el titulo de la ventana
        cargarCabecera();
        organizaCabecera();
        Demo();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbAgregar = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbEditar = new javax.swing.JButton();
        panelTabla = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbPrincipal = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setResizable(false);

        jbAgregar.setText("Agregar");
        jbAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAgregarActionPerformed(evt);
            }
        });

        jbEliminar.setText("Eliminar");

        jbEditar.setText("Editar");

        panelTabla.addVetoableChangeListener(new java.beans.VetoableChangeListener() {
            public void vetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {
                panelTablaVetoableChange(evt);
            }
        });

        jtbPrincipal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtbPrincipal);

        javax.swing.GroupLayout panelTablaLayout = new javax.swing.GroupLayout(panelTabla);
        panelTabla.setLayout(panelTablaLayout);
        panelTablaLayout.setHorizontalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );
        panelTablaLayout.setVerticalGroup(
            panelTablaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbEditar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAgregar)
                    .addComponent(jbEliminar)
                    .addComponent(jbEditar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        
        Carga nuevo = new Carga(this, rootPaneCheckingEnabled);
        nuevo.setVisible(rootPaneCheckingEnabled);

    }//GEN-LAST:event_jbAgregarActionPerformed

    private void panelTablaVetoableChange(java.beans.PropertyChangeEvent evt)throws java.beans.PropertyVetoException {//GEN-FIRST:event_panelTablaVetoableChange
       actualizaTabla();
    }//GEN-LAST:event_panelTablaVetoableChange


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JTable jtbPrincipal;
    public javax.swing.JPanel panelTabla;
    // End of variables declaration//GEN-END:variables
    /**
     * Carga los nombres de la cabecera de la JTable
     *
     */
    private void cargarCabecera() {
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido");
        modelo.addColumn("telefono");
        modelo.addColumn("Correo Electronico");
        jtbPrincipal.setModel(modelo);
    }

    /**
     * metodo para que se pueda organizar la tabla de acuerdo al contenido.
     */
    public void organizaCabecera() { //permite ordenar los datos en la JTable de manera acendente o decendente haciendo clic sobre cualquier cabecera
        TableRowSorter<DefaultTableModel> sorter = new TableRowSorter<>(modelo);
        jtbPrincipal.setRowSorter(sorter);
    }

    public void actualizaTabla() {
        modelo.setRowCount(0);                          //limpia la tabla
        for (Contacto contacto : Contactos.getLista()) {  // cargatodos los datos de la lista en la JTable
            modelo.addRow(new Object[]{
                contacto.getNombre(),
                contacto.getApellido(),
                contacto.getNumero(),
                contacto.geteMail()
            });
        }
        //modelo.fireTableDataChanged();   //lei en un foro para actualizar pero no ha funcionado
    }

    public void cargaTabla(Contacto contacto) {
        //Contactos.agregaContacto(contacto); //Agrega el contacto al la Lista
        modelo.addRow(new Object[]{              //Carga el contacto en la JTable
            contacto.getNombre(),       
            contacto.getApellido(),
            contacto.getNumero(),
            contacto.geteMail()
        });
    }
    
    private void Demo(){
        Contactos.agregaContacto(new Contacto("fernando", "Galvan", 251255, "fg@gmail.com"));
        Contactos.agregaContacto(new Contacto("Cristian", "Sanchez", 44352345, "cs@gmail.com"));
        Contactos.agregaContacto(new Contacto("veronica", "Perez", 1234215, "vp@gmail.com"));
        Contactos.agregaContacto(new Contacto("alejandra", "Velazques", 142336262, "av@gmail.com"));
        actualizaTabla();
    }
}
