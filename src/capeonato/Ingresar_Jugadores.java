package capeonato;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danielmora
 */
public class Ingresar_Jugadores extends javax.swing.JFrame {

    DefaultTableModel model;
    PreparedStatement pr; // para realizar consultas en la base de dats necesitamos esta variable 
    ResultSet rs; //

    /**
     * Creates new form Ingresar_Jugadores
     */
    public Ingresar_Jugadores() {
        initComponents();
        limpiar();
        bloquear();
        mostrarDatos();
    }

    public void mostrarDatos() {
        String[] titulos = {"Cedula", "Nombre", "Apellido", "Direccion", "Estado-Civil", "Sexo", "Edad"}; // ponemos los titulos en el Vector 
        String[] t_datos = new String[7];

        String sql = "select * from Jugadores ";

        model = new DefaultTableModel(null, titulos); // agregamos los titulos 
        Conexion conec = new Conexion();  // objeto de tipo conxion 
        Connection conex = conec.getConnection();

        try {
            Statement st = conex.createStatement();
            rs = st.executeQuery(sql);// ejecutamos  la sentencia sql

            while (rs.next()) { // me permita ingresar los datos al jtable

                t_datos[0] = rs.getString("cedula");
                t_datos[1]=rs.getString("Nombre");
                t_datos[2]=rs.getString("Apellido");
                t_datos[3]=rs.getString("Direccion");
                t_datos[4]=rs.getString("estado_civil");
                t_datos[5]=rs.getString("sexo");
                model.addRow(t_datos); // llenamos el vector
            }
                tablaMostrarDatos.setModel(model); // agegamos el defaultmodel

        } catch (Exception er) {
            System.err.println("Error" + er);
        }

    }

    public void limpiar() {
        cajaCedula.setText("");
        cajaNombre.setText("");
        cajaApellido.setText("");
        cajaDireccion.setText("");
        cajaEdad.setText("");
    }

    public void bloquear() {
        cajaCedula.setEnabled(false);
        cajaNombre.setEnabled(false);
        cajaApellido.setEnabled(false);
        cajaDireccion.setEnabled(false);
        cajaEdad.setEnabled(false);
        botonNuevo.setEnabled(true);
        botonGuardar.setEnabled(false);
        botonCancelar.setEnabled(false);
        botonEliminar.setEnabled(false);
    }

    public void habilitar() {
        cajaCedula.setEnabled(true);
        cajaNombre.setEnabled(true);
        cajaApellido.setEnabled(true);
        cajaDireccion.setEnabled(true);
        cajaEdad.setEnabled(true);
        botonNuevo.setEnabled(false);
        botonGuardar.setEnabled(true);
        botonCancelar.setEnabled(true);
        botonEliminar.setEnabled(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jColorChooser1 = new javax.swing.JColorChooser();
        jColorChooser2 = new javax.swing.JColorChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cajaNombre = new javax.swing.JTextField();
        cajaApellido = new javax.swing.JTextField();
        cajaDireccion = new javax.swing.JTextField();
        comboBoxEstado = new javax.swing.JComboBox<>();
        comboBoxSexo = new javax.swing.JComboBox<>();
        cajaEdad = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        botonNuevo = new javax.swing.JButton();
        botonGuardar = new javax.swing.JButton();
        botonCancelar = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonEliminar = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        cajaCedula = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaMostrarDatos = new javax.swing.JTable();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre :");

        jLabel2.setText("Apellido :");

        jLabel3.setText("Direccion :");

        jLabel4.setText("Estado civil :");

        jLabel5.setText("Sexo :");

        jLabel6.setText("Edad :");

        cajaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaNombreActionPerformed(evt);
            }
        });

        cajaApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaApellidoActionPerformed(evt);
            }
        });

        cajaDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaDireccionActionPerformed(evt);
            }
        });

        comboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Soltero", "Casado" }));
        comboBoxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxEstadoActionPerformed(evt);
            }
        });

        comboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Femenino", "Masculino", "Otros" }));

        cajaEdad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaEdadActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(15, 15, 15));
        jLabel7.setText("Ingreso Jugadores");

        botonNuevo.setText("NUEVO");
        botonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNuevoActionPerformed(evt);
            }
        });

        botonGuardar.setText("GUARDAR");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonCancelar.setText("CANCELAR");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonSalir.setText("SALIR");
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });

        botonModificar.setText("MODIFICAR");
        botonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonModificarActionPerformed(evt);
            }
        });

        botonEliminar.setText("ELIMINAR");
        botonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEliminarActionPerformed(evt);
            }
        });

        jLabel8.setText("Cedula");

        cajaCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaCedulaActionPerformed(evt);
            }
        });

        tablaMostrarDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tablaMostrarDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonNuevo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(botonGuardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonCancelar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5)
                                        .addComponent(jLabel6))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(comboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(comboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cajaEdad, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel8))
                                    .addGap(30, 30, 30)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(cajaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE)
                                        .addComponent(cajaApellido)
                                        .addComponent(cajaDireccion)
                                        .addComponent(cajaCedula)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(botonModificar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonEliminar, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botonSalir, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jLabel7))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cajaCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(cajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(cajaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonModificar)
                                .addGap(38, 38, 38)
                                .addComponent(botonEliminar)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cajaDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(comboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(comboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cajaEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNuevo)
                    .addComponent(botonGuardar)
                    .addComponent(botonCancelar)
                    .addComponent(botonSalir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNuevoActionPerformed

        habilitar();
        cajaNombre.requestFocus(); // habilita el cursor en la casilla nombrada

    }//GEN-LAST:event_botonNuevoActionPerformed

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed

        bloquear();

    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed

        this.dispose();

    }//GEN-LAST:event_botonSalirActionPerformed

    private void cajaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaNombreActionPerformed

        cajaNombre.transferFocus();
    }//GEN-LAST:event_cajaNombreActionPerformed

    private void cajaApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaApellidoActionPerformed
        cajaApellido.transferFocus();
    }//GEN-LAST:event_cajaApellidoActionPerformed

    private void cajaDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaDireccionActionPerformed
        cajaDireccion.transferFocus();
    }//GEN-LAST:event_cajaDireccionActionPerformed

    private void cajaEdadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaEdadActionPerformed
        cajaEdad.transferFocus();
    }//GEN-LAST:event_cajaEdadActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed

        Conexion conec = new Conexion(); //  llamamos al objeto conctar de nuestraclase Conexion

        Connection conex = conec.getConnection();// Creamos nuestra variable de conxion

        String cedula, nombre, apellido, direccion, estadoCivil, sexo, edad, sql = ""; // creamos las variables temporales para almenar lo que contiene las cajas de texto

        cedula = cajaCedula.getText();
        nombre = cajaNombre.getText();
        apellido = cajaApellido.getText();
        direccion = cajaDireccion.getText();
        estadoCivil = comboBoxEstado.getSelectedItem().toString();
        sexo = comboBoxSexo.getSelectedItem().toString();
        edad = cajaEdad.getText();
        sql = "insert into Jugadores(cedula,Nombre,Apellido,Direccion,estado_civil,sexo,edad) values(?,?,?,?,?,?,?)";// creamos la sentencia sql 

        try {
            
           // CallableStatement ps = conex.prepareCall("call insertarJugadores(?,?,?,?,?,?,?)");
            PreparedStatement ps = conex.prepareStatement(sql);
            ps.setString(1, cedula);
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setString(4, direccion);
            ps.setString(5, estadoCivil);
            ps.setString(6, sexo);
            ps.setString(7, edad);

            int result = ps.executeUpdate(); // ejecutamos la inserccion en la base de datos 

            if (result > 0) {
                JOptionPane.showMessageDialog(null, "Registro Insertado correctamente ");
                bloquear();
                 mostrarDatos();

            } else {
                JOptionPane.showMessageDialog(null, " Error al Insertar el Registro  ");
            }

        } catch (Exception ex) {
            System.err.println("Error" + ex);
        }


    }//GEN-LAST:event_botonGuardarActionPerformed

    private void cajaCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaCedulaActionPerformed
        cajaCedula.transferFocus();
    }//GEN-LAST:event_cajaCedulaActionPerformed

    private void comboBoxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxEstadoActionPerformed

    private void botonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonModificarActionPerformed
        
        
        try{
            Conexion conec = new Conexion(); //  llamamos al objeto conctar de nuestraclase Conexion

        Connection conex = conec.getConnection();
        
        pr=conex.prepareStatement("update Jugadores set cedula=?,Nombre=?,Apellido=?,Direccion=?,estado_civil=?,sexo=?,edad=?");
        //CallableStatement pr = conex.prepareCall("call modificarJugadores (?,?,?,?,?,?,?)");
        pr.setString(1,cajaCedula.getText());
        pr.setString(2,cajaNombre.getText());
        pr.setString(3,cajaApellido.getText());
        pr.setString(4,cajaDireccion.getText());
        pr.setString(5,comboBoxEstado.getSelectedItem().toString());
        pr.setString(6,comboBoxSexo.getSelectedItem().toString());
        pr.setString(7,cajaEdad.getText());
       
        int resultado = pr.executeUpdate(); // ejecutamos la Modificacion en la base de datos 
            
            if (resultado>0) {
                
                JOptionPane.showMessageDialog(null,"Registro Modificado correctamente ");
                limpiar();
                mostrarDatos();
            } 
            else{
                 JOptionPane.showMessageDialog(null,"Error al ingresar el Registro ");
                 
            }
        
        
        }
        catch(Exception ex){
            
            System.err.println("Error"+ex);
        }
    }//GEN-LAST:event_botonModificarActionPerformed

    private void botonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEliminarActionPerformed
        
         try{
            Conexion conec = new Conexion(); //  llamamos al objeto conctar de nuestraclase Conexion

        Connection conex = conec.getConnection();
        
        pr=conex.prepareStatement("delete from Jugadores where cedula=?");
        pr.setString(1,cajaCedula.getText());

        
        int resultado = pr.executeUpdate(); // ejecutamos la Eliminacion en la base de datos 
            
            if (resultado>0) {
                
                JOptionPane.showMessageDialog(null,"Registro Eliminado  correctamente ");
                limpiar();
                mostrarDatos();
            } 
            else{
                 JOptionPane.showMessageDialog(null,"Error al ELIMINAR  el Registro ");
                 
            }
        
        
        }
        catch(Exception ex){
            
            System.err.println("Error"+ex);
        }
    }//GEN-LAST:event_botonEliminarActionPerformed

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
            java.util.logging.Logger.getLogger(Ingresar_Jugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Jugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Jugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Jugadores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar_Jugadores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonEliminar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JButton botonModificar;
    private javax.swing.JButton botonNuevo;
    private javax.swing.JButton botonSalir;
    private javax.swing.JTextField cajaApellido;
    private javax.swing.JTextField cajaCedula;
    private javax.swing.JTextField cajaDireccion;
    private javax.swing.JTextField cajaEdad;
    private javax.swing.JTextField cajaNombre;
    private javax.swing.JComboBox<String> comboBoxEstado;
    private javax.swing.JComboBox<String> comboBoxSexo;
    private javax.swing.JColorChooser jColorChooser1;
    private javax.swing.JColorChooser jColorChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTable tablaMostrarDatos;
    // End of variables declaration//GEN-END:variables
}
