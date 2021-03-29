package hotf;


public class hotfgui extends javax.swing.JFrame {

    public hotfgui() {
        
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGenerate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPrint = new javax.swing.JTextArea();
        sdrQuantity = new javax.swing.JComboBox<>();
        btnClear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCustom = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnGenerate.setText("Generate");
        btnGenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerateActionPerformed(evt);
            }
        });

        txtPrint.setColumns(20);
        txtPrint.setRows(5);
        jScrollPane1.setViewportView(txtPrint);

        sdrQuantity.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "5", "10", "15", "20", "25", "50", "100" }));

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("Smart Home Appliance Generator");

        btnCustom.setText("Custom");
        btnCustom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomActionPerformed(evt);
            }
        });

        jLabel2.setText("Generate Appliances -");

        jLabel3.setText("N.O Appliances? -");

        jLabel4.setText("Custom Appliance -");

        jLabel5.setText("Clear Output -");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(sdrQuantity, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCustom, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnGenerate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnClear, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 505, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGenerate)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(sdrQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCustom)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnClear)
                            .addComponent(jLabel5))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerateActionPerformed
        
        txtPrint.setText(null); /* Clears the content from txtPrint */
        
        String QuanCombo = sdrQuantity.getSelectedItem().toString(); /* Stores combo box selection as a string */
        
        int QuanBtn = Integer.parseInt(QuanCombo); /* Converts string to an integer */
        
        int count = 0; /* Assigning the value 0 to the count variable */    
        
    while (count < QuanBtn) { /* Start of while loop */
    
    Home.HomeVar(); /* Calling method HomeVar from Home class */
    
    
        if (Home.indicator == "TV"){ 
    
        /* Start of TV code block */
       
            count ++; /* Increase the value of count by one */

            TV LG = new TV(TV.brand); /* Creating a new object */
      
            TV.TVVar(); /* Calling the TVVar() method from the TV class */                        

            txtPrint.append(LG.getName() + " is located in the " + TV.location + " and uses " + TV.energyused + " units of energy per hour. \n  "); /* Prints an output to the users screen. */

           
                          
        } else if (Home.indicator == "Microwave") {

            /* Start of Microwave code block */

            count ++; /* Increase the value of count by one */

            Microwave Samsung = new Microwave(Microwave.brand); /* Creating a new object */
           
            Microwave.MicrowaveVar(); /* Calling the MicrowaveVar() method from the Microwave class */
                        
            txtPrint.append(Samsung.getName() + " is located in the " + Microwave.location + " and uses " + Microwave.energyused + " units of energy per hour. \n  "); /* Prints an output to the users screen. */

            
                        
        } else if (Home.indicator == "Refrigirator") {

            /* Start of Refrigirator code block */

            count ++; /* Increase the value of count by one */

            Refrigirator KitchenAid = new Refrigirator(Refrigirator.brand); /* Creating a new object */
            
            Refrigirator.RefrigiratorVar(); /* Calling the RefrigiratorVar() method from the Refrigirator class */            

            txtPrint.append(KitchenAid.getName() + " is located in the " + Refrigirator.location + " and uses " + Refrigirator.energyused + " units of energy per hour. \n  "); /* Prints an output to the users screen. */

                                   
        } else if (Home.indicator == "Speakers") {

            /* Start of Speakers code block */

            count ++; /* Increase the value of count by one */

            Speakers Bose = new Speakers(Speakers.brand); /* Creating a new object */           

            Speakers.SpeakersVar(); /* Calling the SpeakersVar() method from the Speakers class */
           
            txtPrint.append(Bose.getName() + " is located in the " + Speakers.location + " and uses " + Speakers.energyused + " units of energy per hour. \n  "); /* Prints an output to the users screen. */

                                    
        } else if (Home.indicator == "HeatingAircon") {

            /* Start of Heating/Aircon code block */ 

            count ++; /* Increase the value of count by one */

            HeatingAircon Aircool = new HeatingAircon(HeatingAircon.brand); /* Creating a new object */
            
            HeatingAircon.HeatingAirconVar(); /* Calling the HeatingAirconVar() method from the HeatingAircon class */            

            txtPrint.append(Aircool.getName() + " is located in the " + HeatingAircon.location + " and uses " + HeatingAircon.energyused + " units of energy per hour. \n "); /* Prints an output to the users screen. */
           
        }
        
    }
    
    }//GEN-LAST:event_btnGenerateActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        
        txtPrint.setText(null); /* Clears the content from txtPrint */
        
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCustomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomActionPerformed
        
        hotfcustom custom =new hotfcustom(); /* Creates a new JFrame object */
        
        custom.setVisible(true); /* Sets object to become visible */
        
        dispose(); /* Clears current JFrame from screen */
        
    }//GEN-LAST:event_btnCustomActionPerformed

 
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
            java.util.logging.Logger.getLogger(hotfgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(hotfgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(hotfgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(hotfgui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            public void run() {
                
                new hotfgui().setVisible(true);
                
            }
            
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCustom;
    private javax.swing.JButton btnGenerate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> sdrQuantity;
    private javax.swing.JTextArea txtPrint;
    // End of variables declaration//GEN-END:variables
}
