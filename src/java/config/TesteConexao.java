
package config;

/**
 *
 * @author Claudinha
 */
public class TesteConexao {
    public static void main(String[] args) throws Exception {
        ConectaDB.conectar();
        System.out.println("Conexão OK!");
    }
}
