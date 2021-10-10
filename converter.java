package converter;
import javax.swing.JOptionPane;
public class converter extends javax.swing.JFrame 
{
    public converter() 
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        heading = new javax.swing.JLabel();
        Reading = new javax.swing.JLabel();
        ReadingInput = new javax.swing.JTextField();
        centi = new javax.swing.JRadioButton();
        fha = new javax.swing.JRadioButton();
        kel = new javax.swing.JRadioButton();
        button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 0));
        setForeground(new java.awt.Color(102, 153, 255));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        heading.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        heading.setText("Temperature Converter");

        Reading.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Reading.setText("Enter Temperature Reading");

        ReadingInput.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N

        centi.setBackground(new java.awt.Color(204, 255, 255));
        centi.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        centi.setText("Centigrade");
        centi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                centiActionPerformed(evt);
            }
        });

        fha.setBackground(new java.awt.Color(204, 255, 255));
        fha.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        fha.setText("Fharenheit");
        fha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fhaActionPerformed(evt);
            }
        });

        kel.setBackground(new java.awt.Color(204, 255, 255));
        kel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        kel.setText("Kelvin");
        kel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelActionPerformed(evt);
            }
        });

        button.setBackground(new java.awt.Color(204, 255, 255));
        button.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        button.setText("Submit");
        button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/converter/Images/temperature.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(heading, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(centi)
                                .addGap(43, 43, 43)
                                .addComponent(fha)
                                .addGap(57, 57, 57)
                                .addComponent(kel))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(217, 217, 217)
                                .addComponent(button))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(300, 300, 300)
                        .addComponent(Reading, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ReadingInput, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)))
                .addContainerGap(91, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(heading)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ReadingInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Reading, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(centi)
                            .addComponent(fha)
                            .addComponent(kel))
                        .addGap(44, 44, 44)
                        .addComponent(button)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void centiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_centiActionPerformed

    }//GEN-LAST:event_centiActionPerformed

    private void fhaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fhaActionPerformed

    }//GEN-LAST:event_fhaActionPerformed

    private void kelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelActionPerformed

    }//GEN-LAST:event_kelActionPerformed

    private void buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonActionPerformed

        if(ReadingInput.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(null,"Input is empty");
        }
        else if(centi.isSelected()==false && fha.isSelected()==false && kel.isSelected()==false)
        {
            JOptionPane.showMessageDialog(null,"Unit of your Reading is not selected");
        }
        else if(centi.isSelected()==true)
        {
            centimanipulate cm=new centimanipulate();
            cm.value=ReadingInput.getText();
            cm.ReadingOutput.setText("Entered Temperature reading is "+ReadingInput.getText()+" °C");
            cm.setVisible(true);
            setVisible(false);
        }
        else if(fha.isSelected()==true)
        {
            fahrenheitmanipulate fm=new fahrenheitmanipulate();
            fm.value=ReadingInput.getText();
            fm.ReadingOutput.setText("Entered Temperature reading is "+ReadingInput.getText()+" °F");
            fm.setVisible(true);
            setVisible(false);
        }
        else
        {
            kelvinmanipulate km=new kelvinmanipulate();
            km.value=ReadingInput.getText();
            km.ReadingOutput.setText("Entered Temperature reading is "+ReadingInput.getText()+" K");
            km.setVisible(true);
            setVisible(false);
        }
    }//GEN-LAST:event_buttonActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new converter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Reading;
    public javax.swing.JTextField ReadingInput;
    private javax.swing.JButton button;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton centi;
    private javax.swing.JRadioButton fha;
    private javax.swing.JLabel heading;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton kel;
    // End of variables declaration//GEN-END:variables
}
