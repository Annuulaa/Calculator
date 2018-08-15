package Calculator;

public class Calculator extends javax.swing.JFrame {

    public Calculator() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        result = new javax.swing.JLabel();
        buttonOne = new javax.swing.JButton();
        buttonTwo = new javax.swing.JButton();
        buttonZero = new javax.swing.JButton();
        buttonThree = new javax.swing.JButton();
        buttonFour = new javax.swing.JButton();
        buttonFive = new javax.swing.JButton();
        buttonSix = new javax.swing.JButton();
        buttonSeven = new javax.swing.JButton();
        buttonEight = new javax.swing.JButton();
        buttonNine = new javax.swing.JButton();
        buttonDot = new javax.swing.JButton();
        buttonCas = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        buttonAdding = new javax.swing.JButton();
        buttonSubtraction = new javax.swing.JButton();
        buttonMultiplication = new javax.swing.JButton();
        buttonDivsion = new javax.swing.JButton();
        buttonEquals = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        result.setText("0.");

        buttonOne.setText("1");
        buttonOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonOneActionPerformed(evt);
            }
        });

        buttonTwo.setText("2");
        buttonTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonTwoActionPerformed(evt);
            }
        });

        buttonZero.setText("0");
        buttonZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonZeroActionPerformed(evt);
            }
        });

        buttonThree.setText("3");
        buttonThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonThreeActionPerformed(evt);
            }
        });

        buttonFour.setText("4");
        buttonFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFourActionPerformed(evt);
            }
        });

        buttonFive.setText("5");
        buttonFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFiveActionPerformed(evt);
            }
        });

        buttonSix.setText("6");
        buttonSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSixActionPerformed(evt);
            }
        });

        buttonSeven.setText("7");
        buttonSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSevenActionPerformed(evt);
            }
        });

        buttonEight.setText("8");
        buttonEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEightActionPerformed(evt);
            }
        });

        buttonNine.setText("9");
        buttonNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonNineActionPerformed(evt);
            }
        });

        buttonDot.setText(".");
        buttonDot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDotActionPerformed(evt);
            }
        });

        buttonCas.setText("<");
        buttonCas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCasActionPerformed(evt);
            }
        });

        reset.setText("C");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        buttonAdding.setText("+");
        buttonAdding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAddingActionPerformed(evt);
            }
        });

        buttonSubtraction.setText("-");
        buttonSubtraction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubtractionActionPerformed(evt);
            }
        });

        buttonMultiplication.setText("*");
        buttonMultiplication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonMultiplicationActionPerformed(evt);
            }
        });

        buttonDivsion.setText("/");
        buttonDivsion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonDivsionActionPerformed(evt);
            }
        });

        buttonEquals.setText("=");
        buttonEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonEqualsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonOne)
                            .addComponent(buttonDot))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonTwo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonThree))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(buttonZero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(buttonCas))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonFour)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonFive)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonSix))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonSeven)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonEight)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonNine)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(reset)))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonAdding)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonSubtraction, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonDivsion)
                            .addComponent(buttonEquals))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(buttonMultiplication))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(result, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonSeven)
                            .addComponent(buttonEight)
                            .addComponent(buttonNine)
                            .addComponent(reset))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonFour)
                            .addComponent(buttonFive)
                            .addComponent(buttonSix))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonOne)
                            .addComponent(buttonTwo)
                            .addComponent(buttonThree))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonZero)
                            .addComponent(buttonDot)
                            .addComponent(buttonCas)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(buttonAdding)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(buttonMultiplication)
                            .addComponent(buttonSubtraction)
                            .addComponent(buttonEquals))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonDivsion)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonZeroActionPerformed
        result.setText(Logic.changeNumber(result.getText(), "0"));
    }//GEN-LAST:event_buttonZeroActionPerformed

    private void buttonOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonOneActionPerformed
        result.setText(Logic.changeNumber(result.getText(), "1"));
        Logic.makeOperation = true;
        Logic.rememberNumber = true;
    }//GEN-LAST:event_buttonOneActionPerformed

    private void buttonTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonTwoActionPerformed
        result.setText(Logic.changeNumber(result.getText(), "2"));
        Logic.makeOperation = true;
        Logic.rememberNumber = true;
    }//GEN-LAST:event_buttonTwoActionPerformed

    private void buttonThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonThreeActionPerformed
        result.setText(Logic.changeNumber(result.getText(), "3"));
        Logic.makeOperation = true;
        Logic.rememberNumber = true;
    }//GEN-LAST:event_buttonThreeActionPerformed

    private void buttonFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFourActionPerformed
        result.setText(Logic.changeNumber(result.getText(), "4"));
        Logic.makeOperation = true;;
        Logic.rememberNumber = true;
    }//GEN-LAST:event_buttonFourActionPerformed

    private void buttonFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFiveActionPerformed
        result.setText(Logic.changeNumber(result.getText(), "5"));
        Logic.makeOperation = true;
        Logic.rememberNumber = true;
    }//GEN-LAST:event_buttonFiveActionPerformed

    private void buttonSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSixActionPerformed
        result.setText(Logic.changeNumber(result.getText(), "6"));
        Logic.makeOperation = true;
        Logic.rememberNumber = true;
    }//GEN-LAST:event_buttonSixActionPerformed

    private void buttonSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSevenActionPerformed
        result.setText(Logic.changeNumber(result.getText(), "7"));
        Logic.makeOperation = true;
        Logic.rememberNumber = true;
    }//GEN-LAST:event_buttonSevenActionPerformed

    private void buttonEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEightActionPerformed
        result.setText(Logic.changeNumber(result.getText(), "8"));
        Logic.makeOperation = true;
        Logic.rememberNumber = true;
    }//GEN-LAST:event_buttonEightActionPerformed

    private void buttonNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonNineActionPerformed
        result.setText(Logic.changeNumber(result.getText(), "9"));
        Logic.makeOperation = true;
        Logic.rememberNumber = true;
    }//GEN-LAST:event_buttonNineActionPerformed

    private void buttonDotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDotActionPerformed
        if (Logic.howManyNumbers == 0) {
            Logic.howManyNumbers++;
            result.setText("0.");
        }
        Logic.isDotSet = true;
        Logic.makeOperation = true;
    }//GEN-LAST:event_buttonDotActionPerformed

    private void buttonCasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCasActionPerformed
        result.setText(Logic.reduceNumber(result.getText()));
    }//GEN-LAST:event_buttonCasActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        Logic.reset();
        result.setText("0.");
    }//GEN-LAST:event_resetActionPerformed

    private void buttonAddingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAddingActionPerformed
        Logic.nextNumber = Double.parseDouble(result.getText());
        result.setText(Logic.makeCalculation("addition"));
        Logic.incompleteReset();
    }//GEN-LAST:event_buttonAddingActionPerformed

    private void buttonSubtractionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubtractionActionPerformed
        Logic.nextNumber = Double.parseDouble(result.getText());
        result.setText(Logic.makeCalculation("subtraction"));
        Logic.incompleteReset();
    }//GEN-LAST:event_buttonSubtractionActionPerformed

    private void buttonMultiplicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonMultiplicationActionPerformed
        Logic.nextNumber = Double.parseDouble(result.getText());
        result.setText(Logic.makeCalculation("multiplication"));
        Logic.incompleteReset();
    }//GEN-LAST:event_buttonMultiplicationActionPerformed

    private void buttonDivsionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonDivsionActionPerformed
        Logic.nextNumber = Double.parseDouble(result.getText());
        result.setText(Logic.makeCalculation("division"));
        Logic.incompleteReset();
    }//GEN-LAST:event_buttonDivsionActionPerformed

    private void buttonEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonEqualsActionPerformed
        Logic.makeOperation = true;
        if (Logic.rememberNumber) {
            Logic.nextNumber = Double.parseDouble(result.getText());
        }
        result.setText(Logic.makeCalculation(Logic.operation));
        Logic.incompleteReset();
        Logic.rememberNumber = false;
    }//GEN-LAST:event_buttonEqualsActionPerformed

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
            java.util.logging.Logger.getLogger(Calculator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Calculator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Calculator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Calculator.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Calculator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdding;
    private javax.swing.JButton buttonCas;
    private javax.swing.JButton buttonDivsion;
    private javax.swing.JButton buttonDot;
    private javax.swing.JButton buttonEight;
    private javax.swing.JButton buttonEquals;
    private javax.swing.JButton buttonFive;
    private javax.swing.JButton buttonFour;
    private javax.swing.JButton buttonMultiplication;
    private javax.swing.JButton buttonNine;
    private javax.swing.JButton buttonOne;
    private javax.swing.JButton buttonSeven;
    private javax.swing.JButton buttonSix;
    private javax.swing.JButton buttonSubtraction;
    private javax.swing.JButton buttonThree;
    private javax.swing.JButton buttonTwo;
    private javax.swing.JButton buttonZero;
    private javax.swing.JButton reset;
    private javax.swing.JLabel result;
    // End of variables declaration//GEN-END:variables
}
