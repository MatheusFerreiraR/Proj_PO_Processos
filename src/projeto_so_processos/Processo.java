package projeto_so_processos;

/**
 *
 * @author a1980009
 */
public class Processo {
    private String nome;
    private int tempo;
    private int estado;

    public Processo(String nome, int tempo, int estado) {
        this.nome = nome;
        this.tempo = tempo;
        this.estado = estado;
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
    
}
