<?php // Tayna
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "livroautor";

$conn = new mysqli($servername, $username, $password, $dbname);

// Verifica a conexão
if ($conn->connect_error) {
    die("Falha na conexão: " . $conn->connect_error);
}

// Atualiza informações do livro
$sqlLivro = "UPDATE livros SET titulo='Aprendendo Python Atualizado', ano_publicacao=2021 WHERE id_livro=1";
$conn->query($sqlLivro);

// Atualiza informações do autor associado ao livro
$sqlAutor = "UPDATE autores SET nome_autor='Carlos Silva Atualizado' WHERE id_autor=1";
$conn->query($sqlAutor);

// Adiciona novo autor associado ao livro
$sqlNovoAutor = "INSERT INTO autores (nome_autor) VALUES ('Rita Oliveira')";
$conn->query($sqlNovoAutor);

// Fecha a conexão
$conn->close();
?>