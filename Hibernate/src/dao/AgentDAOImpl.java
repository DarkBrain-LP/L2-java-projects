/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import hibernate.Agent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author M@nU_LP
 */
public class AgentDAOImpl implements AgentDAO {
    
    Connection con;
    
    @Override
    public void create(Agent agent) {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/hibernate_agent", "root", "");
            
            PreparedStatement pst = con.prepareStatement("INSERT INTO `agent`(nom, prenom) VALUES(?,?)");
            pst.setString(1, agent.getNom());
            pst.setString(2, agent.getPrenom());
            
            pst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(AgentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            try {
                if (con!=null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void delete(Agent agent) {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/hibernate_agent", "root", "");
            
            PreparedStatement pst = con.prepareStatement("DELETE FROM `agent` where id=?");
            
            pst.setLong(1, agent.getId());
            pst.executeUpdate();
            
        } catch (SQLException ex) {
            Logger.getLogger(AgentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }   finally {
            try {
                if (con!=null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }     
    }

    @Override
    public void update(Long id, Agent agent) {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/hibernate_agent", "root", "");
            
            PreparedStatement pst = con.prepareStatement("UPDATE `agent` SET nom=?,prenom=? WHERE id=?");
            
            pst.setString(1, agent.getNom());
            pst.setString(2, agent.getPrenom());
            pst.setLong(3, id);
            
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AgentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            try {
                if (con!=null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public Agent getById(Long id) {
        Agent agent = new Agent();
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/hibernate_agent", "root", "");
            
            PreparedStatement pst = con.prepareStatement("SELECT * FROM `agent` WHERE id=?");
            
            pst.setLong(1, id);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                agent.setNom(rs.getString("nom"));
                agent.setPrenom(rs.getString("prenom"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AgentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            try {
                if (con!=null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }       
        
        return agent;
    }

    @Override
    public ArrayList<Agent> getUsersByName(String name) {
        //Agent agent = new Agent(); // Si l'agent est créé ici c'est juste
        // la derniere modification qui serait ajoutée n fois, avec n etant
        // le nombre d'Agents de l'ArrayList
        /*
        En effet, lorsque l'on appelle un set sur une même instance, c'est une
        modification avec réference. Ainsi dans notre cas, dès qu'on fait une 
        avec les sets, tous les anciens elements de l'instance enrégistrés sont modifiés
        */
        ArrayList<Agent> col = new ArrayList();
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/hibernate_agent", "root", "");
            
            PreparedStatement pst = con.prepareStatement("SELECT * FROM `agent` WHERE nom=?");
            
            pst.setString(1, name);
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                Agent agent = new Agent();
                agent.setId(rs.getLong("id"));
                agent.setNom(rs.getString("nom"));
                agent.setPrenom(rs.getString("prenom"));
                System.out.print("id = " + rs.getLong("id") + "");
                System.out.println("agent = " + agent);
                
                col.add(agent);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AgentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            try {
                if (con!=null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }          
        
        return col;
    }

    @Override
    public ArrayList<Agent> selectAll() {
        ArrayList<Agent> col = new ArrayList();
        
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost/hibernate_agent", "root", "");
            
            PreparedStatement pst = con.prepareStatement("SELECT * FROM `agent` LIMIT 50");
            ResultSet rs = pst.executeQuery();
            
            while(rs.next()){
                Agent agent = new Agent();
                agent.setId(rs.getLong("id"));
                agent.setNom(rs.getString("nom"));
                agent.setPrenom(rs.getString("prenom"));
                
                col.add(agent);
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(AgentDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }finally {
            try {
                if (con!=null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }          
        
        return col;        
    }
    
    
    
}
