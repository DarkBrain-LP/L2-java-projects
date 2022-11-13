<%-- 
    Document   : form
    Created on : 16 sept. 2021, 09:29:47
    Author     : LENOVO
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Remplir le formulaire</title>
    </head>
    <body>
        
        <c:if test="${!empty form.response}">
            <c:out value="${form.response}"></c:out>
        </c:if>
        
        <form method="post" action="form">
            <p>
                <label for="login">Name : </label>
                <input type="text" name="login" id="login" value="name">
            </p>
            <p>
                <label for="pwd">Password : </label>
                <input type="password" name="pwd" id="pwd">
            </p>
            
            <input type="submit" value="Soumettre">
        </form>
        
        
        <p>
            <a href="accueil">Accueil</a></br>
            <a href="bonjour">Salutation</a>
        </p>
    </body>
</html>
