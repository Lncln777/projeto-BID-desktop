/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Date;

/**
 *
 * @author Aluno
 */
public class ClubeBean {
    private int idC;
    private String nomeClube;
    private Date fundacao;
    
    public ClubeBean(){  
    } 
    public ClubeBean(int id, String nomeClube, Date fundacao){
        this.idC = idC;
        this.nomeClube = nomeClube;
        this.fundacao = fundacao;
        
    }

    public String getNomeClube() {
        return nomeClube;
    }

    public void setNomeClube(String nomeClube) {
        this.nomeClube = nomeClube;
    }

    public Date getFundacao() {
        return fundacao;
    }

    public void setFundacao(Date fundacao) {
        this.fundacao = fundacao;
    }

    public int getIdC() {
        return idC;
    }

    public void setIdC(int idC) {
        this.idC = idC;
    }
    
    
}
