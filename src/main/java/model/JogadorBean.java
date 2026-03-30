/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Aluno
 */
public class JogadorBean {
    private String idJ;
    private String nomeJogador;
    private String clube;
    
    public JogadorBean() {
    }

    public JogadorBean(int id, String nomeJogador, String clube) {
        this.idJ = idJ;
        this.nomeJogador = nomeJogador;
        this.clube = clube;
    }

    public String getNomeJogador() {
        return nomeJogador;
    }

    public void setNomeJogador(String nomeJogador) {
        this.nomeJogador = nomeJogador;
    }

    public String getClube() {
        return clube;
    }

    public void setClube(String clube) {
        this.clube = clube;
    }

    public String getIdJ() {
        return idJ;
    }

    public void setIdJ(String idJ) {
        this.idJ = idJ;
    }

    
}
