package projeto_so_processos.model;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author a1980009
 */
public class Memoria {
    private int tempoDispo;

    public Memoria(int tempoDispo) {
        this.tempoDispo = tempoDispo;
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
}
