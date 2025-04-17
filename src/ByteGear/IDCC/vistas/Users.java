/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ByteGear.IDCC.vistas;


import ByteGear.BIDCC.principal.Pantalla2;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author josem
 */
public class Users extends javax.swing.JPanel {

    /**
     * Creates new form Principal
     */
    public Users() {
        initComponents();
        LoadUsers();
    }
     private void LoadUsers() {
      
    }
   
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        userSearch = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Borrar = new javax.swing.JButton();
        Editar = new javax.swing.JButton();
        Nuevo = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 0, 0));

        BG.setBackground(new java.awt.Color(255, 255, 255));
        BG.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        title.setForeground(new java.awt.Color(0, 0, 0));
        title.setText("Usuarios");
        BG.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 200, 40));

        userSearch.setForeground(new java.awt.Color(0, 0, 0));
        userSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                userSearchMousePressed(evt);
            }
        });
        userSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userSearchActionPerformed(evt);
            }
        });
        BG.add(userSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 579, 30));

        searchButton.setBackground(new java.awt.Color(0, 76, 225));
        searchButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Buscar");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });
        BG.add(searchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 115, 30));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido Paterno", "Apellido Materno", "Carrera"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        BG.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 700, 310));

        Borrar.setBackground(new java.awt.Color(0, 76, 225));
        Borrar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Borrar.setForeground(new java.awt.Color(255, 255, 255));
        Borrar.setText("Borrar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });
        BG.add(Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, -1, -1));

        Editar.setBackground(new java.awt.Color(0, 76, 225));
        Editar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Editar.setForeground(new java.awt.Color(255, 255, 255));
        Editar.setText("Editar");
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });
        BG.add(Editar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        Nuevo.setBackground(new java.awt.Color(0, 76, 225));
        Nuevo.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Nuevo.setForeground(new java.awt.Color(255, 255, 255));
        Nuevo.setText("Nuevo");
        Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NuevoActionPerformed(evt);
            }
        });
        BG.add(Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, 829, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void userSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userSearchActionPerformed

    }//GEN-LAST:event_userSearchActionPerformed

    private void userSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userSearchMousePressed

    }//GEN-LAST:event_userSearchMousePressed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
       
    }//GEN-LAST:event_EditarActionPerformed

    private void NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NuevoActionPerformed
        Pantalla2.ShowJPanel(new UpUsers());
    }//GEN-LAST:event_NuevoActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
           
    }//GEN-LAST:event_searchButtonActionPerformed

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed
       
    }//GEN-LAST:event_BorrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JButton Borrar;
    private javax.swing.JButton Editar;
    private javax.swing.JButton Nuevo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel title;
    private javax.swing.JTextField userSearch;
    // End of variables declaration//GEN-END:variables
}
