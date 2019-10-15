package projeto_so_processos;

/**
 *
 * @author a1980009
 */
public class Processo {
    private String nome;
    private int tempo;
    private int estado;
    private int pos;

    public Processo(int pos, String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        this.pos = pos;
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

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getPos() {
        return pos;
    }

    public void setPos(int pos) {
        this.pos = pos;
    }
    
    
}
