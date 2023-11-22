/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */






package model;





/**
 *
 * @author pmath
 */
public class Compra extends javax.swing.JInternalFrame{
  
    
    
    
    
    
    private static javax.swing.JInternalFrame Compra;
  
  
    private int id_user;
    private String txtnomec;
    private String txtcpf;
    private String txtmarca;
    private String txtmodelo;
    private String txtanov;
    private String txtdesc;
    private String txtplaca;
    private String txtmanuntencao;
    private String txtvalorc;
    private String txtdata;
    
   
    
    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String gettxtNomec() {
        return txtnomec;
    }

    public void settxtNomec(String txtnomec) {
        if (txtnomec.length() >= 3) {
            this.txtnomec = txtnomec;

        } else {

            this.txtnomec = "";
        }
    }

    public String gettxtCpf() {
        return txtcpf;
    }

    public void settxtCpf(String txtcpf) {

        if (txtcpf.length() == 11) {
            this.txtcpf = txtcpf;

        } else {

            this.txtcpf = "CPF invalido";

        }
    }

    public String gettxtMarca() {
        return txtmarca;
    }

    public void settxtMarca(String txtmarca) {
        this.txtmarca = txtmarca;
    }

    public String gettxtModelo() {
        return txtmodelo;
    }

    public void settxtModelo(String txtmodelo) {
        this.txtmodelo = txtmodelo;
    }

    public String gettxtAnov() {
        return txtanov;
    }

    public void settxtAnov(String txtanov) {
 this.txtanov = txtanov;
        
    }

    public String gettxtDesc() {
        return txtdesc;
    }

    public void settxtDesc(String txtdesc) {
        this.txtdesc = txtdesc;
    }

    public String gettxtPlaca() {
        return txtplaca;
    }
    

    public void settxtPlaca(String txtplaca) {
        
            this.txtplaca = txtplaca;
       
    }

    public String gettxtManuntencao() {
        return txtmanuntencao;
    }
    

    public void settxtManuntencao(String txtmanuntencao) {
        this.txtmanuntencao = txtmanuntencao;
    }
    
    public String gettxtValorc() {
        return txtvalorc;
    }
    

    public void settxtValorc(String txtvalorc) {
        this.txtvalorc = txtvalorc;
    }
    
    public String gettxtData() {
        return txtdata;
    }
    

    public void settxtData(String txtdata) {
        this.txtdata = txtdata;
    
    }

}
