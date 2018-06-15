package dao;

import java.util.*;
import transfertObject.*;

/**
 *
 * @author Philippe-K
 */

public interface DAOReservation
{
    ArrayList<Reservation> selectReservations();
    ArrayList<Reservation> selectReservations(int idCh);
    ArrayList<Reservation> selectReservations(Date dateMin, Date dateMax);
    ArrayList<Reservation> selectReservations(int idCh, Date dateMin, Date dateMax);
    boolean insertReservation(Reservation rs);
    boolean updateReservation(Reservation rs);
    boolean deleteReservation(int resId);
    boolean isAvailable(Reservation r);
}