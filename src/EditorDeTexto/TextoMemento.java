/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EditorDeTexto;

/**
 *
 * @author Karen TP
 */
public class TextoMemento {
    
    private Texto texto;
    
    public TextoMemento(Texto textoP) {
        this.texto=textoP;
    }

    public Texto getTexto() {
        return texto;
    }

    public void setTexto(Texto texto) {
        this.texto = texto;
    }
    
    public Texto getMemento(){
        return texto;
    }
    
    
}
