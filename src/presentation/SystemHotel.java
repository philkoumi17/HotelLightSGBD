package presentation;

/**
 *
 * @author Philippe-K
 */

public class SystemHotel
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
         StartApp st = new StartApp();
         st.setVisible(true);
         JFPrincipale jf = new JFPrincipale();
         
         try
         {   
            for(int i = 0; i <= 100; i++)
            {
                Thread.sleep(40);
                st.Loading_num.setText(i + "%");
                st.ProgressBarApp.setValue(i);
                 
                if(i == 100)
                {
                    st.dispose();
                    jf.setVisible(true);
                }
            }
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
    }
}