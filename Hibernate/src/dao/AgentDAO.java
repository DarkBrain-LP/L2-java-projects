/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import hibernate.Agent;
import java.util.ArrayList;

/**
 *
 * @author M@nU_LP
 */
public interface AgentDAO {
    public void create(Agent agent);
    public void delete(Agent agent);
    public void update(Long id, Agent agent);
    public Agent getById(Long id);
    public ArrayList<Agent> getUsersByName(String name);
    public ArrayList<Agent> selectAll();
    
}
