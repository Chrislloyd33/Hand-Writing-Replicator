package hand.writing.replicator;

import com.sun.corba.se.impl.protocol.giopmsgheaders.Message;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.CubicCurve2D;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author jobinrjohnson
 */
public class Testing2 extends javax.swing.JFrame {

    /**
     * Creates new form Testing2
     */
    Testing2.CanvasPanel canvas;

    float startx = 20, starty = 20, endy = starty + 200, endx = startx + 170;

    public Testing2() {
        initComponents();
        initDrawingBoard();
    }

    public void initDrawingBoard() {
        canvas = new Testing2.CanvasPanel();
        canvas.setBackground(new Color(255, 255, 255));
        jPanel1.setLayout(new BorderLayout());
        jPanel1.add(canvas, BorderLayout.NORTH);

        float[] f1 = {startx, endy, ((startx + endy) / 2) + endy / 4, 0, ((startx + endy) / 2) - endy / 4, 0, endx, endy};
        canvas.paintRepaint1(f1);
        float[] f2 = {endx, endy, 21.0f, 26.0f, startx, endx, startx, endy};
        canvas.paintRepaint2(f2);
        pack();
    }

    class CanvasPanel extends JPanel {

        Graphics2D gx;
        float[] firstOne = {0, 0, 0, 0, 0, 0, 0, 0};
        float[] secondOne = {0, 0, 0, 0, 0, 0, 0, 0};
        float[] thirdOne = {0, 0, 0, 0, 0, 0, 0, 0};

        CanvasPanel() {
            setPreferredSize(new Dimension(420, 420));
        }

        public void paintRepaint1(float[] f1) {
            firstOne = f1;
            repaint();
        }

        public void paintRepaint2(float[] f2) {
            secondOne = f2;
            repaint();
        }

        public void paintRepaint3(float[] f3) {
            thirdOne = f3;
            repaint();
        }

        public void paintRepaint(float[] f1, float[] f2, float[] f3) {
            firstOne = f1;
            secondOne = f2;
            thirdOne = f3;
            repaint();
        }

        @Override
        public void paintComponent(Graphics g) {
            super.paintComponent(g);
            gx = (Graphics2D) g;
            Random rnd = new Random();
            gx.setStroke(new BasicStroke(2f));

            RenderingHints rh = new RenderingHints(
                    RenderingHints.KEY_ANTIALIASING,
                    RenderingHints.VALUE_ANTIALIAS_ON);
            gx.setRenderingHints(rh);

            CubicCurve2D shape = new CubicCurve2D.Float();
            CubicCurve2D shape2 = new CubicCurve2D.Float();
            CubicCurve2D shape3 = new CubicCurve2D.Float();

            gx.setColor(new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
            shape.setCurve(firstOne[0], firstOne[1], firstOne[2], firstOne[3], firstOne[4], firstOne[5], firstOne[6], firstOne[7]);
            gx.draw(shape);

            gx.setColor(new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
            shape2.setCurve(secondOne[0], secondOne[1], secondOne[2], secondOne[3], secondOne[4], secondOne[5], secondOne[6], secondOne[7]);
            gx.draw(shape2);

            gx.setColor(new Color(rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256)));
            shape3.setCurve(thirdOne[0], thirdOne[1], thirdOne[2], thirdOne[3], thirdOne[4], thirdOne[5], thirdOne[6], thirdOne[7]);
            gx.draw(shape3);

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 278, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Testing2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Testing2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Testing2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Testing2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Testing2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
