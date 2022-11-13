<%-- 
    Document   : accueil
    Created on : 14 sept. 2021, 09:09:53
    Author     : LENOVO
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Accueil</title>
    </head>
    <body>
        <p>Bienvenue sur le site officiel de <strong>LaTeam/Club_LaClasse</strong>  </p>
        
        <h3>La liste des éléments de <i>LaTeam/Club_LaClasse</i></h3>
        <%@include file="menu.jsp" %>
        
        <c:forEach var="i" begin="1" end="9" step="2">
            Nous sommes les meilleurs ${i} fois</br>
        </c:forEach>
        
            
        <a href="form">Inscrivez-vous</a></br>
        <a href="bonjour">Votre salutation</a>
    </body>
</html>
