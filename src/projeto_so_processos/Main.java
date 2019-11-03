package projeto_so_processos;

import projeto_so_processos.model.Memoria;
import projeto_so_processos.view.TelaProcessos;

/**
 *
 * @author a1980009
 */
public class Main {
    public static void main(String[] args) {
        //Processo proc1 = new Processo("click", 12, 0);
        Memoria memoria = new Memoria(10);
        
        
        TelaProcessos tela = new TelaProcessos();
        tela.setVisible(true);
        
    }
    
}
