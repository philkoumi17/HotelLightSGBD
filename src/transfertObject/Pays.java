package transfertObject;

/**
 *
 * @author Philippe-K
 */

public class Pays
{
    private int P_Id;
    private String P_Nom;

    public Pays(){}

    public Pays(int P_Id, String P_Nom)
    {
        this.P_Id = P_Id;
        this.P_Nom = P_Nom;
    }

    /**
     * @return the P_Id
     */
    public int getP_Id()
    {
        return P_Id;
    }

    /**
     * @param P_Id the P_Id to set
     */
    public void setP_Id(int P_Id)
    {
        this.P_Id = P_Id;
    }

    /**
     * @return the P_Nom
     */
    public String getP_Nom()
    {
        return P_Nom;
    }

    /**
     * @param P_Nom the P_Nom to set
     */
    public void setP_Nom(String P_Nom)
    {
        this.P_Nom = P_Nom;
    }

    @Override
    public String toString()
    {
        return P_Nom;
    }
}