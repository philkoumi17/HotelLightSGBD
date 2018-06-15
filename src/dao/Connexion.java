package dao;

import java.sql.*;

/**
 *
 * @author Philippe-K
 */

public interface Connexion
{
    /* Cette fct permet d'exécuter une requête d'action. */
    boolean actionQuery(String query);

    /* Fermeture de la connexion. */
    void close();

    /* Cette fct retourne l'état de l'objet: connecté/déconnecté */
    boolean isConnected();

    /* Cette fct retourne le résultat de la requête demandée par l'utilisateur. */
    ResultSet selectQuery(String query);   
}