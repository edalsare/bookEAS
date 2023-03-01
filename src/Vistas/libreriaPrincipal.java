package Vistas;

import com.mysql.cj.xdevapi.PreparableStatement;
import java.awt.Color;
import java.awt.Image;
import java.awt.Point;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Locale;

public class libreriaPrincipal extends javax.swing.JFrame {

    public static final String url = "jdbc:mysql://localhost:3306/libreria_eas";
    public static final String usuario = "root";
    public static final String pass = "";

    public libreriaPrincipal() {
        initComponents();

        //Linea para  que la ventana se adapte a la pantalla
        this.setExtendedState(MAXIMIZED_BOTH);
        //setImageLabel(jllogo, "src/img/logo.png");
        mostrarDatos();
    }

    public Connection getConnection() {
        Connection conexion = null;
        try {
            conexion = (Connection) DriverManager.getConnection(url, usuario, pass);
            System.out.println("Conexion exitosa");

        } catch (Exception e) {
            mensaje("Error de conexion" + e);
        }
        return conexion;
    }

    public void mostrarDatos() {
        Connection conexion = null;
        PreparedStatement ps;
        ResultSet rs;

        try {
            String aux[] = new String[4];
            String img[]=new String[4];
            int ban = 0;
            
            conexion = (Connection) DriverManager.getConnection(url, usuario, pass);
            String sql = "SELECT titulo,caratula FROM libro limit 4";
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();

             while (rs.next()) {
               
                String titulo = rs.getString("titulo");
                String caratula = rs.getString("caratula");
                aux[ban]=titulo;
                img[ban] = "src/Caratula/"+caratula;
                ban++;
                
            }
             ps.close();
             setImageLabel(jlReciente1, img[0]);
             setImageLabel(jlReciente2, img[1]);
             setImageLabel(jlReciente3, img[2]);
             setImageLabel(jlReciente4, img[3]);

            }catch (Exception e) {
            mensaje("error de conexion "+e);
        }
        }

    

    public void mensaje(String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jpBiblioteca = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jpCabecera = new javax.swing.JPanel();
        jllogo = new javax.swing.JLabel();
        txtBuscarLibro = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jpRecientes = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jlReciente1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jlrueba1 = new javax.swing.JLabel();
        btnprueba = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jlReciente2 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jlReciente3 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jlReciente4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnLibros = new javax.swing.JButton();
        btnInfantil = new javax.swing.JButton();
        btnComic = new javax.swing.JButton();
        btnRecoemndados = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();

        jpBiblioteca.setBorder(javax.swing.BorderFactory.createTitledBorder("botones"));
        jpBiblioteca.setPreferredSize(new java.awt.Dimension(122, 100));

        jMenuItem1.setText("jMenuItem1");
        jpBiblioteca.add(jMenuItem1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("BOOK_EAS");
        setBackground(new java.awt.Color(204, 204, 255));
        setFocusCycleRoot(false);
        setFocusTraversalPolicyProvider(true);

        jpCabecera.setBackground(new java.awt.Color(204, 204, 255));
        jpCabecera.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 102), 1, true));
        jpCabecera.setLayout(new java.awt.GridBagLayout());

        jllogo.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jllogo.setForeground(new java.awt.Color(0, 0, 0));
        jllogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo.png"))); // NOI18N
        jllogo.setText("BOOKS_EAS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 9, 0, 9);
        jpCabecera.add(jllogo, gridBagConstraints);

        txtBuscarLibro.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        txtBuscarLibro.setForeground(new java.awt.Color(204, 204, 255));
        txtBuscarLibro.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtBuscarLibro.setText("Ingrese Libro A Buscar");
        txtBuscarLibro.setToolTipText("");
        txtBuscarLibro.setBorder(null);
        txtBuscarLibro.setName(""); // NOI18N
        txtBuscarLibro.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtBuscarLibroFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtBuscarLibroFocusLost(evt);
            }
        });
        txtBuscarLibro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarLibroActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 14;
        gridBagConstraints.weightx = 1.3;
        gridBagConstraints.insets = new java.awt.Insets(0, 9, 0, 9);
        jpCabecera.add(txtBuscarLibro, gridBagConstraints);

        jButton8.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        jButton8.setText("Buscar");
        jButton8.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(0, 9, 0, 9);
        jpCabecera.add(jButton8, gridBagConstraints);

        jButton9.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jButton9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login.png"))); // NOI18N
        jButton9.setText("Ingresar");
        jButton9.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 5;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(0, 9, 0, 9);
        jpCabecera.add(jButton9, gridBagConstraints);

        jButton10.setBackground(new java.awt.Color(0, 102, 153));
        jButton10.setFont(new java.awt.Font("Leelawadee UI Semilight", 1, 14)); // NOI18N
        jButton10.setForeground(new java.awt.Color(255, 255, 255));
        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/registro.png"))); // NOI18N
        jButton10.setText("Registrarse");
        jButton10.setBorder(null);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 6;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.ipadx = 4;
        gridBagConstraints.ipady = 12;
        gridBagConstraints.weightx = 0.3;
        gridBagConstraints.insets = new java.awt.Insets(0, 9, 0, 9);
        jpCabecera.add(jButton10, gridBagConstraints);
        jButton10.getAccessibleContext().setAccessibleDescription("");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "MAS COMUNES", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 14), new java.awt.Color(51, 0, 102))); // NOI18N
        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jLabel8.setBackground(new java.awt.Color(255, 0, 102));
        jLabel8.setText("jLabel8");
        jPanel2.add(jLabel8);

        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5);

        jLabel6.setText("jLabel6");
        jPanel2.add(jLabel6);

        jLabel7.setText("jLabel7");
        jPanel2.add(jLabel7);

        jpRecientes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "AGREGADOS RECIENTE", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI Black", 1, 14), new java.awt.Color(51, 0, 102))); // NOI18N
        jpRecientes.setLayout(new java.awt.GridLayout(1, 0));

        jlReciente1.setText("jLabel1");

        jPanel3.setLayout(new java.awt.CardLayout());

        jlrueba1.setText("jLabel1");
        jlrueba1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlrueba1MouseEntered(evt);
            }
        });
        jPanel3.add(jlrueba1, "card2");

        btnprueba.setText("jButton1");
        btnprueba.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnpruebaMouseExited(evt);
            }
        });
        jPanel3.add(btnprueba, "card3");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlReciente1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jlReciente1, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                .addGap(4, 4, 4))
        );

        jpRecientes.add(jPanel4);

        jlReciente2.setText("jLabel1");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlReciente2, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlReciente2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpRecientes.add(jPanel7);

        jlReciente3.setText("jLabel1");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlReciente3, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlReciente3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jpRecientes.add(jPanel8);

        jlReciente4.setText("jLabel1");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlReciente4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(128, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlReciente4, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        jpRecientes.add(jPanel9);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 2, 0));

        btnLibros.setBackground(new java.awt.Color(204, 204, 255));
        btnLibros.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnLibros.setForeground(new java.awt.Color(0, 51, 51));
        btnLibros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/biblioteca.png"))); // NOI18N
        btnLibros.setText("Libros");
        btnLibros.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 51), 1, true));
        btnLibros.setPreferredSize(new java.awt.Dimension(45, 40));
        btnLibros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLibrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLibrosMouseExited(evt);
            }
        });
        jPanel1.add(btnLibros);

        btnInfantil.setBackground(new java.awt.Color(204, 204, 255));
        btnInfantil.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnInfantil.setForeground(new java.awt.Color(0, 51, 51));
        btnInfantil.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/libros.png"))); // NOI18N
        btnInfantil.setText("Infantil");
        btnInfantil.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 51), 1, true));
        btnInfantil.setPreferredSize(new java.awt.Dimension(45, 40));
        jPanel1.add(btnInfantil);

        btnComic.setBackground(new java.awt.Color(204, 204, 255));
        btnComic.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnComic.setForeground(new java.awt.Color(0, 51, 51));
        btnComic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/biblioteca.png"))); // NOI18N
        btnComic.setText("Comic Y Manga");
        btnComic.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 51), 1, true));
        btnComic.setPreferredSize(new java.awt.Dimension(45, 40));
        jPanel1.add(btnComic);

        btnRecoemndados.setBackground(new java.awt.Color(204, 204, 255));
        btnRecoemndados.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        btnRecoemndados.setForeground(new java.awt.Color(0, 51, 51));
        btnRecoemndados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/biblioteca.png"))); // NOI18N
        btnRecoemndados.setText("Recomendados");
        btnRecoemndados.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 51), 1, true));
        btnRecoemndados.setPreferredSize(new java.awt.Dimension(45, 40));
        jPanel1.add(btnRecoemndados);

        jButton5.setBackground(new java.awt.Color(204, 204, 255));
        jButton5.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 51, 51));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/biblioteca.png"))); // NOI18N
        jButton5.setText("My Biblioteca");
        jButton5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 51), 1, true));
        jButton5.setPreferredSize(new java.awt.Dimension(45, 40));
        jPanel1.add(jButton5);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpCabecera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpRecientes, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpCabecera, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jpRecientes, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarLibroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarLibroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBuscarLibroActionPerformed

    private void txtBuscarLibroFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarLibroFocusGained
        if (txtBuscarLibro.getText().equals("Ingrese Libro A Buscar")) {
            txtBuscarLibro.setText("");
            txtBuscarLibro.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtBuscarLibroFocusGained

    private void txtBuscarLibroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtBuscarLibroFocusLost

        txtBuscarLibro.setText("Ingrese Libro A Buscar");
        txtBuscarLibro.setForeground(new Color(204, 204, 255));

    }//GEN-LAST:event_txtBuscarLibroFocusLost

    private void btnLibrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibrosMouseEntered
       btnLibros.setBackground(Color.GREEN);
       Point p = btnLibros.getLocationOnScreen();
       
       generos genero = new generos("Libros");
       genero.setLocation(p);
       genero.setVisible(true);
       
    }//GEN-LAST:event_btnLibrosMouseEntered

    private void btnLibrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLibrosMouseExited
        btnLibros.setBackground(new Color(203, 203, 255));
        
        
    }//GEN-LAST:event_btnLibrosMouseExited

    private void jlrueba1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlrueba1MouseEntered
        jlrueba1.setVisible(false);
        btnprueba.setVisible(true);
    }//GEN-LAST:event_jlrueba1MouseEntered

    private void btnpruebaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpruebaMouseExited
        jlrueba1.setVisible(true);
        btnprueba.setVisible(false);
    }//GEN-LAST:event_btnpruebaMouseExited

    
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
            java.util.logging.Logger.getLogger(libreriaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(libreriaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(libreriaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(libreriaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new libreriaPrincipal().setVisible(true);
            }
        });
    }

    private void setImageLabel(JLabel jlLogo, String ruta) {

        ImageIcon image = new ImageIcon(ruta);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(jlLogo.getWidth(), jlLogo.getHeight(), Image.SCALE_DEFAULT));
        jlLogo.setIcon(icon);
        this.repaint();

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnComic;
    private javax.swing.JButton btnInfantil;
    private javax.swing.JButton btnLibros;
    private javax.swing.JButton btnRecoemndados;
    private javax.swing.JButton btnprueba;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel jlReciente1;
    private javax.swing.JLabel jlReciente2;
    private javax.swing.JLabel jlReciente3;
    private javax.swing.JLabel jlReciente4;
    private javax.swing.JLabel jllogo;
    private javax.swing.JLabel jlrueba1;
    private javax.swing.JPopupMenu jpBiblioteca;
    private javax.swing.JPanel jpCabecera;
    private javax.swing.JPanel jpRecientes;
    private javax.swing.JTextField txtBuscarLibro;
    // End of variables declaration//GEN-END:variables


}
