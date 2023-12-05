import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class atualizacaoprojetosatribuicoes {
  

    public static void main(String[] args) {
        // Daniele - Atualização de Projetos e Atribuições

        // Dados de conexão com o banco de dados
        String url = "jdbc:mysql://seu_servidor/seu_banco_de_dados";
        String usuario = "seu_usuario";
        String senha = "sua_senha";

        try {
            // Estabelece a conexão
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            Statement stmt = conexao.createStatement();

            // Atualiza informações do projeto
            String sqlProjeto = "UPDATE projetos SET nome_projeto='Portal Corporativo Atualizado', descricao='Portal para clientes atualizado' WHERE id_projeto=2";
            stmt.executeUpdate(sqlProjeto);

            // Atualiza informações da atribuição associada ao projeto
            String sqlAtribuicao = "UPDATE atribuicoes SET id_funcionario=4 WHERE id_projeto=2";
            stmt.executeUpdate(sqlAtribuicao);

            // Fecha a conexão
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();  }
        }
    

}
    

