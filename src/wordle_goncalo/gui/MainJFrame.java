/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package wordle_goncalo.gui;
import java.awt.Color;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import wordle_goncalo.classes.*;
/**
 *
 * @author Gonçalo
 */
public class MainJFrame extends javax.swing.JFrame {
    
    String mensaje;

    private Map<String,Integer> letrasPorPalabra;
    private int contador=0;//contador para saber con que fila estoy trabajando
    private IMotorWordle motor;
    private String palabra;
    private String entrada;
    private static final java.awt.Color COLOR_NEGRO = Color.BLACK;//new java.awt.Color(64,64,64);
    private static final java.awt.Color COLOR_VERDE = new java.awt.Color(51,255,51);
    private static final java.awt.Color COLOR_AMARILLO = Color.YELLOW;//new java.awt.Color(255,255,102);
    /**
     * Creates new form MainJFrame
     * @param motor
     */
    public MainJFrame(IMotorWordle motor) {
        initComponents();
        this.letrasPorPalabra= new LinkedHashMap<>();
        this.motor=motor;
        this.palabra=motor.obtenerPalabraAleatoria();
        
    }
    public MainJFrame() {
        initComponents();
        this.letrasPorPalabra= new LinkedHashMap<>();
        this.motor=new MotorTest();
        this.palabra=motor.obtenerPalabraAleatoria();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainjPanel = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        tecladojPanel = new javax.swing.JPanel();
        DosFilasTecladojPanel3 = new javax.swing.JPanel();
        jButton1_1 = new javax.swing.JButton();
        jButton1_2 = new javax.swing.JButton();
        jButton1_3 = new javax.swing.JButton();
        jButton1_4 = new javax.swing.JButton();
        jButton1_5 = new javax.swing.JButton();
        jButton1_6 = new javax.swing.JButton();
        jButton1_7 = new javax.swing.JButton();
        jButton1_8 = new javax.swing.JButton();
        jButton1_9 = new javax.swing.JButton();
        jButton1_10 = new javax.swing.JButton();
        jButton2_1 = new javax.swing.JButton();
        jButton2_2 = new javax.swing.JButton();
        jButton2_3 = new javax.swing.JButton();
        jButton2_4 = new javax.swing.JButton();
        jButton2_5 = new javax.swing.JButton();
        jButton2_6 = new javax.swing.JButton();
        jButton2_7 = new javax.swing.JButton();
        jButton2_8 = new javax.swing.JButton();
        jButton2_9 = new javax.swing.JButton();
        jButton2_10 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        nombrejLabel1 = new javax.swing.JLabel();
        letrasjPanel2 = new javax.swing.JPanel();
        a11jLabel1_1 = new javax.swing.JLabel();
        a12jLabel1_2 = new javax.swing.JLabel();
        a13jLabel1_3 = new javax.swing.JLabel();
        a14jLabel1_4 = new javax.swing.JLabel();
        a15jLabel1_5 = new javax.swing.JLabel();
        a21jLabel2_1 = new javax.swing.JLabel();
        a22jLabel2_2 = new javax.swing.JLabel();
        a23jLabel2_3 = new javax.swing.JLabel();
        a24jLabel2_4 = new javax.swing.JLabel();
        a25jLabel2_5 = new javax.swing.JLabel();
        a31jLabel3_1 = new javax.swing.JLabel();
        a32jLabel3_2 = new javax.swing.JLabel();
        a33jLabel3_3 = new javax.swing.JLabel();
        a34jLabel3_4 = new javax.swing.JLabel();
        a35jLabel3_5 = new javax.swing.JLabel();
        a41jLabel4_1 = new javax.swing.JLabel();
        a42jLabel4_2 = new javax.swing.JLabel();
        a43jLabel4_3 = new javax.swing.JLabel();
        a44jLabel4_4 = new javax.swing.JLabel();
        a45jLabel4_5 = new javax.swing.JLabel();
        a51jLabel5_1 = new javax.swing.JLabel();
        a52jLabel5_2 = new javax.swing.JLabel();
        a53jLabel5_3 = new javax.swing.JLabel();
        a54jLabel5_4 = new javax.swing.JLabel();
        a55jLabel5_5 = new javax.swing.JLabel();
        a61jLabel6_1 = new javax.swing.JLabel();
        a62jLabel6_2 = new javax.swing.JLabel();
        a63jLabel6_3 = new javax.swing.JLabel();
        a64jLabel6_4 = new javax.swing.JLabel();
        a65jLabel6_5 = new javax.swing.JLabel();
        inputjTextField1 = new javax.swing.JTextField();
        enviarjButton1 = new javax.swing.JButton();
        avisosjLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        archivojMenu1 = new javax.swing.JMenu();
        motoresjMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        DosFilasTecladojPanel3.setLayout(new java.awt.GridLayout(2, 10));

        jButton1_1.setText("Q");
        jButton1_1.setMaximumSize(new java.awt.Dimension(24, 24));
        jButton1_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_1ActionPerformed(evt);
            }
        });
        DosFilasTecladojPanel3.add(jButton1_1);

        jButton1_2.setText("W");
        DosFilasTecladojPanel3.add(jButton1_2);

        jButton1_3.setText("E");
        DosFilasTecladojPanel3.add(jButton1_3);

        jButton1_4.setText("R");
        DosFilasTecladojPanel3.add(jButton1_4);

        jButton1_5.setText("T");
        DosFilasTecladojPanel3.add(jButton1_5);

        jButton1_6.setText("Y");
        DosFilasTecladojPanel3.add(jButton1_6);

        jButton1_7.setText("U");
        DosFilasTecladojPanel3.add(jButton1_7);

        jButton1_8.setText("I");
        DosFilasTecladojPanel3.add(jButton1_8);

        jButton1_9.setText("O");
        DosFilasTecladojPanel3.add(jButton1_9);

        jButton1_10.setText("P");
        DosFilasTecladojPanel3.add(jButton1_10);

        jButton2_1.setText("A");
        DosFilasTecladojPanel3.add(jButton2_1);

        jButton2_2.setText("S");
        DosFilasTecladojPanel3.add(jButton2_2);

        jButton2_3.setText("D");
        DosFilasTecladojPanel3.add(jButton2_3);

        jButton2_4.setText("F");
        DosFilasTecladojPanel3.add(jButton2_4);

        jButton2_5.setText("G");
        DosFilasTecladojPanel3.add(jButton2_5);

        jButton2_6.setText("H");
        DosFilasTecladojPanel3.add(jButton2_6);

        jButton2_7.setText("J");
        DosFilasTecladojPanel3.add(jButton2_7);

        jButton2_8.setText("K");
        DosFilasTecladojPanel3.add(jButton2_8);

        jButton2_9.setText("L");
        DosFilasTecladojPanel3.add(jButton2_9);

        jButton2_10.setText("Ñ");
        DosFilasTecladojPanel3.add(jButton2_10);

        jButton1.setText("Z");

        jButton2.setText("X");

        jButton3.setText("C");

        jButton4.setText("V");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("B");

        jButton6.setText("N");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("M");

        jButton8.setText("Borrar");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tecladojPanelLayout = new javax.swing.GroupLayout(tecladojPanel);
        tecladojPanel.setLayout(tecladojPanelLayout);
        tecladojPanelLayout.setHorizontalGroup(
            tecladojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tecladojPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(tecladojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(DosFilasTecladojPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 292, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tecladojPanelLayout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(0, 0, 0)
                        .addComponent(jButton2)
                        .addGap(0, 0, 0)
                        .addComponent(jButton3)
                        .addGap(0, 0, 0)
                        .addComponent(jButton4)
                        .addGap(0, 0, 0)
                        .addComponent(jButton5)
                        .addGap(0, 0, 0)
                        .addComponent(jButton6)
                        .addGap(0, 0, 0)
                        .addComponent(jButton7)
                        .addGap(0, 0, 0)
                        .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        tecladojPanelLayout.setVerticalGroup(
            tecladojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tecladojPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(DosFilasTecladojPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(tecladojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tecladojPanelLayout.createSequentialGroup()
                        .addGroup(tecladojPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton6)
                            .addComponent(jButton7))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        nombrejLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        nombrejLabel1.setText("WORDLE");

        letrasjPanel2.setLayout(new java.awt.GridLayout(6, 5));

        a11jLabel1_1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a11jLabel1_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a11jLabel1_1.setText("-");
        letrasjPanel2.add(a11jLabel1_1);

        a12jLabel1_2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a12jLabel1_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a12jLabel1_2.setText("-");
        letrasjPanel2.add(a12jLabel1_2);

        a13jLabel1_3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a13jLabel1_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a13jLabel1_3.setText("-");
        letrasjPanel2.add(a13jLabel1_3);

        a14jLabel1_4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a14jLabel1_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a14jLabel1_4.setText("-");
        letrasjPanel2.add(a14jLabel1_4);

        a15jLabel1_5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a15jLabel1_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a15jLabel1_5.setText("-");
        letrasjPanel2.add(a15jLabel1_5);

        a21jLabel2_1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a21jLabel2_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a21jLabel2_1.setText("-");
        letrasjPanel2.add(a21jLabel2_1);

        a22jLabel2_2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a22jLabel2_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a22jLabel2_2.setText("-");
        letrasjPanel2.add(a22jLabel2_2);

        a23jLabel2_3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a23jLabel2_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a23jLabel2_3.setText("-");
        letrasjPanel2.add(a23jLabel2_3);

        a24jLabel2_4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a24jLabel2_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a24jLabel2_4.setText("-");
        letrasjPanel2.add(a24jLabel2_4);

        a25jLabel2_5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a25jLabel2_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a25jLabel2_5.setText("-");
        letrasjPanel2.add(a25jLabel2_5);

        a31jLabel3_1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a31jLabel3_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a31jLabel3_1.setText("-");
        letrasjPanel2.add(a31jLabel3_1);

        a32jLabel3_2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a32jLabel3_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a32jLabel3_2.setText("-");
        letrasjPanel2.add(a32jLabel3_2);

        a33jLabel3_3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a33jLabel3_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a33jLabel3_3.setText("-");
        letrasjPanel2.add(a33jLabel3_3);

        a34jLabel3_4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a34jLabel3_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a34jLabel3_4.setText("-");
        letrasjPanel2.add(a34jLabel3_4);

        a35jLabel3_5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a35jLabel3_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a35jLabel3_5.setText("-");
        letrasjPanel2.add(a35jLabel3_5);

        a41jLabel4_1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a41jLabel4_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a41jLabel4_1.setText("-");
        letrasjPanel2.add(a41jLabel4_1);

        a42jLabel4_2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a42jLabel4_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a42jLabel4_2.setText("-");
        letrasjPanel2.add(a42jLabel4_2);

        a43jLabel4_3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a43jLabel4_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a43jLabel4_3.setText("-");
        letrasjPanel2.add(a43jLabel4_3);

        a44jLabel4_4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a44jLabel4_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a44jLabel4_4.setText("-");
        letrasjPanel2.add(a44jLabel4_4);

        a45jLabel4_5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a45jLabel4_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a45jLabel4_5.setText("-");
        letrasjPanel2.add(a45jLabel4_5);

        a51jLabel5_1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a51jLabel5_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a51jLabel5_1.setText("-");
        letrasjPanel2.add(a51jLabel5_1);

        a52jLabel5_2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a52jLabel5_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a52jLabel5_2.setText("-");
        letrasjPanel2.add(a52jLabel5_2);

        a53jLabel5_3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a53jLabel5_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a53jLabel5_3.setText("-");
        letrasjPanel2.add(a53jLabel5_3);

        a54jLabel5_4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a54jLabel5_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a54jLabel5_4.setText("-");
        letrasjPanel2.add(a54jLabel5_4);

        a55jLabel5_5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a55jLabel5_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a55jLabel5_5.setText("-");
        letrasjPanel2.add(a55jLabel5_5);

        a61jLabel6_1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a61jLabel6_1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a61jLabel6_1.setText("-");
        letrasjPanel2.add(a61jLabel6_1);

        a62jLabel6_2.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a62jLabel6_2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a62jLabel6_2.setText("-");
        letrasjPanel2.add(a62jLabel6_2);

        a63jLabel6_3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a63jLabel6_3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a63jLabel6_3.setText("-");
        letrasjPanel2.add(a63jLabel6_3);

        a64jLabel6_4.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a64jLabel6_4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a64jLabel6_4.setText("-");
        letrasjPanel2.add(a64jLabel6_4);

        a65jLabel6_5.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        a65jLabel6_5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        a65jLabel6_5.setText("-");
        letrasjPanel2.add(a65jLabel6_5);

        inputjTextField1.setFont(new java.awt.Font("Arial", 0, 36)); // NOI18N
        inputjTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputjTextField1ActionPerformed(evt);
            }
        });

        enviarjButton1.setText("Enviar");
        enviarjButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarjButton1ActionPerformed(evt);
            }
        });

        avisosjLabel1.setText(mensaje);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(116, 116, 116)
                            .addComponent(nombrejLabel1))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(letrasjPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(avisosjLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(inputjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(enviarjButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(0, 21, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(tecladojPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(18, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(nombrejLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(letrasjPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputjTextField1)
                    .addComponent(enviarjButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(avisosjLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(427, 427, 427)
                    .addComponent(tecladojPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout MainjPanelLayout = new javax.swing.GroupLayout(MainjPanel);
        MainjPanel.setLayout(MainjPanelLayout);
        MainjPanelLayout.setHorizontalGroup(
            MainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainjPanelLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        MainjPanelLayout.setVerticalGroup(
            MainjPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainjPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        archivojMenu1.setText("Archivo");
        jMenuBar1.add(archivojMenu1);

        motoresjMenu2.setText("Motores");
        jMenuBar1.add(motoresjMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(MainjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainjPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void inputjTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputjTextField1ActionPerformed
        //this.inputjTextField1
    }//GEN-LAST:event_inputjTextField1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1_1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_1ActionPerformed

    private void enviarjButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarjButton1ActionPerformed
       if(contador==0){
        entrada = this.inputjTextField1.getText();
        if(entrada.matches("[a-zA-Z]{5}")){
            if(motor.checkPalabra(entrada)){
                checkFila(a11jLabel1_1,0);
                checkFila(a12jLabel1_2,1);
                checkFila(a13jLabel1_3,2);
                checkFila(a14jLabel1_4,3);
                checkFila(a15jLabel1_5,4);
          contador++;
            }
            else{
                this.avisosjLabel1.setText("La palabra no existe");
            }
      }
      else{
            this.avisosjLabel1.setText("¡La palabra debe estar compuesta por 5 letras!");
      }
        }
        
        else if(contador==1){
        entrada = this.inputjTextField1.getText().toUpperCase();
        if(entrada.matches("[a-zA-Z]{5}")){
            if(motor.checkPalabra(entrada)){
                checkFila(a21jLabel2_1,0);
                checkFila(a22jLabel2_2,1);
                checkFila(a23jLabel2_3,2);
                checkFila(a24jLabel2_4,3);
                checkFila(a25jLabel2_5,4);
          contador++;
            }
            else{
                JOptionPane.showMessageDialog(this, "¡La palabra no existe!");
            }
      }
      else{
          JOptionPane.showMessageDialog(this, "¡La palabra debe estar compuesta por 5 letras!");
      }
        }
        else if(contador==2){
        entrada = this.inputjTextField1.getText().toUpperCase();
        if(entrada.matches("[a-zA-Z]{5}")){
            if(motor.checkPalabra(entrada)){
                checkFila(a31jLabel3_1,0);
                checkFila(a32jLabel3_2,1);
                checkFila(a33jLabel3_3,2);
                checkFila(a34jLabel3_4,3);
                checkFila(a35jLabel3_5,4);
          contador++;
            }
            else{
                JOptionPane.showMessageDialog(this, "¡La palabra no existe!");
            }
      }
      else{
          JOptionPane.showMessageDialog(this, "¡La palabra debe estar compuesta por 5 letras!");
      }
        }
        else if(contador==3){
        entrada = this.inputjTextField1.getText().toUpperCase();
        if(entrada.matches("[a-zA-Z]{5}")){
            if(motor.checkPalabra(entrada)){
                checkFila(a41jLabel4_1,0);
                checkFila(a42jLabel4_2,1);
                checkFila(a43jLabel4_3,2);
                checkFila(a44jLabel4_4,3);
                checkFila(a45jLabel4_5,4);
          contador++;
            }
            else{
                JOptionPane.showMessageDialog(this, "¡La palabra no existe!");
            }
      }
      else{
          JOptionPane.showMessageDialog(this, "¡La palabra debe estar compuesta por 5 letras!");
      }
        }
        else if(contador==4){
        entrada = this.inputjTextField1.getText().toUpperCase();
        if(entrada.matches("[a-zA-Z]{5}")){
            if(motor.checkPalabra(entrada)){
                checkFila(a51jLabel5_1,0);
                checkFila(a52jLabel5_2,1);
                checkFila(a53jLabel5_3,2);
                checkFila(a54jLabel5_4,3);
                checkFila(a55jLabel5_5,4);
          contador++;
            }
            else{
                JOptionPane.showMessageDialog(this, "¡La palabra no existe!");
            }
      }
      else{
          JOptionPane.showMessageDialog(this, "¡La palabra debe estar compuesta por 5 letras!");
      }
        }
        else if(contador==5){
        entrada = this.inputjTextField1.getText().toUpperCase();
        if(entrada.matches("[a-zA-Z]{5}")){
            if(motor.checkPalabra(entrada)){
          a61jLabel6_1.setText(entrada.charAt(0)+"");
          a62jLabel6_2.setText(entrada.charAt(1)+"");
          a63jLabel6_3.setText(entrada.charAt(2)+"");
          a64jLabel6_4.setText(entrada.charAt(3)+"");
          a65jLabel6_5.setText(entrada.charAt(4)+"");
          contador++;
            }
            else{
                JOptionPane.showMessageDialog(this, "¡La palabra no existe!");
            }
      }
      else{
          JOptionPane.showMessageDialog(this, "¡La palabra debe estar compuesta por 5 letras!");
      }
        }
        if(ganarJuego()){
            this.avisosjLabel1.setText("¡Ganaste!");
            contador=6;
        }
        else{
            System.out.println("¡Perdiste! La palabra era "+this.palabra);
        }
    }//GEN-LAST:event_enviarjButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DosFilasTecladojPanel3;
    private javax.swing.JPanel MainjPanel;
    private javax.swing.JLabel a11jLabel1_1;
    private javax.swing.JLabel a12jLabel1_2;
    private javax.swing.JLabel a13jLabel1_3;
    private javax.swing.JLabel a14jLabel1_4;
    private javax.swing.JLabel a15jLabel1_5;
    private javax.swing.JLabel a21jLabel2_1;
    private javax.swing.JLabel a22jLabel2_2;
    private javax.swing.JLabel a23jLabel2_3;
    private javax.swing.JLabel a24jLabel2_4;
    private javax.swing.JLabel a25jLabel2_5;
    private javax.swing.JLabel a31jLabel3_1;
    private javax.swing.JLabel a32jLabel3_2;
    private javax.swing.JLabel a33jLabel3_3;
    private javax.swing.JLabel a34jLabel3_4;
    private javax.swing.JLabel a35jLabel3_5;
    private javax.swing.JLabel a41jLabel4_1;
    private javax.swing.JLabel a42jLabel4_2;
    private javax.swing.JLabel a43jLabel4_3;
    private javax.swing.JLabel a44jLabel4_4;
    private javax.swing.JLabel a45jLabel4_5;
    private javax.swing.JLabel a51jLabel5_1;
    private javax.swing.JLabel a52jLabel5_2;
    private javax.swing.JLabel a53jLabel5_3;
    private javax.swing.JLabel a54jLabel5_4;
    private javax.swing.JLabel a55jLabel5_5;
    private javax.swing.JLabel a61jLabel6_1;
    private javax.swing.JLabel a62jLabel6_2;
    private javax.swing.JLabel a63jLabel6_3;
    private javax.swing.JLabel a64jLabel6_4;
    private javax.swing.JLabel a65jLabel6_5;
    private javax.swing.JMenu archivojMenu1;
    private javax.swing.JLabel avisosjLabel1;
    private javax.swing.JButton enviarjButton1;
    private javax.swing.JTextField inputjTextField1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1_1;
    private javax.swing.JButton jButton1_10;
    private javax.swing.JButton jButton1_2;
    private javax.swing.JButton jButton1_3;
    private javax.swing.JButton jButton1_4;
    private javax.swing.JButton jButton1_5;
    private javax.swing.JButton jButton1_6;
    private javax.swing.JButton jButton1_7;
    private javax.swing.JButton jButton1_8;
    private javax.swing.JButton jButton1_9;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton2_1;
    private javax.swing.JButton jButton2_10;
    private javax.swing.JButton jButton2_2;
    private javax.swing.JButton jButton2_3;
    private javax.swing.JButton jButton2_4;
    private javax.swing.JButton jButton2_5;
    private javax.swing.JButton jButton2_6;
    private javax.swing.JButton jButton2_7;
    private javax.swing.JButton jButton2_8;
    private javax.swing.JButton jButton2_9;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel letrasjPanel2;
    private javax.swing.JMenu motoresjMenu2;
    private javax.swing.JLabel nombrejLabel1;
    private javax.swing.JPanel tecladojPanel;
    // End of variables declaration//GEN-END:variables

private void checkFila(JLabel j,int numero_letra){
    contarLetrasCorrectas();
    if((entrada.charAt(numero_letra)+"").equalsIgnoreCase(palabra.charAt(numero_letra)+"")){
              j.setText(entrada.charAt(numero_letra)+"");
              j.setForeground(COLOR_VERDE);
          }
          else if((palabra).contains(entrada.charAt(numero_letra)+"")){
              j.setText(entrada.charAt(numero_letra)+"");
              if(letrasPorPalabra.get(entrada.charAt(numero_letra)+"")>0){
              j.setForeground(COLOR_AMARILLO);
              }
              else{
                  j.setForeground(COLOR_NEGRO);
              }
          }
          else{
              j.setText(entrada.charAt(numero_letra)+"");
              j.setForeground(COLOR_NEGRO);
          }
}

public boolean ganarJuego(){
        return (entrada.charAt(0)+"").equalsIgnoreCase(palabra.charAt(0)+"")  && (entrada.charAt(1)+"").equalsIgnoreCase(palabra.charAt(1)+"") && (entrada.charAt(2)+"").equalsIgnoreCase(palabra.charAt(2)+"") && (entrada.charAt(3)+"").equalsIgnoreCase(palabra.charAt(3)+"") && (entrada.charAt(4)+"").equalsIgnoreCase(palabra.charAt(4)+"");
}

public void contarLetrasCorrectas(){
    for (int i = 0; i < palabra.length(); i++) {
            letrasPorPalabra.put(palabra.charAt(i)+"", letrasPorPalabra.get(palabra.charAt(i)+"")+1);
    }
    for (int i = 0; i < entrada.length(); i++) {
        if((entrada.charAt(i)+"").equalsIgnoreCase(palabra.charAt(i)+"")){
            letrasPorPalabra.put(palabra.charAt(i)+"", letrasPorPalabra.get(palabra.charAt(i)+"")-1);
        }
    }
}

}


