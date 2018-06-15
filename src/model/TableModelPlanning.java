package model;

import java.util.*;
import javax.swing.table.*;
import transfertObject.*;

/**
 *
 * @author Philippe-K
 */

public class TableModelPlanning extends AbstractTableModel
{
    private ArrayList<Planning> myList = new ArrayList<Planning>();

    public TableModelPlanning(ArrayList<Planning> myList)
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
        return 2;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        switch(columnIndex)
        {
            case 0: return myList.get(rowIndex).getPl_Id();
            case 1: return myList.get(rowIndex).getPl_Date();
            default: throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public String getColumnName(int col)
    {
        switch(col)
        {
            case 0: return "Id";
            case 1: return "Date";
            default: throw new IndexOutOfBoundsException();
        }
    }
    
    @Override
    public Class getColumnClass(int c)
    {
        // return getValueAt(0, c).getClass(); ! provoque une erreur quand la table est vide et qu'il y a un sorter !
        switch(c)
        {
            case 0 : return Integer.class;
            case 1 : return Date.class;
        }
        return null;
    }
    
    public void setMyList(ArrayList myList)
    {
        this.myList = myList;
        this.fireTableDataChanged();
    }
    
    public ArrayList<Planning> getMyList()
    {
        return myList;
    }
    
    public Planning getMyList(int index)
    {
        return myList.get(index);
    }
}