/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package SimpleGUI;
import sun.awt.resources.awt;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.io.File;

/**
 *
 * @author santhilata
 */
public class EpochPanel extends javax.swing.JPanel {

    final static boolean shouldFill = true;
    final static boolean shouldWeightX = true;
    final static boolean RIGHT_TO_LEFT = false;

    /**
     * Creates new form EpochPanel
     */
    public EpochPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        titlePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        EpochCombo = new javax.swing.JComboBox();
        Epoch_tabs = new javax.swing.JPanel();
        Epoch_pics = new javax.swing.JPanel();
        buttonPanel = new javax.swing.JPanel();
        resetButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();
        generateButton = new javax.swing.JButton();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Qgen_latest.png"))); // NOI18N
        jLabel1.setText("");


        jLabel2.setText("Number of Epochs in QuerySet");

        EpochCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6" }));
        EpochCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EpochComboActionPerformed(evt);
            }
        });

        EpochCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                epochComboItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
                titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(titlePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(90, 90, 90)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EpochCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        titlePanelLayout.setVerticalGroup(
                titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(titlePanelLayout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(EpochCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                .addContainerGap())
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                                .addGap(0, 4, Short.MAX_VALUE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout Epoch_tabsLayout = new javax.swing.GroupLayout(Epoch_tabs);
        Epoch_tabs.setLayout(Epoch_tabsLayout);
        Epoch_tabsLayout.setHorizontalGroup(
                Epoch_tabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 855, Short.MAX_VALUE)
        );
        Epoch_tabsLayout.setVerticalGroup(
                Epoch_tabsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 245, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout Epoch_picsLayout = new javax.swing.GroupLayout(Epoch_pics);
        Epoch_pics.setLayout(Epoch_picsLayout);
        Epoch_picsLayout.setHorizontalGroup(
                Epoch_picsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
        );
        Epoch_picsLayout.setVerticalGroup(
                Epoch_picsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 148, Short.MAX_VALUE)
        );

        jLabel1.setSize(200,200);

        resetButton.setLabel("Reset");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        exitButton.setLabel("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        generateButton.setLabel("Generate QuerySet");
        generateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonPanelLayout = new javax.swing.GroupLayout(buttonPanel);
        buttonPanel.setLayout(buttonPanelLayout);
        buttonPanelLayout.setHorizontalGroup(
                buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(buttonPanelLayout.createSequentialGroup()
                                .addGap(294, 294, 294)
                                .addComponent(resetButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(exitButton)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(generateButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        buttonPanelLayout.setVerticalGroup(
                buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, buttonPanelLayout.createSequentialGroup()
                                .addContainerGap(14, Short.MAX_VALUE)
                                .addGroup(buttonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(resetButton)
                                        .addComponent(exitButton)
                                        .addComponent(generateButton))
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(Epoch_tabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 43, Short.MAX_VALUE))
                                        .addComponent(Epoch_pics, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Epoch_pics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Epoch_tabs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(buttonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>

    private void EpochComboActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:


    }

    private void epochComboItemStateChanged(java.awt.event.ItemEvent evt) {
        // TODO add your handling code here:

        if (evt.getStateChange() == ItemEvent.DESELECTED)
            return;



            Epoch_pics.invalidate();
            Epoch_pics.removeAll();
            Epoch_pics.repaint();

        noEpochs = Integer.parseInt((String)EpochCombo.getSelectedItem());

        addLabels(Epoch_pics,noEpochs);

        Epoch_tabs.invalidate();
        Epoch_tabs.removeAll();
        Epoch_tabs.repaint();
        addComponents(Epoch_tabs, noEpochs);
        Epoch_tabs.setVisible(true);


    }

    public void addLabels(JPanel pane, int epochs){
        for (int i=0; i< epochs; i++){
            epochLabelArray[i] = new JLabel();
            epochLabelArray[i].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Blank.png")));
            epochLabelArray[i].setVisible(true);

            int initialIndex = 10;

            Epoch_pics.add(epochLabelArray[i]);
            epochLabelArray[i].setBounds(initialIndex+(i*130),0, 130,120);


            pane.revalidate();
            pane.repaint();
        }
    }

    public  void addComponents(JPanel pane, int epochs) {

        if (RIGHT_TO_LEFT) {
            pane.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
        }


        pane.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        if (shouldFill) {
            //natural height, maximum width
            c.fill = GridBagConstraints.HORIZONTAL;

            // Display Titles
            titleLabel[0] = new JLabel("# Epoch");
            titleLabel[0].setFont(new Font("Ubuntu", Font.BOLD,15));
            if (shouldWeightX) {
                c.weightx = 0.5;
            }
            c.fill = GridBagConstraints.HORIZONTAL;
            c.gridx = 0;
            c.gridy = 0;
            c.ipadx = 30;
            pane.add(titleLabel[0], c);

            titleLabel[1] = new JLabel("Distribution");
            titleLabel[1].setFont(new Font("Ubuntu", Font.BOLD,15));
            if (shouldWeightX) {
                c.weightx = 0.5;
            }
            c.fill = GridBagConstraints.HORIZONTAL;
            c.gridx = 1;
            c.gridy = 0;
            c.ipadx = 30;
            pane.add(titleLabel[1], c);

            titleLabel[2] = new JLabel("No.of Queries");
            titleLabel[2].setFont(new Font("Ubuntu", Font.BOLD,15));
            if (shouldWeightX) {
                c.weightx = 0.5;
            }
            c.fill = GridBagConstraints.HORIZONTAL;
            c.gridx = 2;
            c.gridy = 0;
            c.ipadx = 30;
            pane.add(titleLabel[2], c);

            titleLabel[3] = new JLabel("Query Repetition");
            titleLabel[3].setFont(new Font("Ubuntu", Font.BOLD,15));
            if (shouldWeightX) {
                c.weightx = 0.5;
            }
            c.fill = GridBagConstraints.HORIZONTAL;
            c.gridx = 3;
            c.gridy = 0;
            //  c.ipadx = 30;
            pane.add(titleLabel[3], c);

            titleLabel[4] = new JLabel("Sub-query Repetition");
            titleLabel[4].setFont(new Font("Ubuntu", Font.BOLD,15));
            if (shouldWeightX) {
                c.weightx = 0.5;
            }
            c.fill = GridBagConstraints.HORIZONTAL;
            c.gridx = 4;
            c.gridy = 0;
            //  c.ipadx = 30;
            pane.add(titleLabel[4], c);


            // to create number of epochs

            for (int j=1; j <= epochs; j++){
                // epoch number

                epochLabel[j-1] = new JLabel("Epoch "+(j));
                if (shouldWeightX) {
                    c.weightx = 0.5;
                }
                c.fill = GridBagConstraints.HORIZONTAL;
                c.gridx = 0;
                c.gridy = j;
                pane.add(epochLabel[j-1], c);

                // distribution options
                String[] distStrings= {"","Poisson","Exponential","Uniform","Grading","Random"};
                distCombo[j-1] = new JComboBox(distStrings);
                distCombo[j-1].setSelectedIndex(0);
                c.fill = GridBagConstraints.HORIZONTAL;
                c.weightx = 0.5;
                c.gridx = 1;
                c.gridy = j;
                pane.add(distCombo[j-1], c);
                final int finalJ1 = j-1;
                distCombo[j-1].addActionListener(new ActionListener () {
                    public void actionPerformed(ActionEvent e) {
                        //doSomething();
                        distComboActionPerformed(e, finalJ1);
                    }
                });


                //no of queries options
                Integer[] numbQ = {0,1000, 2500, 5000, 10000, 20000};
                numbQCombo[j-1] = new JComboBox(numbQ);
                numbQCombo[j-1].setSelectedIndex(0);
                c.fill = GridBagConstraints.HORIZONTAL;
                c.weightx = 0.5;
                c.gridx = 2;
                c.gridy = j;
                pane.add(numbQCombo[j-1], c);

                numbQCombo[j-1].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        //System.out.println(numbQCombo[finalJ1].getSelectedItem());
                        numbQs[finalJ1] = (Integer)(numbQCombo[finalJ1].getSelectedItem());
                    }
                });



                //Query repetition options
                String[] qr = {"","Poisson","Exponential","Uniform","Grading","Random"};
                QRCombo[j-1] = new JComboBox(qr);
                QRCombo[j-1].setSelectedIndex(0);
                c.fill = GridBagConstraints.HORIZONTAL;
                // c.ipady = 40;      //make this component tall
                // c.weightx = 0.0;
                // c.gridwidth = 3;
                c.gridx = 3;
                c.gridy = j;
                pane.add(QRCombo[j-1], c);

                QRCombo[j-1].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String tempStr =  (String)QRCombo[finalJ1].getSelectedItem();
                        if (tempStr.equals("")) percentQueryRepetition[finalJ1] =0;

                        else {
                           // tempStr = tempStr.substring(0,tempStr.length()-1);
                           // percentQueryRepetition[finalJ1] = Integer.parseInt(tempStr);
                           // System.out.println(percentQueryRepetition[finalJ1]);


                            }


                    }
                });

                //sub-query repetition options
                String[] sqc = {"","Poisson","Exponential","Uniform","Grading","Random"};
                SQCombo[j-1] = new JComboBox(sqc);
                SQCombo[j-1].setSelectedIndex(0);
                c.fill = GridBagConstraints.HORIZONTAL;

                c.gridx = 4;       //aligned with button 2
                //c.gridwidth = 2;   //2 columns wide
                c.gridy = j;       //third row
                pane.add(SQCombo[j-1], c);

                SQCombo[j-1].addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        String tempStr =  (String)SQCombo[finalJ1].getSelectedItem();
                        if (tempStr.equals("")) percentSubqueryRepetition[finalJ1] =0;

                        else {
                            tempStr = tempStr.substring(0,tempStr.length()-1);
                            percentSubqueryRepetition[finalJ1] = Integer.parseInt(tempStr);
                           // System.out.println(percentSubqueryRepetition[finalJ1]);
                        }


                    }
                });


            }
        }
    }

    private void distComboActionPerformed(java.awt.event.ActionEvent evt, int j){
        int type =0;
        String distribution = (String)distCombo[j].getSelectedItem();

        distributions[j] = distribution;
        if (distribution.equals("Poisson"))    type = 1;
        else if (distribution.equals("Exponential")) type = 2;
        else if (distribution.equals("Uniform")) type = 3;
        else if (distribution.equals("Grading")) type = 4;
        else if (distribution.equals("Random")) type = 5;
        else if (distribution.equals("")) type = 6;

            switch(type){
                case 1: {
                    epochLabelArray[j].setIcon(new javax.swing.ImageIcon(getClass().getResource("/poisson.png")));
                    epochLabelArray[j].validate();
                    epochLabelArray[j].repaint();
                    JTextField mean = new JTextField(5);
                   // JTextField variance = new JTextField(5);

                    JPanel myPanel = new JPanel();
                    myPanel.add(new JLabel("mean:"));
                    myPanel.add(mean);
                    myPanel.add(Box.createHorizontalStrut(15)); // a spacer
                    //myPanel.add(new JLabel("variance:"));
                   // myPanel.add(variance);

                    int result = JOptionPane.showConfirmDialog(this, myPanel,
                            "Please enter mean value", JOptionPane.OK_CANCEL_OPTION);
                    if (result == JOptionPane.OK_OPTION) {
                        System.out.println("mean: " + mean.getText());
                       // System.out.println("variance: " + variance.getText());
                        meanValues[j] = Double.parseDouble(mean.getText());
                       // varianceValues[j] = Double.parseDouble(variance.getText());

                        epochLabelArray[j].setToolTipText("Poisson mean:"+mean.getText());

                    }
                    break;
                }
                case 2:{
                    epochLabelArray[j].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Exponential.png")));
                    epochLabelArray[j].validate();
                    epochLabelArray[j].repaint();

                    JTextField mean = new JTextField(5);
                    // JTextField variance = new JTextField(5);

                    JPanel myPanel = new JPanel();
                    myPanel.add(new JLabel("mean:"));
                    myPanel.add(mean);
                    myPanel.add(Box.createHorizontalStrut(15)); // a spacer
                    //myPanel.add(new JLabel("variance:"));
                    // myPanel.add(variance);

                    int result = JOptionPane.showConfirmDialog(this, myPanel,
                            "Please enter mean value", JOptionPane.OK_CANCEL_OPTION);
                    if (result == JOptionPane.OK_OPTION) {
                        System.out.println("mean: " + mean.getText());
                        // System.out.println("variance: " + variance.getText());
                        meanExponentialValues[j] = Double.parseDouble(mean.getText());
                        // varianceValues[j] = Double.parseDouble(variance.getText());

                        epochLabelArray[j].setToolTipText("Exponential mean:"+mean.getText());

                    }

                    break;
                }
                case 3:{
                    epochLabelArray[j].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Uniform.png")));
                    epochLabelArray[j].validate();
                    epochLabelArray[j].repaint();

                    JTextField lower = new JTextField(5);
                    JTextField upper = new JTextField(5);

                    JPanel myPanel = new JPanel();
                    myPanel.add(new JLabel("Lower limit:"));
                    myPanel.add(lower);
                    myPanel.add(Box.createHorizontalStrut(15)); // a spacer
                    myPanel.add(new JLabel("Upper limit:"));
                    myPanel.add(upper);

                    int result = JOptionPane.showConfirmDialog(this, myPanel,
                            "Please enter lower and upper limits", JOptionPane.OK_CANCEL_OPTION);
                    if (result == JOptionPane.OK_OPTION){
                        System.out.println("lower:"+lower.getText()+", upper:"+upper.getText());
                        uniformLowerLimit[j] = Integer.parseInt(lower.getText());
                        uniformUpperLimit[j] = Integer.parseInt(upper.getText());

                        epochLabelArray[j].setToolTipText("Uniform lower limit:"+lower.getText()+", upper limit:"+upper.getText());
                    }

                    break;
                }
                case 4: {
                    epochLabelArray[j].setIcon(new javax.swing.ImageIcon(getClass().getResource("/gradient.png")));
                    epochLabelArray[j].validate();
                    epochLabelArray[j].repaint();
                    break;
                }
                case 5:{
                    epochLabelArray[j].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Random.png")));
                    epochLabelArray[j].validate();
                    epochLabelArray[j].repaint();
                    break;
                }
                default: {
                    epochLabelArray[j].setIcon(new javax.swing.ImageIcon(getClass().getResource("/Blank.png")));
                    epochLabelArray[j].validate();
                    epochLabelArray[j].repaint();
                    break;
                }
        }
    }

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        for (int i =0; i<6; i++){
            distCombo[i].setSelectedIndex(0);
            numbQCombo[i].setSelectedIndex(0);
            QRCombo[i].setSelectedIndex(0);
            SQCombo[i].setSelectedIndex(0);
            distributions[i] = "";
            numbQs[i] =0;
            percentQueryRepetition[i]=0;
            percentSubqueryRepetition[i] =0;
        }
    }

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt){
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(this,"Do you want to exit?","Query Generator",JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION){
            System.exit(0);
        }

    }

    private void generateButtonActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:

        //check for null values
        for(int i=0; i <noEpochs; i++){
            if ( (distributions == null) || (distributions[i]== null) || (distributions[i].equals("")) ) {
                JOptionPane.showMessageDialog(this, "Query distribution for Epoch " + i + " is missing");
                return;
            }

        }

        QueryGenerator queryGenerator = new QueryGenerator();
        queryGenerator.setDistributions(distributions);
        queryGenerator.setMeanExponentialValues(meanExponentialValues);
        queryGenerator.setMeanValues(meanValues);
        queryGenerator.setNoEpochs(noEpochs);
        queryGenerator.setNumbQs(numbQs);
        queryGenerator.setPercentQueryRepetition(percentQueryRepetition);
        queryGenerator.setPercentSubqueryRepetition(percentSubqueryRepetition);
        queryGenerator.setUniformLowerLimit(uniformLowerLimit);
        queryGenerator.setUniformUpperLimit(uniformUpperLimit);



        File file = queryGenerator.generateQuerySet();
        JFileChooser fileChooser = new JFileChooser() ;

    }


    public String[] getDistributions() {
        return distributions;
    }

    public int[] getNumbQs() {
        return numbQs;
    }

    public int[] getPercentQueryRepetition() {
        return percentQueryRepetition;
    }

    public int[] getPercentSubqueryRepetition() {
        return percentSubqueryRepetition;
    }

    public String[] getDistQueryRepetition(){
        return distQueryRepetition;
    }

    public  String[] getDistSubQueryRepetition(){
        return  distSubQueryRepetition;
    }

    int noEpochs ;
    double[] meanValues = new double[6];
    double[] meanExponentialValues = new double[6];
  //  double[] varianceValues = new double[6];
    int[] uniformLowerLimit = new int[6];
    int[] uniformUpperLimit = new int[6];



    JLabel[] epochLabelArray = new JLabel[6];

    JLabel[] titleLabel = new JLabel[5];
    JLabel[] epochLabel = new JLabel[7];
    JComboBox[] distCombo = new JComboBox[7];
    JComboBox[] numbQCombo = new JComboBox[7];
    JComboBox[] QRCombo = new JComboBox[7];
    JComboBox[] SQCombo = new JComboBox[7];

    private String[] distributions = new String[7];
    private int[] numbQs = new int[7];
    private String[] distQueryRepetition = new String[7];
    private int[] percentQueryRepetition = new int[7];
    private String[] distSubQueryRepetition = new String[7];
    private int[] percentSubqueryRepetition = new int[7];
    // Variables declaration - do not modify
    private javax.swing.JComboBox EpochCombo;
    private javax.swing.JPanel Epoch_pics;
    private javax.swing.JPanel Epoch_tabs;
    private javax.swing.JPanel buttonPanel;

    private javax.swing.JButton resetButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton generateButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration


}
