<%-- 
    Document   : bonjour
    Created on : 14 sept. 2021, 08:16:36
    Author     : LENOVO
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Test</title>
    </head>
    <body>
        <p><c:out value="One... Two... Three... Test JSTL" /></p>
        <p>Hello World! </br>
            from ${name}
        </p>
        <p>
            <a href="accueil">Retourner à l'accueil</a></br>
            <a href="form">Aller à la page d'inscription</a>
        </p>
        <p>
            Beans elements : >> name : ${auteur.nom} >> second name : ${auteur.prenom}
             >> statue : ${auteur.actif?"ON":"DOWN"}
        </p>
        
        <c:forEach items="${girlsName}" var="aGirlsName">
            The lovely ${aGirlsName} </br>
        </c:forEach>
    
        <%-- 
        <h3>
            <%
                String name = (String) request.getAttribute("name");
                out.println("From >> " + name);
            %>
        </h3>
        
        
        
        <a href="Accueil">Accueil</a>
        <p>
            <%@include file="menu.jsp" %>
        </p>
        
        <p>
            <%
                for(int i = 0; i < 100; i++){
                    out.println("Piratage de votre compte par " + name + " " + i + " %" + "</br>");
                    //Thread.sleep(1000);
                }
                    
            %>
        </p>
        --%>
    </body>
</html>
