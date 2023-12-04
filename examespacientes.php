<?php
$servidor = "localhost";
$usuario = "root";
$senha = "";
$banco = "ResultadosdeExamesePacientes";

$conn = new mysqli($servidor, $usuario, $senha, $banco);

if ($conn->connect_error) {
    die("Conexão falhou: " . $conn->connect_error);
}

$sqlPaciente = "INSERT INTO pacientes (nome_paciente, data_nascimento) VALUES ('João Silva', '1990-01-01')";
$conn->query($sqlPaciente);

$idPaciente = $conn->insert_id;

$sqlExame = "INSERT INTO resultados_exames (tipo_exame, resultado, id_paciente) VALUES ('Hemograma', 'Normal', $idPaciente)";
$conn->query($sqlExame);

$conn->close();
?>