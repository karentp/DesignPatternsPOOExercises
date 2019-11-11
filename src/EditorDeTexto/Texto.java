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
public class Texto {
    private int numIdentificador;
    private String textoGuardado;

    public Texto() {
    }

    public Texto(int numIdentificador, String textoGuardado) {
        this.numIdentificador = numIdentificador;
        this.textoGuardado = textoGuardado;
    }

    public int getNumIdentificador() {
        return numIdentificador;
    }

    public void setNumIdentificador(int numIdentificador) {
        this.numIdentificador = numIdentificador;
    }

    public String getTextoGuardado() {
        return textoGuardado;
    }

    public void setTextoGuardado(String textoGuardado) {
        this.textoGuardado = textoGuardado;
    }
    
    public TextoMemento createMemento(){
        return new TextoMemento(this);
    }
    
    public void restoreMemento(TextoMemento memento){
        Texto texto= memento.getMemento();
        this.numIdentificador= texto.getNumIdentificador();
        this.textoGuardado= texto.getTextoGuardado();
    }
     
    
}
