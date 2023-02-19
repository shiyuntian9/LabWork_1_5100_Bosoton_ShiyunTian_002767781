/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;

import Model.Business;
import Model.Insurance;
import Model.Owner;
import Model.Pet;
import Model.Vaccination;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tianshiyun
 */
public class UpdateJPanel extends javax.swing.JPanel {
    Business business;
    DefaultTableModel viewTableModel;
    Owner owner = new Owner();
    
    /**
     * Creates new form UpdateJPanel
     */
    public UpdateJPanel() {
        initComponents();
    }
    public UpdateJPanel(Business business) {
        initComponents();
        this.business = business;
        this.viewTableModel = (DefaultTableModel) jTable1.getModel();
        this.owner = owner;
        
        for(Insurance ins:business.getInsurancePlan()){
            insuranceBox.addItem(ins.getName());
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

        jLabel5 = new javax.swing.JLabel();
        petName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        petAge = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        petGender = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        breed = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        courseCompleted = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        applicationID = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        firstName = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        lastName = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        vaccineNameBox = new javax.swing.JComboBox<>();
        insuranceBox = new javax.swing.JComboBox<>();
        update = new javax.swing.JButton();
        addVaccineText = new javax.swing.JTextField();
        addVaccinationButton = new javax.swing.JButton();
        editVaccine = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        petType = new javax.swing.JTextField();

        jLabel5.setText("Pet Name");

        jLabel6.setText("Pet Age");

        jLabel7.setText("Pet Gender");

        jLabel8.setText("Breed");

        jLabel9.setText("Vaccine Name");

        jLabel10.setText("Course Completed (ture/false)");

        jLabel11.setText("Insurance Plan");

        jLabel1.setText("Application ID");

        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("First Name");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "First Name", "Last Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setText("Last Name");

        jLabel4.setText("Application Date");

        jButton2.setText("View Details");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Search");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Search");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        addVaccinationButton.setText("Add Vaccination");
        addVaccinationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addVaccinationButtonActionPerformed(evt);
            }
        });

        editVaccine.setText("Edit Vaccination");
        editVaccine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editVaccineActionPerformed(evt);
            }
        });

        jLabel12.setText("Pet Type");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(34, 34, 34)
                                .addComponent(vaccineNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(addVaccineText, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(addVaccinationButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(jLabel11)
                                        .addGap(37, 37, 37)
                                        .addComponent(insuranceBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(37, 37, 37)
                                        .addComponent(courseCompleted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(41, 41, 41)
                                .addComponent(editVaccine, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(118, 118, 118)
                                .addComponent(update)
                                .addGap(280, 280, 280)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(19, 19, 19)
                                .addComponent(applicationID, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(24, 24, 24)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(27, 27, 27)
                                        .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(27, 27, 27)
                                        .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(33, 33, 33)
                                        .addComponent(petName, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(45, 45, 45)
                                        .addComponent(petAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(24, 24, 24)
                                        .addComponent(petGender, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel12))
                                        .addGap(41, 41, 41)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(breed, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                            .addComponent(petType))))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jButton3)
                                            .addComponent(jButton4)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addComponent(jButton1)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(145, 145, 145))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(applicationID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton1)))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(firstName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton3)))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lastName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton4)))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(petName, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(petAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(petGender, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(breed, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2)))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(petType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(vaccineNameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addVaccineText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addVaccinationButton))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(courseCompleted, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editVaccine)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(insuranceBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addComponent(update)
                .addGap(31, 31, 31))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        for(Owner o:business.getOwnerList()){
            if(o.getId().toString().equals(applicationID.getText())){
                firstName.setText(o.getFirstName());
                lastName.setText(o.getLastName());
                jDateChooser1.setDateFormatString(o.getDate());
                petName.setText(o.getPet().getName());
                petAge.setText(o.getPet().getAge()+"");
                petGender.setText(o.getPet().getGender());
                breed.setText(o.getPet().getBreed());
                for(Vaccination v:o.getPet().getVaccine()){
                    vaccineNameBox.addItem(v.getVaccineName());
                    String complete = v.getCourseCompleted().toString();
                    courseCompleted.setText(complete);
                }
                insuranceBox.setSelectedItem((Object)o.getPet().getInsurance());
                
                
            }
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        ArrayList<Owner> newList = new ArrayList();
        for(Owner o: business.getOwnerList()){
            if(o.getFirstName().equals(firstName)){
                newList.add(o);
            }
        }
        if(newList.size() > 0){
            
            viewTableModel.setRowCount(0);
            
            for(Owner o: newList){
                
                Object row[]  =new Object[3];
                row[0] = o.getId().toString();
                row[1] = o.getFirstName();
                row[2] = o.getLastName();
                viewTableModel.addRow(row);
            }
        }else{
            System.out.println("Applicant doesn't exist!");
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
    ArrayList<Owner> newList = new ArrayList();
        for(Owner o: business.getOwnerList()){
            if(o.getFirstName().equals(lastName)){
                newList.add(o);
            }
        }
        if(newList.size() > 0){
            
            viewTableModel.setRowCount(0);
            
            for(Owner o: newList){
                
                Object row[]  =new Object[3];
                row[0] = o.getId().toString();
                row[1] = o.getFirstName();
                row[2] = o.getLastName();
                viewTableModel.addRow(row);
            }
        }else{
            System.out.println("Applicant doesn't exist!");
        }
// TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    int selectedRow =jTable1.getSelectedRow();
        
        if(selectedRow >= 0 ){
        String id  = (String)jTable1.getValueAt(selectedRow, 0);
        Owner ow = new Owner();
        for(Owner o : business.getOwnerList()){
            if(o.getId().toString().equals(id)){
                ow = o;
                applicationID.setText(id);
                firstName.setText(ow.getFirstName());
                lastName.setText(ow.getLastName());
                jDateChooser1.setDateFormatString(ow.getDate());
                petName.setText(ow.getPet().getName());
                petAge.setText(ow.getPet().getAge()+"");
                petGender.setText(ow.getPet().getGender());
                breed.setText(ow.getPet().getBreed());
                insuranceBox.setSelectedItem((Object)o.getPet().getInsurance());
                for(Vaccination v:ow.getPet().getVaccine()){
                    vaccineNameBox.addItem(v.getVaccineName());
                    String complete = v.getCourseCompleted().toString();
                    courseCompleted.setText(complete);
                }
            }else{
            JOptionPane.showMessageDialog(null,"Please Select a row");
            }
        }
        
        // TODO add your handling code here:
    }             
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
                
                Long id = Long.valueOf(applicationID.getText());
                for(Owner o: business.getOwnerList()){
                    if(o.getId().equals(id)){
                        
                        business.getOwnerList().remove(o);
                        
                    }
                }
                String fN = firstName.getText();
                String lN = lastName.getText();
                String d = jDateChooser1.getDateFormatString();
                String petN = petName.getText();
                int petA = Integer.valueOf(petAge.getText());
                String petG = petGender.getText();
                String pT = petType.getText();
                String petB = breed.getText();
                Object a = insuranceBox.getSelectedItem();
                Insurance insurance = new Insurance();
                
                for(Insurance i: business.getInsurancePlan()){
                    if(i.toString().equals(a)){
                        insurance = i;
                    }
                }
                ArrayList<Vaccination> newList = new ArrayList<>();
                newList = this.owner.getPet().getVaccine();
                Pet pet = new Pet(petN, petA,  petG, pT, petB, newList ,  insurance);
                this.owner = new Owner(id, fN, lN, d, pet);
                 
                    
        // TODO add your handling code here:
    }//GEN-LAST:event_updateActionPerformed

    private void editVaccineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editVaccineActionPerformed
        
        Long id = Long.valueOf(applicationID.getText());
        for(Owner o: business.getOwnerList()){
            if(o.getId().equals(id)){
                this.owner = o;
            }
        }
        for(Vaccination v:this.owner.getPet().getVaccine()){
                    if(v.getVaccineName().equals(vaccineNameBox.getSelectedItem().toString())){
                        this.owner.getPet().getVaccine().remove(v);
                        String n = vaccineNameBox.getSelectedItem().toString();
                        Boolean b = Boolean.valueOf(courseCompleted.getText());
                        Vaccination vv = new Vaccination(n,b);
                        this.owner.getPet().getVaccine().add(vv);
                    }
                }
// TODO add your handling code here:
    }//GEN-LAST:event_editVaccineActionPerformed

    private void addVaccinationButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addVaccinationButtonActionPerformed
    
        Long id = Long.valueOf(applicationID.getText());
        for(Owner o: business.getOwnerList()){
            if(o.getId().equals(id)){
                this.owner = o;
            }
        }
        String nam = addVaccineText.getText();
        Boolean bb = Boolean.valueOf(courseCompleted.getText());
        Vaccination va = new Vaccination(nam,bb);
        this.owner.getPet().getVaccine().add(va);
        
// TODO add your handling code here:
    }//GEN-LAST:event_addVaccinationButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addVaccinationButton;
    private javax.swing.JTextField addVaccineText;
    private javax.swing.JTextField applicationID;
    private javax.swing.JTextField breed;
    private javax.swing.JTextField courseCompleted;
    private javax.swing.JButton editVaccine;
    private javax.swing.JTextField firstName;
    private javax.swing.JComboBox<String> insuranceBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField lastName;
    private javax.swing.JTextField petAge;
    private javax.swing.JTextField petGender;
    private javax.swing.JTextField petName;
    private javax.swing.JTextField petType;
    private javax.swing.JButton update;
    private javax.swing.JComboBox<String> vaccineNameBox;
    // End of variables declaration//GEN-END:variables
}
