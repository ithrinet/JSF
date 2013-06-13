/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;


import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

/**
 *
 * @author ITHRI
 */
@ManagedBean
public class Numero {
 
    private Integer numero = 5;
    private int correcto = 100;
    

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    
    public String adivinar(){
        String mensaje = "";
        
        if (correcto == numero){
            mensaje = "Has acertado";
            
        }else{
            mensaje=" Lo siento, sigue intentando :(";
        }
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(mensaje));
        return null;
    }
}
