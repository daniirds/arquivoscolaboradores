<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "livrosautores";

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Falha na conexão: " . $conn->connect_error);
}

$sql = "CREATE TABLE IF NOT EXISTS livros (
    id_livros VARCHAR(255) NOT NULL,
    titulo VARCHAR(255) NOT NULL,
    ano_publicado VARCHAR(255) NOT NULL 
)";

if ($conn->query($sql) === TRUE) {
    echo "Tabela de livros criada com sucesso<br>";
} else {
    echo "Erro ao criar tabela de livros: " . $conn->error . "<br>";
}

$sql = "CREATE TABLE IF NOT EXISTS autores (
    id_autor INT(6) PRIMARY KEY AUTO_INCREMENT,
    nome_autor VARCHAR(255) NOT NULL
)";

if ($conn->query($sql) === TRUE) {
    echo "Tabela de autores criada com sucesso<br>";
} else {
    echo "Erro ao criar tabela de autores: " . $conn->error . "<br>";
}

$sql = "INSERT INTO autores (nome_autor) 
        VALUES ('Sarah Maas')";

if ($conn->query($sql) === TRUE) {
    echo "Dados inseridos na tabela de autores com sucesso<br>";
} else {
    echo "Erro ao inserir dados na tabela de autores: " . $conn->error . "<br>";
}

