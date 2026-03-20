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
    private String nomeClube;
    private Date fundacao;
    
    public ClubeBean(){  
    } 
    public ClubeBean(String nomeClube, Date fundacao){
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
    
    
}
