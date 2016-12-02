<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
<title>Pesquisa de serviços por data</title>
</head>
<body>
<header class="container">
    <div class="nav navbar-nav navbar-right">
        <li><a href="#"><span class="glyphicon glyphicon-user"></span> Admin</a></li>
        <li><a href="#"><span class="glyphicon glyphicon-log-in"></span> Sair</a></li>
    </div>
    <ul class="nav nav-tabs">
        <li ><a href="/lavajato">Home</a></li>
        <li class="active"><a href="#">Status</a></li>
        <li ><a href="#">Relatórios</a></li>
    </ul>
</header>
<br>
<h2>Relatório de serviços para a data : ${servico.data_servico}</h2>
	<div class="row">
		<div class="container col-xs-12">
			<div class="col-md-6 col-md-offset-3">
			<div id="mensagem"></div>
				<table class="table table-responsive">
					<tr class="bg-primary">
						<th>Placa</th>
						<th>Modelo</th>
						<th>Descricao</th>
						<th>Preço</th>
						<th>Horário</th>
						<th>Cliente</th>
						<th>Telefone</th>
						<th>Registro</th>
					</tr>
					<c:forEach var="servico" items="${servicos}">
						<tr>
							<td>${servico.veiculo.placa}</td>
							<td>${servico.veiculo.modelo}</td>
							<td>${servico.descricao}</td>
							<td>${servico.preco}</td>
							<td>${servico.horario}</td>
							<td>${servico.veiculo.cliente.nome}</td>
							<td>${servico.veiculo.cliente.telefone}</td>
							<td>${servico.data_servico}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
</body>
</html>