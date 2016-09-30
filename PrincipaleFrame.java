package gestinotes;

/**
 * Version 1.0 complétée le 2016/09/28
 *
 * @author Victor Rondeau
 */
//Importations
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
//import java.util.logging.Level;
//import java.util.logging.Logger;

public class PrincipaleFrame extends JFrame implements ActionListener {
    //Attributs
    Etablissement unEtablissement = new Etablissement();
    Groupe unGroupe;
    JPanel simplePanel;
    JButton option1, option2, option3, option4;
    GridLayout gl = new GridLayout(4, 1, 0, 3);
    int confirmation, numeroDeGroupe, note1, note2, note3, note4;
    String nom, prenom, dateDeNaissance;
    int i=0;
    
    public PrincipaleFrame(){
        simplePanel = new JPanel();
        simplePanel.setLayout(gl);
        setTitle("GestiNotes");
        simplePanel.setBackground(Color.blue);
        //Labels
        option1 = new JButton("Inscrire un étudiant");
        option1.setBackground(Color.white);
        option1.setForeground(Color.black);
        option1.addActionListener(this);
        option2 = new JButton("Afficher la liste des étudiants");
        option2.setBackground(Color.white);
        option2.setForeground(Color.black);
        option2.addActionListener(this);
        option3 = new JButton("Afficher les statistiques");
        option3.setBackground(Color.white);
        option3.setForeground(Color.black);
        option3.addActionListener(this);
        option4 = new JButton("Quitter");
        option4.setBackground(Color.white);
        option4.setForeground(Color.red);
        option4.addActionListener(this);
        
        //Remplissage
        simplePanel.add(option1);
        simplePanel.add(option2);
        simplePanel.add(option3);
        simplePanel.add(option4);
        add(simplePanel);
    }
    @Override
    public void actionPerformed(ActionEvent event){
        if (event.getSource() == option1){
            if(Etablissement.getNombreGroupes()==0){
                Etablissement.addPremierGroupe();
            }else{
                nom=JOptionPane.showInputDialog("Entrez le nom de famille de l'étudiant");
                prenom=JOptionPane.showInputDialog("Entrez le prénom de l'étudiant");
                dateDeNaissance=JOptionPane.showInputDialog("Entrez la date de naissance de l'étudiant sour le format JJ-MM-AAAA");
                note1=Integer.parseInt(JOptionPane.showInputDialog("Entrez la note du premier cours"));
                note2=Integer.parseInt(JOptionPane.showInputDialog("Entrez la note du deuxième cours"));
                note3=Integer.parseInt(JOptionPane.showInputDialog("Entrez la note du troisième cours"));
                note4=Integer.parseInt(JOptionPane.showInputDialog("Entrez la note du quatrième cours"));
                //Etablissement.getTabGroupes().add(unGroupe);
                Etablissement.getTabGroupes().get(i).ajouter(new Etudiant(nom, prenom, dateDeNaissance, note1, note2, note3, note4));
                ArrayList<Groupe> myTabGroupe =Etablissement.getTabGroupes();
                int numeroGroupeAffichage=Etablissement.getTabGroupes().size()-1;
                if(Etablissement.getTabGroupes().get(i).getTabEtudiants().size()>10){
                    JOptionPane.showMessageDialog(null,"Le groupe "+myTabGroupe.get(i).getNumero()
                        +" est plein. Les autres élèves seront placés dans le groupe "+myTabGroupe.get(i+1).getNumero());
                    JOptionPane.showMessageDialog(null,"L'étudiant a bien été ajouté au groupe "+numeroGroupeAffichage);
                    i++;
                    
                }else
                    JOptionPane.showMessageDialog(null,"L'étudiant a bien été ajouté au groupe "+numeroGroupeAffichage);
            }
        }
        else if (event.getSource() == option2){
            if(Etablissement.getNombreGroupes()==0){
                Etablissement.addPremierGroupe();
            }
            numeroDeGroupe=Integer.parseInt(JOptionPane.showInputDialog("Entrez le numéro du groupe"));
           JOptionPane.showMessageDialog(null,unEtablissement.afficherInformations(numeroDeGroupe)); 
        }
        else if (event.getSource() == option3){
            if(Etablissement.getNombreGroupes()==0){
                Etablissement.addPremierGroupe();
            }
            numeroDeGroupe=Integer.parseInt(JOptionPane.showInputDialog("Entrez le numéro du groupe"));
            JOptionPane.showMessageDialog(null,unEtablissement.afficherStatistiques(numeroDeGroupe)); 
        }
        else if (event.getSource() == option4){
            confirmation = JOptionPane.showConfirmDialog(null,"Voulez-vous vraiment quitter?","Quitter",JOptionPane.YES_NO_OPTION);
            if (confirmation == 0){
                JOptionPane.showMessageDialog(null, "Merci d'avoir utilisé GestiNotes !\n                Au revoir!");
                System.exit(0);
            }
        }
    }
}

