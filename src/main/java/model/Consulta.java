/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author t247602
 */
public class Consulta {
    int id;
    float valor;
    String sintomas;
    Date data;
    String documentacao;
    String receituario;

    public Consulta(int id, float valor, String sintomas, Date data, String documentacao, String receituario) {
        this.id = id;
        this.valor = valor;
        this.sintomas = sintomas;
        this.data = data;
        this.documentacao = documentacao;
        this.receituario = receituario;
    }

    public int getId() {
        return id;
    }
    
    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getSintomas() {
        return sintomas;
    }

    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDocumentacao() {
        return documentacao;
    }

    public void setDocumentacao(String documentacao) {
        this.documentacao = documentacao;
    }

    public String getReceituario() {
        return receituario;
    }

    public void setReceituario(String receituario) {
        this.receituario = receituario;
    }
    
    
}
