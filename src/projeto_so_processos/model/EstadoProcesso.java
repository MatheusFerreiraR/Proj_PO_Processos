/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto_so_processos.model;

/**
 *
 * @author Jece Xavier
 */
public enum EstadoProcesso {
    
    EXECUTANDO("Executando"),
    CONCLUIDO("Concluido"),
    BLOQUEADO("Bloqueado"),
    PRONTO("Pronto"),
    ESPERANDO("Esperando");
    
    private String nameImg;
   
    EstadoProcesso(String nameImg) {
        this.nameImg = nameImg;
    }
    
    public String getNameImg(){
        return nameImg;
    }
}
