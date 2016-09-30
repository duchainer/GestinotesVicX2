package gestinotes;

/**
 * GestiNotes:
 * Version 1.0 complétée le 2016/09/28
 * @author Vittorio PASSUELLO-DUSSAULT (Classes Groupe et Etudiant)
 *         Victor RONDEAU (Classes graphiques)
 */
//Importations
import javax.swing.*;

public class GestiNotes {
    public static void main(String[] args){
        try{
            PrincipaleFrame main = new PrincipaleFrame();
            main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            main.pack();
            main.setVisible(true);
            main.setLocationRelativeTo(null);   
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e.getMessage());
        }
    }
}
