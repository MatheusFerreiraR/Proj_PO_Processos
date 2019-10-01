package projeto_so_processos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a1980009
 */
public class Memoria {
    private int tempoDispo;
    private List<Processo> processos;

    public Memoria(int tempoDispo) {
        this.tempoDispo = tempoDispo;
        this.processos = new ArrayList();
    }

    public int getTamanho() {
        return tempoDispo;
    }

    public void setTamanho(int tempoDispo) {
        this.tempoDispo = tempoDispo;
    }

    public int getTempoDispo() {
        return tempoDispo;
    }

    public void setTempoDispo(int tempoDispo) {
        this.tempoDispo = tempoDispo;
    }

    public List<Processo> getProcessos() {
        return processos;
    }

    public void setProcessos(Processo processos) {
        this.processos.add(processos);
    }
    
}
