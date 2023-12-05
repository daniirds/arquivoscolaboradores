import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class atualizacaocliente {

    public static void main(String[] args) {
        // Daniele - Atualização de Informações de Clientes e Vendas

        // Dados de conexão com o banco de dados
        String url = "jdbc:mysql://seu_servidor/seu_banco_de_dados";
        String usuario = "root";
        String senha = "";

        try {
            // Estabelece a conexão
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            Statement stmt = conexao.createStatement();

            // Atualiza informações do cliente
            String sqlCliente = "UPDATE clientes SET nome='Pedro Atualizado', email='pedro_atualizado@example.com' WHERE id_cliente=2";
            stmt.executeUpdate(sqlCliente);

            // Atualiza informações da venda associada ao cliente
            String sqlVenda = "UPDATE vendas SET produto_vendido='Fones Atualizado', valor=180.00 WHERE id_cliente=2";
            stmt.executeUpdate(sqlVenda);

            // Fecha a conexão
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
