
package conecta;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * OBJETIVO : CLASSE RESPONSÁVEL EM FAZER A CONECÇÃO COM O BANCO DE DADOS 
 * @author matheus_n_pereira
 */
public class Conexao {
  
    public static Connection conector() {
        java.sql.Connection conexao = null;
        //Carrega o driver
        String driver = "com.mysql.cj.jdbc.Driver";
        //Armazenando informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/sa_lojadecarros";
        String user = "root";
        String password = "";     
        //Conectando com o banco de dados
        try {
            Class.forName(driver);
            conexao =  DriverManager.getConnection(url, user, password);
            return conexao;
            
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }

    }
     
}