package projeto_so_processos.model;

/**
 *
 * @author a1980009
 */
public class Processo implements Comparable<Processo>{
    private String nome;
    protected int tempo;
    private EstadoProcesso estado;
    private int pos;

    public Processo(String nome, int tempo, EstadoProcesso estado) {
        this.nome = nome;
        this.tempo = tempo;
        this.estado = estado;
    }
    
    public void updateTime(){
        this.tempo = this.tempo - 10;
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
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
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
