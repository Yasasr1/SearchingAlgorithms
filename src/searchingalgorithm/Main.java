/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package searchingalgorithm;

import java.util.*;
import java.util.Arrays;

/**
 *
 * @author Yasas
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    private int[] array = new int[10000];
    private int searchValue;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jOptionPane1 = new javax.swing.JOptionPane();
        generateButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        displayArray = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sequentialTime = new javax.swing.JTextField();
        binaryTime = new javax.swing.JTextField();
        jumpTime = new javax.swing.JTextField();
        interpolationTime = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        sequentialOutput = new javax.swing.JTextField();
        binaryOutput = new javax.swing.JTextField();
        jumpOutput = new javax.swing.JTextField();
        interpolationOutput = new javax.swing.JTextField();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        generateButton.setText("Generate array");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        displayArray.setColumns(20);
        displayArray.setRows(5);
        jScrollPane1.setViewportView(displayArray);

        jLabel1.setText("Input Number :");

        input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Execution Time (nano seconds)");

        jLabel4.setText("Sequential Search");

        jLabel5.setText("Binary Search");

        jLabel6.setText("Jump Search");

        jLabel7.setText("Interpolation Search");

        sequentialTime.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sequentialTimeActionPerformed(evt);
            }
        });

        jLabel8.setText("Output");

        jLabel9.setText("Sequential Search");

        jLabel10.setText("Binary Search");

        jLabel11.setText("Jump Search");

        jLabel12.setText("Interpolation Search");

        sequentialOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sequentialOutputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sequentialTime, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                    .addComponent(binaryTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(jumpTime))
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(interpolationTime, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 665, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(62, 62, 62)
                                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(44, 44, 44)
                                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(276, 276, 276)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(sequentialOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(binaryOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jumpOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(interpolationOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(84, 84, 84)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                .addGap(37, 37, 37)
                                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(51, 51, 51))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(297, 297, 297))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(generateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sequentialOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(binaryOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jumpOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(interpolationOutput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sequentialTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(binaryTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jumpTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(interpolationTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generateButtonActionPerformed
        // TODO add your handling code here:
        generateSortedArray();
        displayArray.setText("");
        for(int i=0; i<array.length; i++){
            displayArray.append(String.valueOf(array[i]) + ",");
        }
    }//GEN-LAST:event_generateButtonActionPerformed

    private void inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_inputActionPerformed

    private void sequentialTimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sequentialTimeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sequentialTimeActionPerformed

    private void sequentialOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sequentialOutputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sequentialOutputActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        try {
           searchValue = Integer.parseInt(input.getText());
           sequentialSearch();
           jumpSearch();
           binarySearch();
           interpolationSearch();
           
        }
        catch(NumberFormatException e){
            jOptionPane1.showMessageDialog(jFrame1, "Error :" + e);
        }
        
    }//GEN-LAST:event_searchButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    
    public void generateSortedArray(){
        int min = 1;
        int max = 500000;
        int range = max - min + 1;
        for(int i=0; i<array.length; i++){
            array[i] = (int)(Math.random() * range) + min;
        }
        Arrays.sort(array);
        
    }
    
    public void sequentialSearch(){
        long startTime = System.nanoTime();
        int i;
        for(i=0; i<array.length; i++){
            if(array[i] == searchValue){
                sequentialOutput.setText("Found at index :" + Integer.toString(i));
                break;
            }
        }
        if(i == array.length){
           sequentialOutput.setText("Not Found"); 
        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        sequentialTime.setText(Long.toString(totalTime));
    }
    
    public void jumpSearch(){
        long startTime = System.nanoTime();
        int n = array.length;
        int blockSize = (int)Math.floor(Math.sqrt(n));
        int start = 0;
        int end = blockSize;
        while(end < n && array[end] <= searchValue){
            start = end;
            end = end + blockSize;
            if(end > n-1){
                end = n;
                
            }
        }
        
        for(int i=start; i<end; i++){
            if(array[i] == searchValue){
                jumpOutput.setText("Found at index :" + Integer.toString(i));
                break;
            }
            if(i == end-1){
                jumpOutput.setText("Not found");
            }
        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        jumpTime.setText(Long.toString(totalTime));
    }
    
    public void binarySearch(){
        long startTime = System.nanoTime();
        int n = array.length;
        int lowerBound = 0;
        int upperBound = n;
        int midPoint;
        boolean found = false;
        
        while(found == false){
            if(upperBound < lowerBound){
                binaryOutput.setText("Not Found");
                break;
            }
            
            midPoint = lowerBound + ( upperBound - lowerBound ) / 2;
            
            if(array[midPoint] < searchValue){
                lowerBound = midPoint + 1;
            }
            
            if(array[midPoint] > searchValue){
                upperBound = midPoint - 1;
            }
            
            if(array[midPoint] == searchValue){
                binaryOutput.setText("Found at index :" + Integer.toString(midPoint));
                found = true;
            }
            
        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        binaryTime.setText(Long.toString(totalTime));
    }
    
    /*public void interpolationSearch(){
        long startTime = System.nanoTime();
        int low = 0;
        int high = array.length-1;
        int middle;
        boolean found = false;
        
        while(low <= high && searchValue >= array[low] && searchValue <= array[high]){
            if(low == high){
                if(array[low] == searchValue){
                    interpolationOutput.setText("Found at Index:" + Integer.toString(low));
                    found = true;
                    break;
                }
                interpolationOutput.setText("Not Found");
                break;
            }
            
            middle = low + ((high-low) / (array[high] - array[low])) * (searchValue - array[low]);
            
            if(array[middle] == searchValue){
                interpolationOutput.setText("Found at Index:" + Integer.toString(middle));
                found = true;
                break;
            }
            else{
                if(array[middle] < searchValue){
                    low = middle + 1;
                }
                else if(array[middle] > searchValue){
                    high = middle - 1;
                }
            }
        }
        if(found == false){
            interpolationOutput.setText("Not Found");
        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        interpolationTime.setText(Long.toString(totalTime));
    }*/
    
    public void interpolationSearch(){
        long startTime = System.nanoTime();
        int start = 0;
        int end = array.length - 1;
        int dist, valRange, indexRange,pos;
        float fraction;
        
        while(start <= end && searchValue >= array[start] && searchValue <= array[end]){
            dist = searchValue - array[start];
            valRange = array[end] - array[start];
            fraction = dist/valRange;
            indexRange = end - start;
            pos = start + ((int)fraction * indexRange);
            
            if(array[pos] == searchValue){
                interpolationOutput.setText("Found at Index:" + Integer.toString(pos));
                break;
            }
            
            if(array[pos] < searchValue){
                start = pos + 1;
            }
            else
                end = pos - 1;
        }
        if(start > end || searchValue < array[start] || searchValue > array[end]){
            interpolationOutput.setText("Not Found");
        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        interpolationTime.setText(Long.toString(totalTime));
        
    }
    
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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField binaryOutput;
    private javax.swing.JTextField binaryTime;
    private javax.swing.JTextArea displayArray;
    private javax.swing.JButton generateButton;
    private javax.swing.JTextField input;
    private javax.swing.JTextField interpolationOutput;
    private javax.swing.JTextField interpolationTime;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JOptionPane jOptionPane1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jumpOutput;
    private javax.swing.JTextField jumpTime;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField sequentialOutput;
    private javax.swing.JTextField sequentialTime;
    // End of variables declaration//GEN-END:variables
}
