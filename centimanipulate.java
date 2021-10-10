package converter;
import javax.swing.JOptionPane;
import java.util.*;
public class centimanipulate extends javax.swing.JFrame
{
    public String value;
    public centimanipulate() 
    {
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ReadingOutput = new javax.swing.JLabel();
        Conversion = new javax.swing.JLabel();
        Fharenheit = new javax.swing.JRadioButton();
        button = new javax.swing.JButton();
        kelvin = new javax.swing.JRadioButton();
        outputlabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ReadingOutput.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        Conversion.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Conversion.setText("In Which Temperature scale you want to convert");

        Fharenheit.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Fharenheit.setText("Fharenheit");

        button.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        button.setText("Convert");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        kelvin.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        kelvin.setText("Kelvin");

        outputlabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/converter/Images/centigrade.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Conversion, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ReadingOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Fharenheit)
                                .addGap(164, 164, 164)
                                .addComponent(kelvin))
                            .addComponent(outputlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 547, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(button)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ReadingOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Conversion)
                        .addGap(52, 52, 52)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Fharenheit)
                            .addComponent(kelvin))
                        .addGap(32, 32, 32)
                        .addComponent(button)
                        .addGap(18, 18, 18)
                        .addComponent(outputlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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
        if(Fharenheit.isSelected()==false && kelvin.isSelected()==false)
        {
            outputlabel.setText("");
            JOptionPane.showMessageDialog(null,"Type of Conversion is not selected");
        }
        else if(Fharenheit.isSelected()==true && kelvin.isSelected()==false)
        {
            double c=Double.parseDouble(value);
            double f=((9*c)/5)+32;
            String output=String.valueOf(f);
            outputlabel.setText("The temeperature in Fharenheit scale is "+output+" °F");
        }
        else if(kelvin.isSelected()==true && Fharenheit.isSelected()==false)
        {
            converter ca=new converter();
            double c=Double.parseDouble(value);
            double k=c+273.15;
            String output=String.valueOf(k);
            outputlabel.setText("The temeperature in Kelvin scale is "+output+" K");
        }
        else
        {
            outputlabel.setText("");
            JOptionPane.showMessageDialog(null,"Select only one option");
        }
    }//GEN-LAST:event_buttonActionPerformed
    public static void main(String args[]) 
    {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new centimanipulate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Conversion;
    private javax.swing.JRadioButton Fharenheit;
    public javax.swing.JLabel ReadingOutput;
    private javax.swing.JButton button;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton kelvin;
    private javax.swing.JLabel outputlabel;
    // End of variables declaration//GEN-END:variables
}
