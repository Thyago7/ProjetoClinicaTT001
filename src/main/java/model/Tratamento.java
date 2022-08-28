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
public class Tratamento {
    int id;
    Date data_inicio;
    Date data_termino;
    String diagnostico;
    String historico;

    public Tratamento(int id, Date data_inicio, Date data_termino, String diagnostico, String historico) {
        this.id = id;
        this.data_inicio = data_inicio;
        this.data_termino = data_termino;
        this.diagnostico = diagnostico;
        this.historico = historico;
    }

    public int getId() {
        return id;
    }

    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Date getData_termino() {
        return data_termino;
    }

    public void setData_termino(Date data_termino) {
        this.data_termino = data_termino;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }
        
}
