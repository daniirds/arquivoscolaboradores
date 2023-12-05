import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class livroautor {

    public static void main(String[] args) {
        // Daniele - Atualização de Dados de Livros e Autores

        // Dados de conexão com o banco de dados
        String url = "jdbc:mysql://seu_servidor/seu_banco_de_dados";
        String usuario = "root";
        String senha = "";

        try {
            // Estabelece a conexão
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            Statement stmt = conexao.createStatement();

            // Atualiza informações do livro
            String sqlLivro = "UPDATE livros SET titulo='Introdução à Inteligência Artificial Atualizado', ano_publicacao=2022 WHERE id_livro=2";
            stmt.executeUpdate(sqlLivro);

            // Atualiza informações do autor associado ao livro
            String sqlAutor = "UPDATE autores SET nome_autor='Ana Souza Atualizado' WHERE id_autor=2";
            stmt.executeUpdate(sqlAutor);

            // Adiciona novo autor associado ao livro
            String sqlNovoAutor = "INSERT INTO autores (nome_autor) VALUES ('Paulo Rocha')";
            stmt.executeUpdate(sqlNovoAutor);

            // Fecha a conexão
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

