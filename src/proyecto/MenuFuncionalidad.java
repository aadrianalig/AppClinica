/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;

import controller.GestorDeGestores;
import modelo.Empleado;
import javax.swing.JOptionPane;

public class MenuFuncionalidad extends javax.swing.JFrame {

    private Empleado empleado;
    private GestorDeGestores gg;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MenuFuncionalidad.class.getName());

    public MenuFuncionalidad() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    //recibe empleado + gg
    public MenuFuncionalidad(Empleado empleado, GestorDeGestores gg) {
        this();
        this.empleado = empleado;
        this.gg = gg; // guardar referencia central a todos los gestores
        configurarSegunRol();
    }

    private void configurarSegunRol() {  // muestra/oculta menus segun rol
        if (empleado == null) {           // si no hay empleado, salgo
            return;
        }

        String rol = empleado.getRol();  // rol actual (ADMIN, RECEP, etc.)

        lblBienvenida.setText("Bienvenido " + empleado.getNombres()
                + "        Rol: " + rol);    // texto de bienvenida

        // todo oculto default
        itemEmpleados.setVisible(false);
        itemConsultorios.setVisible(false);
        itemReportes.setVisible(false);
        itemConsultas.setVisible(false);
        itemPacientes.setVisible(false);

        // activo segun el rol
        if (rol.equals("ADMIN")) {          // admin todo
            itemEmpleados.setVisible(true);
            itemConsultorios.setVisible(true);
            itemReportes.setVisible(true);
            itemConsultas.setVisible(true);
            itemPacientes.setVisible(true);
        } else if (rol.equals("RECEP")) {  // recepcion: pacientes + consultas
            itemPacientes.setVisible(true);
            itemConsultas.setVisible(true);
        } else if (rol.equals("MEDICO")) { // medico: consultas + pacientes
            itemConsultas.setVisible(true);
            itemPacientes.setVisible(true);
        } else if (rol.equals("ENF")) {    // enfermeria: consultas
            itemConsultas.setVisible(true);
        } else if (rol.equals("CAJERO")) { // cajero: reportes
            itemReportes.setVisible(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        btnIngresar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblBienvenida = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        itemEmpleados = new javax.swing.JMenuItem();
        itemConsultorios = new javax.swing.JMenuItem();
        itemReportes = new javax.swing.JMenuItem();
        itemConsultas = new javax.swing.JMenuItem();
        itemPacientes = new javax.swing.JMenuItem();
        itemFacturas = new javax.swing.JMenuItem();
        itemCerrarSesion = new javax.swing.JMenuItem();

        jPanel1.setBackground(new java.awt.Color(167, 215, 209));

        jLabel1.setForeground(new java.awt.Color(45, 62, 80));
        jLabel1.setText("Usuario");

        txtUsuario.setToolTipText("");
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(45, 62, 80));
        jLabel2.setText("Contraseña");

        txtPassword.setToolTipText("");

        btnIngresar.setBackground(new java.awt.Color(169, 229, 187));
        btnIngresar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(26, 46, 26));
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnSalir.setBackground(new java.awt.Color(247, 196, 196));
        btnSalir.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(74, 28, 28));
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsuario)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(71, 71, 71)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(btnSalir))
                .addContainerGap(92, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(167, 215, 209));

        lblBienvenida.setForeground(new java.awt.Color(45, 62, 80));
        lblBienvenida.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBienvenida.setText("Bienvenido");
        lblBienvenida.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(64, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(lblBienvenida, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(69, 190, 175));
        jMenuBar1.setForeground(new java.awt.Color(45, 62, 80));

        jMenu1.setBackground(new java.awt.Color(105, 158, 151));
        jMenu1.setText("File");

        itemEmpleados.setText("Empleados");
        itemEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEmpleadosActionPerformed(evt);
            }
        });
        jMenu1.add(itemEmpleados);

        itemConsultorios.setText("Consultorios");
        itemConsultorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultoriosActionPerformed(evt);
            }
        });
        jMenu1.add(itemConsultorios);

        itemReportes.setText("Reportes");
        itemReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReportesActionPerformed(evt);
            }
        });
        jMenu1.add(itemReportes);

        itemConsultas.setText("Consultas");
        itemConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultasActionPerformed(evt);
            }
        });
        jMenu1.add(itemConsultas);

        itemPacientes.setText("Pacientes");
        itemPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPacientesActionPerformed(evt);
            }
        });
        jMenu1.add(itemPacientes);

        itemFacturas.setText("Facturas");
        itemFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemFacturasActionPerformed(evt);
            }
        });
        jMenu1.add(itemFacturas);

        itemCerrarSesion.setText("Cerrar sesión");
        itemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCerrarSesionActionPerformed(evt);
            }
        });
        jMenu1.add(itemCerrarSesion);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void itemReportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemReportesActionPerformed
        FrmReportes frm = new FrmReportes(gg);
        frm.setVisible(true);
    }//GEN-LAST:event_itemReportesActionPerformed

    private void itemEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEmpleadosActionPerformed
        FrmEmpleados frm = new FrmEmpleados(gg);
        frm.setVisible(true);;
    }//GEN-LAST:event_itemEmpleadosActionPerformed

    private void itemConsultoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultoriosActionPerformed
        FrmConsultorios frm = new FrmConsultorios(gg);
        frm.setVisible(true);
    }//GEN-LAST:event_itemConsultoriosActionPerformed

    private void itemConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultasActionPerformed
        FrmConsultas frm = new FrmConsultas(gg);
        frm.setVisible(true);
    }//GEN-LAST:event_itemConsultasActionPerformed

    private void itemPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPacientesActionPerformed
        FrmPacientes frm = new FrmPacientes(gg);
        frm.setVisible(true);
    }//GEN-LAST:event_itemPacientesActionPerformed

    private void itemCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemCerrarSesionActionPerformed
        //te regresa a la ventana login, nuevo 0 usuarios
        login log = new login();
        log.setVisible(true);
        //cerrar esta ventana (menu funcionalidades)
        this.dispose();
    }//GEN-LAST:event_itemCerrarSesionActionPerformed

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed

    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed

    }//GEN-LAST:event_btnSalirActionPerformed

    private void itemFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemFacturasActionPerformed
        FrmFacturas frm = new FrmFacturas(gg);
        frm.setVisible(true);
    }//GEN-LAST:event_itemFacturasActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new MenuFuncionalidad().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JMenuItem itemCerrarSesion;
    private javax.swing.JMenuItem itemConsultas;
    private javax.swing.JMenuItem itemConsultorios;
    private javax.swing.JMenuItem itemEmpleados;
    private javax.swing.JMenuItem itemFacturas;
    private javax.swing.JMenuItem itemPacientes;
    private javax.swing.JMenuItem itemReportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
