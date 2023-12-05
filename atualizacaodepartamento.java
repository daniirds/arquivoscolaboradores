import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class atualizacaodepartamento {

    public static void main(String[] args) {
        // Daniele - Atualização de Dados de Funcionários e Departamentos

        // Dados de conexão com o banco de dados
        String url = "jdbc:mysql://seu_servidor/seu_banco_de_dados";
        String usuario = "root";
        String senha = "";

        try {
            // Estabelece a conexão
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            Statement stmt = conexao.createStatement();

            // Atualiza informações do funcionário
            String sqlFuncionario = "UPDATE funcionarios SET nome='Luiz Atualizado', cargo='Analista de Sistemas' WHERE id_funcionario=1";
            int rowsFuncionario = stmt.executeUpdate(sqlFuncionario);
            System.out.println(rowsFuncionario + " registro(s) de funcionário atualizado(s).");

            // Atualiza informações do departamento associado ao funcionário
            String sqlDepartamento = "UPDATE departamentos SET nome_departamento='TI Atualizado' WHERE id_departamento=1";
            int rowsDepartamento = stmt.executeUpdate(sqlDepartamento);
            System.out.println(rowsDepartamento + " registro(s) de departamento atualizado(s).");

            // Fecha a conexão
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
