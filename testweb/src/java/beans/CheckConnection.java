/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.servlet.http.HttpServletRequest;

/**
 *
 * @author LENOVO
 */
public class CheckConnection {
    String response ;
    
    public void verifId(HttpServletRequest request){
        response = (request.getParameter("pwd").equals(request.getParameter("login") + "123"))?
                "Vous avez réussi à vous conneter ": "Connection échouée : nom ou mot de passe incorrect ";
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

}
