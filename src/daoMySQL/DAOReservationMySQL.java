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

public class DAOReservationMySQL implements DAOReservation
{
    private static DAOReservationMySQL uniqueInstance = new DAOReservationMySQL();
    
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    
    public static DAOReservationMySQL getInstance()
    {
        return uniqueInstance;
    }

    @Override
    public ArrayList<Reservation> selectReservations()
    {
        ArrayList<Reservation> myList = new ArrayList<Reservation>();
        
        String req = "SELECT * FROM reservation r, client c, chambre ch, planning pl, pays p " 
                     + "WHERE c.Cl_Id = r.Cl_Id AND ch.Ch_Num = r.Ch_Num AND pl.Pl_Id = r.Pl_Id AND c.Cl_Pays = p.P_Id ORDER BY 1";
        
        ResultSet res = ConnexionMySQL.getInstance().selectQuery(req);
        
        try
        {
            while(res.next())
            {
                myList.add(new Reservation(res.getInt("Res_Id"),
                           new Client(res.getInt("Cl_Id"), res.getString("Cl_Nom"), res.getString("Cl_Prénom"), res.getString("Cl_Adresse"), res.getInt("Cl_CP"), res.getString("Cl_Ville"), 
                           new Pays(res.getInt("P_Id"), res.getString("P_Nom")), 
                           res.getDate("Cl_Naiss")), 
                           new Chambre(res.getInt("Ch_Num"), res.getBoolean("Ch_Bain"), res.getBoolean("Ch_Douche"), res.getBoolean("Ch_WC"), res.getInt("Ch_Couchage")), 
                           new Planning(res.getInt("Pl_Id"), res.getDate("Pl_Date")), 
                           res.getInt("NbPers")));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.toString() + "\nErreur de la sélection !!");
            System.exit(0);
        }
        
        return myList;
    }
    
    @Override
    public ArrayList<Reservation> selectReservations(int idCh)
    {
        ArrayList<Reservation> myList = new ArrayList<Reservation>();
        
        String req = "";
        
        if(idCh != 0)
        {
            req = "SELECT * FROM reservation r, client c, chambre ch, planning pl, pays p " 
                  + "WHERE c.Cl_Id = r.Cl_Id AND ch.Ch_Num = r.Ch_Num AND pl.Pl_Id = r.Pl_Id AND c.Cl_Pays = p.P_Id AND ch.Ch_Num = " + idCh + " ORDER BY 1";
        }
        else
        {
            req = "SELECT * FROM reservation r, client c, chambre ch, planning pl, pays p " 
                  + "WHERE c.Cl_Id = r.Cl_Id AND ch.Ch_Num = r.Ch_Num AND pl.Pl_Id = r.Pl_Id AND c.Cl_Pays = p.P_Id ORDER BY 1";
        }
        
        ResultSet res = ConnexionMySQL.getInstance().selectQuery(req);
        
        try
        {
            while(res.next())
            {
                myList.add(new Reservation(res.getInt("Res_Id"),
                           new Client(res.getInt("Cl_Id"), res.getString("Cl_Nom"), res.getString("Cl_Prénom"), res.getString("Cl_Adresse"), res.getInt("Cl_CP"), res.getString("Cl_Ville"), 
                           new Pays(res.getInt("P_Id"), res.getString("P_Nom")), 
                           res.getDate("Cl_Naiss")), 
                           new Chambre(res.getInt("Ch_Num"), res.getBoolean("Ch_Bain"), res.getBoolean("Ch_Douche"), res.getBoolean("Ch_WC"), res.getInt("Ch_Couchage")), 
                           new Planning(res.getInt("Pl_Id"), res.getDate("Pl_Date")), 
                           res.getInt("NbPers")));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.toString() + "\nErreur de la sélection !!");
            System.exit(0);
        }
        
        return myList;
    }
    
    @Override
    public ArrayList<Reservation> selectReservations(Date dateMin, Date dateMax)
    {
        ArrayList<Reservation> myList = new ArrayList<Reservation>();
        
        String req = "SELECT * FROM reservation r, client c, chambre ch, planning pl, pays p " + 
                     "WHERE c.Cl_Id = r.Cl_Id AND ch.Ch_Num = r.Ch_Num AND pl.Pl_Id = r.Pl_Id AND c.Cl_Pays = p.P_Id " + 
                     " AND pl.Pl_Date BETWEEN '" + sdf.format(dateMin) + "' AND '" + sdf.format(dateMax) + "' ORDER BY 1";
        
        ResultSet res = ConnexionMySQL.getInstance().selectQuery(req);
        
        try
        {
            while(res.next())
            {
                myList.add(new Reservation(res.getInt("Res_Id"),
                           new Client(res.getInt("Cl_Id"), res.getString("Cl_Nom"), res.getString("Cl_Prénom"), res.getString("Cl_Adresse"), res.getInt("Cl_CP"), res.getString("Cl_Ville"), 
                           new Pays(res.getInt("P_Id"), res.getString("P_Nom")), 
                           res.getDate("Cl_Naiss")), 
                           new Chambre(res.getInt("Ch_Num"), res.getBoolean("Ch_Bain"), res.getBoolean("Ch_Douche"), res.getBoolean("Ch_WC"), res.getInt("Ch_Couchage")), 
                           new Planning(res.getInt("Pl_Id"), res.getDate("Pl_Date")), 
                           res.getInt("NbPers")));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.toString() + "\nErreur de la sélection !!");
            System.exit(0);
        }
        
        return myList;
    }
    
    @Override
    public ArrayList<Reservation> selectReservations(int idCh, Date dateMin, Date dateMax)
    {
        ArrayList<Reservation> myList = new ArrayList<Reservation>();
        
        String req = "";
        
        if(idCh != 0)
        {
            req = "SELECT * FROM reservation r, client c, chambre ch, planning pl, pays p " 
                  + "WHERE c.Cl_Id = r.Cl_Id AND ch.Ch_Num = r.Ch_Num AND pl.Pl_Id = r.Pl_Id AND c.Cl_Pays = p.P_Id AND ch.Ch_Num = " + idCh + " ORDER BY 1";
        }
        else
        {
            req = "SELECT * FROM reservation r, client c, chambre ch, planning pl, pays p " + 
                     "WHERE c.Cl_Id = r.Cl_Id AND ch.Ch_Num = r.Ch_Num AND pl.Pl_Id = r.Pl_Id AND c.Cl_Pays = p.P_Id " + 
                     " AND pl.Pl_Date BETWEEN '" + sdf.format(dateMin) + "' AND '" + sdf.format(dateMax) + "' ORDER BY 1";
        }
        
        ResultSet res = ConnexionMySQL.getInstance().selectQuery(req);
        
        try
        {
            while(res.next())
            {
                myList.add(new Reservation(res.getInt("Res_Id"),
                           new Client(res.getInt("Cl_Id"), res.getString("Cl_Nom"), res.getString("Cl_Prénom"), res.getString("Cl_Adresse"), res.getInt("Cl_CP"), res.getString("Cl_Ville"), 
                           new Pays(res.getInt("P_Id"), res.getString("P_Nom")), 
                           res.getDate("Cl_Naiss")), 
                           new Chambre(res.getInt("Ch_Num"), res.getBoolean("Ch_Bain"), res.getBoolean("Ch_Douche"), res.getBoolean("Ch_WC"), res.getInt("Ch_Couchage")), 
                           new Planning(res.getInt("Pl_Id"), res.getDate("Pl_Date")), 
                           res.getInt("NbPers")));
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.toString() + "\nErreur de la sélection !!");
            System.exit(0);
        }
        
        return myList;
    }
    
    @Override
    public boolean insertReservation(Reservation rs)
    {
        boolean test = false;
        
        String req = "INSERT INTO reservation(Res_Id, Cl_Id, Ch_Num, Pl_Id, NbPers) VALUES (" 
                      + null + ", " + rs.getCliRes().getCl_Id() + ", " + rs.getChRes().getCh_Num() + ", " 
                      + rs.getPlRes().getPl_Id() + ", " + rs.getNbPers() + ")";
        
        System.out.println(req);
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
    public boolean updateReservation(Reservation rs)
    {
        boolean test = false;
        
        String req = "UPDATE reservation SET Cl_Id = " + rs.getCliRes().getCl_Id() + ", Ch_Num = " + rs.getChRes().getCh_Num() 
                      + ", Pl_Id = " + rs.getPlRes().getPl_Id() + ", NbPers = " + rs.getNbPers() + " WHERE Res_Id = " + rs.getResId();
        
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
    public boolean deleteReservation(int resId)
    {
        boolean ok = ConnexionMySQL.getInstance().actionQuery("DELETE FROM reservation WHERE Res_Id = '" + resId + "'");
        
        return ok;
    }
    
    @Override
    public boolean isAvailable(Reservation r)
    {
        String req = "SELECT COUNT(*) FROM reservation "
                     + "WHERE Ch_Num = " + r.getChRes().getCh_Num() + " AND Pl_Id = " + r.getPlRes().getPl_Id();
        
        int resultatReq = -1;
        
        ResultSet res = ConnexionMySQL.getInstance().selectQuery(req);
        
        try
        {
            while(res.next())
            {
                resultatReq = res.getInt(1);
            }
            
            // Si la chambre est disponible
            if(resultatReq == 0)
            {
                return true;
            }
        }
        catch(SQLException e)
        {
            System.out.println(e.toString() + "\nErreur de la sélection !!");
            System.exit(0);
        }
        
        return false;
    }

//    @Override
//    public ArrayList<Reservation> selectReservations(String carac)
//    {
//        ArrayList<Reservation> myList = new ArrayList<Reservation>();
//        
//        String req = "";
//        
//        if(!carac.equals(""))
//        {
//            req = "SELECT r.Cl_Nom FROM reservation r, client c WHERE r.Cl_Id = c.Cl_Id AND c.Cl_Nom LIKE '" + carac + "%'";
//        }
//        else
//        {
//            req = "SELECT * FROM reservation r, client c, chambre ch, planning pl, pays p WHERE r.Cl_Id = c.Cl_Id AND r.Ch_Num = ch.Ch_Num AND r.Pl_Id = pl.Pl_Id and c.Cl_Pays = p.P_Id";
//        }
//        
//        ResultSet res = ConnexionMySQL.getInstance().selectQuery(req);
//        
//        try
//        {
//            while(res.next())
//            {
//                myList.add(new Reservation(res.getInt("Res_Id"),
//                       new Client(res.getInt("Cl_Id"), res.getString("Cl_Nom"), res.getString("Cl_Prénom"), res.getString("Cl_Adresse"), res.getInt("Cl_CP"), res.getString("Cl_Ville"), 
//                       new Pays(res.getInt("P_Id"), res.getString("P_Nom")), 
//                       res.getDate("Cl_Naiss")), 
//                       new Chambre(res.getInt("Ch_Num"), res.getBoolean("Ch_Bain"), res.getBoolean("Ch_Douche"), res.getBoolean("Ch_WC"), res.getInt("Ch_Couchage")), 
//                       new Planning(res.getInt("Pl_Id"), res.getDate("Pl_Date")), 
//                       res.getInt("NbPers")));
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
}