/*
 * Factory concrète d'objets DAOAccess.
 * Normalement, il faudrait passer par une fabrique abstraite (interface)
 * capable de fabriquer n'importe quels objets DAO (MySQL, Oracle...).
 * C'est seulement à l'exécution qu'on choisirait la fabrique DAOAccess
 * plutôt qu'une autre...
 * Dans cet exemple simplifié, si on voulait changer de BD, il faudrait changer 
 * la classe Factory...
 */

package factory;

import dao.*;
import daoMySQL.*;

/**
 *
 * @author Philippe-K
 */

public class Factory
{
    public static DAOChambre getDAOChambre()
    {
        return DAOChambresMySQL.getInstance();
    }
    
    public static DAOClient getDAOClient()
    {
        return DAOClientsMySQL.getInstance();
    }
    
    public static DAOPays getDAOPays()
    {
        return DAOPaysMySQL.getInstance();
    }
    
    public static DAOPlanning getDAOPlanning()
    {
        return DAOPlanningMySQL.getInstance();
    }
    
    public static DAOReservation getDAOReservation()
    {
        return DAOReservationMySQL.getInstance(); 
    }
    
    public static Connexion getDAOConnexion()
    {
        return ConnexionMySQL.getInstance();
    }
}