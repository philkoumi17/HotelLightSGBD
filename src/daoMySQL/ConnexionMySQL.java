package daoMySQL;

import dao.*;
import java.sql.*;

public class ConnexionMySQL implements Connexion
{
    // Objet de connexion à la BDD
    private Connection conn;
    
    // Objet permettant d'effectuer des requêtes simples
    private Statement stat;
    
    // Variable permettant de savoir si on est connecté à une BDD
    private boolean connected;

    private static ConnexionMySQL uniqueInstance = new ConnexionMySQL();

    /* Constructeur : ouvre la connexion */
    private ConnexionMySQL()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch(ClassNotFoundException classe)
        {
            System.out.println(classe.toString());
        }
        connected = false;

        // En local
        // String url = "jdbc:mysql://localhost/hotellight";
        
        // A l'école
        String url = "jdbc:mysql://database.edu.uccle/koph1712_hotellight";
        
        try
        {
            /* setup the properties: si les accents ne sont pas Unicode ds la BDD
            java.util.Properties prop = new java.util.Properties();
            prop.put("charSet", "ISO-8859-15");
            prop.put("user", username);
            prop.put("password", password);*/

            // Connect to the database
            
            // En local
            // conn = DriverManager.getConnection(url, "root", "");
            
            // A l'école
            conn = DriverManager.getConnection(url, "koph1712", "localhost");

            stat = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE);
            
            //on peut parcourir le résultat dans les 2 sens, insensible aux chgmts d'autrui
            //on peut modifier ce résultat pour ensuite reporter ces modifs ds la table (updateRow)
            conn.setAutoCommit(false);
            connected = true;
	}
        catch(SQLException e)
        {
            System.out.println(e.toString());
        }
    }

    /* Fermeture de la connexion. */
    @Override
    public void close()
    {
	try
        {
            conn.close();
            connected = false;
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
        }
    }

    /* Pattern Singleton */
    public static ConnexionMySQL getInstance()
    {
        return uniqueInstance;
    }

    /* Cette fct retourne l'état de l'objet: connecté/déconnecté */
    @Override
    public boolean isConnected()
    {
	return connected;
    }

    /* Cette fct retourne le résultat de la requête demandée par l'utilisateur. */
    @Override
    public ResultSet selectQuery(String query)
    {
        ResultSet m_rs = null;
	if(connected)
        {
            try
            {
               	m_rs = stat.executeQuery(query);
            }
            catch(SQLException e)
            {
		System.out.println(e.toString());
                System.out.println("Requete: " + query);
            }
        }
	else
        {
            System.out.println("Objet non connecte! Echec fct.");
        }
	return m_rs;
    }

    /* Cette fct permet d'exécuter une requête d'action. */
    @Override
    public boolean actionQuery(String query)
    {
	boolean b = false;
	try
        {
            stat.executeUpdate(query);
            b = true;
            
            // force à exécuter la requête sur la BDD
            conn.commit();
        }
        catch(SQLException e)
        {
            System.out.println(e.toString());
            System.out.println("Requete :" + query);
        }
	return b;
    }
}