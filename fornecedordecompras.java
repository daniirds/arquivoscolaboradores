import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class fornecedordecompras {

    public static void main(String[] args) {
        // Daniele - Atualização de Informações de Fornecedores e Compras

        // Dados de conexão com o banco de dados
        String url = "jdbc:mysql://seu_servidor/seu_banco_de_dados";
        String usuario = "root";
        String senha = "";

        try {
            // Estabelece a conexão
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            Statement stmt = conexao.createStatement();

            // Atualiza informações do fornecedor
            String sqlFornecedor = "UPDATE fornecedores SET nome='Empresa B Atualizada', contato='novo_contato@empresaB.com' WHERE id_fornecedor=2";
            stmt.executeUpdate(sqlFornecedor);

            // Atualiza informações da compra associada ao fornecedor
            String sqlCompra = "UPDATE compras SET produto_comprado='Material de Escritório Atualizado', quantidade=600 WHERE id_fornecedor=2";
            stmt.executeUpdate(sqlCompra);

            // Fecha a conexão
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
