package ContenidoB;

import java.io.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author crist
 */
public class JPOpciones extends javax.swing.JPanel {
    ConexionDB baseDatos = new ConexionDB("PFEquipo1", "Kano", "Royalzkano01");
    Connection con;
    Statement st;
    ResultSet rs;
    DefaultTableModel modeloBitacora;
    /**
     * Creates new form JPOpciones
     */
    public JPOpciones() {
        initComponents();
        consultaInicialBA();
    }
    
    void limpiarTabla() {
        for (int i = 0; i < jTBitacoraA.getRowCount(); i++) {
            modeloBitacora.removeRow(i);
            i = i - 1;
        }
    }
    
    public void consultaInicialBA(){
        try {
            String consultaE = "SELECT * FROM bAcceso";
            if (baseDatos.conectar()) {
                st = baseDatos.con.createStatement();
                rs = st.executeQuery(consultaE);

                Object[] bitacoras = new Object[7];
                modeloBitacora = (DefaultTableModel) jTBitacoraA.getModel();
                while (rs.next()) {
                    bitacoras[0] = rs.getInt("id");
                    bitacoras[1] = rs.getString("usuario");
                    bitacoras[2] = rs.getString("fecha");
                    bitacoras[3] = rs.getString("operacion");
                    bitacoras[4] = rs.getString("tabla");
                    bitacoras[5] = rs.getString("valorViejo");
                    bitacoras[6] = rs.getString("valorNuevo");
                    modeloBitacora.addRow(bitacoras);
                }
                jTBitacoraA.setModel(modeloBitacora);
            }
        }catch(Exception e){
            System.out.println("El error es: "+e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jBRespaldar = new javax.swing.JButton();
        jBRestaurar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTBitacoraA = new javax.swing.JTable();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel15.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel15.setText("Bitácora de Accesos:");

        jLabel21.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jLabel21.setText("Respaldo de la BD:");

        jBRespaldar.setBackground(new java.awt.Color(34, 18, 81));
        jBRespaldar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jBRespaldar.setForeground(new java.awt.Color(255, 255, 255));
        jBRespaldar.setText("RESPALDAR");
        jBRespaldar.setBorderPainted(false);
        jBRespaldar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBRespaldar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRespaldarActionPerformed(evt);
            }
        });

        jBRestaurar.setBackground(new java.awt.Color(34, 18, 81));
        jBRestaurar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        jBRestaurar.setForeground(new java.awt.Color(255, 255, 255));
        jBRestaurar.setText("RESTAURAR");
        jBRestaurar.setBorderPainted(false);
        jBRestaurar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRestaurarActionPerformed(evt);
            }
        });

        jTBitacoraA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Usuario", "Fecha", "Operacion", "Tabla", "Valor Viejo", "Valor Nuevo"
            }
        ));
        jTBitacoraA.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane1.setViewportView(jTBitacoraA);
        if (jTBitacoraA.getColumnModel().getColumnCount() > 0) {
            jTBitacoraA.getColumnModel().getColumn(1).setMinWidth(150);
            jTBitacoraA.getColumnModel().getColumn(1).setMaxWidth(200);
            jTBitacoraA.getColumnModel().getColumn(2).setMinWidth(150);
            jTBitacoraA.getColumnModel().getColumn(2).setMaxWidth(200);
            jTBitacoraA.getColumnModel().getColumn(5).setMinWidth(350);
            jTBitacoraA.getColumnModel().getColumn(5).setMaxWidth(400);
            jTBitacoraA.getColumnModel().getColumn(6).setMinWidth(350);
            jTBitacoraA.getColumnModel().getColumn(6).setMaxWidth(400);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 367, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jBRespaldar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBRestaurar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 648, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jLabel21)
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBRespaldar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBRestaurar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBRespaldarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRespaldarActionPerformed
        try {
            String usuario = "Kano";
            String contraseña = "Royalzkano01";
            String nombreBD = "PFEquipo1";
            String rutaRespaldo = "C:/Respaldos/PFEquipo1Respaldo.sql";

            Process proceso = Runtime.getRuntime().exec("mysqldump -u " + usuario + " -p" + contraseña + " " + nombreBD);
            InputStream entrada = proceso.getInputStream();

            FileOutputStream archivo = new FileOutputStream(rutaRespaldo);

            byte[] buffer = new byte[1000];

            int byteLeido = entrada.read(buffer);

            while (byteLeido > 0) { // Mientras esté leyendo algo
                archivo.write(buffer, 0, byteLeido);
                byteLeido = entrada.read(buffer);
            }

            JOptionPane.showMessageDialog(null, "Respaldo Creado");
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Error al crear el respaldo: " + ex.getMessage());
        } 
    }//GEN-LAST:event_jBRespaldarActionPerformed

    private void jBRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRestaurarActionPerformed
        try {
        String usuario = "Kano";
        String contraseña = "Royalzkano01";
        String nombreBD = "PFEquipo1";
        String rutaRespaldo = "C:/Respaldos/PFEquipo1Respaldo.sql";

        Process proceso = Runtime.getRuntime().exec("mysql -u " + usuario + " -p" + contraseña + " " + nombreBD);
        OutputStream salida = proceso.getOutputStream();

        FileInputStream archivo = new FileInputStream(rutaRespaldo);

        byte[] buffer = new byte[1000];

        int byteLeido = archivo.read(buffer);

        while (byteLeido > 0) {
            salida.write(buffer, 0, byteLeido);
            byteLeido = archivo.read(buffer);
        }
        
        JOptionPane.showMessageDialog(null, "Rstauracion Finalizada");
        salida.flush(); // Vaciar el buffer de salida
    } catch (IOException ex) {
        JOptionPane.showMessageDialog(null, "Error al restaurar el respaldo: " + ex.getMessage());
    }
    }//GEN-LAST:event_jBRestaurarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBRespaldar;
    private javax.swing.JButton jBRestaurar;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTBitacoraA;
    // End of variables declaration//GEN-END:variables
}
