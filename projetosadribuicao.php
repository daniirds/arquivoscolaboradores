<?php
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "projetosatribuicao";

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Falha na conexão: " . $conn->connect_error);
}

$sql = "CREATE TABLE IF NOT EXISTS projetos (
    id_projeto INT(6) PRIMARY KEY AUTO_INCREMENT,
    nome_projeto VARCHAR(255) NOT NULL,
    descricao TEXT NOT NULL
)";

if ($conn->query($sql) === TRUE) {
    echo "Tabela de projetos criada com sucesso<br>";
} else {
    echo "Erro ao criar tabela de projetos: " . $conn->error . "<br>";
}

$sql = "CREATE TABLE IF NOT EXISTS atribuicoes (
    id_atribuicao INT(6) PRIMARY KEY AUTO_INCREMENT,
    id_projeto INT(6) NOT NULL,
    id_funcionario INT(6) NOT NULL,
    FOREIGN KEY (id_projeto) REFERENCES projetos(id_projeto),
    FOREIGN KEY (id_funcionario) REFERENCES funcionarios(id_funcionario)
)";

if ($conn->query($sql) === TRUE) {
    echo "Tabela de atribuições criada com sucesso<br>";
} else {
    echo "Erro ao criar tabela de atribuições: " . $conn->error . "<br>";
}

$sql = "INSERT INTO projetos (nome_projeto, descricao) 
        VALUES ('Paga Senai', 'Pagamento atrasado')";

if ($conn->query($sql) === TRUE) {
    echo "Dados inseridos na tabela de projetos com sucesso<br>";
} else {
    echo "Erro ao inserir dados na tabela de projetos: " . $conn->error . "<br>";
}

$sql = "INSERT INTO atribuicoes (id_projeto, id_funcionario) 
        VALUES (1, 9870)";

if ($conn->query($sql) === TRUE) {
    echo "Dados inseridos na tabela de atribuições com sucesso<br>";
} else {
    echo "Erro ao inserir dados na tabela de atribuições: " . $conn->error . "<br>";
}

$conn->close();
?>
