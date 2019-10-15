/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_so_processos;

import java.util.ArrayList;
import java.util.List;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author a1980009
 */
public class TelaProcessos extends javax.swing.JFrame {
    private List<Processo> listaProcesso;
    
     int i = 0;
    
    
    public TelaProcessos() {
        initComponents();
        
        this.listaProcesso = new ArrayList();        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTab2 = new javax.swing.JTable();
        BarraProgresso = new javax.swing.JProgressBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTab1 = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTab3 = new javax.swing.JTable();
        jbNovoProcesso = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTab2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Pos", "Nome", "Tempo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTab2);
        if (jTab2.getColumnModel().getColumnCount() > 0) {
            jTab2.getColumnModel().getColumn(0).setHeaderValue("Pos");
            jTab2.getColumnModel().getColumn(2).setHeaderValue("Tempo");
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, 250, 160));
        getContentPane().add(BarraProgresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, 150, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null}
            },
            new String [] {
                "Nome", "Tempo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 230, 50));

        jTab1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pos", "Nome", "Tempo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTab1);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 260, 160));

        jTab3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nome", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTab3);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 250, 250, 160));

        jbNovoProcesso.setText("Novo processo");
        jbNovoProcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoProcessoActionPerformed(evt);
            }
        });
        getContentPane().add(jbNovoProcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 120, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbNovoProcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoProcessoActionPerformed
       //Processo proc = new Processo( i, 'azul', 10);
       i++;
       preencherBarraRolagem();
       DefaultTableModel jtab =  (DefaultTableModel) jTab1.getModel();
       Object[] obj = {i,"oi",10  };
       jtab.addRow(obj);
       
//       jTab1.setco
    }//GEN-LAST:event_jbNovoProcessoActionPerformed

    
    public void preencherBarraRolagem(){
        long tempoFrames = 1000/30;
        float progresso = 0.0f;
        long tempoInicial = System.currentTimeMillis();
        long tempoAtual = 0;
        long ti = System.currentTimeMillis();
        float difTempo = 0.0000001f;
        
        while(true){
            tempoAtual = System.currentTimeMillis();
            if(progresso >= 100.0f) break;
            if((tempoAtual - tempoInicial) >=  tempoFrames){
                tempoInicial = tempoAtual;
                progresso += 100.0f / (float)difTempo * ((float)tempoFrames / 1000);
                BarraProgresso.setValue((int)progresso);
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar BarraProgresso;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTab1;
    private javax.swing.JTable jTab2;
    private javax.swing.JTable jTab3;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbNovoProcesso;
    // End of variables declaration//GEN-END:variables
}
