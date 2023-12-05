<?php // Tayna
// Dados de conexão com o banco de dados
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "projetoatribuicao";

$conn = new mysqli($servername, $username, $password, $dbname);

// Verifica a conexão
if ($conn->connect_error) {
    die("Falha na conexão: " . $conn->connect_error);
}

// Atualiza informações do projeto
$sqlProjeto = "UPDATE projetos SET nome_projeto='Sistema de Controle Atualizado', descricao='Sistema interno atualizado' WHERE id_projeto=1";
$conn->query($sqlProjeto);

// Atualiza informações da atribuição associada ao projeto
$sqlAtribuicao = "UPDATE atribuicoes SET id_funcionario=3 WHERE id_projeto=1";
$conn->query($sqlAtribuicao);

// Fecha a conexão
$conn->close();
?>
