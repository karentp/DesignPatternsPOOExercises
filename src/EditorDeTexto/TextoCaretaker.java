/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EditorDeTexto;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * @author Karen TP
 */
public class TextoCaretaker {
    
    private int indiceActual=-1;
    private Stack<TextoMemento> pilaTextosGuardados = new Stack<TextoMemento>();

    public TextoCaretaker() {
    }

    public int getIndiceActual() {
        return indiceActual;
    }

    public void setIndiceActual(int indiceActual) {
        this.indiceActual = indiceActual;
    }

    public Stack<TextoMemento> getPilaTextosGuardados() {
        return pilaTextosGuardados;
    }

    public void setPilaTextosGuardados(Stack<TextoMemento> pilaTextosGuardados) {
        this.pilaTextosGuardados = pilaTextosGuardados;
    }
    
    
    public void addNewMemento(TextoMemento textoMemento){
        pilaTextosGuardados.push(textoMemento);
        indiceActual++;
    }
    
    public TextoMemento getCurrentMemento(){
        return pilaTextosGuardados.peek();
    }
    
    public TextoMemento getPreviousMemento(){
        int indiceAnterior= indiceActual-1;
       
        if(indiceAnterior <=-1 || indiceAnterior >=pilaTextosGuardados.size()-1){
            return null;
        }
        else{
            
            indiceActual= indiceAnterior;
            return pilaTextosGuardados.pop();
        }
    }  
    
}
