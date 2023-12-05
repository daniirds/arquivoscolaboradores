<?php // Tayna
$servername = "localhost";
$username = "root";
$password = "";
$dbname = "atualizacaoclientes";

$conn = new mysqli($servername, $username, $password, $dbname);

if ($conn->connect_error) {
    die("Falha na conexão: " . $conn->connect_error);
}

$sqlCliente = "UPDATE clientes SET
nome = 'Daniele Ramos',
email = 'danieleramos7000@gmail.com'
WHERE id_cliente = 1;";
$conn->query($sqlCliente);

$sqlVenda = "UPDATE Vendas SET
produto_vendido = 'telefone',
valor = 1500.000
WHERE id_cliente = 1;";
$conn->query($sqlVenda);

$conn->close();
?>
