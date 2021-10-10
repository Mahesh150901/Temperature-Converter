package converter;
import javax.swing.JOptionPane;
public class fahrenheitmanipulate extends javax.swing.JFrame 
{
    public String value;
    public fahrenheitmanipulate() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Conversion = new javax.swing.JLabel();
        ReadingOutput = new javax.swing.JLabel();
        centigrade = new javax.swing.JRadioButton();
        kelvin = new javax.swing.JRadioButton();
        button = new javax.swing.JButton();
        outputlabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        Conversion.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Conversion.setText("In which Temperature scale you want to convert");

        ReadingOutput.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        centigrade.setBackground(new java.awt.Color(153, 153, 255));
        centigrade.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        centigrade.setText("Centigrade");
        centigrade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centigradeActionPerformed(evt);
            }
        });

        kelvin.setBackground(new java.awt.Color(153, 153, 255));
        kelvin.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        kelvin.setText("Kelvin");

        button.setBackground(new java.awt.Color(153, 153, 255));
        button.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        button.setText("Convert");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        outputlabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/converter/Images/fharenheit.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(222, 222, 222)
                        .addComponent(button)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(centigrade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(kelvin))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 63, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ReadingOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 458, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Conversion, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(87, 87, 87))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(outputlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(ReadingOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(Conversion, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(centigrade)
                            .addComponent(kelvin))
                        .addGap(28, 28, 28)
                        .addComponent(button)
                        .addGap(18, 18, 18)
                        .addComponent(outputlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 609, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed
        if(centigrade.isSelected()==false && kelvin.isSelected()==false)
        {
            outputlabel.setText("");
            JOptionPane.showMessageDialog(null,"Type of Conversion is not selected");
        }
        else if(centigrade.isSelected()==true && kelvin.isSelected()==false)
        {
            double f=Double.parseDouble(value);
            double c=(((f-32)/9)*5);
            outputlabel.setText("The temperature in Centigrade scale is "+String.valueOf(c)+"°C");
        }
        else if(kelvin.isSelected()==true && centigrade.isSelected()==false)
        {
            double f=Double.parseDouble(value);
            double k=((((f-32)*5)/9)+273.15);
            outputlabel.setText("The Temperature in Kelvin scale is "+String.valueOf(k)+"K");
        }
        else
        {
            outputlabel.setText("");
            JOptionPane.showMessageDialog(null,"Select only one option");
        }
    }//GEN-LAST:event_buttonActionPerformed

    private void centigradeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centigradeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_centigradeActionPerformed

    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() 
        {
            public void run() {
                new fahrenheitmanipulate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Conversion;
    public javax.swing.JLabel ReadingOutput;
    private javax.swing.JButton button;
    private javax.swing.JRadioButton centigrade;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton kelvin;
    private javax.swing.JLabel outputlabel;
    // End of variables declaration//GEN-END:variables
}
