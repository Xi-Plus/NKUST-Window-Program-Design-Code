
import java.awt.Color;
import java.util.*;

public class main extends javax.swing.JFrame {

    /**
     * Creates new form main
     */
    public main() {
        initComponents();
        resetGame();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botCard = new javax.swing.JLabel();
        userCard = new javax.swing.JLabel();
        centerCard = new javax.swing.JLabel();
        botBtn = new javax.swing.JButton();
        userBtn = new javax.swing.JButton();
        statusLabel = new javax.swing.JLabel();
        restartBtn = new javax.swing.JButton();
        botScoreLabel = new javax.swing.JLabel();
        userScoreLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("1105108138 黃宣喻");
        setResizable(false);

        botCard.setBackground(new java.awt.Color(0, 255, 0));
        botCard.setFont(new java.awt.Font("新細明體", 0, 18)); // NOI18N
        botCard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botCard.setText("電腦");
        botCard.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botCard.setOpaque(true);
        botCard.setPreferredSize(new java.awt.Dimension(71, 96));

        userCard.setBackground(new java.awt.Color(0, 255, 255));
        userCard.setFont(new java.awt.Font("新細明體", 0, 18)); // NOI18N
        userCard.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userCard.setText("玩家");
        userCard.setOpaque(true);
        userCard.setPreferredSize(new java.awt.Dimension(71, 96));

        centerCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Poker.jpg"))); // NOI18N
        centerCard.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        centerCard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                centerCardMouseClicked(evt);
            }
        });

        botBtn.setFont(new java.awt.Font("新細明體", 0, 18)); // NOI18N
        botBtn.setText("電腦取牌");
        botBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botBtnMouseClicked(evt);
            }
        });

        userBtn.setFont(new java.awt.Font("新細明體", 0, 18)); // NOI18N
        userBtn.setText("玩家丟牌");
        userBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userBtnMouseClicked(evt);
            }
        });

        statusLabel.setFont(new java.awt.Font("新細明體", 1, 18)); // NOI18N
        statusLabel.setForeground(new java.awt.Color(255, 0, 0));
        statusLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        statusLabel.setText("結果");
        statusLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0), 2));

        restartBtn.setFont(new java.awt.Font("新細明體", 0, 18)); // NOI18N
        restartBtn.setText("重新開始");
        restartBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                restartBtnMouseClicked(evt);
            }
        });

        botScoreLabel.setFont(new java.awt.Font("新細明體", 1, 18)); // NOI18N
        botScoreLabel.setForeground(new java.awt.Color(0, 0, 255));
        botScoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        botScoreLabel.setText("0");

        userScoreLabel.setFont(new java.awt.Font("新細明體", 1, 18)); // NOI18N
        userScoreLabel.setForeground(new java.awt.Color(0, 0, 255));
        userScoreLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        userScoreLabel.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(botBtn)
                        .addGap(18, 18, 18)
                        .addComponent(userBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(botCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(centerCard)
                        .addGap(18, 18, 18)
                        .addComponent(userCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(botScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(restartBtn)
                .addGap(55, 55, 55)
                .addComponent(userScoreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userCard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botCard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(centerCard))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botBtn)
                    .addComponent(userBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(statusLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(restartBtn)
                    .addComponent(botScoreLabel)
                    .addComponent(userScoreLabel))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botBtnMouseClicked
        if (!botGetCard) {
            if (checkCanGetCard()) {
                lockBotGetCard();
                botCard.setText(null);
                botCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+cardList[cardIndex]+".gif")));
                botNum = (cardList[cardIndex]%13 == 0 ? 13 : cardList[cardIndex]%13);
                cardIndex ++;
                checkGameResult();
            }
        }
    }//GEN-LAST:event_botBtnMouseClicked

    private void centerCardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_centerCardMouseClicked
         if (!userGetCard) {
            if (checkCanGetCard()) {
                lockUserGetCard();
                userCard.setText(null);
                userCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+cardList[cardIndex]+".gif")));
                userNum = (cardList[cardIndex]%13 == 0 ? 13 : cardList[cardIndex]%13);
                centerCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Poker.jpg")));
                cardIndex ++;
                checkGameResult();
            }
        }
    }//GEN-LAST:event_centerCardMouseClicked

    private void restartBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_restartBtnMouseClicked
        resetGame();
    }//GEN-LAST:event_restartBtnMouseClicked

    private void userBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userBtnMouseClicked
        if (!userGetCard) {
            if (checkCanGetCard()) {
                System.out.println("user skip card "+cardIndex+" "+cardList[cardIndex]%13);
                centerCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/"+cardList[cardIndex]+".gif")));
                cardIndex ++;
            }
        }
    }//GEN-LAST:event_userBtnMouseClicked

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botBtn;
    private javax.swing.JLabel botCard;
    private javax.swing.JLabel botScoreLabel;
    private javax.swing.JLabel centerCard;
    private javax.swing.JButton restartBtn;
    private javax.swing.JLabel statusLabel;
    private javax.swing.JButton userBtn;
    private javax.swing.JLabel userCard;
    private javax.swing.JLabel userScoreLabel;
    // End of variables declaration//GEN-END:variables
    private int cardList[];
    private int botScore = 0;
    private int userScore = 0;
    private boolean botGetCard;
    private boolean userGetCard;
    private int userNum;
    private int botNum;
    private int cardIndex;
    private final int cardMax = 52;
    
    private void resetGame() {
        System.out.println("resetGame");
        
        botCard.setBackground(Color.GREEN);
        botCard.setText("電腦");
        userCard.setBackground(Color.CYAN);
        userCard.setText("玩家");
        centerCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Poker.jpg")));
        botCard.setIcon(null);
        userCard.setIcon(null);
        
        List<Integer> s = new ArrayList<Integer>();
        for (int i = 1; i <= cardMax; i++) {
            s.add(i);
        }
        Collections.shuffle(s);
        cardList = s.stream().mapToInt(i->i).toArray();
        for (int i = 0; i < cardList.length; i++) {
            System.out.print(cardList[i]%13+" ");
        }
        System.out.println();
        
        botGetCard = false;
        userGetCard = false;
        botNum = -1;
        userNum = -1;
        cardIndex = 0;
        botBtn.setEnabled(true);
        userBtn.setEnabled(true);
        statusLabel.setText(null);
    }
    
    private void lockBotGetCard() {
        botGetCard = true;
        botBtn.setEnabled(false);
    }
    
    private void lockUserGetCard() {
        userGetCard = true;
        userBtn.setEnabled(false);
    }

    private boolean checkCanGetCard() {
        if (cardIndex >= cardMax) {
            lockBotGetCard();
            lockUserGetCard();
            centerCard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/CardEmpty.jpg")));
            return false;
        }
        return true;
    }

    private void checkGameResult() {
        if (userNum != -1 && botNum != -1) {
            if (userNum > botNum) {
                statusLabel.setText("玩家獲勝！");
                userScore ++;
                userScoreLabel.setText(userScore+"");
            } else if (userNum < botNum) {
                statusLabel.setText("電腦獲勝！");
                botScore ++;
                botScoreLabel.setText(botScore+"");
            } else {
                statusLabel.setText("平手！");
            }
        }
    }
}
