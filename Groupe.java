package gestinotes;

import static gestinotes.Etablissement.getTabGroupes;
import java.util.ArrayList;


/**
 *
 * @author Vittorio Passuello-Dussault
 */
public class Groupe {
    
    //Attributs
    private int numero = 0;
    private ArrayList<Etudiant> tabEtudiants = new ArrayList<Etudiant>();
    final int NOMBRE_MAX_ETUDIANTS = 10;
    
    //Constructeur 
    public Groupe(int unNumero){
        //Création du premier groupe avec valeurs prédéfinies
        unNumero = numero;
    }
    
    
    //Méthodes
    //Méthode pour ajouter un étudiant au groupe
    public void ajouter(Etudiant unEtudiant){
        if(getTabEtudiants().size()==10){
            Etablissement.addGroupe(unEtudiant);
        }
        else{
             getTabEtudiants().add(unEtudiant);
             
        }
    }
    //Méthode pour calculer la moyenne
    public double calculerMoyenne(){
        double somme=0;
        for(int count=0;count<getTabEtudiants().size();count++){
            somme+=getTabEtudiants().get(count).calculerNoteFinale();
        }
        return somme/getTabEtudiants().size();
    }
    //Méthode pour calculer l'écart-type 
    public double calculerEcartType(){
        double ecart = Math.sqrt(calculerVariance());
        return ecart;
    }
    
    //Méthode calculer variance 
    public double calculerVariance(){
        double variance = 0;
        for(int count=0;count<getTabEtudiants().size();count++){
            variance += Math.pow((getTabEtudiants().get(count).calculerNoteFinale())-(calculerMoyenne()),2.) / getTabEtudiants().size();
        }
        return variance;
    }
    
    //Méthode toString() contenant les informations d'un étudiant
    public String toStringInfo(){
        String msgInfo="";
        for(int count=0;count<getTabEtudiants().size();count++){
         msgInfo += "\nCode d'étudiant: " + getTabEtudiants().get(count).calculerCode()+ "\nNom: " + getTabEtudiants().get(count).getNom() + "\nPrénom: " + getTabEtudiants().get(count).getPrenom() + "\nDate de naissance: " + getTabEtudiants().get(count).getDateDeNaissance() + "\nNote finale: "+getTabEtudiants().get(count).calculerNoteFinale();
        }
        return msgInfo;
    }
    
    //Méthode toString() contenant les statistiques du groupe
    public String toStringStats(){
        String msgStats="";
        msgStats = "Moyenne du groupe: "+calculerMoyenne()+ "\nÉcart-Type: " + calculerEcartType() + "\nVariance du groupe: "+ calculerVariance();
        return msgStats;
    }
    
    
    
    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * @return the tabEtudiants
     */
    public ArrayList<Etudiant> getTabEtudiants() {
        return tabEtudiants;
    }

    /**
     * @param tabEtudiants the tabEtudiants to set
     */
    public void setTabEtudiants(ArrayList<Etudiant> tabEtudiants) {
        this.tabEtudiants = tabEtudiants;
    }
    
}
