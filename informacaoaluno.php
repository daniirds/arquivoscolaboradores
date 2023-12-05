<?php // Tayna
// Dados de conexão com o banco de dados
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "informacaoaluno";

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Falha na conexão: " . $conn->connect_error);
}

$sqlAluno = "UPDATE alunos SET nome='Lucas Atualizado', turma='C' WHERE id_aluno=1";
$conn->query($sqlAluno);

$sqlCurso = "UPDATE cursos SET nome_curso='Matemática Atualizado', instrutor='Professor Silva' WHERE id_curso=1";
$conn->query($sqlCurso);

$sqlNovoCurso = "INSERT INTO cursos (nome_curso, instrutor) VALUES ('Português', 'Professora Maria')";
$conn->query($sqlNovoCurso);

$conn->close();
?>
