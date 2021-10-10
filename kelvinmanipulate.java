
package converter;

import javax.swing.JOptionPane;

public class kelvinmanipulate extends javax.swing.JFrame 
{
    public String value;
    public kelvinmanipulate()
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Conversion = new javax.swing.JLabel();
        ReadingOutput = new javax.swing.JLabel();
        Centigrade = new javax.swing.JRadioButton();
        Fharenheit = new javax.swing.JRadioButton();
        button = new javax.swing.JButton();
        outputlabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));

        Conversion.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Conversion.setText("In Which Temperature scale you want to convert");

        ReadingOutput.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        Centigrade.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Centigrade.setText("Centigrade");

        Fharenheit.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Fharenheit.setText("Fharenheit");

        button.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        button.setText("Convert");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        outputlabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/converter/Images/kelvin.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(Conversion, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(ReadingOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(Fharenheit)
                                        .addGap(185, 185, 185)
                                        .addComponent(Centigrade)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(outputlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(195, 195, 195)
                                .addComponent(button)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ReadingOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Conversion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Fharenheit)
                            .addComponent(Centigrade))
                        .addGap(18, 18, 18)
                        .addComponent(button)
                        .addGap(23, 23, 23)
                        .addComponent(outputlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 66, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        if(Centigrade.isSelected()==false && Fharenheit.isSelected()==false)
        {
            outputlabel.setText("");
            JOptionPane.showMessageDialog(null,"Type of Conversion is not Selected");
        }
        else if(Centigrade.isSelected()==true && Fharenheit.isSelected()==false)
        {
            double k=Double.parseDouble(value);
            double c=(k-273.15);
            outputlabel.setText("The Temperature in Centigrade sclae is "+String.valueOf(c)+"°C");
        }
        else if(Fharenheit.isSelected()==true && Centigrade.isSelected()==false)
        {
            double k=Double.parseDouble(value);
            double f=((((k-273.15)/5)*9)+32);
            outputlabel.setText("The Temperature in Fharenheit scale is "+String.valueOf(f)+"°F");
        }
        else
        {
            outputlabel.setText("");
            JOptionPane.showMessageDialog(null,"Select only one option");
        }
    }//GEN-LAST:event_buttonActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable()
        {
            public void run()
            {
                new kelvinmanipulate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Centigrade;
    private javax.swing.JLabel Conversion;
    private javax.swing.JRadioButton Fharenheit;
    public javax.swing.JLabel ReadingOutput;
    private javax.swing.JButton button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel outputlabel;
    // End of variables declaration//GEN-END:variables
}
