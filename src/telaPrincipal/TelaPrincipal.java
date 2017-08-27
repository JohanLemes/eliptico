package telaPrincipal;

import telaExercicio.NovoExercicio;
import telaPerfil.MeuPerfil;

//importações para o gráfico (início)
import cronometro.Cronometro;
import static cronometro.Cronometro.regressiva;
import grafico.Grafico;
import static grafico.Grafico.valores;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;
import static oracle.jrockit.jfr.events.Bits.intValue;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.ValueAxis;
import org.jfree.chart.plot.XYPlot;
import org.jfree.data.time.Millisecond;
import org.jfree.data.time.TimeSeries;
import org.jfree.data.time.TimeSeriesCollection;
import org.jfree.data.xy.XYDataset;
import org.jfree.ui.RefineryUtilities;
//importações para o gráfico (final)

public class TelaPrincipal extends javax.swing.JFrame {

    private static String arqU;
    
    public TelaPrincipal(String arq) {
        initComponents();
        
        arqU = arq;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuExercicio = new javax.swing.JMenu();
        itemNovoEx = new javax.swing.JMenuItem();
        itemEscolherEx = new javax.swing.JMenuItem();
        itemEditarEx = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        menuUsuario = new javax.swing.JMenu();
        itemHist = new javax.swing.JMenuItem();
        itemEdit = new javax.swing.JMenuItem();
        menuConfig = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton2.setText("Gráfico");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addContainerGap(425, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(283, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        menuExercicio.setText("Exercício");

        itemNovoEx.setText("Novo exercício");
        itemNovoEx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemNovoExActionPerformed(evt);
            }
        });
        menuExercicio.add(itemNovoEx);

        itemEscolherEx.setText("Escolher exercício");
        menuExercicio.add(itemEscolherEx);

        itemEditarEx.setText("Editar exercício");
        menuExercicio.add(itemEditarEx);
        menuExercicio.add(jSeparator1);

        jMenuBar1.add(menuExercicio);

        menuUsuario.setText("Usuário");

        itemHist.setText("Meu histórico");
        menuUsuario.add(itemHist);

        itemEdit.setText("Meu perfil");
        itemEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemEditActionPerformed(evt);
            }
        });
        menuUsuario.add(itemEdit);

        jMenuBar1.add(menuUsuario);

        menuConfig.setText("Configurações");

        jMenuItem7.setText("jMenuItem1");
        menuConfig.add(jMenuItem7);

        jMenuItem8.setText("jMenuItem1");
        menuConfig.add(jMenuItem8);

        jMenuItem9.setText("jMenuItem1");
        menuConfig.add(jMenuItem9);

        jMenuBar1.add(menuConfig);

        menuAjuda.setText("Ajuda");

        jMenuItem10.setText("jMenuItem1");
        menuAjuda.add(jMenuItem10);

        jMenuItem11.setText("jMenuItem1");
        menuAjuda.add(jMenuItem11);

        jMenuItem12.setText("jMenuItem1");
        menuAjuda.add(jMenuItem12);

        jMenuBar1.add(menuAjuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(518, 377));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        double min = Double.parseDouble(JOptionPane.showInputDialog("Tempo de exercicio"));
        double mm = Math.floor(min);
        double seg = (min - mm)*100; 
        min = mm*60 + seg;
        int m = intValue(min);
        valores();
        Cronometro contagem = new Cronometro(0, 0, 0, 0, 0, m+1, regressiva);
        Grafico demo = new Grafico("Velocidades", m);
        contagem.cronometro();
        demo.pack();
        //demo.setSize(500,500);
        this.add(demo.getContentPane());
    }//GEN-LAST:event_jButton2ActionPerformed

    private void itemNovoExActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemNovoExActionPerformed
        new NovoExercicio(arqU).setVisible(true);
    }//GEN-LAST:event_itemNovoExActionPerformed

    private void itemEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemEditActionPerformed
        new MeuPerfil(arqU).setVisible(true);
    }//GEN-LAST:event_itemEditActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal(arqU).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem itemEdit;
    private javax.swing.JMenuItem itemEditarEx;
    private javax.swing.JMenuItem itemEscolherEx;
    private javax.swing.JMenuItem itemHist;
    private javax.swing.JMenuItem itemNovoEx;
    private javax.swing.JButton jButton2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuConfig;
    private javax.swing.JMenu menuExercicio;
    private javax.swing.JMenu menuUsuario;
    // End of variables declaration//GEN-END:variables
}
