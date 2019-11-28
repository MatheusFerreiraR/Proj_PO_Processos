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
        
        this.createListProcess();
        this.listaProcessWai = new ArrayList<>();
        this.listaProcessSuc = new ArrayList<>();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(BarraProgresso, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 260, 30));

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

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 260, 50));

        tabProcess.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Tempo", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tabProcess);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 260, 370));

        tabProcessSucess.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Estado"
            }
        ));
        jScrollPane4.setViewportView(tabProcessSucess);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 250, 160));

        jbRunSmulation.setText("Inciar Simulação");
        jbRunSmulation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRunSmulationActionPerformed(evt);
            }
        });
        getContentPane().add(jbRunSmulation, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 60, 160, 50));

        jLabel1.setText("Processos em execução");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jLabel4.setText("Lista de Processos");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jLabel5.setText("Processos em andamento");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        jLabel6.setText("Processos concluidos");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 230, -1, -1));

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

        getContentPane().add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 260, 260, 160));

        setSize(new java.awt.Dimension(915, 483));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbRunSmulationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRunSmulationActionPerformed
        if(this.iniciado){
            JOptionPane.showMessageDialog(null, "Simulação já inicializada!!");
        }else if(listaProcesso.size() == 0){
            JOptionPane.showMessageDialog(null, "Nenhum processo adicionado");            
        }else{
            this.iniciado = true;
            
            this.RunSimulation();
            

//            this.iniciado = false;  
        }
    }//GEN-LAST:event_jbRunSmulationActionPerformed
    
    private void createListProcess(){
        
        this.listaProcesso = new ArrayList(); 
        Random tempo = new Random();
        
        for (int i = 0; i < 10; i++) {
            this.listaProcesso.add(new Processo("Processo - "+(i+1), tempo.nextInt(15)+1, EstadoProcesso.INICIADO));
        }
        
        this.addTableProcess();
    }
    
    private void RunSimulation(){
        
        DefaultTableModel jtabR =  (DefaultTableModel) tabProcessRun.getModel();
        DefaultTableModel jtabP =  (DefaultTableModel) tabProcess.getModel();
        
        jtabP.removeRow(0);
//        if(tabProcessRun.WIDTH > 0)
//            
        this.listaProcesso.get(0).setEstado(EstadoProcesso.EXECUTANDO);
        Object[] obj = {
            this.listaProcesso.get(0).getNome(), 
            this.listaProcesso.get(0).getTempo(),
            this.listaProcesso.get(0).getEstado()};
    
        jtabR.addRow(obj);
        
        this.processRun = listaProcesso.get(0); 
        listaProcesso.remove(0);
        
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
        
        for (Processo process : this.listaProcesso) {
            Object[] obj = {process.getNome(), process.getTempo(), process.getEstado()};
            jtab.addRow(obj);
        }
    }
    
    public void upgradBarProcess(){
        this.BarraProgresso.setValue(0);
        this.BarraProgresso.setMaximum(10);
    }
    
    public void upgradListTable(){
        
        this.upgradBarProcess();
        
        DefaultTableModel jtabRun =  (DefaultTableModel) tabProcessRun.getModel();
        DefaultTableModel jtabSuc =  (DefaultTableModel) tabProcessSucess.getModel();
        DefaultTableModel jtabWait =  (DefaultTableModel) tabProcessWait.getModel();
        
        

        if((this.processRun.getTempo() - 10) <= 0){
            this.processRun.setEstado(EstadoProcesso.CONCLUIDO);
            Object[] obj = {this.processRun.getNome(), this.processRun.getEstado()};
            this.listaProcessSuc.add(this.processRun);
            jtabSuc.addRow(obj);
        }else{
            this.processRun.setEstado(EstadoProcesso.ESPERANDO);
            this.processRun.updateTime();
            Object[] obj = {this.processRun.getNome(), this.processRun.getTempo(), this.processRun.getEstado()};
            this.listaProcessWai.add(this.processRun);
            jtabWait.addRow(obj);
//        Chamando a Thread Que simula o tempo de processo
            new WaitProcess().start();
        }
        
        if(this.listaProcesso.size() >= 0){
            this.RunSimulation();
        }else if(this.listaProcessWai.size() != 0){
            System.out.println("Teste");
        }else{
            JOptionPane.showMessageDialog(null, "Concluido");
        }
        
        jtabRun.removeRow(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar BarraProgresso;
    private javax.swing.JLabel jLabel1;
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
            int acrecimo;
            if (((int) (BarraProgresso.getMaximum() * 0.1)) == 0){
                acrecimo = 1;
            }else{
                acrecimo = ((int) (BarraProgresso.getMaximum() * 0.1));
            }
            
            while(BarraProgresso.getValue() < BarraProgresso.getMaximum()){
                try {
                    sleep(1000);
                    BarraProgresso.setValue(BarraProgresso.getValue() + acrecimo);
                    BarraProgresso.repaint();
                } catch (InterruptedException ex) {
                    Logger.getLogger(Processing.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            upgradListTable();
        }
        
    }
    
    public class WaitProcess extends Thread{
        
        @Override
        public void  run(){
            try {
                sleep(5000);
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
    
}
