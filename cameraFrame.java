/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpsd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author root
 */
public class cameraFrame extends javax.swing.JFrame {
 
    FileInputStream in = null;
    BufferedReader br = null;
    BufferedWriter bw = null;
    
    double sensorSize = 0;
    int resolution1=0;
    int resolution2=0;
    double magnification=1;
    double objectDistance = 0;
    
    
    /**
     * Creates new form cameraFrame
     */
    public cameraFrame(String str) {
        initComponents();
       
      try{
        in = new FileInputStream("/home/admin/Downloads/CoalImages/cameraData.txt");
        br = new BufferedReader(new InputStreamReader(in));
        
        sensorSize = Double.parseDouble(br.readLine());
        resolution1 = Integer.parseInt(br.readLine());
        resolution2 = Integer.parseInt(br.readLine());
        magnification = Double.parseDouble(br.readLine());
        objectDistance = Double.parseDouble(br.readLine());
        
        br.close();
        
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
      
     sensorSizeField.setText(sensorSize+"");
     resolutionField1.setText(resolution1+"");
     resolutionField2.setText(resolution2+"");
     magnificationField.setText(magnification+"");
     objectDistanceField.setText(objectDistance+"");
     
       this.setTitle(str);
       this.setVisible(true);
       this.setSize(600,400);
       this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        sensorSizeField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        resolutionField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        resolutionField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        magnificationField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        objectDistanceField = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        cameraSetButton = new javax.swing.JButton();
        cameraCancelButton = new javax.swing.JButton();

        jLabel3.setText("jLabel3");

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jLabel9.setText("jLabel9");

        jLabel1.setText("sensor size : ");

        sensorSizeField.setText("jTextField1");
        sensorSizeField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sensorSizeFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("(in inches)");

        jLabel4.setText("resolution :");

        resolutionField1.setText("jTextField2");
        resolutionField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resolutionField1ActionPerformed(evt);
            }
        });

        jLabel5.setText("X");

        resolutionField2.setText("jTextField3");
        resolutionField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resolutionField2ActionPerformed(evt);
            }
        });

        jLabel8.setText("magnification : ");

        magnificationField.setText("jTextField4");
        magnificationField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                magnificationFieldActionPerformed(evt);
            }
        });

        jLabel10.setText("object distance from device lens :");

        objectDistanceField.setText("jTextField5");
        objectDistanceField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                objectDistanceFieldActionPerformed(evt);
            }
        });

        jLabel11.setText("(mm)");

        cameraSetButton.setText("set");
        cameraSetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cameraSetButtonActionPerformed(evt);
            }
        });

        cameraCancelButton.setText("cancel");
        cameraCancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cameraCancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sensorSizeField, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(magnificationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(resolutionField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(resolutionField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(objectDistanceField, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(185, 185, 185)
                                .addComponent(cameraSetButton, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(cameraCancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 17, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sensorSizeField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(resolutionField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(resolutionField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(magnificationField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(objectDistanceField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cameraSetButton)
                    .addComponent(cameraCancelButton))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resolutionField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resolutionField2ActionPerformed
        //resolution2 = Integer.parseInt(resolutionField2.getText()); // TODO add your handling code here:
    }//GEN-LAST:event_resolutionField2ActionPerformed

    private void cameraCancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cameraCancelButtonActionPerformed
        this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_cameraCancelButtonActionPerformed

    private void sensorSizeFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sensorSizeFieldActionPerformed
        //sensorSize = Double.parseDouble(sensorSizeField.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_sensorSizeFieldActionPerformed

    private void resolutionField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resolutionField1ActionPerformed
        //resolution1 = Integer.parseInt(resolutionField1.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_resolutionField1ActionPerformed

    private void magnificationFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_magnificationFieldActionPerformed
       // magnification = Double.parseDouble(magnificationField.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_magnificationFieldActionPerformed

    private void objectDistanceFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_objectDistanceFieldActionPerformed
       // objectDistance = Double.parseDouble(objectDistanceField.getText());        // TODO add your handling code here:
    }//GEN-LAST:event_objectDistanceFieldActionPerformed

    private void cameraSetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cameraSetButtonActionPerformed
        sensorSize = Double.parseDouble(sensorSizeField.getText());
        resolution1 = Integer.parseInt(resolutionField1.getText());
        resolution2 = Integer.parseInt(resolutionField2.getText());
        magnification = Double.parseDouble(magnificationField.getText());
        objectDistance = Double.parseDouble(objectDistanceField.getText());
        try{
           
           bw = new BufferedWriter(new FileWriter("/home/admin/Downloads/CoalImages/cameraData.txt"));
           bw.write(sensorSize+"\n");
           bw.write(resolution1+"\n");
           bw.write(resolution2+"\n");
           bw.write(magnification+"\n");
           bw.write(objectDistance+"\n");
           bw.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch(IOException e){
            e.printStackTrace();
        }
        catch(Exception e){
            e.printStackTrace();
        }
        this.dispose();// TODO add your handling code here:
    }//GEN-LAST:event_cameraSetButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cameraCancelButton;
    private javax.swing.JButton cameraSetButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField magnificationField;
    private javax.swing.JTextField objectDistanceField;
    private javax.swing.JTextField resolutionField1;
    private javax.swing.JTextField resolutionField2;
    private javax.swing.JTextField sensorSizeField;
    // End of variables declaration//GEN-END:variables
}
