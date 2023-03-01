/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import java.awt.GridLayout;
import java.awt.Color.*;
import java.awt.Dimension;
import java.awt.Point;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import modelo.conexion;

public class generos extends javax.swing.JFrame {

    conexion con = new conexion();
    Dimension d;
    Point p;

    public generos(String titulo) {

        initComponents();
        mostrarDatos(titulo);
        d = jpGeneros.getSize();
        p = jpGeneros.getLocation();
    }

    public void mostrarDatos(String titulo) {
        Border bor = new TitledBorder(titulo);
        jpGeneros.setBorder(bor);
        PreparedStatement ps;
        ResultSet rs;

        try {
            ArrayList<String> lista = new ArrayList<String>();

            Connection conexion = con.getConnection();
            String sql = "SELECT Nombre_Sup FROM categoria_superior";
            ps = conexion.prepareStatement(sql);
            rs = ps.executeQuery();
            String label = "JLCategoria";

            while (rs.next()) {
                //String titulo = rs.getString("titulo");
                String caratula = rs.getString("Nombre_Sup");
                //aux[ban]=titulo;
                lista.add(caratula);

            }
            for (int i = 0; i < lista.size(); i++) {
                jpGeneros.setLayout(new GridLayout(lista.size(), 0));
                JLabel Jlcategoria = new JLabel();
                Jlcategoria.setBackground(new java.awt.Color(255, 204, 153));
                Jlcategoria.setFont(new java.awt.Font("Tahoma", 1, 14));
                Jlcategoria.setForeground(new java.awt.Color(0, 102, 51));
                Jlcategoria.setText(lista.get(i));

                Jlcategoria.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseEntered(java.awt.event.MouseEvent evt) {
                        MouseCategoria(evt);
                    }
                });
                jpGeneros.add(Jlcategoria);

            }

            ps.close();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "error " + e);
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpGeneros = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("libros");
        setUndecorated(true);
        setType(java.awt.Window.Type.POPUP);

        jpGeneros.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 153, 0)), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 153, 0))); // NOI18N

        javax.swing.GroupLayout jpGenerosLayout = new javax.swing.GroupLayout(jpGeneros);
        jpGeneros.setLayout(jpGenerosLayout);
        jpGenerosLayout.setHorizontalGroup(
            jpGenerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 181, Short.MAX_VALUE)
        );
        jpGenerosLayout.setVerticalGroup(
            jpGenerosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 273, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpGeneros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpGeneros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MouseCategoria(java.awt.event.MouseEvent evt) {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 0));
        
        
        panel.setSize(d);
        panel.setLocation(p.x+d.width, p.y);
        panel.setVisible(true);
        add(panel);
        panel.add(new JLabel("FFFFffffffffffffffffff"));
        this.setSize(d.width*2,d.height);
        this.setVisible(true);
        //Point p = this.getLocationOnScreen();
        //Dimension d = this.getSize();
       // generos2 nueva = new generos2();
        
        //nueva.setLocation(p.x+d.width, p.y);
        
       // nueva.setVisible(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jpGeneros;
    // End of variables declaration//GEN-END:variables
}
