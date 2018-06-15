package daoMySQL;

import dao.*;
import java.sql.*;
import java.util.*;
import transfertObject.*;

/**
 *
 * @author Philippe-K
 */

public class DAOPaysMySQL implements DAOPays
{
    private static DAOPaysMySQL uniqueInstance = new DAOPaysMySQL();
    
    public static DAOPaysMySQL getInstance()
    {
        return uniqueInstance;
    }
    
    public ArrayList<Pays> selectPays()
    {
        ArrayList<Pays> myList = new ArrayList<Pays>();
        
        String req = "SELECT * FROM pays ORDER BY 1";
        
        ResultSet res = ConnexionMySQL.getInstance().selectQuery(req);
        
        try
        {
            while(res.next())
            {
                myList.add(new Pays(res.getInt("P_Id"), res.getString("P_Nom")));
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString() + "\nErreur de la sélection !!");
            System.exit(0);
        }
        
        return myList;
    }
}