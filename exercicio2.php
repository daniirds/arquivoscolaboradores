<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "cocorico";

// Função para criar a tabela pessoas
function createTable($conn) {
    $sql = "CREATE TABLE pessoas (
        id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
        nome VARCHAR(255) NOT NULL,
        idade INT(3) NOT NULL,
        sexo VARCHAR(1)
    )";
    
    // Executa a query
    if ($conn->query($sql) === TRUE) {
        echo "Tabela 'pessoas' criada com sucesso";
    } else {
        echo "Erro ao criar tabela: " . $conn->error;
    }
}

// Função para inserir dados na tabela pessoas
function insertData($conn) {
    $sql = "INSERT INTO pessoas (nome, idade, sexo) VALUES
    ('João', 25, 'M'),
    ('Maria', 20, 'F')";
    
    // Executa a query
    if ($conn->query($sql) === TRUE) {
        echo "Dados inseridos com sucesso";
    } else {
        echo "Erro ao inserir dados: " . $conn->error;
    }
}

// Função para obter todos os registros da tabela pessoas
function getAllPessoas($conn) {
    $sql = "SELECT * FROM pessoas";
    $result = $conn->query($sql);

    if ($result->num_rows > 0) {
        return $result->fetch_all(MYSQLI_ASSOC);
    } else {
        return "Nenhum resultado encontrado";
    }
}

// Função para obter pessoa por ID
function getPessoaById($conn, $id) {
    $sql = "SELECT * FROM pessoas WHERE id = $id";
    $result = $conn->query($sql);

    if ($result->num_rows > 0) {
        return $result->fetch_assoc();
    } else {
        return "Nenhum resultado encontrado para o ID $id";
    }
}

// Conexão com o banco de dados
$conn = new mysqli($servername, $username, $password, $dbname);

// Verifica a conexão
if ($conn->connect_error) {
    die("Conexão falhou: " . $conn->connect_error);
}

// Cria a tabela se ainda não existir
createTable($conn);

// Insere dados na tabela
insertData($conn);

// Obtém todos os registros da tabela
$data = getAllPessoas($conn);
print_r($data);

// Obtém uma pessoa por ID
$idToGet = 1;
$pessoaById = getPessoaById($conn, $idToGet);
echo "Pessoa com ID $idToGet: ";
print_r($pessoaById);

// Fecha a conexão
$conn->close();
?>