<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>novaVenda</title>
</head>
<body>

<h1>Adicionar Nova Venda </h1>
<hr />
<form action="novaVenda" method="post">


Forma De Recebimento:<input type="text" name="formaRecebimento" /><br />
Valor:<input type="text" name="valor" /><br />
Desconto:<input type="text" name="desconto" /><br />
Quantidade:<input type="text" name="quantidade" /><br />
Modelo:<input type="text" name="modelo" /><br />
Cliente:<input type="text" name="cliente" /><br />

<input type="submit" value="Gravar"  />
</form>
</body>
</html>