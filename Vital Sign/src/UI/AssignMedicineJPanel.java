/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Medicine;
import Model.Application;
import Model.Observation;
import java.util.ArrayList;

/**
 *
 * @author tianshiyun
 */
public class AssignMedicineJPanel extends javax.swing.JPanel {
    
    Application application;
    Observation observation;

    /**
     * Creates new form AssignMedicine
     */
    public AssignMedicineJPanel() {
        initComponents();
    }

    
     public AssignMedicineJPanel(Application application) {
        initComponents();
        this.application = application;
        this.observation = observation;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        medicineBox = new javax.swing.JComboBox<>();
        assignMedicineButton = new javax.swing.JButton();
        ObservationBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        medicineBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineBoxActionPerformed(evt);
            }
        });

        assignMedicineButton.setText("ASSIGN");
        assignMedicineButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignMedicineButtonActionPerformed(evt);
            }
        });

        ObservationBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ObservationBoxItemStateChanged(evt);
            }
        });

        jLabel1.setText("jLabel1");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(medicineBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 266, Short.MAX_VALUE)
                .addComponent(ObservationBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(assignMedicineButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicineBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ObservationBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(assignMedicineButton)
                .addGap(85, 85, 85)
                .addComponent(jLabel1)
                .addContainerGap(237, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void medicineBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicineBoxActionPerformed

    private void assignMedicineButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignMedicineButtonActionPerformed
        Observation o = (Observation) ObservationBox.getSelectedItem();
        Medicine m  = (Medicine) medicineBox.getSelectedItem();
        o.setMedication(m);
        
        

        // TODO add your handling code here:
    }//GEN-LAST:event_assignMedicineButtonActionPerformed

    private void ObservationBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ObservationBoxItemStateChanged
        Observation o = (Observation) ObservationBox.getSelectedItem();
        if(o.getMedication() != null){
            jLabel1.setText(o.getMedication().getMedicineName());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_ObservationBoxItemStateChanged

    
    public void populateDropdowns(){
        ArrayList<Medicine> medicines = this.application.getCatalog().getMedicineList();
        ArrayList<Observation> observations = this.application.getHistory().getVitalSignHistory();
        for(Observation o : observations){
            ObservationBox.addItem(o.toString());
            
        }
        
        for(Medicine med:medicines){
            medicineBox.addItem(med.toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ObservationBox;
    private javax.swing.JButton assignMedicineButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox<String> medicineBox;
    // End of variables declaration//GEN-END:variables
}