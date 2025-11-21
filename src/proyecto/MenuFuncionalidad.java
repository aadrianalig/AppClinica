/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto;

import modelo.Empleado;
public class MenuFuncionalidad extends javax.swing.JFrame {

    private Empleado empleado;

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(MenuFuncionalidad.class.getName());

    public MenuFuncionalidad() {
        initComponents();
        // centrar la ventana
        this.setLocationRelativeTo(null);
    }

    public MenuFuncionalidad(Empleado empleado) {
        this();                 // inicializa componentes
        this.empleado = empleado; //guarda el empleado del login
        configurarSegunRol();   // ahora sí, los componentes ya existen
    }

    private void configurarSegunRol() {
        if (empleado == null) {
            return;
        }

        String rol = empleado.getRol();

        lblBienvenida.setText("Bienvenido " + empleado.getNombres() + "        Rol: " + rol);

        itemEmpleados.setVisible(false);
        itemConsultorios.setVisible(false);
        itemReportes.setVisible(false);
        itemConsultas.setVisible(false);
        itemPacientes.setVisible(false);

        if (rol.equals("ADMIN")) {
            itemEmpleados.setVisible(true);
            itemConsultorios.setVisible(true);
            itemReportes.setVisible(true);
        } else if (rol.equals("RECEP")) {
            itemPacientes.setVisible(true);
            itemConsultas.setVisible(true);
        } else if (rol.equals("MEDICO")) {
            itemConsultas.setVisible(true);
            itemPacientes.setVisible(true);
        } else if (rol.equals("ENF")) {
            itemConsultas.setVisible(true);
        } else if (rol.equals("CAJERO")) {
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
        mnFile = new javax.swing.JMenu();
        itemEmpleados = new javax.swing.JMenuItem();
        itemConsultorios = new javax.swing.JMenuItem();
        itemReportes = new javax.swing.JMenuItem();
        itemConsultas = new javax.swing.JMenuItem();
        itemPacientes = new javax.swing.JMenuItem();
        itemCerrarSesion = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

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

        mnFile.setText("File");

        itemEmpleados.setText("Empleados");
        itemEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEmpleadosActionPerformed(evt);
            }
        });
        mnFile.add(itemEmpleados);

        itemConsultorios.setText("Consultorios");
        itemConsultorios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultoriosActionPerformed(evt);
            }
        });
        mnFile.add(itemConsultorios);

        itemReportes.setText("Reportes");
        itemReportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemReportesActionPerformed(evt);
            }
        });
        mnFile.add(itemReportes);

        itemConsultas.setText("Consultas");
        itemConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemConsultasActionPerformed(evt);
            }
        });
        mnFile.add(itemConsultas);

        itemPacientes.setText("Pacientes");
        itemPacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemPacientesActionPerformed(evt);
            }
        });
        mnFile.add(itemPacientes);

        itemCerrarSesion.setText("Cerrar sesión");
        itemCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemCerrarSesionActionPerformed(evt);
            }
        });
        mnFile.add(itemCerrarSesion);

        jMenu1.add(mnFile);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

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
        // TODO add your handling code here:
    }//GEN-LAST:event_itemReportesActionPerformed

    private void itemEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEmpleadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemEmpleadosActionPerformed

    private void itemConsultoriosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultoriosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemConsultoriosActionPerformed

    private void itemConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemConsultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemConsultasActionPerformed

    private void itemPacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemPacientesActionPerformed
        // TODO add your handling code here:
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
        //obtiene texto de label usuario
        String usuario = txtUsuario.getText();

        //obtiene contrasenia del label y lo convierte string
        String password = new String(txtPassword.getPassword());

        //usa el metodo login de gestorEmpleados del usuario y contrasenia de los labels
        //para ver si existe o no
        Empleado logeado = GestorEmpleados.login(usuario, password);

        // no existe
        if (logeado == null) {
            JOptionPane.showMessageDialog(this,
                    "Usuario o contraseña incorrectos",
                    "Error", JOptionPane.ERROR_MESSAGE); //con mensaje de error
        } else {
            //si existe
            JOptionPane.showMessageDialog(this,
                    "Bienvenido " + logeado.getNombres()
                    + " Rol: " + logeado.getRol());

            //abrir ventana menu
            MenuFuncionalidad menu = new MenuFuncionalidad(logeado);
            menu.setVisible(true);
            //cerrar ventana actual (login)
            this.dispose();
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        //cierra la aplicacion
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

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
    private javax.swing.JMenuItem itemPacientes;
    private javax.swing.JMenuItem itemReportes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JMenu mnFile;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
