package projeto_so_processos.model;

import projeto_so_processos.model.Processo;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a1980009
 */
public class RN {
    private List<Processo> processos;
    private Processo processo;

    public RN() {
        this.processos = new ArrayList();
    }
    
    int NovosProcessos(Processo proce){
        processos.add(proce);
        
        return 0;
    }
}
