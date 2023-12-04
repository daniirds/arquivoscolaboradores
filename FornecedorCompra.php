<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "FornecedorCompra";

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Falha na conexão: " . $conn->connect_error);
}

$sql = "CREATE TABLE IF NOT EXISTS fornecedores (
    id_fornecedor INT(6) PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(255) NOT NULL,
    contato VARCHAR(255) NOT NULL 
)";

if ($conn->query($sql) === TRUE) {
    echo "Tabela de fornecedores criada com sucesso<br>";
} else {
    echo "Erro ao criar tabela de fornecedores: " . $conn->error . "<br>";
}

$sql = "CREATE TABLE IF NOT EXISTS compras (
    id_compra INT(6) PRIMARY KEY AUTO_INCREMENT,
    id_fornecedor INT(6) NOT NULL,
    produto_comprado VARCHAR(255) NOT NULL,
    quantidade INT(6) NOT NULL
)";

if ($conn->query($sql) === TRUE) {
    echo "Tabela de compras criada com sucesso<br>";
} else {
    echo "Erro ao criar tabela de compras: " . $conn->error . "<br>";
}

$sql = "INSERT INTO fornecedores (nome, contato) 
        VALUES ('fanta', 3399723495)";

if ($conn->query($sql) === TRUE) {
    echo "Dados inseridos na tabela de fornecedores com sucesso<br>";
} else {
    echo "Erro ao inserir dados na tabela de fornecedores: " . $conn->error . "<br>";
}

$sql = "INSERT INTO compras (id_fornecedor, produto_comprado, quantidade) 
        VALUES (1, 'refrigerante', 10)";

if ($conn->query($sql) === TRUE) {
    echo "Dados inseridos na tabela de compras com sucesso<br>";
} else {
    echo "Erro ao inserir dados na tabela de compras: " . $conn->error . "<br>";
}

$conn->close();
?>
