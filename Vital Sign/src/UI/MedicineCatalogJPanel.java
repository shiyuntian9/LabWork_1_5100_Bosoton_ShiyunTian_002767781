/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Application;
import Model.Medicine;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import Model.MedicineCatalog;
import javax.swing.JOptionPane;

/**
 *
 * @author tianshiyun
 */
public class MedicineCatalogJPanel extends javax.swing.JPanel {

    
   
    
    Application application;
    DefaultTableModel medTableModel;
    /**
     * Creates new form MedicineCatalog
     */
    public MedicineCatalogJPanel() {
        initComponents();
    }
    
    MedicineCatalogJPanel (Application application){
        initComponents();
        this.application = application;
        this.medTableModel = (DefaultTableModel)medicineCatalogTable.getModel();
                
        
        displayMedicineCatalog();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        medicineCatalogTable = new javax.swing.JTable();
        name = new javax.swing.JTextField();
        dosage = new javax.swing.JTextField();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();

        medicineCatalogTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Name", "Dosage"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(medicineCatalogTable);

        name.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameFocusLost(evt);
            }
        });

        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dosage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 221, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(delete)
                .addGap(166, 166, 166))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55)
                        .addComponent(dosage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(add)))
                .addGap(74, 74, 74)
                .addComponent(delete)
                .addContainerGap(176, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        String nameS = name.getText();
        String dosageS = dosage.getText();
        MedicineCatalog catalog = this.application.getCatalog();
        catalog.creatMedicine(nameS, Double.valueOf(dosageS));
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_addActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int selectedRow = medicineCatalogTable.getSelectedRow();
        if(selectedRow >=0){
            Medicine medicine = (Medicine)medicineCatalogTable.getValueAt(selectedRow,0);
            this.application.getCatalog().removeMedicine(medicine.getMedicineName());
            displayMedicineCatalog();
        }else{
            
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_deleteActionPerformed

    private void nameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameFocusLost
        String nameS2 = name.getText();
        Boolean isUnique = this.application.getCatalog().checkIfMedicineUnique(nameS2);
        if(isUnique){
            
        }else{
            name.setText("");
            JOptionPane.showMessageDialog(null, "Medicine already exists!");
        }// TODO add your handling code here:
    }//GEN-LAST:event_nameFocusLost

    
    public void displayMedicineCatalog(){
        ArrayList<Medicine> medicines = this.application.getCatalog().getMedicineList();
        if(medicines.size()>0){
            medTableModel.setRowCount(0);
            for(Medicine med:medicines){
                Object row[] = new Object[2];
                row[0] = med;
                row[1] = med.getDosage();
                medTableModel.addRow(row);
            }
        }
    }
    
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton delete;
    private javax.swing.JTextField dosage;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable medicineCatalogTable;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}
