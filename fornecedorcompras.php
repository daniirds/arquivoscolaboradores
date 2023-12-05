<?php // Tayna

$servername = "localhost";
$username = "root";
$password = "";
$dbname = "fornecedorcompras";

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Falha na conexão: " . $conn->connect_error);
}

$sqlFornecedor = "UPDATE fornecedores SET nome='Empresa A Atualizada', contato='novo_contato@empresaA.com' WHERE id_fornecedor=1";
$conn->query($sqlFornecedor);

$sqlCompra = "UPDATE compras SET produto_comprado='Peças de Computador Atualizado', quantidade=120 WHERE id_fornecedor=1";
$conn->query($sqlCompra);

$conn->close();
?>
