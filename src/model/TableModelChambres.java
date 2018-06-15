package model;

import java.util.*;
import javax.swing.table.*;
import transfertObject.*;

/**
 *
 * @author Philippe-K
 */

public class TableModelChambres extends AbstractTableModel
{
    private ArrayList<Chambre> myList = new ArrayList<Chambre>();
    private String[] colNames = {"Ch_Num", "Ch_Bain", "Ch_Douche", "Ch_WC", "Ch_Couchage"};
    
    public TableModelChambres(ArrayList<Chambre> myList)
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
        Chambre myChambre = myList.get(rowIndex);
        switch(columnIndex)
        {
            case 0: return myChambre.getCh_Num();
            case 1: return myChambre.isCh_Bain();
            case 2: return myChambre.isCh_Douche();
            case 3: return myChambre.isCh_WC();
            case 4: return myChambre.getCh_Couchage();
            default: return null;
        }
    }

    @Override
    public String getColumnName(int col)
    {
        return colNames[col];
    }

//    @Override
//    public boolean isCellEditable(int rowIndex, int columnIndex)
//    {
//        return(columnIndex > 0) && (columnIndex < 4);
//    }
    
    @Override
    public Class getColumnClass(int c)
    {
        // return getValueAt(0, c).getClass(); ! provoque une erreur quand la table est vide et qu'il y a un sorter !
        switch(c)
        {
            case 0 : return Integer.class;
            case 1 : return Boolean.class;
            case 2 : return Boolean.class;
            case 3 : return Boolean.class;
            case 4 : return Integer.class;
        }
        return null;
    }
    
    public void setMyList(ArrayList myList)
    {
        this.myList = myList;
        this.fireTableDataChanged();
    }
    
    public ArrayList<Chambre> getMyList()
    {
        return myList;
    }
    
    public Chambre getMyList(int index)
    {
        return myList.get(index);
    }
}