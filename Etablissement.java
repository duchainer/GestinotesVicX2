package gestinotes;

import java.util.ArrayList;

/**
 *
 * @author Vittorio Passuello-Dussault
 */
public class Etablissement {
    //Attributs
    private static ArrayList<Groupe> tabGroupes = new ArrayList<Groupe>();
    private static int nombreGroupes=0;
    //Méthode pour ajouter un groupe à tabGroupes
    static int addGroupe(Etudiant unEtudiant) {
        getTabGroupes().add(new Groupe(nombreGroupes));
        getTabGroupes().get(nombreGroupes).ajouter(unEtudiant);
        //getTabGroupes().get(nombreGroupes).setNumero(getTabGroupes().size());
        nombreGroupes++;
        return nombreGroupes;
        //anciennement getTabGroupes().get(getTabGroupes().size()-1).setNumero(getTabGroupes().size());
    }
    //Constructeur avec groupe de départ
    static void addPremierGroupe(){
        getTabGroupes().add(new Groupe(nombreGroupes));
        /*Etudiant a = null;
        Etudiant b = null;
        Etudiant c = null;
        Etudiant d = null;
        Etudiant e = null;
        Etudiant f = null;
        Etudiant g = null;
        Etudiant h = null;
        
        a.setNom("Desroches");
        a.setPrenom("Yvan");
        a.setDateDeNaissance("03-08-1997");
        
        b.setNom("Terrieur");
        b.setPrenom("Alain");
        b.setDateDeNaissance("02-07-1996");
        
        c.setNom("Terrieur");
        c.setPrenom("Alex");
        c.setDateDeNaissance("01-06-1995");
        
        d.setNom("Courci");
        d.setPrenom("Sarah");
        d.setDateDeNaissance("04-08-1998");
        
        e.setNom("Molli");
        e.setPrenom("Sarah");
        e.setDateDeNaissance("23-08-1996");
        
        f.setNom("Brulé");
        f.setPrenom("Yvon");
        f.setDateDeNaissance("14-11-2001");
        
        g.setNom("Noel");
        g.setPrenom("Père");
        g.setDateDeNaissance("25-12-1901");
        
        h.setNom("Paul-Paul");
        h.setPrenom("Paul");
        h.setDateDeNaissance("16-02-1997");*/
        ArrayList<Etudiant> tabEtudiants = getTabGroupes().get(nombreGroupes).getTabEtudiants();
        tabEtudiants.add(new Etudiant("Descroches","Yvan","03-08-1997",50,60,70,80));
        tabEtudiants.add(new Etudiant("Terrieur","Alain","02-07-1996",70,60,80,77));
        tabEtudiants.add(new Etudiant("Terrieur","Alex","01-06-1995",66,77,88,99));
        tabEtudiants.add(new Etudiant("Courci","Sarah","04-08-1998",33,64,87,44));
        tabEtudiants.add(new Etudiant("Molli","Sarah","23-08-1996",57,87,98,76));
        tabEtudiants.add(new Etudiant("Brûlé","Yvon","14-11-2001",56,86,34,99));
        tabEtudiants.add(new Etudiant("Noël","Père","25-12-1901",78,98,67,100));
        tabEtudiants.add(new Etudiant("Paul-Paul","Paul","16-02-1997",76,87,56,44));
        nombreGroupes++;
        //getTabGroupes().get(getTabGroupes().size()).setNumero(getTabGroupes().size());
        //anciennement getTabGroupes().get(getTabGroupes().size()-1).setNumero(getTabGroupes().size());
    }
    
    //Méthode pour rechercher un groupe

    /**
     * @return the tabGroupes
     */
    public static ArrayList<Groupe> getTabGroupes() {
        return tabGroupes;
    }

    /**
     * @param aTabGroupes the tabGroupes to set
     */
    public static void setTabGroupes(ArrayList<Groupe> aTabGroupes) {
        tabGroupes = aTabGroupes;
    }

    /**
     * @return the nombreGroupes
     */
    public static int getNombreGroupes() {
        return nombreGroupes;
    }

    /**
     * @param aNombreGroupes the nombreGroupes to set
     */
    public static void setNombreGroupes(int aNombreGroupes) {
        nombreGroupes = aNombreGroupes;
    }
    
    
    
    public String afficherInformations(int unNumero){
        /*ing message=null;
        for (int i=0;i<tabGroupes.size();i++){
            if (unNumero==tabGroupes.get(i).getNumero()){
                compteExiste=true;
                message=tabGroupes.get(i).toString(unNumero);
                break;
            }
        }
        if(!compteExiste){
            message+="";
        }*/
        String message = tabGroupes.get(unNumero).toStringInfo()+"\n";
        return message;
    }
    
    //Méthode contenant les statistiques
    public String afficherStatistiques(int UnNumero){
        String msgStats = tabGroupes.get(UnNumero).toStringStats();
        return msgStats;
    }
    
}
