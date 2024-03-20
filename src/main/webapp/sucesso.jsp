<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html>
<html lang="pt-br">

<html>
<head>
<meta charset="UTF-8"">
<link rel="stylesheet" type="text/css" href="pagina03.css" media="">

<title>Requerimento de Estudantes</title>
</head>

<body>
<% 
		String nome = request.getParameter("nome");
		String codigo = request.getParameter("codigo");
		String curso = request.getParameter("curso");
		String ano = request.getParameter("ano");
		String despacho = request.getParameter("despacho");
		%>
		<h1>Gabinete do Magnifico Reitor da Unisced</h1>
		
		<fieldset>
			<legend>Despacho dos Requerimentos dos Estudantes</legend><br>
			<br>
			
			<p>O Requerimento do estudante <%=nome %>, com o codigo de matricula <%=codigo %>, frequentando o curso de <%=curso %>, foi despachado com sucesso pelo magnifico reitor <%=despacho%></p> <br>
			
			<p>
			Obigado pela preferencia<br>
			<br>
			</p>
			<h1>UnISCED<br>
			Ensino online, ensino com futuro</h1>
		</fieldset>
</body>
</html>