<%-- 
    Document   : salvar_materiais
    Created on : 21 de nov. de 2025, 20:51:30
    Author     : Claudinha
--%>
<%@page import="model.Material"%>
<%@page import="model.DAO.MaterialDAO"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Controle de Cadastros</h1>
        <%
            //Instância do objeto
            Material mat = new Material();
            
            mat.setId(Integer.parseInt( request.getParameter("codigo")));
            mat.setNome(request.getParameter("nome"));
            mat.setFab(request.getParameter("fabricante"));
            mat.setQtd(Integer.parseInt( request.getParameter("qtd")));
            mat.setPreco(Float.parseFloat(request.getParameter("preco")));            
            
            //Sáida
            out.println("Código....: " + mat.getId());
            out.println("<br>Descritivo: " + mat.getNome());
            out.println("<br>Fabricante: ....: " + mat.getFab());            
            out.println("<br>Qtd.Min.de Estoque:..........: " + mat.getQtd()); 
            out.println("<br>Preco..........: " + mat.getPreco()); 

            //Salvar
            MaterialDAO matDAO = new MaterialDAO();
            if (matDAO.cadastrar(mat)) {
                out.println("<br> Material inserido com sucesso!!!");
            }else{
                out.println("<br> Material inserido não cadastrado!");            
            }
            
        %>
    </body>
</html>
