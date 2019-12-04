package projeto_so_processos.model;

import java.util.Random;

/**
 * @author Professor Xavier
 * @author a1980009
 */
public class Processo implements Comparable<Processo>{
//    Atributos
    private String nome;
    protected int tempo;
    private EstadoProcesso estado;
    private int posicao;
    private Boolean complementary;
    private int qtdComplementary;
    private int tempoTotal;

//    Construtor
    public Processo(String nome, int tempo, EstadoProcesso estado, Boolean complementary, int posicao) {
        this.nome = nome;
        this.tempo = tempo;
        this.tempoTotal = tempo;
        this.estado = estado;
        this.complementary = complementary;
        this.addComplementary();
        this.posicao = posicao;
    }
    
//    My Métodos
    public void updateTime(){
        this.tempo = this.tempo - 10;
    }
    
    public void addComplementary() {
        
        if(this.complementary){this.qtdComplementary = 0;
        }else{
            Random qtd = new Random();
            this.qtdComplementary = qtd.nextInt(4);
        }
    }
    
//    Gets and Sets

    public int getTempoTotal() {
        return tempoTotal;
    }

    public void setTempoTotal(int tempoTotal) {
        this.tempoTotal = tempoTotal;
    }
    
    
    public int getQtdComplementary() {
        return qtdComplementary;
    }
    
    public Boolean isComplementary() {
        return complementary;
    }

    public void setComplementary(Boolean complementary) {
        this.complementary = complementary;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public EstadoProcesso getEstado() {
        return estado;
    }

    public void setEstado(EstadoProcesso estado) {
        this.estado = estado;
    }

    public int getPos() {
        return posicao;
    }

    public void setPos(int posicao) {
        this.posicao = posicao;
    }

    @Override
    public int compareTo(Processo otherProcess) {
        if( this.tempo < otherProcess.getTempo()){
            return -1 ;
        }else if( this.tempo > otherProcess.getTempo()){
            return +1 ;
        }else{
            return 0;
        }
    }
    
    
}
