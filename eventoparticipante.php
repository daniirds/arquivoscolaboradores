<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "eventoparticipante";

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Falha na conexão: " . $conn->connect_error);
}

$sql = "CREATE TABLE IF NOT EXISTS eventos (
    id_evento VARCHAR(255) NOT NULL,
    nome_evento VARCHAR(255) NOT NULL,
    data VARCHAR(255) NOT NULL 
)";

if ($conn->query($sql) === TRUE) {
    echo "Tabela de eventos criada com sucesso<br>";
} else {
    echo "Erro ao criar tabela de livros: " . $conn->error . "<br>";
}

$sql = "CREATE TABLE IF NOT EXISTS participantes (
    id_participante INT(6) PRIMARY KEY AUTO_INCREMENT,
    id_evento VARCHAR(255) NOT NULL,
    nome_participante VARCHAR(255) NOT NULL
)";

if ($conn->query($sql) === TRUE) {
    echo "Tabela de participantes criada com sucesso<br>";
} else {
    echo "Erro ao criar tabela de participantes: " . $conn->error . "<br>";
}

$sql = "INSERT INTO participantes (nome_participante) 
        VALUES ('Sarah Maas')";

if ($conn->query($sql) === TRUE) {
    echo "Dados inseridos na tabela de participantes com sucesso<br>";
} else {
    echo "Erro ao inserir dados na tabela de participantes: " . $conn->error . "<br>";
}
