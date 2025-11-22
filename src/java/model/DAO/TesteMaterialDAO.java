/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO;

/**
 *
 * @author Claudinha
 */
import config.ConectaDB;
import java.sql.Connection;
import model.Material;

public class TesteMaterialDAO {
    public static void main(String[] args) throws Exception {
        
        // Criar um material para teste
        Material material = new Material();
        material.setId(21);
        material.setNome("Caderno");
        material.setFab("Faber Castell");
        material.setQtd(10);
        material.setPreco(12);
        
        
        // Instancia o DAO
        MaterialDAO dao = new MaterialDAO();
        
        // Testa o método cadastrar
        boolean resultado = dao.cadastrar(material);
        
        if (resultado) {
            System.out.println("Material cadastrado com sucesso!");
        } else {
            System.out.println("Falha ao cadastrar material.");
        }
    }
}
