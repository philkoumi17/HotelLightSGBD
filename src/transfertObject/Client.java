package transfertObject;

import java.text.*;
import java.util.*;

/**
 *
 * @author Philippe-K
 */

public class Client
{
    private int Cl_Id, Cl_CP;
    private String Cl_Nom, Cl_Prénom, Cl_Adresse, Cl_Ville;
    private Pays Cl_Pays;
    private Date Cl_Naiss;

    public Client(){}

    public Client(int Cl_Id, String Cl_Nom, String Cl_Prénom, String Cl_Adresse, int Cl_CP, String Cl_Ville, Pays Cl_Pays, Date Cl_Naiss)
    {
        this.Cl_Id = Cl_Id;
        this.Cl_CP = Cl_CP;
        this.Cl_Nom = Cl_Nom;
        this.Cl_Prénom = Cl_Prénom;
        this.Cl_Adresse = Cl_Adresse;
        this.Cl_Ville = Cl_Ville;
        this.Cl_Pays = Cl_Pays;
        this.Cl_Naiss = Cl_Naiss;
    }

    /**
     * @return the Cl_Id
     */
    public int getCl_Id()
    {
        return Cl_Id;
    }

    /**
     * @param Cl_Id the Cl_Id to set
     */
    public void setCl_Id(int Cl_Id)
    {
        this.Cl_Id = Cl_Id;
    }

    /**
     * @return the Cl_CP
     */
    public int getCl_CP()
    {
        return Cl_CP;
    }

    /**
     * @param Cl_CP the Cl_CP to set
     */
    public void setCl_CP(int Cl_CP)
    {
        this.Cl_CP = Cl_CP;
    }

    /**
     * @return the Cl_Nom
     */
    public String getCl_Nom()
    {
        return Cl_Nom;
    }

    /**
     * @param Cl_Nom the Cl_Nom to set
     */
    public void setCl_Nom(String Cl_Nom)
    {
        this.Cl_Nom = Cl_Nom;
    }

    /**
     * @return the Cl_Prénom
     */
    public String getCl_Prénom()
    {
        return Cl_Prénom;
    }

    /**
     * @param Cl_Prénom the Cl_Prénom to set
     */
    public void setCl_Prénom(String Cl_Prénom)
    {
        this.Cl_Prénom = Cl_Prénom;
    }

    /**
     * @return the Cl_Adresse
     */
    public String getCl_Adresse()
    {
        return Cl_Adresse;
    }

    /**
     * @param Cl_Adresse the Cl_Adresse to set
     */
    public void setCl_Adresse(String Cl_Adresse)
    {
        this.Cl_Adresse = Cl_Adresse;
    }

    /**
     * @return the Cl_Ville
     */
    public String getCl_Ville()
    {
        return Cl_Ville;
    }

    /**
     * @param Cl_Ville the Cl_Ville to set
     */
    public void setCl_Ville(String Cl_Ville)
    {
        this.Cl_Ville = Cl_Ville;
    }

    /**
     * @return the Cl_Pays
     */
    public Pays getCl_Pays()
    {
        return Cl_Pays;
    }

    /**
     * @param Cl_Pays the Cl_Pays to set
     */
    public void setCl_Pays(Pays Cl_Pays)
    {
        this.Cl_Pays = Cl_Pays;
    }
    
    /**
     * @return the Cl_Naiss
     */
    public Date getCl_Naiss()
    {
        return Cl_Naiss;
    }

    /**
     * @param Cl_Naiss the Cl_Naiss to set
     */
    public void setCl_Naiss(Date Cl_Naiss)
    {
        this.Cl_Naiss = Cl_Naiss;
    }
    
    public String getCl_NaissBE()
    {
        String tmp;

        if(this.Cl_Naiss == null)
        {
            tmp = "";
        }
        else
        {
            SimpleDateFormat dateParser = new SimpleDateFormat("dd/MM/yyyy");
            tmp = dateParser.format(this.Cl_Naiss);
        }
        return tmp;
    }
    
    public void setCl_NaissBE(String Cl_Naiss)
    {
        SimpleDateFormat dateParser = new SimpleDateFormat("dd/MM/yyyy");
        try
        {
            this.Cl_Naiss = dateParser.parse(Cl_Naiss);
        }
        catch(ParseException ex)
        {
            System.err.println("Erreur de parsing de la date en format BE");
        }
    }
    
    public String getCl_NaissSQL()
    {
        String tmp;

        if(this.Cl_Naiss == null)
        {
            tmp = "";
        }
        else
        {
            SimpleDateFormat dateParser = new SimpleDateFormat("yyyy-MM-dd");
            tmp = dateParser.format(this.Cl_Naiss);
        }
        return tmp;
    }

    public String getCl_NaissUS()
    {
        String tmp;

        if(this.Cl_Naiss == null)
        {
            tmp = "";
        }
        else
        {
            tmp = this.Cl_Naiss.toString();
        }
        return tmp;
    }
    
    @Override
    public String toString()
    {
        if(Cl_Nom.equals("") && Cl_Prénom.equals(""))
        {
            return "*";
        }
        else
        {
            return Cl_Nom + " " + Cl_Prénom;
        }
    }
    
    public boolean equals(Client c)
    {
        return this.getCl_Nom().equals(c.getCl_Nom()) && this.getCl_Prénom().equals(c.getCl_Prénom()) && this.getCl_NaissSQL().equals(c.getCl_NaissSQL());
    }
}