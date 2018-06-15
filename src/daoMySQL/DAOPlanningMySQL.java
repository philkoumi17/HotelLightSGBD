package daoMySQL;

import dao.*;
import java.util.ArrayList;
import java.util.Date;
import java.sql.*;
import java.text.*;
import transfertObject.*;

/**
 *
 * @author Philippe-K
 */

public class DAOPlanningMySQL implements DAOPlanning
{
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    
    private static DAOPlanningMySQL uniqueInstance = new DAOPlanningMySQL();
    
    public static DAOPlanningMySQL getInstance()
    {
        return uniqueInstance;
    }

    @Override
    public ArrayList<Planning> selectPlanning()
    {
        ArrayList<Planning> myList = new ArrayList<Planning>();
        
        String req = "SELECT * FROM planning ORDER BY 1";

        ResultSet res = ConnexionMySQL.getInstance().selectQuery(req);
        
        try
        {
            while(res.next())
            {
                myList.add(new Planning(res.getInt("Pl_Id"), res.getDate("Pl_Date")));
            }
        }
        catch(Exception e)
        {
            System.out.println(e.toString() + "\nErreur de la sélection !!");
            System.exit(0);
        }
        
        return myList;
    }
    
    @Override
    public Planning selectPlanning(Date uneDate)
    {
        Planning pl = new Planning();
        
        String req = "SELECT Pl_Id, Pl_Date FROM planning WHERE Pl_Date = '" + sdf.format(uneDate) + "'";
        
        ResultSet res = ConnexionMySQL.getInstance().selectQuery(req);
        
        try
        {
            while(res.next())
            {
                pl = new Planning(res.getInt("Pl_Id"), res.getDate("Pl_Date"));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.toString() + "\nErreur de la sélection !!");
            System.exit(0);
        }
        
        return pl;
    }

    @Override
    public Date selectDateMin()
    {
        Date dateMin = new Date();
                
        String req = "SELECT MIN(Pl_Date) FROM planning;";
        
        ResultSet res = ConnexionMySQL.getInstance().selectQuery (req);
        
        try
        {
            while(res.next())
            {  
                dateMin = res.getDate(1);
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return dateMin;
    }
    
    @Override
    public Date selectDateMax()
    {
        Date dateMin = new Date();
                
        String req = "SELECT MAX(Pl_Date) FROM planning;";
        
        ResultSet res = ConnexionMySQL.getInstance().selectQuery (req);
        
        try
        {
            while(res.next())
            {  
                dateMin = res.getDate(1);
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
            System.exit(-1);
        }
        return dateMin;
    }
}