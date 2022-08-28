/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author t247602
 */
public class Veterinario {
    String especies_dominio;
    String disponibilidade;

    public Veterinario(String especies_dominio, String disponibilidade) {
        this.especies_dominio = especies_dominio;
        this.disponibilidade = disponibilidade;
    }

    public String getEspecies_dominio() {
        return especies_dominio;
    }

    public void setEspecies_dominio(String especies_dominio) {
        this.especies_dominio = especies_dominio;
    }

    public String getDisponibilidade() {
        return disponibilidade;
    }

    public void setDisponibilidade(String disponibilidade) {
        this.disponibilidade = disponibilidade;
    }
        
}
