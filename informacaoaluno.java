import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class informacaoaluno {

    public static void main(String[] args) {
        // Daniele - Atualização de Informações de Alunos e Cursos

        // Dados de conexão com o banco de dados
        String url = "jdbc:mysql://seu_servidor/seu_banco_de_dados";
        String usuario = "root";
        String senha = "";

        try {
            // Estabelece a conexão
            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            Statement stmt = conexao.createStatement();

            // Atualiza informações do aluno
            String sqlAluno = "UPDATE alunos SET nome='Julia Atualizada', turma='D' WHERE id_aluno=2";
            stmt.executeUpdate(sqlAluno);

            // Atualiza informações do curso associado ao aluno
            String sqlCurso = "UPDATE cursos SET nome_curso='Ciências Atualizado', instrutor='Professora Silva' WHERE id_curso=2";
            stmt.executeUpdate(sqlCurso);

            // Adiciona novo curso associado ao aluno
            String sqlNovoCurso = "INSERT INTO cursos (nome_curso, instrutor) VALUES ('História', 'Professor Oliveira')";
            stmt.executeUpdate(sqlNovoCurso);

            // Fecha a conexão
            conexao.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
