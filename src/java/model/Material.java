/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Claudinha
 */
public class Material {
    int id, qtd;
    String nome, fab;
    float preco;
    
    // Métodos
    public void setId(int p_id) {
        this.id = p_id;
    }
    public void setNome(String p_nome) {
        this.nome = p_nome;
    }
    public void setFab(String p_fab) {
        this.fab = p_fab;
    }
    public void setQtd(int p_qtd) {
        this.qtd = p_qtd;
    }
    public void setPreco(float p_preco) {
        this.preco = p_preco;
    }
    
    public int getId() {
        return this.id;
    }
    public String getNome() {
        return this.nome;
    }
    public String getFab() {
        return this.fab;
    }
    public int getQtd() {
        return this.qtd;
    }
    public float getPreco() {
        return this.preco;
    }  
}
