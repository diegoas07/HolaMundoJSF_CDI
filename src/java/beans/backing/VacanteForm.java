/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.backing;

import beans.model.Candidato;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Desarrollo2
 */
@Named(value = "vacanteForm")
@RequestScoped
public class VacanteForm {

    /**
     * Creates a new instance of VacanteForm
     */
    public VacanteForm() {
    }

    @Inject
    private Candidato candidato;

    /**
     * @return the candidato
     */
    public Candidato getCandidato() {
        return candidato;
    }

    /**
     * @param candidato the candidato to set
     */
    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    
    public String enviar(){
        if (this.candidato.getNombre().equals("Juan")) {
            return "exito";
        }else{
            return "fallo";
        }
    }
    
    
}
