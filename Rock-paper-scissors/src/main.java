/**
 *
 * @author xiplus
 */
public class main extends javax.swing.JFrame {

    /**
     * Creates new form Rock-paper-scissors
     */
    public main() {
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

        userimg = new javax.swing.JLabel();
        botimg = new javax.swing.JLabel();
        userbtn = new javax.swing.JButton();
        resultimg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        userimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/scissors.gif"))); // NOI18N
        userimg.setToolTipText("點選換圖片");
        userimg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userimgMouseClicked(evt);
            }
        });

        botimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/scissors.gif"))); // NOI18N

        userbtn.setText("猜拳");
        userbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(resultimg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botimg, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(userbtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(userimg))))
                .addGap(46, 46, 46))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botimg, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userimg, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(userbtn)
                .addGap(40, 40, 40)
                .addComponent(resultimg, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int userans = 0;
    private void userimgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userimgMouseClicked
        userans++;
        userans%=3;
        System.out.println(userans);
        switch(userans) {
            case 0:
                userimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/scissors.gif")));
                break;
            case 1:
                userimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rock.gif")));
                break;
            case 2:
                userimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/paper.gif")));
                break;
        }
    }//GEN-LAST:event_userimgMouseClicked

    private void userbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userbtnActionPerformed
        resultimg.setIcon(null);
        int botans = (int)Math.floor(Math.random()*3);
        switch(botans) {
            case 0:
                botimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/scissors.gif")));
                break;
            case 1:
                botimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/rock.gif")));
                break;
            case 2:
                botimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/paper.gif")));
                break;
        }
        
        botans = (botans-userans+3)%3;
        switch(botans) {
            case 0:
                resultimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/draw.gif")));
                break;
            case 1:
                resultimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/loss.gif")));
                break;
            case 2:
                resultimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/win.gif")));
                break;
        }
    }//GEN-LAST:event_userbtnActionPerformed

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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel botimg;
    private javax.swing.JLabel resultimg;
    private javax.swing.JButton userbtn;
    private javax.swing.JLabel userimg;
    // End of variables declaration//GEN-END:variables
}