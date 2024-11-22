package Vista;
import Controlador.Banco;
import Modelo.Cuenta;
import Modelo.Titular;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;

public class frmPrincipal extends javax.swing.JFrame {
    //variables y objetos globales
    Banco objBanco;
    int posTitular=-1;
    
    public frmPrincipal() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNit = new javax.swing.JTextField();
        txtRazonSocial = new javax.swing.JTextField();
        btnCrearB = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtDocumento = new javax.swing.JTextField();
        txtNombres = new javax.swing.JTextField();
        txtApellidos = new javax.swing.JTextField();
        cbxGenero = new javax.swing.JComboBox<>();
        txtDireccion = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        txtFechaNacimiento = new javax.swing.JFormattedTextField();
        cbxTipo = new javax.swing.JComboBox<>();
        btnCrearT = new javax.swing.JButton();
        btnBuscarT = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        cbxTipoC = new javax.swing.JComboBox<>();
        cbxTitular = new javax.swing.JComboBox<>();
        txtFechaApertura = new javax.swing.JFormattedTextField();
        txtSaldo = new javax.swing.JTextField();
        txtClave = new javax.swing.JTextField();
        txtClaveDinamica = new javax.swing.JTextField();
        btnCrearC = new javax.swing.JButton();
        btnBuscarC = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setEnabled(false);
        jTabbedPane1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseDragged(evt);
            }
        });
        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jLabel1.setText("Nit");

        jLabel2.setText("Razon Social");

        btnCrearB.setText("Crear");
        btnCrearB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCrearB)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNit)
                        .addComponent(txtRazonSocial, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                .addContainerGap(434, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(txtNit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtRazonSocial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(btnCrearB)
                .addContainerGap(291, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Banco", jPanel1);

        jLabel3.setText("Documento");

        jLabel4.setText("Nombres");

        jLabel5.setText("Apellidos");

        jLabel6.setText("Genero");

        jLabel7.setText("Direccion");

        jLabel8.setText("Celular");

        jLabel9.setText("Correo");

        jLabel10.setText("Fecha Nacimiento");

        jLabel11.setText("Tipo");

        cbxGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Femenino", "Masculino", "Otros" }));

        try {
            txtFechaNacimiento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cbxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "VIP", "Referido", "Empresarial", "Basico" }));

        btnCrearT.setText("Crear");
        btnCrearT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearTActionPerformed(evt);
            }
        });

        btnBuscarT.setText("Buscar");
        btnBuscarT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarTActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnCrearT)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarT))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtDocumento)
                        .addComponent(txtNombres)
                        .addComponent(txtApellidos)
                        .addComponent(cbxGenero, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtDireccion)
                        .addComponent(txtCelular)
                        .addComponent(txtCorreo)
                        .addComponent(txtFechaNacimiento)
                        .addComponent(cbxTipo, 0, 218, Short.MAX_VALUE)))
                .addContainerGap(417, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel3)
                                            .addComponent(txtDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4))
                                    .addComponent(txtNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addComponent(txtApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cbxGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearT)
                    .addComponent(btnBuscarT))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Titulares", jPanel2);

        jLabel12.setText("Numero");

        jLabel13.setText("Tipo");

        jLabel14.setText("Titular");

        jLabel15.setText("Fecha Apertura");

        jLabel16.setText("Saldo");

        jLabel17.setText("Clave");

        jLabel18.setText("Clave Dinamica");

        cbxTipoC.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "AFC", "Ahorros", "Corriente", "Nomina" }));

        cbxTitular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxTitularActionPerformed(evt);
            }
        });

        try {
            txtFechaApertura.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##-##-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnCrearC.setText("Crear");
        btnCrearC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearCActionPerformed(evt);
            }
        });

        btnBuscarC.setText("Buscar");
        btnBuscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCrearC)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscarC))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNumero)
                        .addComponent(cbxTipoC, 0, 228, Short.MAX_VALUE)
                        .addComponent(cbxTitular, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtFechaApertura)
                        .addComponent(txtSaldo)
                        .addComponent(txtClave)
                        .addComponent(txtClaveDinamica)))
                .addContainerGap(386, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(cbxTipoC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(cbxTitular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtFechaApertura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(txtClaveDinamica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrearC)
                    .addComponent(btnBuscarC))
                .addContainerGap(111, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Cuentas", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCrearBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearBActionPerformed
        // TODO add your handling code here:
        crearBanco();
    }//GEN-LAST:event_btnCrearBActionPerformed

    private void btnCrearTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearTActionPerformed
        // TODO add your handling code here:
        crearTitular();
    }//GEN-LAST:event_btnCrearTActionPerformed

    private void btnCrearCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearCActionPerformed
        // TODO add your handling code here:
        crearCuenta();
    }//GEN-LAST:event_btnCrearCActionPerformed
    
    private void crearCuenta(){
        LocalDate fecha= LocalDate.now();
        String[] x= txtFechaApertura.getText().split("-");
        fecha= LocalDate.of(Integer.parseInt(x[2]), Integer.parseInt(x[1]), 
                Integer.parseInt(x[0]));
        
        Titular tit=objBanco.buscarCliente(objBanco.getClientes().get(posTitular).getDocumento());
        
        //JOptionPane.showMessageDialog(this, (tit.getDocumento()+" "+tit.getNombres()+" "+tit.getApellidos()));
        
        Cuenta objCuenta= new Cuenta(txtNumero.getText(), ""+cbxTipoC.getSelectedItem(), 
               tit,fecha,  Double.parseDouble(txtSaldo.getText()), 
               txtClave.getText(), txtClaveDinamica.getText());
        
        boolean exito= objBanco.addCuenta(objCuenta);
        if(exito){
            JOptionPane.showMessageDialog(this, "la cuenta ha sido almacenada...");
            limpiarCuenta();
        }else{
            JOptionPane.showMessageDialog(this, "Error al crear la cuente");
        }
    }
    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        // TODO add your handling code here:
        llenarTitular();
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jTabbedPane1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_jTabbedPane1MouseDragged

    private void cbxTitularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxTitularActionPerformed
        // TODO add your handling code here:
        posTitular= cbxTitular.getSelectedIndex();
    }//GEN-LAST:event_cbxTitularActionPerformed

    private void btnBuscarTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarTActionPerformed
        // TODO add your handling code here:
        buscarClienteView();
    }//GEN-LAST:event_btnBuscarTActionPerformed

    private void btnBuscarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCActionPerformed
        // TODO add your handling code here:
        buscarCuentaView();
    }//GEN-LAST:event_btnBuscarCActionPerformed
    private void limpiarCuenta(){
        txtNumero.setText("");
        txtSaldo.setText("");
        txtClave.setText("");
        txtClaveDinamica.setText("");
        cbxTipoC.setSelectedIndex(-1);
        cbxTitular.setSelectedIndex(-1);
        txtFechaApertura.setText("");
    }
    private void buscarCuentaView(){
        Cuenta objCta= objBanco.buscarCuenta(txtNumero.getText());
        if(objCta == null){
            JOptionPane.showMessageDialog(this, "La cuenta no existe...");
        }else{
            txtNumero.setText(objCta.getNumero());
            cbxTipoC.setSelectedItem(objCta.getTipo());
            cbxTitular.setSelectedItem(objCta.getTitular().getNombres()
                                       +" "+objCta.getTitular().getApellidos());
            txtSaldo.setText(""+objCta.getSaldo());
            txtClave.setText(objCta.getClave());
            txtClaveDinamica.setText(objCta.getClaveDinamica());
            txtFechaApertura.setText(formatearFeha(objCta.getFechaApertura()));
            //mostrar todos los datos del titular
            txtDocumento.setText(objCta.getTitular().getDocumento());
            txtNombres.setText(objCta.getTitular().getNombres());
            txtApellidos.setText(objCta.getTitular().getApellidos());
            cbxGenero.setSelectedItem(objCta.getTitular().getGenero());
            txtDireccion.setText(objCta.getTitular().getDireccion());
            txtCelular.setText(objCta.getTitular().getCelular());
            txtCorreo.setText(objCta.getTitular().getCorreo());
            cbxTipo.setSelectedItem(objCta.getTitular().getTipo());
            txtFechaNacimiento.setText( formatearFecha1(objCta.getTitular().getFechaNacimiento()));
            
        }
    
    }
    private String formatearFecha1(LocalDate f) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return f.format(formatter);
    }
    private String formatearFeha(LocalDate f){
        String fecha="";
        int a=0,m=0,d=0;
        String dS="",mS="",aS="";
        a=f.getYear();
        m=f.getMonthValue();
        d=f.getDayOfMonth();
        if(d<10){
            dS= String.valueOf(d);
            dS= "0"+dS;
        }else{
            dS= String.valueOf(d);
        }        
        if(m<10){
            mS= String.valueOf(m);
            mS= "0"+mS;
        }
        else{
            mS= String.valueOf(m);
        }        
        aS= String.valueOf(a);        
        fecha= dS+"-"+mS+"-"+aS;        
        return fecha;
    }
    private void buscarClienteView(){
        Titular objTitular= objBanco.buscarCliente(txtDocumento.getText());
        if(objTitular == null){
            JOptionPane.showMessageDialog(this, "El cliente no existe...");
        }else{
            txtDocumento.setText(objTitular.getDocumento());
            txtNombres.setText(objTitular.getNombres());
            txtApellidos.setText(objTitular.getApellidos());
            cbxGenero.setSelectedItem(objTitular.getGenero());
            txtDireccion.setText(objTitular.getDireccion());
            txtCorreo.setText(objTitular.getCorreo());
            txtCelular.setText(objTitular.getCelular());
            cbxTipo.setSelectedItem(objTitular.getTipo());            
            txtFechaNacimiento.setText( formatearFecha1(objTitular.getFechaNacimiento()));
           
        }
    }
    private void llenarTitular(){
        for(Titular t:objBanco.getClientes()){
            boolean ex= false;
            for(int i=0; i< cbxTitular.getItemCount();i++){
                String item= t.getNombres()+" "+t.getApellidos();
                if(item.equals(cbxTitular.getItemAt(i))){
                    ex=true;
                }
            }            
            if(!ex){
                cbxTitular.addItem(t.getNombres() + " " + t.getApellidos());
            }            
        }
    }
    private void crearTitular(){
        LocalDate fecha= LocalDate.now();
        String[] x= txtFechaNacimiento.getText().split("-");
        fecha= LocalDate.of(Integer.parseInt(x[2]), Integer.parseInt(x[1]), 
                Integer.parseInt(x[0]));
        
        Titular objTitular=new Titular(txtDocumento.getText(), txtNombres.getText(),
                txtApellidos.getText(), ""+cbxGenero.getSelectedItem(), txtDireccion.getText(),
                txtCelular.getText(),txtCorreo.getText(), fecha, ""+cbxTipo.getSelectedItem());
        
        boolean exito= objBanco.addCliente(objTitular);
        if(exito){
            JOptionPane.showMessageDialog(this, "El cliente ha sido almacenado...");
            limpiar();
        }else{
            JOptionPane.showMessageDialog(this, "Error al almacenar el cliente, posible duplicidad en el documento");
        }
    }
    private void limpiar(){
        txtApellidos.setText("");
        txtCelular.setText("");
        txtCorreo.setText("");
        txtDireccion.setText("");
        txtDocumento.setText("");
        txtFechaNacimiento.setText("");
        txtNombres.setText("");
        cbxGenero.setSelectedItem("Seleccionar");
        cbxTipo.setSelectedItem("Seleccionar");
    }
    
    private void crearBanco(){
        if(!txtNit.getText().isEmpty() && !txtRazonSocial.getText().isEmpty()){
            objBanco= new Banco(txtNit.getText(), txtRazonSocial.getText());
            //JOptionPane.showMessageDialog(this, (objBanco.getNit()+" "+objBanco.getRazonSocial()));
            JOptionPane.showMessageDialog(this,"El banco ha sido creado exitosamente");
            txtNit.setText("");
            txtRazonSocial.setText("");
            jTabbedPane1.enable(true);
        }else{
            JOptionPane.showMessageDialog(this, "Los campos Nit y Razon Social, se deben diligenciar");
        }   
    }
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
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarC;
    private javax.swing.JButton btnBuscarT;
    private javax.swing.JButton btnCrearB;
    private javax.swing.JButton btnCrearC;
    private javax.swing.JButton btnCrearT;
    private javax.swing.JComboBox<String> cbxGenero;
    private javax.swing.JComboBox<String> cbxTipo;
    private javax.swing.JComboBox<String> cbxTipoC;
    private javax.swing.JComboBox<String> cbxTitular;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtApellidos;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtClave;
    private javax.swing.JTextField txtClaveDinamica;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDocumento;
    private javax.swing.JFormattedTextField txtFechaApertura;
    private javax.swing.JFormattedTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombres;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRazonSocial;
    private javax.swing.JTextField txtSaldo;
    // End of variables declaration//GEN-END:variables
}
