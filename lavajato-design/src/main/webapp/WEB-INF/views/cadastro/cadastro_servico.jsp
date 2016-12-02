<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
	rel="stylesheet">
<link href="<c:url value="/resources/css/estilo.css" />"
	rel="stylesheet">
<title>Serviço</title>
</head>
<body>
	<!-- Menu -->    
<div >
  <div class="navbar navbar-default navbar-fixed-top">
    <div class="container">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="#">Lava Jato</a>
      </div>
      <div class="collapse navbar-collapse">
        <ul class="nav navbar-nav">
          <li><a href="/lavajato/">Home</a></li>
          <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Cadastro <b class="caret"></b></a>
            <ul class="dropdown-menu">
              <li><a href="/lavajato/novo-cliente">Cliente</a></li>
              <li><a href="/lavajato/novo-veiculo">Veiculo</a></li>
              <li><a href="/lavajato/novo-servico">Serviço</a></li>
            </ul>
          </li>
          
          <li class="dropdown">
            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Relatório<b class="caret"></b></a>
            <ul class="dropdown-menu">
              <li><a href="/lavajato/lista-servicos">Serviços</a></li>
              <li class="divider"></li>
              <li><a href="/lavajato/lista-clientes">Clientes</a></li>
              <li><a href="/lavajato/lista-veiculos">Veículos</a></li>
            </ul>
          </li>
          <li class="navbar-right pull-right"><a href="#"><span class="glyphicon glyphicon-log-in"></span> Sair</a></li>
        <li class="navbar-right"><a href="#"><span class="glyphicons glyphicons-car navbar-r"></span> Admin</a></li>
        </ul>
      </div>
    </div>
  </div>
</div> <!-- Fim do menu -->

<div class="center-block container">
<div class="panel panel-default">
      <div class="panel-heading">
   			 <h3 class="panel-title">Novo Serviço</h3>
  	  </div>
     <div class="panel-body">
<form class="form-horizontal center-m" action="salvar-servico" method="get">
 			<!-- Dados do cliente -->
 			<div id="mensagem" class="alert alert-info">
                Dados do cliente.
            </div>
            
            <div class="form-group">
            <label class="col-sm-2 control-label">Nome</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="nome" value="${veiculo.cliente.nome}" readonly>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">Telefone</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" value="${veiculo.cliente.telefone}" readonly>
            </div>
        </div> <!-- Fim dos dados do cliente -->
   		<br>
   		
   		<!-- Dados do veiculo -->
 			<div id="mensagem" class="alert alert-info">
                Dados do veículo.
            </div>
            
            <div class="form-group">
            <label class="col-sm-2 control-label">Placa</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" id="placa" name="placa" value="${veiculo.placa}" readonly>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">Modelo</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" value="${veiculo.modelo}" readonly>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">Cor</label>
            <div class="col-sm-10">
                <input type="text" class="form-control" value="${veiculo.cor}" readonly>
            </div>
        </div> <!-- Fim dos dados do veiculo -->
        <br>
        
        <!-- Dados do serviço -->
        <div id="mensagem" class="alert alert-info">
            Informe os dados do serviço.
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">Lavagem</label>
            <div class="col-sm-10">
                <select type="text" class="form-control" id="descricao" name="descricao">
                    <option value="SIMPLES">SIMPLES</option>
                    <option value="GERAL_SEM_MOTOR">GERAL SEM MOTOR</option>
                    <option value="GERAL_COM_MOTOR">GERAL COM MOTOR</option>
                </select>
            </div>
        </div>
        <div class="form-group">
            <label class="col-sm-2 control-label">Valor</label>
            <div class="col-sm-2">
                <input required type="text" class="form-control" name="preco">
            </div>
            <label class="col-sm-4 control-label">Previsão entrega</label>
            <div class="col-sm-4">
                <input required type="text" class="form-control" name="previsao_entrega">
            </div>
        </div><br>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-primary">Salvar</button>
            </div>
        </div>
    </form>
    </div>
    </div> <!-- Fim do painel -->
	</div>
<script type="text/javascript" src="<c:url value="/resources/js/jquery-3.1.1.min.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/js/function.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/js/jquery.maskedinput.js"/>"></script>
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
</body>