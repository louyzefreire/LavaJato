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
<title>Index</title>
</head>
<body>
<!-- Menu -->    
<div id="wrap">
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
          <li class="active"><a href="#">Home</a></li>
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
<script type="text/javascript" src="<c:url value="/resources/js/jquery-3.1.1.min.js"/>"></script>	
<script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>	
</body>
</html>