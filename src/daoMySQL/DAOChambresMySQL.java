package daoMySQL;

import dao.*;
import java.util.*;
import java.sql.*;
import transfertObject.*;

/**
 *
 * @author Philippe-K
 */

public class DAOChambresMySQL implements DAOChambre
{
    private static DAOChambresMySQL uniqueInstance = new DAOChambresMySQL();
    
    public static DAOChambresMySQL getInstance()
    {
        return uniqueInstance;
    }

    @Override
    public ArrayList<Chambre> selectChambres()
    {
        ArrayList<Chambre> myList = new ArrayList<Chambre>();
        
        String req = "SELECT * FROM chambre";
        
        ResultSet res = ConnexionMySQL.getInstance().selectQuery(req);
        
        try
        {
            while(res.next())
            {
                myList.add(new Chambre(res.getInt("Ch_Num"), res.getBoolean("Ch_Bain"), res.getBoolean("Ch_Douche"), res.getBoolean("Ch_WC"), res.getInt("Ch_Couchage")));
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