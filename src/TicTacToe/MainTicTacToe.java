/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package TicTacToe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author josep
 */
public class MainTicTacToe extends javax.swing.JFrame {

    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    boolean checker;
    
    /**
     * Creates new form MainTicTacToe
     */
    public MainTicTacToe() {
        initComponents();
    }

    private void gameScore()
    {
        LblJugadorX.setText(startGame.valueOf(xCount));
        LblJugadorO.setText(startGame.valueOf(oCount));
    }
    
        private void choose_a_Player ()
    {
        if(startGame.equalsIgnoreCase("X"))
        {
         startGame = "O";
        }
        else
        {
        startGame = "X";
        }
    }
    
    private void winningGame ()
    {
        String bl= Btn1.getText();
        String b2= Btn2.getText();
        String b3= Btn3.getText();
        String b4= Btn4.getText();
        String b5= Btn5.getText();
        String b6= Btn6.getText();
        String b7= Btn7.getText();
        String b8= Btn8.getText();
        String b9= Btn9.getText();
        
        if (bl == ("X") && b2 == ("X") && b3 == ("X") )
        {
            JOptionPane.showMessageDialog(this, "Jugador X Gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            Btn1.setBackground(Color.ORANGE);
            Btn2.setBackground(Color.ORANGE);
            Btn3.setBackground(Color.ORANGE);
            xCount++;
            gameScore();
            
        }
        if (bl == ("X") && b4 == ("X") && b7 == ("X") )
        {
            JOptionPane.showMessageDialog(this, "Jugador X Gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            Btn1.setBackground(Color.ORANGE);
            Btn4.setBackground(Color.ORANGE);
            Btn7.setBackground(Color.ORANGE);
            xCount++;
            gameScore();
            
        }
        if (b2 == ("X") && b5 == ("X") && b8 == ("X") )
        {
            JOptionPane.showMessageDialog(this, "Jugador X Gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            Btn2.setBackground(Color.CYAN);
            Btn5.setBackground(Color.CYAN);
            Btn8.setBackground(Color.CYAN);
            xCount++;
            gameScore();
            
        }
        
         if (b4 == ("X") && b5 == ("X") && b6 == ("X") )
        {
            JOptionPane.showMessageDialog(this, "Jugador X Gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            Btn4.setBackground(Color.CYAN);
            Btn5.setBackground(Color.CYAN);
            Btn6.setBackground(Color.CYAN);
            xCount++;
            gameScore();
            
        }
         if (b7 == ("X") && b8 == ("X") && b9 == ("X") )
        {
            JOptionPane.showMessageDialog(this, "Jugador X Gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            Btn7.setBackground(Color.YELLOW);
            Btn8.setBackground(Color.YELLOW);
            Btn9.setBackground(Color.YELLOW);
            xCount++;
            gameScore();
            
        }
         if (b3 == ("X") && b6 == ("X") && b9 == ("X") )
        {
            JOptionPane.showMessageDialog(this, "Jugador X Gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            Btn3.setBackground(Color.YELLOW);
            Btn6.setBackground(Color.YELLOW);
            Btn9.setBackground(Color.YELLOW);
            xCount++;
            gameScore();
            
        }
          if (bl == ("X") && b5 == ("X") && b9 == ("X") )
        {
            JOptionPane.showMessageDialog(this, "Jugador X Gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            Btn1.setBackground(Color.GREEN);
            Btn5.setBackground(Color.GREEN);
            Btn9.setBackground(Color.GREEN);
            xCount++;
            gameScore();
            
        }
          if (b3 == ("X") && b5 == ("X") && b7 == ("X") )
        {
            JOptionPane.showMessageDialog(this, "Jugador X Gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            Btn3.setBackground(Color.GREEN);
            Btn5.setBackground(Color.GREEN);
            Btn7.setBackground(Color.GREEN);
            xCount++;
            gameScore();
            
        }
          
         
         
        if (bl == ("O") && b2 == ("O") && b3 == ("O") )
        {
            JOptionPane.showMessageDialog(this, "Jugador O Gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            Btn1.setBackground(Color.ORANGE);
            Btn2.setBackground(Color.ORANGE);
            Btn3.setBackground(Color.ORANGE);
            oCount++;
            gameScore();
            
        }
        if (bl == ("O") && b4 == ("O") && b7 == ("O") )
        {
            JOptionPane.showMessageDialog(this, "Jugador O Gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            Btn1.setBackground(Color.ORANGE);
            Btn4.setBackground(Color.ORANGE);
            Btn7.setBackground(Color.ORANGE);
            oCount++;
            gameScore();
            
        }
        if (b2 == ("O") && b5 == ("O") && b8 == ("O") )
        {
            JOptionPane.showMessageDialog(this, "Jugador O Gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            Btn2.setBackground(Color.CYAN);
            Btn5.setBackground(Color.CYAN);
            Btn8.setBackground(Color.CYAN);
            oCount++;
            gameScore();
            
        }
        
         if (b4 == ("O") && b5 == ("O") && b6 == ("O") )
        {
            JOptionPane.showMessageDialog(this, "Jugador O Gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            Btn4.setBackground(Color.CYAN);
            Btn5.setBackground(Color.CYAN);
            Btn6.setBackground(Color.CYAN);
            oCount++;
            gameScore();
            
        }
         if (b7 == ("O") && b8 == ("O") && b9 == ("O") )
        {
            JOptionPane.showMessageDialog(this, "Jugador O Gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            Btn7.setBackground(Color.YELLOW);
            Btn8.setBackground(Color.YELLOW);
            Btn9.setBackground(Color.YELLOW);
            oCount++;
            gameScore();
            
        }
         if (b3 == ("O") && b6 == ("O") && b9 == ("O") )
        {
            JOptionPane.showMessageDialog(this, "Jugador O Gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            Btn3.setBackground(Color.YELLOW);
            Btn6.setBackground(Color.YELLOW);
            Btn9.setBackground(Color.YELLOW);
            oCount++;
            gameScore();
            
        }
          if (bl == ("O") && b5 == ("O") && b9 == ("O") )
        {
            JOptionPane.showMessageDialog(this, "Jugador O Gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            Btn1.setBackground(Color.GREEN);
            Btn5.setBackground(Color.GREEN);
            Btn9.setBackground(Color.GREEN);
            oCount++;
            gameScore();
            
        }
          if (b3 == ("O") && b5 == ("O") && b7 == ("O") )
        {
            JOptionPane.showMessageDialog(this, "Jugador O Gana", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            Btn3.setBackground(Color.GREEN);
            Btn5.setBackground(Color.GREEN);
            Btn7.setBackground(Color.GREEN);
            oCount++;
            gameScore();
            
        }
    }
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Btn1 = new javax.swing.JButton();
        Btn2 = new javax.swing.JButton();
        Btn3 = new javax.swing.JButton();
        Btn4 = new javax.swing.JButton();
        Btn5 = new javax.swing.JButton();
        Btn6 = new javax.swing.JButton();
        Btn7 = new javax.swing.JButton();
        Btn8 = new javax.swing.JButton();
        Btn9 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        LblJugadorO = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        LblJugadorX = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        BtnSalir = new javax.swing.JButton();
        BtnNuevoJuego = new javax.swing.JButton();
        BtnResetear = new javax.swing.JButton();
        jPanel20 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(195, 26, 43));

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanel2.setPreferredSize(new java.awt.Dimension(500, 500));

        Btn1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn1ActionPerformed(evt);
            }
        });

        Btn2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn2ActionPerformed(evt);
            }
        });

        Btn3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn3ActionPerformed(evt);
            }
        });

        Btn4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn4ActionPerformed(evt);
            }
        });

        Btn5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn5ActionPerformed(evt);
            }
        });

        Btn6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn6ActionPerformed(evt);
            }
        });

        Btn7.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn7ActionPerformed(evt);
            }
        });

        Btn8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn8ActionPerformed(evt);
            }
        });

        Btn9.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        Btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn4, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn5, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Btn3, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn6, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn9, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Btn9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Btn7, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        LblJugadorO.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        LblJugadorO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblJugadorO.setText("0");
        LblJugadorO.setOpaque(true);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Jugador O:");
        jLabel2.setPreferredSize(new java.awt.Dimension(196, 44));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("Jugador X:");

        LblJugadorX.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        LblJugadorX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblJugadorX.setText("0");
        LblJugadorX.setOpaque(true);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LblJugadorX, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LblJugadorO, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblJugadorX, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LblJugadorO, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        BtnSalir.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        BtnSalir.setText("Salir");
        BtnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnSalirActionPerformed(evt);
            }
        });

        BtnNuevoJuego.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        BtnNuevoJuego.setText("Nuevo Juego");
        BtnNuevoJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNuevoJuegoActionPerformed(evt);
            }
        });

        BtnResetear.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        BtnResetear.setText("Resetear");
        BtnResetear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnResetearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(BtnResetear, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BtnNuevoJuego, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BtnNuevoJuego, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnResetear, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel20.setBackground(new java.awt.Color(195, 26, 43));
        jPanel20.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 66, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

        private JFrame frame;
    
    private void Btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn3ActionPerformed
        Btn3.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
        checker = false;
        }
        else
        {
         checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_Btn3ActionPerformed

    private void Btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn6ActionPerformed
        Btn6.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
        checker = false;
        }
        else
        {
         checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_Btn6ActionPerformed

    private void Btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn9ActionPerformed
        Btn9.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
        checker = false;
        }
        else
        {
         checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_Btn9ActionPerformed

    private void BtnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnSalirActionPerformed
        frame = new JFrame ("Salir");
        if (JOptionPane.showConfirmDialog(frame, "¿DESEA SALIR?", "Tic Tac Toe", 
                JOptionPane.YES_NO_OPTION ) == JOptionPane.YES_NO_OPTION)
        {
            System.exit(0);
        }
    }//GEN-LAST:event_BtnSalirActionPerformed

    private void BtnResetearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnResetearActionPerformed
        Btn1.setEnabled(true);
        Btn2.setEnabled(true);
        Btn3.setEnabled(true);
        Btn4.setEnabled(true);
        Btn5.setEnabled(true);
        Btn6.setEnabled(true);
        Btn7.setEnabled(true);
        Btn8.setEnabled(true);
        Btn9.setEnabled(true);
        
        LblJugadorX.setText("0");
        LblJugadorO.setText("0");
        
        Btn1.setText("");
        Btn2.setText("");
        Btn3.setText("");
        Btn4.setText("");
        Btn5.setText("");
        Btn6.setText("");
        Btn7.setText("");
        Btn8.setText("");
        Btn9.setText("");
        
        Btn1.setBackground(Color.LIGHT_GRAY);
        Btn2.setBackground(Color.LIGHT_GRAY);
        Btn3.setBackground(Color.LIGHT_GRAY);
        Btn4.setBackground(Color.LIGHT_GRAY);
        Btn5.setBackground(Color.LIGHT_GRAY);
        Btn6.setBackground(Color.LIGHT_GRAY);
        Btn7.setBackground(Color.LIGHT_GRAY);
        Btn8.setBackground(Color.LIGHT_GRAY);
        Btn9.setBackground(Color.LIGHT_GRAY);
        
    }//GEN-LAST:event_BtnResetearActionPerformed

    private void BtnNuevoJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNuevoJuegoActionPerformed
        Btn1.setEnabled(true);
        Btn2.setEnabled(true);
        Btn3.setEnabled(true);
        Btn4.setEnabled(true);
        Btn5.setEnabled(true);
        Btn6.setEnabled(true);
        Btn7.setEnabled(true);
        Btn8.setEnabled(true);
        Btn9.setEnabled(true);
        
        Btn1.setText("");
        Btn2.setText("");
        Btn3.setText("");
        Btn4.setText("");
        Btn5.setText("");
        Btn6.setText("");
        Btn7.setText("");
        Btn8.setText("");
        Btn9.setText("");
        
        Btn1.setBackground(Color.LIGHT_GRAY);
        Btn2.setBackground(Color.LIGHT_GRAY);
        Btn3.setBackground(Color.LIGHT_GRAY);
        Btn4.setBackground(Color.LIGHT_GRAY);
        Btn5.setBackground(Color.LIGHT_GRAY);
        Btn6.setBackground(Color.LIGHT_GRAY);
        Btn7.setBackground(Color.LIGHT_GRAY);
        Btn8.setBackground(Color.LIGHT_GRAY);
        Btn9.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_BtnNuevoJuegoActionPerformed

    private void Btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn1ActionPerformed
        Btn1.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
        checker = false;
        }
        else
        {
         checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_Btn1ActionPerformed

    private void Btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn2ActionPerformed
                Btn2.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
        checker = false;
        }
        else
        {
         checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_Btn2ActionPerformed

    private void Btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn4ActionPerformed
        Btn4.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
        checker = false;
        }
        else
        {
         checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_Btn4ActionPerformed

    private void Btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn5ActionPerformed
        Btn5.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
        checker = false;
        }
        else
        {
         checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_Btn5ActionPerformed

    private void Btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn7ActionPerformed
        
        Btn7.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
        checker = false;
        }
        else
        {
         checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_Btn7ActionPerformed

    private void Btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn8ActionPerformed
        Btn8.setText(startGame);
        
        if (startGame.equalsIgnoreCase("X"))
        {
        checker = false;
        }
        else
        {
         checker = true;
        }
        choose_a_Player();
        winningGame();
    }//GEN-LAST:event_Btn8ActionPerformed
    

    
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
            java.util.logging.Logger.getLogger(MainTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainTicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainTicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn1;
    private javax.swing.JButton Btn2;
    private javax.swing.JButton Btn3;
    private javax.swing.JButton Btn4;
    private javax.swing.JButton Btn5;
    private javax.swing.JButton Btn6;
    private javax.swing.JButton Btn7;
    private javax.swing.JButton Btn8;
    private javax.swing.JButton Btn9;
    private javax.swing.JButton BtnNuevoJuego;
    private javax.swing.JButton BtnResetear;
    private javax.swing.JButton BtnSalir;
    private javax.swing.JLabel LblJugadorO;
    private javax.swing.JLabel LblJugadorX;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    // End of variables declaration//GEN-END:variables
}
