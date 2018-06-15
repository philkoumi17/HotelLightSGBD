package daoMySQL;

import dao.*;
import java.sql.*;
import java.util.*;
import transfertObject.*;

/**
 *
 * @author Philippe-K
 */

public class DAOClientsMySQL implements DAOClient
{
    private static DAOClientsMySQL uniqueInstance = new DAOClientsMySQL();
    
    public static DAOClientsMySQL getInstance()
    {
        return uniqueInstance;
    }

    @Override
    public ArrayList<Client> selectClients()
    {
        ArrayList<Client> myList = new ArrayList<Client>();
        
        String req = "SELECT * FROM client c, pays p WHERE c.Cl_Pays = p.P_Id";
        
        ResultSet res = ConnexionMySQL.getInstance().selectQuery(req);
        
        try
        {
            while(res.next())
            {
                myList.add(new Client(res.getInt("Cl_Id"), res.getString("Cl_Nom"), res.getString("Cl_Prénom"), res.getString("Cl_Adresse"), res.getInt("Cl_CP"), res.getString("Cl_Ville"), 
                           new Pays(res.getInt("P_Id"), res.getString("P_Nom")), 
                           res.getDate("Cl_Naiss")));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.toString() + "\nErreur de la sélection !!");
            System.exit(0);
        }
        
        return myList;
    }
    
//    @Override
//    public ArrayList<Client> selectClients(String nom, String prénom)
//    {
//        ArrayList<Client> myList = new ArrayList<Client>();
//        
//        String req = "SELECT * FROM Client WHERE Cl_Nom LIKE '" + nom.toUpperCase() + "%' AND Cl_Prénom '" + prénom.toUpperCase() + "%'";
//        
//        ResultSet res = ConnexionMySQL.getInstance().selectQuery(req);
//        
//        try
//        {
//            while(res.next())
//            {
//                myList.add(new Client(res.getInt("Cl_Id"), res.getString("Cl_Nom"), res.getString("Cl_Prénom"), res.getString("Cl_Adresse"), res.getInt("Cl_CP"), res.getString("Cl_Ville"), 
//                           new Pays(res.getInt("P_Id"), res.getString("P_Nom")), 
//                           res.getDate("Cl_Naiss")));
//            }
//        }
//        catch(SQLException e)
//        {
//            System.out.println(e.toString() + "\nErreur de la sélection !!");
//            System.exit(0);
//        }
//        
//        return myList;
//    }
    
    @Override
    public boolean insertClient(Client cl)
    {
        boolean test = false;
        
        String req = "INSERT INTO client(Cl_Id, Cl_Nom, Cl_Prénom, Cl_Adresse, Cl_CP, Cl_Ville, Cl_Pays, Cl_Naiss) VALUES (" 
                      + null + ", '" + cl.getCl_Nom().toUpperCase() + "', '" + cl.getCl_Prénom() + "', '" + cl.getCl_Adresse() + "', " + cl.getCl_CP() 
                      + ", '" + cl.getCl_Ville() + "', " + cl.getCl_Pays().getP_Id() + ", '" + cl.getCl_NaissSQL()+ "')";
        
        try
        {
            test = ConnexionMySQL.getInstance().actionQuery(req);
        }
        catch(Exception e)
        {
            System.out.println("Error : " + e.getMessage());
            System.exit(0);
        }
        
        return test;
    }

    @Override
    public boolean updateClient(Client cl)
    {
        boolean test = false;
        
        String req = "UPDATE client SET Cl_Nom = '" + cl.getCl_Nom().toUpperCase() +
                     "', Cl_Prénom = '" + cl.getCl_Prénom() + "', Cl_Adresse = '" 
                     + cl.getCl_Adresse() + "', Cl_CP = " + cl.getCl_CP()
                     + ", Cl_Ville = '" + cl.getCl_Ville() + "', Cl_Pays = '" + cl.getCl_Pays().getP_Id()
                     + "', Cl_Naiss = '" + cl.getCl_NaissSQL() + "' WHERE client.Cl_Id = " + cl.getCl_Id();
        
        try
        {
            test = ConnexionMySQL.getInstance().actionQuery(req);
        }
        catch(Exception e)
        {
            System.out.println("Error : " + e.getMessage());
        }
        
        return test;
    }

    @Override
    public boolean deleteClient(int idCl)
    {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("DELETE FROM client WHERE Cl_Id = " + idCl);
        
        return ok;
    }
}