/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author matheus_n_pereira
 */
public class Venda {
  
    
    private int id_user;
    private String nomecomp;
    private String txtcpfcomp;
    private String txtvalorvenda;
    private String txtdatavenda;
    
    
    
    
    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNomecomp() {
        return nomecomp;
    }

    public void setnomeComp(String nomecomp) {
        if (nomecomp.length() >= 3) {
            this.nomecomp = nomecomp;

        } else {

            this.nomecomp = "";
        }
    }

    public String gettxtCpfcomp() {
        return txtcpfcomp;
    }

    public void setxtCpfcomp(String txtcpfcomp) {

        if (txtcpfcomp.length() == 11) {
            this.txtcpfcomp = txtcpfcomp;

        } else {

            this.txtcpfcomp = "CPF invalido";

        }
    }

    public String gettxtValorvenda() {
        return txtvalorvenda;
    }

    public void settxtMarca(String txtvalorvenda) {
        this.txtvalorvenda = txtvalorvenda;
    }

    public String gettxtDatavenda() {
        return txtdatavenda;
    }

    public void settxtDatavenda(String txtdatavenda) {
        this.txtdatavenda = txtdatavenda;
    }

    
    }


