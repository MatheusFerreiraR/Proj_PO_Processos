/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_so_processos.view;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import projeto_so_processos.model.Processo;

/**
 *
 * @author a1980009
 */
public class TelaProcessos extends javax.swing.JFrame {
    private List<Processo> listaProcesso;
    
    
    public TelaProcessos() {
        initComponents();
        
//        Configurando Barra de Progresso
        BarraProgresso.setStringPainted(true);
        BarraProgresso.setValue(50);
        BarraProgresso.setForeground(Color.GREEN);
        
        this.listaProcesso = new ArrayList();        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BarraProgresso = new javax.swing.JProgressBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabProcessRun = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabProcess = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabProcessSucess = new javax.swing.JTable();
        jbNovoProcesso = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNameProcess = new javax.swing.JTextField();
        txtTimeProcess = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabProcessWait = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(BarraProgresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 110, 230, 30));

        tabProcessRun.setModel(new javax.swing.table.DefaultTableModel(
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
        tabProcessRun.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(tabProcessRun);
        tabProcessRun.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 40, 230, 60));

        tabProcess.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane3.setViewportView(tabProcess);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 260, 160));

        tabProcessSucess.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Estado"
            }
        ));
        jScrollPane4.setViewportView(tabProcessSucess);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 250, 160));

        jbNovoProcesso.setText("Novo processo");
        jbNovoProcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoProcessoActionPerformed(evt);
            }
        });
        getContentPane().add(jbNovoProcesso, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 120, 40));

        jLabel1.setText("Processos em execução");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));
        getContentPane().add(txtNameProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 210, 30));
        getContentPane().add(txtTimeProcess, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 210, 30));

        jLabel2.setText("Time do Processo (em segundos):");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel3.setText("Nome o Processo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        jLabel4.setText("Lista de Processos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, -1, -1));

        jLabel5.setText("Processos em andamento");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        jLabel6.setText("Processos concluidos");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 230, -1, -1));

        tabProcessWait.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane5.setViewportView(tabProcessWait);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 260, 160));

        setSize(new java.awt.Dimension(915, 483));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbNovoProcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoProcessoActionPerformed

       
       if(txtNameProcess.getText().equals("") || txtTimeProcess.getText().equals("")){
           JOptionPane.showMessageDialog(null, "ERROR! Necessário preencher os campos");
       }else{
           try {
               String name = txtNameProcess.getText();
               int time  = Integer.parseInt(txtTimeProcess.getText());
           
               listaProcesso.add(new Processo(listaProcesso.size(), name, time));
               this.addTableProcess();
               
           } catch (Exception e) {
               JOptionPane.showMessageDialog(null, "ERROR! O tempo deve ser um número inteiro!");
           }
           
       }
    }//GEN-LAST:event_jbNovoProcessoActionPerformed

    public void addTableProcess(){
        DefaultTableModel jtab =  (DefaultTableModel) tabProcess.getModel();
        
        jtab.setRowCount(0);
        
        for (Processo process : listaProcesso) {
            Object[] obj = {process.getPos(),process.getNome(), process.getTempo()};
            jtab.addRow(obj);
        }
    }
    
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton jbNovoProcesso;
    private javax.swing.JTable tabProcess;
    private javax.swing.JTable tabProcessRun;
    private javax.swing.JTable tabProcessSucess;
    private javax.swing.JTable tabProcessWait;
    private javax.swing.JTextField txtNameProcess;
    private javax.swing.JTextField txtTimeProcess;
    // End of variables declaration//GEN-END:variables

    public class Temporizador extends Thread{
    
        private int limit;

        public Temporizador(int limit) {
            this.limit = limit;
        }
        public void run(){
            while(BarraProgresso.getValue() <= limit){
                try {
                    sleep(1000);
                    BarraProgresso.setValue(BarraProgresso.getValue() + 1);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Temporizador.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            this.limit = limit;
        }
        
        
    }
    
}
