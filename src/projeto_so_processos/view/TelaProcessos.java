/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_so_processos.view;

import java.awt.Color;
import static java.lang.Thread.sleep;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.print.Collation;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;
import projeto_so_processos.model.EstadoProcesso;
import projeto_so_processos.model.Processo;

/**
 *
 * @author a1980009
 */
public class TelaProcessos extends javax.swing.JFrame {
    private List<Processo> listaProcesso;
    private List<Processo> listaProcessWai;
    private List<Processo> listaProcessSuc;
    private Processo processRun;
    private  boolean iniciado;
    
    
    public TelaProcessos() {
        initComponents();
        
//        inicializando flag
        this.iniciado = false;
        
//        Configurando Barra de Progresso
        BarraProgresso.setStringPainted(true);
        BarraProgresso.setMaximum(10);
        BarraProgresso.setValue(0);
        BarraProgresso.setForeground(Color.GREEN);
        
        BarraProgressoCriacao.setStringPainted(true);
        BarraProgressoCriacao.setMaximum(100);
        BarraProgressoCriacao.setValue(0);
        BarraProgressoCriacao.setForeground(Color.GREEN);
        
        this.listaProcesso = new ArrayList(); 
        this.listaProcessWai = new ArrayList<>();
        this.listaProcessSuc = new ArrayList<>();
        
        this.createListProcess("Processo - ", false, 2);
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
        jbRunSmulation = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tabProcessWait = new javax.swing.JTable();
        BarraProgressoCriacao = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(BarraProgresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 100, 260, 30));

        tabProcessRun.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Tempo", "Estado"
            }
        ));
        tabProcessRun.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(tabProcessRun);
        tabProcessRun.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 50, 260, 50));

        tabProcess.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Tempo", "Dependência", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabProcess);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 380, 310));

        tabProcessSucess.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Tempo", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tabProcessSucess);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 50, 250, 310));

        jbRunSmulation.setText("Inciar Simulação");
        jbRunSmulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRunSmulationActionPerformed(evt);
            }
        });
        getContentPane().add(jbRunSmulation, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 370, 160, 50));

        jLabel1.setText("Criando Processo Complementar");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 310, -1, -1));

        jLabel4.setText("Lista de Processos Prontos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 30, -1, -1));

        jLabel5.setText("Processos bloqueados");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 30, -1, -1));

        jLabel6.setText("Processos concluidos");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 30, -1, -1));

        tabProcessWait.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Tempo", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tabProcessWait);

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, 260, 310));
        getContentPane().add(BarraProgressoCriacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 330, 260, 30));

        jLabel2.setText("Processos em execução");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 30, -1, -1));

        setSize(new java.awt.Dimension(1360, 488));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbRunSmulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRunSmulationActionPerformed
        if(this.iniciado){
            JOptionPane.showMessageDialog(null, "Simulação já inicializada!!");
        }else if(listaProcesso.size() == 0){
            JOptionPane.showMessageDialog(null, "Nenhum processo adicionado");            
        }else{
            this.iniciado = true;
            
            this.runSimulation();
            

//            this.iniciado = false;  
        }
    }//GEN-LAST:event_jbRunSmulationActionPerformed
    
    private void createListProcess(String name, Boolean complementary, int qtdProcess){
        Random tempo = new Random();
        
        for (int i = 0; i < qtdProcess; i++) {
            Processo p = new Processo(name + (i+1), tempo.nextInt(15)+1, EstadoProcesso.PRONTO, complementary, (i+1));
            this.listaProcesso.add(p);
//            System.out.println(this.listaProcesso.get(i).getNome() + " => " + this.listaProcesso.get(i).getQtdComplementary());
        }
        
        this.addTableProcess();
    }
    
    private void runSimulation(){
        
        DefaultTableModel jtabP =  (DefaultTableModel) tabProcess.getModel();
        
        
        while(this.listaProcesso.size() == 0){
            this.runSimulation();
        }
        
        try {
            jtabP.removeRow(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

        this.processRun = listaProcesso.get(0); 
        listaProcesso.remove(0);
        
        if (!this.processRun.isComplementary()) {
            new CreateProcess().start();
        }else{
            this.simulation();
        }
    }
    
    public void simulation(){
        DefaultTableModel jtabR =  (DefaultTableModel) tabProcessRun.getModel();
        
        this.processRun.setEstado(EstadoProcesso.EXECUTANDO);
        Object[] obj = {
            this.processRun.getNome(), 
            this.processRun.getTempo(),
            this.processRun.getEstado()
        };
    
        jtabR.addRow(obj);
        
        
        
        if (this.processRun.getTempo() < 10){
            this.BarraProgresso.setMaximum(this.processRun.getTempo());
        }
        
//        Chamando a Thread Que simula o tempo de processo
        new Processing().start();
    }
    
    public void addTableProcess(){
        DefaultTableModel jtab =  (DefaultTableModel) tabProcess.getModel();
        jtab.setRowCount(0);
        
        Collections.sort(this.listaProcesso);
        jtab.setRowCount(0);
        
//        System.out.println("QTD PRO: " + this.listaProcesso.size());
        
        for (Processo process : this.listaProcesso) {
            Object[] obj = {
                process.getNome(), 
                process.getTempo(),
                process.getQtdComplementary(),
                process.getEstado()
            };
            jtab.addRow(obj);
        }
    }
    
    public void updateBarProcess(){
        this.BarraProgresso.setValue(0);
        this.BarraProgresso.setMaximum(10);
    }
    
    public void updateListTable(){
        
        this.updateBarProcess();
        
        DefaultTableModel jtabRun =  (DefaultTableModel) tabProcessRun.getModel();
        DefaultTableModel jtabSuc =  (DefaultTableModel) tabProcessSucess.getModel();
        DefaultTableModel jtabWait =  (DefaultTableModel) tabProcessWait.getModel();
        
        try {
            jtabRun.removeRow(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }


        if(this.processRun.getTempo() <= 0){
            this.processRun.setEstado(EstadoProcesso.CONCLUIDO);
            Object[] obj = {this.processRun.getNome(), this.processRun.getTempoTotal(), this.processRun.getEstado()};
            this.listaProcessSuc.add(this.processRun);
            jtabSuc.addRow(obj);
        }else{
            this.processRun.setEstado(EstadoProcesso.BLOQUEADO);
            Object[] obj = {this.processRun.getNome(), this.processRun.getTempo(), this.processRun.getEstado()};
            this.listaProcessWai.add(this.processRun);
            jtabWait.addRow(obj);
//        Chamando a Thread Que simula o tempo de processo
            new WaitProcess().start();
        }
        
        if(this.listaProcesso.size() >= 1){
           this.runSimulation();
        }else if(this.listaProcessWai.size() != 0){
            new WaitUpdate().start();
        }else{
            JOptionPane.showMessageDialog(null, "Concluido");
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar BarraProgresso;
    private javax.swing.JProgressBar BarraProgressoCriacao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JButton jbRunSmulation;
    private javax.swing.JTable tabProcess;
    private javax.swing.JTable tabProcessRun;
    private javax.swing.JTable tabProcessSucess;
    private javax.swing.JTable tabProcessWait;
    // End of variables declaration//GEN-END:variables

    public class Processing extends Thread{
        
        @Override
        public void  run(){
            int contador = 0;
            int ma = (BarraProgresso.getMaximum()) * 100;
            BarraProgresso.setMaximum(ma);
            
            while(BarraProgresso.getValue() < BarraProgresso.getMaximum()){
                try {
                    sleep(10);
                    BarraProgresso.setValue(BarraProgresso.getValue() + 1);
                    BarraProgresso.repaint();
                    contador += 10;
                    if ((contador % 1000) == 0) {
                        decreaseTime();
                    }
                    
                } catch (InterruptedException ex) {
                    Logger.getLogger(Processing.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            updateListTable();
        }
        
        public void decreaseTime(){
            DefaultTableModel jtabRun =  (DefaultTableModel) tabProcessRun.getModel();
            processRun.setTempo(processRun.getTempo() - 1);
            Object[] obj = {processRun.getNome(), processRun.getTempo(), processRun.getEstado()};
            jtabRun.removeRow(0);
            jtabRun.insertRow(0, obj);
        }
        
    }
    
    public class WaitProcess extends Thread{
        
        @Override
        public void  run(){
            try {
                sleep(4500);
                listaProcessWai.get(0).setEstado(EstadoProcesso.PRONTO);
                listaProcesso.add(listaProcessWai.get(0));
                listaProcessWai.remove(0);
                
                DefaultTableModel jtabWai =  (DefaultTableModel) tabProcessWait.getModel();
                jtabWai.removeRow(0);
                
                addTableProcess();
                
                
            } catch (InterruptedException ex) {
                Logger.getLogger(WaitProcess.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public class WaitUpdate extends Thread{
        
        @Override
        public void  run(){
            try {
                sleep(5000);
                runSimulation();
            } catch (InterruptedException ex) {
                Logger.getLogger(WaitProcess.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    public class CreateProcess extends Thread{
        
        @Override
        public void  run(){
            int ma = 100 * processRun.getQtdComplementary();
            
            BarraProgressoCriacao.setMaximum(ma);
            
            while(BarraProgressoCriacao.getValue() < BarraProgressoCriacao.getMaximum()){
                try {
                    sleep(10);
                    BarraProgressoCriacao.setValue(BarraProgressoCriacao.getValue() + 1);
                    BarraProgressoCriacao.repaint();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Processing.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            BarraProgressoCriacao.setValue(0);
            createListProcess("Comp " + processRun.getPos() + ".", true, processRun.getQtdComplementary());
            processRun.setComplementary(true);
            simulation();
        }
        
    }
}
