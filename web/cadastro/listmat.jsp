<%-- 
    Document   : listmat
    Author     : Claudinha
--%>
<%@page import="model.Material"%>
<%@page import="model.DAO.MaterialDAO"%>
<%@page import="java.util.List"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    MaterialDAO dao = new MaterialDAO();
    List<Material> lista = dao.listar();
%>

<!DOCTYPE html>


<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista de Materiais</title>
        <style>
            table {
                width: 70%;
                border-collapse: collapse;
                margin: 20px auto;
            }
            th, td {
                border: 1px solid #333;
                padding: 8px 12px;
                text-align: center;
            }
            th {
                background-color: #eee;
            }
            h2 {
                text-align: center;
                margin-top: 20px;
            }
        </style>
    </head>
    <body>
        <table>
    <tr>
        <th>Código</th>
        <th>Nome</th>
        <th>Fabricante</th>
        <th>Qtd Mínima</th>
        <th>Preço</th>
    </tr>

    <% if (lista != null) {
        for (Material m : lista) { %>

        <tr>
            <td><%= m.getId() %></td>
            <td><%= m.getNome() %></td>
            <td><%= m.getFab() %></td>
            <td><%= m.getQtd() %></td>
            <td>R$ <%= m.getPreco() %></td>
        </tr>

    <% }} %>

</table>
    </body>
</html>
