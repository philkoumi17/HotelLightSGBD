package model;

import javax.swing.table.*;
import java.util.*;
import transfertObject.*;

/**
 *
 * @author Philippe-K
 */

public class TableModelReservation extends AbstractTableModel
{
    private ArrayList<Reservation> myList = new ArrayList<Reservation>();
    private String[] colNames = {"Id", "Nom", "Prénom", "Chambre", "Planning", "NbPers"};
    
    public TableModelReservation(ArrayList<Reservation> myList)
    {
        this.myList = myList;
    }
    
    @Override
    public int getRowCount()
    {
        return myList.size();
    }

    @Override
    public int getColumnCount()
    {
        return colNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        Reservation myRes = myList.get(rowIndex);
        switch(columnIndex)
        {
            case 0: return myRes.getResId();
            case 1: return myRes.getCliRes().getCl_Nom();
            case 2: return myRes.getCliRes().getCl_Prénom();
            case 3: return myRes.getChRes().getCh_Num();
            case 4: return myRes.getPlRes().getPl_DateBE();
            case 5: return myRes.getNbPers();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int col)
    {
        return colNames[col];
    }
    
    @Override
    public Class getColumnClass(int c)
    {
        // return getValueAt(0, c).getClass(); ! provoque une erreur quand la table est vide et qu'il y a un sorter !
        switch (c)
        {
            case 0 : return String.class;
            case 1 : return String.class;
            case 2 : return String.class;
            case 3 : return String.class;
            case 4 : return String.class;
            case 5 : return String.class;
        }
        return null;
    }
    
    public void setMyList(ArrayList myList)
    {
        this.myList = myList;
        this.fireTableDataChanged();
    }
    
    public ArrayList<Reservation> getMyList()
    {
        return myList;
    }
    
    public Reservation getMyList(int index)
    {
        return myList.get(index);
    }
}