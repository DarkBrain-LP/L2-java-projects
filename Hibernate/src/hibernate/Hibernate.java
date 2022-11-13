/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernate;
import dao.AgentDAOImpl;
import java.util.ArrayList;

/**
 *
 * @author M@nU_LP
 */
public class Hibernate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AgentDAOImpl agdao = new AgentDAOImpl();
        
        ArrayList<Agent> ar = null;
        ar = (ArrayList<Agent>) agdao.getUsersByName("YOVO");
        
        System.out.println("Liste des agent appartenant à la famille YOVO : ");
        for(Object agt : ar)
            System.out.println(agt);
        
        agdao.update(1L, new Agent("SEWOVI", "Alfred Aloba LeGros"));
        agdao.update(6L, new Agent("LOCKO", "Le Matheux"));
        System.out.println("Apres modification ");
        
        ar = agdao.selectAll();
        
        for(Agent agt : ar)
            System.out.println(agt);
    }
    
}
