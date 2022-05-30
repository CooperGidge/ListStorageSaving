/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package liststoragesaving;

import java.util.*;
import java.io.*;

/**
 *
 * @author cogid4775
 */
public class ListStorageSaving extends javax.swing.JFrame {

    /**
     * Creates new form ListStorageSaving
     */
    public ListStorageSaving() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        item1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        item1.setText("tem");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(item1)
                .addContainerGap(244, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(item1)
                .addContainerGap(243, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private static ListEngine le = new ListEngine();
    
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
            java.util.logging.Logger.getLogger(ListStorageSaving.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ListStorageSaving.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ListStorageSaving.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ListStorageSaving.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ListStorageSaving().setVisible(true);
            }
        });
        loadFile();
        ListStorageSaving lss = new ListStorageSaving();
        lss.printList();
    }
    
    public void printList() {
        item1.setText("a");
        System.out.println(le.getItem(0));
    }
    
    public static void loadFile() {
        
        // Try reading the file
        try {
            // Get the file
            BufferedReader readFile = new BufferedReader(new FileReader("list.txt"));
            // Create an empty String to hold the contents of the current line
            String currentLine;
            // Loop through each line in the text file until there are none left
            while ((currentLine = readFile.readLine()) != null) {
                // If the line has no contents in it, break from the loop
                // as there is said to be no more items left. This is to
                // account for random empty lines at the end of the text file,
                // which when manually editing it, can accidentally be left in.
                if (currentLine.equals("")) {
                    break;
                }
                // Add the contents of this line to a new element of the ArrayList
                le.addItem(currentLine);
                System.out.println(currentLine);
            }
            // Close the file now that we are done with it
            readFile.close();
        } catch (IOException ioe) {
            // If something goes wrong, print this
            System.err.println("File Crashed!");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel item1;
    // End of variables declaration//GEN-END:variables
}
