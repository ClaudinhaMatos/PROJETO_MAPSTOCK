/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.DAO;

import java.sql.*;
import model.Material;
import config.ConectaDB;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Claudinha
 */
public class MaterialDAO {
    // Atrib
    
    //Métodos - CRUD
    // CADASTRAR - INSERIR NOVO MATERIAL NO BD
    public boolean cadastrar( Material p_material ) throws ClassNotFoundException{
        Connection conn = null;        
        try{           
            conn = ConectaDB.conectar();
            Statement stmt = conn.createStatement();
            String sql = "Insert INTO materiais (codigo, nome, fabricante,qtd_minima,preco_unit) VALUES ('"+ 
                    p_material.getId() +"', '"+ p_material.getNome() +"', '" + p_material.getFab() + "', '" 
                    + p_material.getQtd() + "', '" + p_material.getPreco()+ "')";            
            stmt.executeUpdate(sql); //Insert / Delete / Update
            System.out.println("Registro incluído com sucesso!");
            conn.close();
            return true;
        }catch(SQLException ex){
            return false;
        }        
    }
    
    //LISTAGEM DO BD - MATERIAIS CADASTRADOS
    public List<Material> listar() throws ClassNotFoundException {
    Connection conn = null;
    List<Material> lista = new ArrayList<>();

    try {
        conn = ConectaDB.conectar();
        Statement stmt = conn.createStatement();
        String sql = "SELECT codigo, nome, fabricante, qtd_minima, preco_unit FROM materiais";
        ResultSet rs = stmt.executeQuery(sql);

        while (rs.next()) {
            Material mat = new Material();

            mat.setId(rs.getInt("codigo"));
            mat.setNome(rs.getString("nome"));
            mat.setFab(rs.getString("fabricante"));
            mat.setQtd(rs.getInt("qtd_minima"));
            mat.setPreco(rs.getFloat("preco_unit"));

            lista.add(mat);
        }

        rs.close();
        stmt.close();
        conn.close();

    } catch (SQLException ex) {
        System.out.println("Erro ao listar: " + ex.getMessage());
    }

    return lista;
}

    
}
