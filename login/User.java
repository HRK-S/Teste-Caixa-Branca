package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User { 
    // Tenta conectar ao banco de dados
    public Connection conectarBD() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.Driver.Manager").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        } catch (Exception e) { }
        return conn;
    }
    public String nome="";
    public boolean result = false;

    public boolean verificarUsuario(String login, String senha) { 

        //NÓ 1 Inicio 
        String sql = "";

        Connection conn = conectarBD();//conexão
        
        //INSTRUÇÃO SQL
        sql += "select nome from usuarios ";
        sql += "where login = '" + login + "'";
        sql += " and senha = '" + senha + "'";

        //NÓ 2 entrou no bloco try
        try{
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

            //NÓ 3 entrou no bloco if
            if (rs.next()) {
                //NÓ 4 caminho verdadeiro
                result = true;
                nome = rs.getString("nome");
            }
            // Se o if for falso, ele vai para o NÓ 6 Retorno (Saida)


        }catch (Exception e) { 
            //NÓ 5 bloco catch
           

        }

        // NÓ 6 Retorno (Saida)
        return result;
    } 
    
} // fim do codigo